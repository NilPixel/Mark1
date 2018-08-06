package com.starkindustries.util;

import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by zyc on 6/24/17.
 */
public class FTPUtil {
    private static final Logger logger  = LoggerFactory.getLogger(FTPUtil.class);

    private static String ftpIp = PropertiesUtil.getProperty("ftp.server.ip");
    private static String ftpUser = PropertiesUtil.getProperty("ftp.user");
    private static String ftpPasss = PropertiesUtil.getProperty("ftp.pass");

    private String ip;
    private int port;
    private String user;
    private String pwd;
    private FTPClient ftpClient;


    public FTPUtil(String ip , int port ,String user,String pwd){
        this.ip = ip;
        this.port = port;
        this.user= user;
        this.pwd = pwd;
    }


    public static boolean uploadFile(List<File> fileList) throws IOException {
        FTPUtil ftpUtil = new FTPUtil(ftpIp,21,ftpUser,ftpPasss);
        logger.info("开始连接ftp服务器" + ftpUtil.getIp() + " " + ftpUtil.getUser() + " " + ftpUtil.getPort());
        //此处有个异常， 往上抛就可以， 根据逻辑在业务中的具体位置，根据业务逻辑安排 进行try/catch 或者 throws
        boolean result = ftpUtil.updloadFile("img",fileList);
        logger.info("开始连接ftp服务器，结束上传，上传结果：{}",result);
        return result;
    }
    //如果要上传的路径是 /ftpfile 的目录下就得使用remotePath
    private boolean updloadFile(String remotePath ,List<File>fileList) throws IOException {
        boolean uploaded = true;
        FileInputStream fis = null;
        if(connectServer(this.ip,this.port,this.user,this.pwd)){
            try {
                //切换文件夹
                ftpClient.changeWorkingDirectory(remotePath);
                System.out.println("remotePath : " + remotePath);
                //设置缓冲区
                ftpClient.setBufferSize(1024);
                //设置字符集 utf-8
                ftpClient.setControlEncoding("UTF-8");
                //设置成二进制文件
                ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
                //打开本地本动模式
                ftpClient.enterLocalPassiveMode();
                for(File fileItem : fileList){
                    fis = new FileInputStream(fileItem);
                    ftpClient.storeFile(fileItem.getName(),fis);
                }

            } catch (IOException e) {
                logger.error("上传文件常",e);
                uploaded = false;
                e.printStackTrace();

            }finally{
                fis.close();
                ftpClient.disconnect();
            }
        }
        return uploaded;
    }


    private  boolean connectServer(String ip ,int port ,String user ,String pwd){
        ftpClient = new FTPClient();

        boolean isSuccess = false;
        try {
            ftpClient.connect(ip);
            isSuccess = ftpClient.login(user,pwd);
        } catch (IOException e) {
            logger.error("链接FTP服务器异常",e);
            e.printStackTrace();

        }
        return isSuccess;

    }


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public FTPClient getFtpClient() {
        return ftpClient;
    }

    public void setFtpClient(FTPClient ftpClient) {
        this.ftpClient = ftpClient;
    }
}
