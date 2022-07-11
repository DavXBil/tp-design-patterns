package fr.diginamic.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Singleton {

    private static Singleton instance;

    public Singleton() {
        ResourceBundle configuration = ResourceBundle.getBundle("configuration") ;
        String valeur = configuration.getString("db.url");
        System.out.println(valeur);
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}


