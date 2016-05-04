/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charlie.control;

import charlie.interfaces.IGameInitializer;
import charlie.model.Country;
import charlie.model.Drug;
import charlie.model.Stash;
import charlie.model.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RunEvil
 */
public class GameInitializer implements IGameInitializer {
    
    ArrayList<Drug> startDrugs;
    ArrayList<Drug> inventoryDrugs;
    ArrayList<Country> countries;
    //private String[] columnNames;
    private String currentCountry;
    private int day;
    private Stash stash;
    private double money;
    
    public GameInitializer()
    {
        startDrugs = initializeDrugs();
        countries = initializeCountries(startDrugs);
        stash = new Stash();
        inventoryDrugs = new ArrayList();
    }

    @Override
    public ArrayList<Drug> initializeDrugs() {
        startDrugs = new ArrayList<Drug>();
//        columnNames = new String[4];
//        columnNames[0] = "Name";
//        columnNames[1] = "Price";
//        columnNames[2] = "Amount";
//        columnNames[3] = "Price Strategy";
        
        // 0 = Normal, 1 = Old Memory, 2 = CompleteRand, 3 = Clock, 4 = TwoChoice, 5 = tenPercent, 6 = pickOneOfTen
        
//        ArrayList<String> cocaine = new ArrayList<String>();
//        cocaine.add("Cocaine");
//        cocaine.add("1200.00");
//        cocaine.add("30");
//        cocaine.add("1");

        Drug cocaine = new Drug() {
            {
                name = "Cocaine";
                price = 1200.00;
                availability = 30;
                priceStrategy = 1;
            }
        };
        
//        ArrayList<String> heroin = new ArrayList<String>();
//        heroin.add("heroin");
//        heroin.add("180.00");
//        heroin.add("40");
//        heroin.add("5");

        Drug heroin = new Drug() {
            {
                name = "Heroin";
                price = 180.00;
                availability = 40;
                priceStrategy = 5;
            }
        };
        
//        ArrayList<String> amphetamine = new ArrayList<String>();
//        amphetamine.add("amphetamine");
//        amphetamine.add("200.00");
//        amphetamine.add("50");
//        amphetamine.add("2");

        Drug amphetamine = new Drug() {
            {
                name = "Amphetamine";
                price = 200.00;
                availability = 50;
                priceStrategy = 2;
            }
        };

//        ArrayList<String> acid = new ArrayList<String>();
//        acid.add("acid");
//        acid.add("550.00");
//        acid.add("33");
//        acid.add("2");

        Drug acid = new Drug() {
            {
                name = "Acid";
                price = 550.00;
                availability = 33;
                priceStrategy = 2;
            }
        };

//        ArrayList<String> angelDust = new ArrayList<String>();
//        angelDust.add("angelDust");
//        angelDust.add("1200.00");
//        angelDust.add("30");
//        angelDust.add("6");

        Drug angelDust = new Drug() {
            {
                name = "Angel Dust";
                price = 1200.00;
                availability = 30;
                priceStrategy = 6;
            }
        };
        
//        ArrayList<String> crystalMeth = new ArrayList<String>();
//        crystalMeth.add("crystalMeth");
//        crystalMeth.add("800.00");
//        crystalMeth.add("38");
//        crystalMeth.add("0");

        Drug crystalMeth = new Drug() {
            {
                name = "Crystal Meth";
                price = 800.00;
                availability = 38;
                priceStrategy = 0;
            }
        };
        
//        ArrayList<String> hash = new ArrayList<String>();
//        hash.add("hash");
//        hash.add("180.00");
//        hash.add("100");
//        hash.add("4");
        
        Drug hash = new Drug() {
            {
                name = "Hash";
                price = 180.00;
                availability = 100;
                priceStrategy = 4;
            }
        };

//        ArrayList<String> weed = new ArrayList<String>();
//        weed.add("weed");
//        weed.add("150.00");
//        weed.add("115");
//        weed.add("6");
        
        Drug weed = new Drug() {
            {
                name = "Weed";
                price = 150.00;
                availability = 115;
                priceStrategy = 6;
            }
        };

//        ArrayList<String> mushrooms = new ArrayList<String>();
//        mushrooms.add("mushrooms");
//        mushrooms.add("120.00");
//        mushrooms.add("95");
//        mushrooms.add("3");
        
        Drug mushrooms = new Drug() {
            {
                name = "Mushrooms";
                price = 120.00;
                availability = 95;
                priceStrategy = 3;
            }
        };
        
//        ArrayList<String> valium = new ArrayList<String>();
//        valium.add("valium");
//        valium.add("290.00");
//        valium.add("80");
//        valium.add("0");
        
        Drug valium = new Drug() {
            {
                name = "Valium";
                price = 290.00;
                availability = 80;
                priceStrategy = 0;
            }
        };

        // Add drugs to list
//            startDrugs[0][0] = new ArrayList(); // add another ArrayList object to [0,0]
//            startDrugs[0][0].add(cocaine); // add object to that ArrayList
//            startDrugs[1][0] = new ArrayList(); 
//            startDrugs[1][0].add(heroin); 
//            startDrugs[2][0] = new ArrayList(); 
//            startDrugs[2][0].add(amphetamine); 
//            startDrugs[3][0] = new ArrayList(); 
//            startDrugs[3][0].add(acid); 
//            startDrugs[4][0] = new ArrayList(); 
//            startDrugs[4][0].add(angelDust); 
//            startDrugs[5][0] = new ArrayList(); 
//            startDrugs[5][0].add(crystalMeth); 
//            startDrugs[6][0] = new ArrayList(); 
//            startDrugs[6][0].add(hash); 
//            startDrugs[7][0] = new ArrayList(); 
//            startDrugs[7][0].add(weed); 
//            startDrugs[8][0] = new ArrayList(); 
//            startDrugs[8][0].add(mushrooms); 
//            startDrugs[9][0] = new ArrayList(); 
//            startDrugs[9][0].add(valium);
//            
        startDrugs.add(cocaine);
        startDrugs.add(heroin);
        startDrugs.add(amphetamine);
        startDrugs.add(acid);
        startDrugs.add(angelDust);
        startDrugs.add(crystalMeth);
        startDrugs.add(hash);
        startDrugs.add(weed);
        startDrugs.add(mushrooms);
        startDrugs.add(valium);
        
        return startDrugs;
    }


    
     @Override
    public ArrayList<Country> initializeCountries(ArrayList<Drug> startDrugs) {
            countries = new ArrayList<>();

        Country denmark = new Country() {
            {
                name = "Denmark";
                drugs = startDrugs;
            }
        };

        Country colombia = new Country() {
            {
                name = "Colombia";
                drugs = startDrugs;
            }
        };

        Country germany = new Country() {
            {
                name = "Germany";
                drugs = startDrugs;
            }
        };

        Country usa = new Country() {
            {
                name = "USA";
                drugs = startDrugs;
            }
        };

        Country france = new Country() {
            {
                name = "France";
                drugs = startDrugs;
            }
        };

        Country afghanistan = new Country() {
            {
                name = "Afghanistan";
                drugs = startDrugs;
            }
        };

        countries.add(denmark);
        countries.add(colombia);
        countries.add(germany);
        countries.add(usa);
        countries.add(france);
        countries.add(afghanistan);
        
        return countries;
    }
    
//    public String[] getColumnNames(){
//        return columnNames;
//    }

    
    public ArrayList<Drug> getDrugs()
    {
        return startDrugs;
    }
    
