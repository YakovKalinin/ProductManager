package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(manufacturer, that.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
