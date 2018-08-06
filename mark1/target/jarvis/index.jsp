<html>
<body>
<h2>Hello World!</h2>

springMVC上传图片文件
<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file">
    <input type="submit" value="springMVC上传文件">
</form>

springMVC上传富文本图片文件
<form name="form1" action="/manage/product/richTextImgUpload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file">
    <input type="submit" value="springMVC上传文件">
</form>

</body>
</html>
