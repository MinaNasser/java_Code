public class Rectangel implements  RectInterface{
    private double len ;
    private double wid;

    
    public Rectangel(double l, double w) {
        set(l,w);
    }
    public Rectangel() {
            this.len = 5;
            this.wid = 10;
    }
    public Rectangel(Rectangel r) {
            this.len = r.len;
            this.wid = r.wid;
    }
    
    public double getLen() {
        return len;
    }
    public double getWid() {
        return wid;
    }
    public void setLen(double l) {
        if (l > 0 ) {
            this.len = l;
        }else{
            this.len = 5 ; 
        }
    }
    public void setWid(double w) {
        if(w >0 ){
            this.wid = w;
        }else{
            this.wid = 10 ;
        }
    }
    public void set(double l , double w ){
        setLen(l);
        setWid(w);
    }
    public double per()
    {
        return 2*(this.len + this.wid);
    }
    public double area()
    {
        return this.len * this.wid;
    }
    
    public void print(){
        System.out.println("length = "+ this.len+ "\n"+"Width  = "+ this.wid);
    }
    public void modify(Rectangel r ){
        r.len=1;
        r.wid=1;
    }
    public boolean compare(Rectangel rec1,Rectangel rec2){
        if(rec1.len == rec2.len && rec1.wid==rec2.wid){
            return true;
        }
        else
        return false;
    }
    public boolean equal (Rectangel r) {
        if (this.len == r.len && this.wid == r.wid ) {
            return true;
        }
        return false;
    }

    public Rectangel add(Rectangel r1 ){
        Rectangel z =new Rectangel() ; 
        z.len = r1.len + this.len; 
        z.wid = r1.wid + this.wid; 
        return z ;
    }

}
