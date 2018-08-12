package com.starkindustries.service;

import com.starkindustries.common.ServerResponse;
import com.starkindustries.pojo.Category;

import java.util.List;

public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectedCategoryAndChildrenById(Integer categoryId);
}
