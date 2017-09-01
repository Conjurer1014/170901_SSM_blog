package com.llh.service.impl;

import com.llh.mapper.CategoryMapper;
import com.llh.pojo.Category;
import com.llh.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LENOVO on 2017/9/1.
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> select() {
        return categoryMapper.select();
    }
}
