package com.upscale.java5.services;

import java.util.List;
import java.util.Optional;

import com.upscale.java5.entities.Products;
import com.upscale.java5.exceptions.EtBadRequestException;
import com.upscale.java5.exceptions.EtResourcesNotFoundException;
import com.upscale.java5.helpers.Helper;
import com.upscale.java5.repositories.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    ProductsRepository repo;
    Helper helper = new Helper();

    @Override
    public Products save(String name, Integer qty) throws EtBadRequestException {
        if (name.isEmpty()) {
            throw new EtBadRequestException("nama product harus diisi boss!");
        } else if (name.length() < 5) {
            throw new EtBadRequestException("nama product harus lebih dari 5 ");
        }
        Products prod = new Products(name, qty, helper.now(), helper.now());
        return repo.save(prod);
    }

    @Override
    public List<Products> findAll() {
        return repo.findAll();
    }

    @Override
    public Products findById(Integer productId) throws EtResourcesNotFoundException {
        try {
            Optional<Products> products = repo.findById(productId);
            return products.get();
        } catch (Exception e) {
            throw new EtResourcesNotFoundException("Product id : " + productId + "tidak ditemukan");
        }
    }

    @Override
    public void update(Integer productId, Products data) throws EtBadRequestException {
        Optional<Products> prod = repo.findById(productId);
        prod.getName(data.setName());
    }

    @Override
    public void delete(Integer productId) throws EtResourcesNotFoundException {
        try {
            Optional<Products> products = repo.findById(productId);
            repo.delete(products.get());
        } catch (Exception e) {
            throw new EtResourcesNotFoundException("Gagal Delete, ProductId: " + productId + "tidak ditemukan");
        }
    }

}
