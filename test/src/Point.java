public class Point {
    private int x;
    private int y;
    Point(){
        x =0 ;
        y =0 ;
    }
    Point(int x ,int y){
        set(x, y);
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void  set (int x , int y ){
        this.x =x ;
        this.y =y ;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void print(){
        System.out.println("X = "+this.x +"Y = "+this.y);
    }
    public String ToString() {
        return "X = "+this.x +"\nY = "+this.y+"\n";
    }

    

    

}
