package help;

import javax.swing.plaf.basic.BasicArrowButton;
import java.util.ArrayList;
import java.util.Scanner;

public class gg
{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<Integer> arrayList1=new ArrayList<>();
        for(int a=0;a<10;a++)
            arrayList.add(a);
        for(int i=40;i<50;i++)
            arrayList1.add(i);
        arrayList=arrayList1;
        System.out.println(arrayList);


    }
}
