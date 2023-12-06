package ui.custom.grid.table;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import data.models.Product;

public class ProductTableModel extends AbstractTableModel{
    private ArrayList<Product> products;
    private String[] columns = {"Name", "Description", "Typ", "Price"};
    public ProductTableModel(ArrayList<Product> products) {
        this.products = products;
    }
    public void addRow(Product product) {
        this.products.add(product);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return this.products.size();
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Product product = this.products.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return product.getName();
            case 1:
                return product.getDescription();
            case 2:
                return product.getTyp();
            case 3:
                return product.getPrice();
            default:
                return null;
        }
    }
    
}
