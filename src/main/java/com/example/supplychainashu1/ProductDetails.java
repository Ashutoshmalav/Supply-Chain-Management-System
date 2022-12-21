package com.example.supplychainashu1;

import javafx.beans.Observable;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

public class ProductDetails {

   public TableView<Product> productTable;

   public Pane getAllProducts(){
       TableColumn id = new TableColumn("Id");
       id.setCellValueFactory(new PropertyValueFactory<>("id"));
       TableColumn name = new TableColumn("Name");
       name.setCellValueFactory(new PropertyValueFactory<>("name"));
       TableColumn price= new TableColumn("Price");
       price.setCellValueFactory(new PropertyValueFactory<>("price"));

       ObservableList<Product> data= FXCollections.observableArrayList();
       data.add(new Product(1,"Lenovo" , 84397));
       data.add(new Product(1,"HP" , 85439));

       productTable = new TableView<>();
       productTable.setItems(data);
       productTable.getColumns().addAll(id,name,price);

       Pane tablePane = new Pane();
       tablePane.getChildren().add(productTable);
       return tablePane;
   }
}