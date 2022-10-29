package util;

import java.util.Arrays;
import java.util.Comparator;

public final class Util {
    public static void print(Object object) {
        System.out.print(object);
    }

    public static void println(Object object) {
        System.out.println(object);
    }
    public static void println(Object []objects){
        System.out.println(Arrays.toString(objects));
    }
    public static void println(Object [][]objects){
        System.out.println(Arrays.deepToString(objects));
    }
    public static int findMax(int []a){
        return _find_max(a,0,a.length,a[0]);
    }
    public static int findMaxFrom(int []a,int from){
        return _find_max(a,from,a.length,a[from]);
    }
    public static int findMaxInBetween(int []a,int from,int to){
        to=to<a.length?to+1:to;
        return _find_max(a,from,to,a[from]);
    }
    public static int findMin(int []a){
        return _find_min(a,0,a.length,a[0]);
    }
    public static int findMinFrom(int []a,int from){
        return _find_min(a,from,a.length,a[from]);
    }
    public static int findMinInBetween(int []a,int from,int to){
        to=to<a.length?to+1:to;
        return _find_min(a,from,to,a[from]);
    }
    private static int _find_max(int []a,int index,int endIndex,int max){
        return index<endIndex ?_find_max(a,index+1,endIndex,Math.max(a[index],max)):max;
    }
    private static int _find_min(int []a,int index,int endIndex,int min){
        return index<endIndex?_find_min(a,index+1,endIndex,Math.min(a[index],min)):min;
    }
}
