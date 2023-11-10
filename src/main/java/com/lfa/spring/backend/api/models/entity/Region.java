package com.lfa.spring.backend.api.models.entity;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "regiones")
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    public Region() {
    }

    public Region(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Region(Integer id) {
        this.id = id;
    }

    public Region(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return this.id;
    }

    public Region setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Region setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public String toString() {
        return "Region{" + "id=" + id + ", nombre='" + nombre + '\'' + '}';
    }
}
