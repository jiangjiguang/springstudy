package com.jiangjg.springstudy.hibernate.entities;

/**
 * Created by root on 16-4-10.
 */
public class Book {
    private Integer id;
    private String bookName;
    private String isnb;
    private int price;
    private int stock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", isnb='" + isnb + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
