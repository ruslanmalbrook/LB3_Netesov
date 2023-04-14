public class NOK implements ParentInterface {
    @Override
    public String getName(){
        return "НОК";
    }

    @Override
    public String getSign(){
        return "НОК";
    }

    @Override
    public int operation(int num1, int num2){
        if (num1 == 0 || num2 == 0) return 0;

        int moduleA = Math.abs(num1);
        int moduleB = Math.abs(num2);
        int biggest = Math.max(moduleA,moduleB);
        int smallest = Math.min(moduleA,moduleB);

        int nok = biggest;

        while (nok % smallest !=0)
            nok += biggest;

        return nok;
    }
}