package ejercicio.pkg9;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Ejercicio9 {

    public static void main(String[] args) {
        Calendar f1=GregorianCalendar.getInstance();
        Integer a=f1.getActualMaximum(Calendar.DAY_OF_YEAR);
        Integer b=f1.get(Calendar.DAY_OF_YEAR);
        Integer resultado=a-b;
        System.out.println("Faltan:"+ resultado +" dias para acabar el año");
    }
    
}
