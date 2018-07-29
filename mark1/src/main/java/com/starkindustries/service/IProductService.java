package com.starkindustries.service;

import com.starkindustries.common.ServerResponse;
import com.starkindustries.pojo.Product;

public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);
}
