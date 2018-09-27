/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:13:02 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Categories;
import com.example.demo.repository.CategoriesRepository;
import com.example.demo.service.criteria.CategoriesCriteria;

/**
 * Service implementation for Categories.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Service
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	private CategoriesRepository categoriesRepository;

	@Override
	public Page<Categories> search(Pageable pageable, CategoriesCriteria criteria) {
		return categoriesRepository.findAll(new CategoriesSpecification(criteria), pageable);
	}

	@Override
	public Categories get(Long caregoryId) {
		return categoriesRepository.findByCaregoryId(caregoryId);
	}

	@Override
	public Boolean delete(Long caregoryId) {
		if (categoriesRepository.findByCaregoryId(caregoryId) != null) {
			categoriesRepository.deleteById(caregoryId);
			return true;
		}
		return false;
	}

	@Override
	public Categories create(Categories categories) {
		return categoriesRepository.save(categories);
	}

	@Override
	public Boolean save(Categories categories) {
		final Long pk = categories.getCaregoryId();
		if (categoriesRepository.findByCaregoryId(pk) != null) {
			categoriesRepository.save(categories);
			return true;
		}
		return false;
	}

	@Override
	public Boolean exist(Categories categories) {
		return categoriesRepository.existsById(categories.getCaregoryId());
	}

	class CategoriesSpecification implements Specification<Categories> {

		private CategoriesCriteria criteria;

		public CategoriesSpecification(CategoriesCriteria criteria) {
			this.criteria = criteria;
		}

		@Override
		public Predicate toPredicate(Root<Categories> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
			final List<Predicate> predicates = new ArrayList<>();
			if (StringUtils.isNotBlank(criteria.getCategoryName())) {
				predicates.add(builder.like(builder.lower(root.get("categoryName")),
						criteria.getCategoryName().toLowerCase() + "%"));
			}
			return andTogether(predicates, builder);
		}

		private Predicate andTogether(List<Predicate> predicates, CriteriaBuilder builder) {
			return builder.and(predicates.toArray(new Predicate[0]));
		}
	}

}
