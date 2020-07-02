package com.peshkur.shopbackend.dao;

import com.peshkur.shopbackend.entity.ProductCategory;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaAttributeConverter<ProductCategory, Long> {
}
