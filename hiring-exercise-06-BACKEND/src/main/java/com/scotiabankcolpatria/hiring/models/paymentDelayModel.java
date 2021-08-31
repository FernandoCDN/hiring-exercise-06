package com.scotiabankcolpatria.hiring.models;

import javax.persistence.*;

@Entity
@Table(name = "paymentdelays")
public class paymentDelayModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer period;

    private Integer quantity;

    private String idclient;

    private Integer idproduct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getIdCLient() {
        return idclient;
    }

    public void setIdCLient(String idCLient) {
        this.idclient = idCLient;
    }

    public Integer getIdProduct() {
        return idproduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idproduct = idProduct;
    }
}
