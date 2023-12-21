package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.model.SearchDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO {
    ArrayList<SearchDTO> getAll() throws SQLException, ClassNotFoundException;
}