    public ArrayList<Country> getCountries(){
        return countries;
    }
    
    public String retrieveUsername(){
        String name;
        name = JOptionPane.showInputDialog("What is your name?");
        if (name.isEmpty())
        {
            name = "Peter";
        }
        return name;
    }
    
    public String getCurrentCountry()
    {
        return currentCountry;
    }
    
    public void setCurrentCountry(String currentCountry)
    {
        this.currentCountry = currentCountry;
    }
    
    public boolean nextDay(String selectedCountry)
    {
        boolean gameOver = false;
        
        // Check if it is a new country that has been selected 
        day++;
        if(day > 20)
        {
            gameOver();
            gameOver = true;
        }
        
        return gameOver;
    }
    
    public void gameOver()
    {
        JOptionPane.showMessageDialog(null, "Game over!\nYour drugs are being sold and your final score is being calculated!");
        //Sell inventory and calculate highscore
        JOptionPane.showMessageDialog(null, "Congratulations "); // username + final score...
        // Show highscore list
    }
    
    public void setDay(int i){
        this.day = i;
    }
    
    public int getDay(){
        return day;
    }
    
    public Stash getStash(){
        return stash;
    }
    
    public ArrayList getStashDrugs(){
        return stash.getDrugs();
    }
    
    public void setDrugs(String str){
        
        for (int i = 0; i < startDrugs.size(); i++) {
            
            if(str.equals(startDrugs.get(i).getName()))
                
                inventoryDrugs.add(startDrugs.get(i));
        }
        stash.setDrugs(inventoryDrugs);
    }
    
    public boolean checkInventory(String str){
        boolean inventoryDrug = true;
        
        if (inventoryDrugs.size() > 0){
            for (int i = 0; i < inventoryDrugs.size(); i++) {
                if (str.equals(inventoryDrugs.get(i).getName())){
                    inventoryDrug = true;
                }
                else{
                    inventoryDrug = false;
                    }
            }
        }
        else{
            inventoryDrug = false;
        }
        return inventoryDrug;
    }
    
    public double getMoney(){
        money = stash.getMoney();
        return money;
    }
    
    public void setMoney(double money){
        stash.setMoney(money);
    }
    
      @Override
    public User initializeUser(String input) {
 return new User() {
            {
                name = input;
                stash = initializeStash();
            }
        };
    }
    
    //-----------------   PRIVATE METHODS ----------------------//
    private Stash initializeStash() {
        return new Stash();
    }
 
}
