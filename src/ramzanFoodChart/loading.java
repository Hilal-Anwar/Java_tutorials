package ramzanFoodChart;

public class loading {
    public static void main(String[] args) {
        Class<?> ramazanFoodListClass= RamazanFoodList.class;
        System.out.println(ramazanFoodListClass.isNestmateOf(RamazanFoodList.class));
        System.out.println(ramazanFoodListClass.getModule());
    }
}
