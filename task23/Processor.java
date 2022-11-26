package ru.mirea.task23;

public class Processor {
    private String manufacturer="";
    private int generation=0;
    private int year_of_release=0;
    public Processor(String manufacturer, int generation, int year_of_release){
        this.manufacturer=manufacturer;
        this.generation=generation;
        this.year_of_release=year_of_release;
    }
    public int hashCode(){
        int result = manufacturer==null?0:manufacturer.hashCode();
        result=31*result+year_of_release;
        return result;
    }
    public static void main(String[] args){
        Processor proc1 = new Processor("Intel",10,2020);
        Processor proc2 = new Processor("Intel", 8, 2018);
        Processor proc3 = new Processor("AMD", 3, 2019);
        Processor proc4 = new Processor("AMD", 2, 2015);
        Processor proc5 = new Processor("Intel", 12, 2022);

        if(proc1.hashCode()==proc5.hashCode()){
            System.out.println("Processor: "+proc1.manufacturer+" "+proc1.generation+" equal to "+proc5.manufacturer+" "+proc5.generation);
        }
        else {
            System.out.println("Processor: " + proc1.manufacturer + " " + proc1.generation + " not equal to " + proc5.manufacturer + " " + proc5.generation);
            System.out.println("Hash-code of processor: " + proc1.manufacturer + " " + proc1.generation + ": " + proc1.hashCode());
            System.out.println("Hash-code of processor: " + proc5.manufacturer + " " + proc5.generation + ": " + proc5.hashCode());
        }
        System.out.println("\n");
        if (proc1.hashCode()==proc2.hashCode()){
            System.out.println("Processor: "+proc1.manufacturer+" "+proc1.generation+" equal to "+proc2.manufacturer+" "+proc2.generation);
        }
        else {System.out.println("Processor: "+proc1.manufacturer+" "+proc1.generation+" not equal to "+proc2.manufacturer+" "+proc2.generation);
        System.out.println("Hash-code of processor: "+proc1.manufacturer+" "+proc1.generation+": "+proc1.hashCode());
        System.out.println("Hash-code of processor: "+proc2.manufacturer+" "+proc2.generation+": "+proc2.hashCode());
        }
        System.out.println("\n");
        if(proc1.hashCode()==proc3.hashCode()){
            System.out.println("Processor: "+proc1.manufacturer+" "+proc1.generation+" equal to "+proc3.manufacturer+" "+proc3.generation);
        }
        else {
            System.out.println("Processor: " + proc1.manufacturer + " " + proc1.generation + " not equal to " + proc3.manufacturer + " " + proc3.generation);
            System.out.println("Hash-code of processor: " + proc1.manufacturer + " " + proc1.generation + ": " + proc1.hashCode());
            System.out.println("Hash-code of processor: " + proc3.manufacturer + " " + proc3.generation + ": " + proc3.hashCode());
        }
        System.out.println("\n");
        if(proc1.hashCode()==proc4.hashCode()){
            System.out.println("Processor: "+proc1.manufacturer+" "+proc1.generation+" equal to "+proc4.manufacturer+" "+proc4.generation);
        }
        else {
            System.out.println("Processor: " + proc1.manufacturer + " " + proc1.generation + " not equal to " + proc4.manufacturer + " " + proc4.generation);
            System.out.println("Hash-code of processor: " + proc1.manufacturer + " " + proc1.generation + ": " + proc1.hashCode());
            System.out.println("Hash-code of processor: " + proc4.manufacturer + " " + proc4.generation + ": " + proc4.hashCode());
        }
    }
}

