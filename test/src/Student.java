public class Student extends Person {
    private double gpa;
    private int level ;
    private String department;
    public Student() {
        gpa =2;
        level =3;
        department = "CS";
    }
    public Student(String name, int age, String natonality, String address, double gpa, int level, String department) {
        super(name, age, natonality, address);
        setGpa(gpa);
        setLevel(level);
        this.department = department;
    }
    public Student(String name, int age, double gpa, int level, String department) {
        super(name, age);
        setGpa(gpa);
        setLevel(level);
        this.department = department;
    }
    public void setGpa(double gpa) {
        if (gpa>=0 && gpa<=4) 
        {
            this.gpa = gpa;    
        }
        else{
            this.gpa = 0;
        }
    }
    public void setLevel(int level) {
        if (level>=0 && level<=4) 
        {
            this.level = level;    
        }
        else{
            this.level = 0;
        }
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public void set(String name, int age, String natonality, String address, double gpa, int level, String department){
        set(name, age, natonality, address);
        setGpa(gpa);
        setLevel(level);
        setDepartment(department);
    }
    public double getGpa() {
        return gpa;
    }
    public int getLevel() {
        return level;
    }
    public String getDepartment() {
        return department;
    }
    @Override
    public void print(){
        super.print();
        System.out.print(
            "GPA = "+ this.gpa+"\n"+
            "Level= "+ this.level+"\n"+
            "Department = "+ this.department+"\n"
            );
    }
    @Override
    public String toString() {
        return super.toString()+ "GPA = "+ this.gpa+"\n"+
            "Level= "+ this.level+"\n"+
            "Department = "+ this.department+"\n";
    }

}
