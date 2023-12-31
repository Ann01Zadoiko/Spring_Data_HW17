package com.example.please.service;

import com.example.please.exception.NotFountNoteException;

import java.util.List;

public interface IService<T> {
    List<T> listAll();

    T add(T entity);

    void deleteById(Long id) throws NotFountNoteException;

    void update(T entity) throws NotFountNoteException;

    T getById(Long id) throws NotFountNoteException;
}
