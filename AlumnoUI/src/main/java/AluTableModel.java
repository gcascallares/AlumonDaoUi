/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Class.Alumno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laboratorios
 */
public class AluTableModel extends AbstractTableModel {

    private List<Alumno> alumnos;
    
    public AluTableModel(){
        alumnos = new ArrayList<>();
        
    }
    
    public List<Alumno> getAlumnos(){
        return alumnos;
    }
    
     public void setAlumnos(List<Alumno> list){
        alumnos = list;
    }
    
    @Override
    public int getRowCount() {
       return alumnos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alumno alu = alumnos.get(rowIndex);
        switch (columnIndex){
            case 0:
                    return alu.getDni();
            case 1:
            return alu.getNombre();
            case 2:
            return alu.getApellido();
            default:
                return null;
        }      
    }
}
