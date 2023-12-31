package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO {
   ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;
   boolean deleteItem(String id) throws SQLException, ClassNotFoundException;
   boolean addItem(ItemDTO dto) throws SQLException, ClassNotFoundException;
   boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException;
   boolean existItem(String id) throws SQLException, ClassNotFoundException;
   String generateNextItemId() throws SQLException, ClassNotFoundException;
}
