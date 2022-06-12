/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Class.Alumno;
import Class.MiCalendar;
import Class.Persona;
import DAO.AlumnoDaoSql;
import DAO.DAO;
import DAO.DAOException;
import DAO.DAOFactory;
import Exception.AlumnoException;
import Exception.MiCalendarioException;
import Exception.PersonaException;
import Exception.PersonaNombreException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laboratorios
 */
public class TestDAO {
     /*public static void main(String[] args) {
        try {
            DAO<Alumno, Integer> dao = new AlumnoDaoSql("jdbc:mysql://localhost:3306/efc", "root", "root");
            Persona persona = new Persona(5, "Javier Carlos", "Ramirez", new MiCalendar(1, 1, 2001));
            dao.create(new Alumno(persona, new MiCalendar(1, 1, 2020), 2, 2.25));
            
            Alumno alu = dao.read(24004621);
            System.out.println("Alumno leído ==> "+ alu);
        } catch (DAOException | MiCalendarioException | PersonaException | PersonaNombreException | AlumnoException ex) {
            Logger.getLogger(TestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    /*public static void main(String[] args) {
        DAOFactory factory = new DAOFactory.getInstance();
        DAOFactory factory2 = new DAOFactory.getInstance();
        
        System.out.println();
    }*/
}
