public class DIV implements ParentInterface {

    @Override
    public int operation(int num1, int num2){
        return num1 / num2;
    }

    @Override
    public String getName(){
        return "DIV";
    }

    @Override
    public String getSign(){
        return "÷";
    }
}