package package1;
class Sum {
    int  calculate (int ...arr){
        int total = 0;
        for (int a : arr){
            total = total + a;
        }
        return total;
    }
}
public class sum_using_varargs {
    public static void main(String[] args) {
        Sum add = new Sum();
        System.out.println(add.calculate(1, 2, 3, 4 ));
        System.out.println(add.calculate(2,3,4));
        System.out.println(add.calculate(4,5,6));
    }
}
