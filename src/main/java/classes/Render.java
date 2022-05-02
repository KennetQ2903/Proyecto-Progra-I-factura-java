
package classes;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;


public class Render extends javax.swing.table.DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if(value instanceof JButton){
            JButton btn = (JButton)value;
            return btn;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
    }

    
}
