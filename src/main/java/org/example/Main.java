package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Medication med1= new Medication("Voltaren",12.13,true);
        Medication med2= new Medication("Ibuprofen",11.45,true);
        Medication med3= new Medication("Paracetamol",7.80,false);
        Medication med4= new Medication("Prospan",9.33,true);
        Map apoMap=new HashMap<>();
        apoMap.put("Voltaren",med1);
        apoMap.put("Ibuprofen",med2);
        apoMap.put("Paracetamol",med3);
        Pharmacy apo= new Pharmacy(apoMap);
        apo.printAllMedications();
        apo.save(med4);
        apo.printAllMedications();

        System.out.println("Finde mir Prospan: "+apo.find("Prospan").toString());
        apo.delete("Voltaren");
        apo.printAllMedications();


    }
}