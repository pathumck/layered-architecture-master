package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> extends SuperDAO {
    ArrayList<T> getAll() throws SQLException, ClassNotFoundException;
    Boolean add(T dto) throws SQLException, ClassNotFoundException;
    Boolean update(T dto) throws SQLException, ClassNotFoundException;
    Boolean delete(String id) throws SQLException, ClassNotFoundException;
    Boolean exist(String id) throws SQLException, ClassNotFoundException;
    String generateNextId() throws SQLException, ClassNotFoundException;
    T select(String newValue) throws SQLException, ClassNotFoundException;
}
