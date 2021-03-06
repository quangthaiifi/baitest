/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 05:57:23 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service;

import com.example.demo.entity.Categories;
import java.util.List;

import org.hibernate.hql.internal.ast.tree.BooleanLiteralNode;

public interface CategoriesService {

	Categories getOne(Integer categoryId);

	List<Categories> findAll();

	Boolean delete(Integer categoryId);

	Categories create(Categories categories);

	Boolean update(Categories categories);

	Boolean exist(Categories categories);
}
