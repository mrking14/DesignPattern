package singletondesign ;

public class Compnay {

    // private object 
    private static Compnay ceo;

    // Constructor
    private Compnay(){ 
    }

    public static Compnay makeCeo(){
        if(ceo==null)

            ceo = new Compnay();

        return ceo;
    }


    
}
