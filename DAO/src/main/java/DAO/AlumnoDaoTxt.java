/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Class.Alumno;
import static Class.Persona.DELIMITADOR;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laboratorios
 */
public class AlumnoDaoTxt extends DAO<Alumno, Integer>{

    private RandomAccessFile raf;
    
    AlumnoDaoTxt(String fullPath)throws DAOException{
        File file = new File(fullPath);
        try {
            raf = new RandomAccessFile(file, "rws");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AlumnoDaoTxt.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOException("Archivo no encoentrado. " + ex .getMessage());
        }
    }
    
    @Override
    public void create(Alumno alumno) throws DAOException {
        try {
            if(exist(alumno.getDni()))
            {
               throw new DAOException("Error, el alumno ya existe, DNI: " + alumno.getDni()); 
            }
            raf.seek(raf.length());
            raf.writeBytes(alumno.toString() + System.lineSeparator());
        } catch (IOException ex) {
            Logger.getLogger(AlumnoDaoTxt.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOException("Error crear el alumno. " + ex .getMessage());
        }
    }

    @Override
    public Alumno read(Integer pk) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void update(Alumno entity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void hardDelete(Integer pk) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void softDelete(Integer pk) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> findAll(boolean includeDeleted) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exist(Integer dni) throws DAOException {
        try {
            raf.seek(0);
            //recorrer
            String line;
            String[] campos;
            while((line = raf.readLine()) != null){
               campos = line.split(DELIMITADOR);
               if(dni.equals(Integer.valueOf(campos[0])))
               {
                   return true;
               }
            }
        } catch (IOException ex) {
            Logger.getLogger(AlumnoDaoTxt.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOException("Error de I/O. " + ex .getMessage());
        }
        return false;
    }
}
