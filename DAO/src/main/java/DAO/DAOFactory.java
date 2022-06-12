/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Exception.DAOFactoryException;
import java.util.Map;

/**
 *
 * @author laboratorios
 */
public class DAOFactory {

    private static DAOFactory instance;
    
    public static final String  TIPO_DAO = "TIPO_DAO";
    public static final String  TIPO_DAO_TXT = "DAO_TEXT";
    public static final String  TIPO_DAO_SQL = "DAO_SQL";
    public static final String  PATH_FILE = "PATH_FILE";
    public static final String  SQL_CON = "SQL_CON";
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        if(instance == null){
            instance = new DAOFactory();
        }
        return instance;
    }
    
    public DAO CreateDAO(Map<String,String> config) throws DAOFactoryException, DAOException{
        String tipoDAO = config.get(TIPO_DAO);
        switch(tipoDAO){
            case TIPO_DAO_TXT:
                String path = config.get(PATH_FILE);
                return new AlumnoDaoTxt(path);
            case TIPO_DAO_SQL:
                String sqlCon = config.get(SQL_CON);
                return new AlumnoDaoSql(sqlCon,sqlCon,sqlCon);
        }
        return null;
        //agregar try catch
    }
    
}
