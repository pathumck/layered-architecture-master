package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO {
    ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;
    boolean addCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;
    boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;
    boolean existCustomer(String id) throws SQLException, ClassNotFoundException;
    boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;

    String generateNextCustomerId() throws SQLException, ClassNotFoundException;
}
