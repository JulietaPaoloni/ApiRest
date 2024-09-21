package com.example.inicial1.services;

import java.util.List;

public interface BaseService <E> {
    public List<E> findAll()throws Exception; // trae lista de personas de la base de datos
    public E findById(Long id) throws Exception; //trae una persona/entidad segun ID
    public E save(E entity) throws Exception; //crea una nueva entidad
    public E update(Long id, E entity)throws Exception; //actualiza
    public boolean delete(Long id)throws Exception; //elimina registros de la base de datos

}
