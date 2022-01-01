package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        Date cdate=cal.getTime();
        cal.add(Calendar.YEAR,1);
        Date nyear=cal.getTime();
        cal.add(Calendar.YEAR,-2);
        Date pyear=cal.getTime();
        System.out.println("\nCurrent Datde:"+cdate);
        System.out.println("\nDate before 1 year:"+pyear);
        System.out.println("\nDtae after 1 year:"+nyear+"\n");
    }
}


