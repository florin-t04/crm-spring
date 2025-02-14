package com.example.demo;


import java.time.LocalDate;
import java.util.Objects;

public class Sale {
    private Long id;
    private String product;
    private int quantity;
    private double price;
    private LocalDate saleDate;

    // Constructor fără parametri
    public Sale() {
    }

    // Constructor cu parametri
    public Sale(Long id, String product, int quantity, double price, LocalDate saleDate) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.saleDate = saleDate;
    }

    // Getteri și setteri
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public LocalDate getSaleDate() {
        return saleDate;
    }
    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", saleDate=" + saleDate +
                '}';
    }

    // Metode equals și hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sale)) return false;
        Sale sale = (Sale) o;
        return Objects.equals(id, sale.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
