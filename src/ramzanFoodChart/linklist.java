package ramzanFoodChart;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class linklist {
    public static void main(String[] args) {
        Queue<Integer> queue= new ArrayDeque<>(List.of(-2, -5, -8, -9));
        int i=0;
        while (true){
            queue.poll();
            queue.add(i);
            i++;
            System.out.println(queue);
        }
    }
}
