public class Person {
    private String name ;
    private int age;
    private String natonality;
    private String address;

    public Person(String name, int age, String natonality, String address) {
       this.name=name;
       setAge(age);
       this.natonality= natonality;
       this.address=address;

    }
    public Person() {
        name = "";
        age=11;
       natonality ="egy";
       address ="Qena";
    }
    public Person(String name, int age) {
        this.name=name;
        setAge(age);
    }
    ///////////////////
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age>0) {
            this.age=age;
           } else {
            this.age=11; 
           }
    }
    public void setNatonality(String natonality) {
        this.natonality = natonality;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    //////////////
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getNatonality() {
        return natonality;
    }
    public String getAddress() {
        return address;
    }
    //////////////////////////
    public void set (String name, int age, String natonality, String address) {
        this.name=name;
        setAge(age);
        this.natonality= natonality;
        this.address=address;
 
     }
    
    public void print(){
        System.out.println(
            "Name = "+ this.name+"\n"+
            "Age = "+ this.age+"\n"+
            "Natonality = "+ this.natonality+"\n"+
            "Address = "+ this.address+"\n"
            );
    }
    

    @Override
    public String toString() {
        //return super.toString();
        return "Name = "+ this.name+"\n"+
            "Age = "+ this.age+"\n"+
            "Natonality = "+ this.natonality+"\n"+
            "Address = "+ this.address+"\n";
    }

    
}
