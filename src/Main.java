public class Main {
    public static void main(String[] args){
        ParentInterface[] operations = {new DIV(), new MOD(), new NOD(), new NOK()};

        int num1 = 234122, num2 = 45;

        for (ParentInterface operation : operations){
            System.out.println(operation.getName());

            System.out.printf("%d %s %d = %d\n", num1, operation.getSign(), num2, operation.operation(num1, num2));
        }
    }

}