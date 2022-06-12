/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Class.Alumno;
import Exception.AlumnoException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laboratorios
 */
public class AluTableModel extends AbstractTableModel {

    private List<Alumno> alumnos;
    
    private static final String[] columnas = {"DNI", "Nombre", "Apellido"};

    public AluTableModel() /*throws AlumnoException*/{
        
        alumnos = new ArrayList<>();
        /*alumnos.add(new Alumno(1111111, "Nombre1", "Apellido 1", null,null,null,null));
        alumnos.add(new Alumno(2222222, "Nombre2", "Apellido 2", null,null,null,null));
        alumnos.add(new Alumno(3333333, "Nombre3", "Apellido 3", null,null,null,null));
        alumnos.add(new Alumno(777777, "Nombre7", "Apellido 7", null,null,null,null));
        alumnos.add(new Alumno(55555, "Nombre5", "Apellido 5", null,null,null,null));*/
        
    }
    
    @Override
    public int getRowCount() {
       return alumnos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnas[column];
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
    
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
