package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO {
    ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

    void deleteItem(String code) throws SQLException, ClassNotFoundException;

    void addItem(ItemDTO dto) throws SQLException, ClassNotFoundException;

    void updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException;

    Boolean existItem(String code) throws SQLException, ClassNotFoundException;

    String generateItemCode() throws SQLException, ClassNotFoundException;

}
