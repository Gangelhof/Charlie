package charlie.start;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import charlie.control.GameInitializer;
import charlie.model.Country;
import charlie.model.Drug;
import charlie.view.MainWindow;
import java.util.ArrayList;

/**
 *
 * @author RunEvil
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameInitializer init = new GameInitializer();
        //ArrayList<Drug> startDrugs = init.initializeDrugs();
        //ArrayList<Country> countries = init.initializeCountries(startDrugs);
        String name = init.retrieveUsername();
        init.initializeUser(name);
        MainWindow mainWindow = new MainWindow(name);
    }
}
