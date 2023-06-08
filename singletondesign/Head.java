package singletondesign;
public class Head {

    private static Head  headOffice;
    
    private  Head() {}

    public static Head getOffice(){
        headOffice = new Head();

        return headOffice;
    }


    
}