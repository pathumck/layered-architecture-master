package com.example.layeredarchitecture.controller;

import com.example.layeredarchitecture.dao.custom.QueryDAO;
import com.example.layeredarchitecture.dao.custom.impl.QueryDAOImpl;
import com.example.layeredarchitecture.model.SearchDTO;
import com.example.layeredarchitecture.view.tdm.SearchTM;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class SearchFormController {
    @FXML
    private TableColumn<SearchTM, String> colCusAddress;

    @FXML
    private TableColumn<SearchTM, String> colCusID;

    @FXML
    private TableColumn<SearchTM, String> colCusName;

    @FXML
    private TableColumn<SearchTM, LocalDate> colDate;

    @FXML
    private TableColumn<SearchTM, String> colOrderID;

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<SearchTM> tblSearch;
    QueryDAO queryDAO = new QueryDAOImpl();

    public void initialize() throws SQLException, ClassNotFoundException {
        loadSearchTable();
        vitualize();
    }

    public void loadSearchTable() throws SQLException, ClassNotFoundException {
        ArrayList<SearchDTO> allSearch = queryDAO.getAll();
        ArrayList<SearchTM> tmList = new ArrayList<>();

        for (SearchDTO search : allSearch) {
            SearchTM tm = new SearchTM(search.getId(), search.getName(), search.getAddress(), search.getoId(), search.getDate());
            tmList.add(tm);
        }
        ObservableList<SearchTM> toTable = FXCollections.observableArrayList(tmList);
        tblSearch.setItems(toTable);
        System.out.println(tmList);
    }

    public void vitualize() {
        colCusID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colCusName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colCusAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colOrderID.setCellValueFactory(new PropertyValueFactory<>("oId"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));

    }
}
