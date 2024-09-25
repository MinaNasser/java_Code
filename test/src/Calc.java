public class Calc {
    public static int add(int x , int y){
        return x+y;
    }
    public static int sub(int x , int y){
        return x-y;
    }
    public static int mul(int x , int y){
        return x*y;
    }
    public static int div(int x , int y){
        if(y==0){
            System.out.println("This division is wrong ");
            return 0;
        }
        return x/y;
    }
    
}
