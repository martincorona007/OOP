
public class Encapsulate
{
    // private variables declared  
    // these can only be accessed by  
    // public methods of class
    //Attributes
    private String geekName;
    private int geekRoll;
    private int geekAge;

    //Constructor
    //Constructor parameterized(parametrizado)
    public Encapsulate(String GEKSName,int GEKSRoll,int GEKSAge){
        this.geekName=GEKSName;
        this.geekRoll=GEKSRoll;
        this.geekAge=GEKSAge;
        /*
        geekName=GEKSName;
        geekRoll=GEKSRoll;
        geekAge=GEKSAge;
        */

    }
    //Constructor not parameterized(no parametrizado)
    public Encapsulate(){

    }
    public String introduction(String name){
        return "Hi my name is"+name+" ";
    }
    public void introduction(int age){
        System.out.println("I'm "+age+" yeards old");
    }
    public void introduction(Double dato1,int dato2){
        System.out.println("D1 "+dato1+" D2 "+dato2);
    }
    public Double introduction(Double dato1){
        return dato1;
    }


    //GETTERS AND SETTERS
    // get method for age to access  
    // private variable geekAge 
    public int getAge()
    {
        return geekAge;
    }

    // get method for name to access  
    // private variable geekName 
    public String getName()
    {
        return geekName;
    }

    // get method for roll to access  
    // private variable geekRoll 
    public int getRoll()
    {
        return geekRoll;
    }

    // set method for age to access  
    // private variable geekage 
    public void setAge( int newAge)
    {
        geekAge = newAge;
    }

    // set method for name to access  
    // private variable geekName 
    public void setName(String newName)
    {
        geekName = newName;
    }

    // set method for roll to access  
    // private variable geekRoll 
    public void setRoll( int newRoll)
    {
        geekRoll = newRoll;
    }
}
