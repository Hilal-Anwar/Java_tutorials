package hatif;


import java.util.ArrayList;
import java.util.TreeSet;

public class Combination {
    public static void main(String[] args) {
        var m = new int[]{1, 2, 3, 4, 5, 6};
        var list = new ArrayList<Integer>();
        var l = new int[3];
        combination(0, 4, m, list, 0, l);
        System.out.println(list);
        System.out.println(list.size());
        var lst = new TreeSet<Integer>();
        _combination(0, 4, m, lst, 1, 0);
        System.out.println(lst);
        System.out.println(lst.size());
    }

    static void combination(int startIndex, int digits, int[] memory, ArrayList<Integer> listOfNumbers, int count, int[] val) {
        for (int i = startIndex; i < memory.length; i++) {
            if (count < digits - 1) {
                val[count] = memory[i];
                count++;
                combination(i + 1, digits, memory, listOfNumbers, count, val);
                count--;
            } else {
                int number = 0;
                for (int j = 0; j < val.length; j++) {
                    int k = val[j];
                    number = number + k * (int) (Math.pow(10, val.length - j));
                }
                number = number + memory[i];
                listOfNumbers.add(number);
            }

        }
    }

    static void _combination(int startIndex, int digits, int[] memory, TreeSet<Integer> listOfNumbers, int count, int val) {
        for (int i = startIndex; i < memory.length; i++) {
            if (count < digits) {
                val = val * 10 + memory[i];
                count++;
                _combination(i + 1, digits, memory, listOfNumbers, count, val);
                count--;
                val = val / 10;
            } else {
                listOfNumbers.add(val * 10 + memory[i]);
            }

        }
    }
}
