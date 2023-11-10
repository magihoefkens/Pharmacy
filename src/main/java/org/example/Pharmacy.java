package org.example;
import java.util.Map;
import java.util.HashMap;

public class Pharmacy {
    Map<String,Medication>medicationMap=new HashMap<>();

    public Pharmacy(Map<String, Medication> medicationMap) {
        this.medicationMap = medicationMap;
    }
    public int getCount(){
        return medicationMap.size();
    }
    public void save(Medication medication){
        this.medicationMap.put(medication.getName(), medication);
    }
    public Medication find(String medikationName){
        Medication med=this.medicationMap.get(medikationName);
        return med;
    }
    public void delete(String medicationName){
        this.medicationMap.remove(medicationName);
    }
    public void printAllMedications(){
        for (Map.Entry<String, Medication> eintrag : medicationMap.entrySet()) {
            System.out.println("Key: " + eintrag.getKey() + ", Value: " + eintrag.getValue().toString());
        }
    }
}
