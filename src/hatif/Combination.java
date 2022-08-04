package hatif;


import java.util.ArrayList;
import java.util.TreeSet;

public class Combination {
    public static void main(String[] args) {
        var m = new int[]{1, 2, 3, 4};
        var list = new ArrayList<Integer>();
        var l = new int[2];
        combination(0, 3, m, list, 0, l);
        System.out.println(list);
        System.out.println(list.size());
        list = new ArrayList<>();
        _combination(0, 3, m, list, 1, 0);
        System.out.println(list);
        System.out.println(list.size());
    }

    static void combination(int startIndex, int digits, int[] memory, ArrayList<Integer> listOfNumbers, int count, int[] val) {
        for (int i = startIndex; i < memory.length; i++) {
            if (count < digits - 1) {
                val[count] = memory[i];
                count++;
                combination(i + 1, digits, memory, listOfNumbers, count, val);
                System.out.println(i+1);
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

    static void _combination(int startIndex, int digits, int[] memory, ArrayList<Integer> listOfNumbers, int count, int val) {
        for (int i = startIndex; i < memory.length; i++) {
            if (count < digits) {
                val = val + (memory[i] * (int) (Math.pow(10, digits - count)));
                count++;
                _combination(i + 1, digits, memory, listOfNumbers, count, val);
                count--;
                val = val - val % 100;
            } else {
                val = val + memory[i];
                listOfNumbers.add(val);
            }

        }
    }
}
