package com.upscale.java5.services;

import java.util.List;

import com.upscale.java5.entities.Products;
import com.upscale.java5.exceptions.EtBadRequestException;
import com.upscale.java5.exceptions.EtResourcesNotFoundException;

public interface ProductsService {

    Products save(String name, Integer qty) throws EtBadRequestException;

    List<Products> findAll();

    Products findById(Integer productId) throws EtResourcesNotFoundException;

    void update(Integer productId, Products product) throws EtBadRequestException;

    void delete(Integer productId) throws EtResourcesNotFoundException;
}
