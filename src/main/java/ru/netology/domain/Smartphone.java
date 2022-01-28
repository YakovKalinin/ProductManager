package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String manufacturer;
    private String nameOfSmartphone;

    public Smartphone(int id, String name, int price, String manufacturer, String nameOfSmartphone) {
        super(id, name, price);
        this.manufacturer = manufacturer;
        this.nameOfSmartphone = nameOfSmartphone;
    }
    public Smartphone() {
        super();

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNameOfSmartphone() {
        return nameOfSmartphone;
    }

    public void setNameOfSmartphone(String nameOfSmartphone) {
        this.nameOfSmartphone = nameOfSmartphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(manufacturer, that.manufacturer) && Objects.equals(nameOfSmartphone, that.nameOfSmartphone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), manufacturer, nameOfSmartphone);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", nameOfSmartphone='" + nameOfSmartphone + '\'' +
                '}';
    }
}