package com.upscale.java5.entities;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_generator")
    @SequenceGenerator(name = "products_generator", sequenceName = "products_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "qty")
    private Integer qty;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public Products() {

    }

    public Products(String name, Integer qty, Timestamp createdAt, Timestamp updatedAt) {
        this.name = name;
        this.qty = qty;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQty() {
        return qty;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Products{" + "id=" + id + ", name= '" + name + '\'' + ", qty=" + qty + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + '}';
    }
}
