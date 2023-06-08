package singletondesign;

public class Monitor {
    private static Monitor monitor= new Monitor();

    private Monitor(){}

    public static Monitor makeMonitor(){
        return monitor;

    }


    
}
