public class NOD implements ParentInterface {

    @Override
    public int operation(int num1, int num2){
        if (num1 == 0 || num2 == 0) return num1 + num2;

        int moduleA = Math.abs(num1);
        int moduleB = Math.abs(num2);
        int biggest = Math.max(moduleA,moduleB);
        int smallest = Math.min(moduleA,moduleB);

        return operation(biggest % smallest, smallest);
    }

    @Override
    public String getName(){
        return "НОД";
    }

    @Override
    public String getSign(){
        return "НОД";
    }
}