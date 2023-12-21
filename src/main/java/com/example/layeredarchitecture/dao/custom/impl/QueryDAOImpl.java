package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.QueryDAO;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.SearchDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QueryDAOImpl implements QueryDAO {
    @Override
    public ArrayList<SearchDTO> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer c JOIN Orders o ON c.id = o.customerID");
        ArrayList<SearchDTO> getAll=new ArrayList<>();
        while (rst.next()){
            SearchDTO searchDTO = new SearchDTO(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getString("oid"), rst.getDate("date").toLocalDate());
            getAll.add(searchDTO);
        }
        return getAll;
    }
}
