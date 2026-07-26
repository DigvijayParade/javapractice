import java.util.ArrayList;

public class WrapCls {
    public static void main(String[] args) {

        int x = 10;
        Integer obj1 = Integer.valueOf(x);
        Integer obj2 = 20;

        int y = obj2;

        String s = "100";
        int num1 = Integer.parseInt(s);
        Integer num2 = Integer.valueOf(s);

        Double priceObj = Double.valueOf(45.25);
        double price = priceObj;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(obj1);
        list.add(50);

        System.out.println(obj1);
        System.out.println(y);
        System.out.println(num1 + num2);
        System.out.println(price);
        System.out.println(list);
    }
}