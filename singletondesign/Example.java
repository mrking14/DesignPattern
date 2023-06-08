package singletondesign;
public class Example {
    public static void main(String[] args) {

        Compnay ceo1 = Compnay.makeCeo();
        System.out.println(ceo1.hashCode());

        Compnay ceo2 = Compnay.makeCeo();
        System.out.println(ceo2.hashCode());

        Head headOffice = Head.getOffice();
        System.out.println(headOffice.hashCode());

        Monitor monitor = Monitor.makeMonitor();
        System.out.println(monitor);

        Monitor monitor1 = Monitor.makeMonitor();
        System.out.println(monitor1);


        

    }
    
}
