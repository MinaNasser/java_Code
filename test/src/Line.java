public class Line {
    private Point start;
    private Point end;
    Line(){
        this.start = new Point();
        this.end = new Point();
        
        start.set(0, 0);
        end.set(10, 10);
    }
    Line(Point start , Point end){
        this.start = new Point();
        this.end = new Point();

        this.start.setX(start.getX());
        this.start.setY(start.getY());
        this.end.set(end.getX(),end.getY());
    }
    Line(int x1 ,int y1,int x2,int y2){
        this.start = new Point();
        this.end = new Point(); 
        
        start.set(x1, y1);
        end.set(x2, y2);
    }
    public void setStart(Point start) {
        this.start.set(start.getX(),start.getY());
        
    }
    public void setStart(int x ,int y) {
            this.start.set(x,y);
            
    }


    public void setEnd(Point end) {
        this.end.set(end.getX(),end.getY());
    }
    public void setEnd(int x ,int y) {
        this.end.set(x,y);
    }


    public Point getStart() {
        return start;
    }
    public int getStartX() {
        return start.getX();
    }
    public int getStartY() {
        return start.getY();
    }
    public Point getEnd() {
        return end;
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    String ToString(){
        return "Point Start ( "+start.getX()+","+start.getY()+" )"+"\n"
        +"Point End ( "+end.getX()+","+end.getY()+" )"
        ;
    }




    

    
}
