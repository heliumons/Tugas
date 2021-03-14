package com.upscale.java5.resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.upscale.java5.entities.Products;
import com.upscale.java5.services.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductsResource {

    @Autowired
    ProductsService service;

    @PostMapping("")
    public ResponseEntity<Products> save(HttpServletRequest request, @RequestBody Map<String, Object> productsMap) {
        String name = (String) productsMap.get("name");
        Integer qty = (Integer) productsMap.get("qty");
        Products products = service.save(name, qty);
        return new ResponseEntity<>(products, HttpStatus.CREATED);
    }

    @GetMapping("{productId}")
    public ResponseEntity<Products> findById(HttpServletRequest request, @PathVariable("productId") Integer productId) {
        Products products = service.findById(productId);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<Products>> findAll(HttpServletRequest request) {
        List<Products> products = service.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PutMapping("{productId}")
    public ResponseEntity<Map<String, String>> update(HttpServletRequest request, @PathVariable("productId") Integer id,
            @RequestBody Products products) {
        service.update(id, products);
        Map<String, String> map = new HashMap<>();
        map.put("status", "200");
        map.put("message", "Success Update Product Id: " + id);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @DeleteMapping("{productId")
    public ResponseEntity<Map<String, String>> delete(HttpServletRequest request,
            @PathVariable("productId") Integer id) {
        service.delete(id);
        Map<String, String> map = new HashMap<>();
        map.put("status", "200");
        map.put("message", "Success Delete Product Id: " + id);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
