public class MOD implements ParentInterface {

    @Override
    public int operation(int num1, int num2){
        return num1 % num2;
    }

    @Override
    public String getName(){
        return "MOD";
    }

    @Override
    public String getSign(){
        return "%";
    }
}