package sessionDay02;

public class SampleProgramDay2 {

	  //public class sampleProgramDay2 {

    //instance variables which can be seen in any child class
    public String name = "Java Classes";
    public int date = 23;
    //instance variable which is visible only to this class
    private static int month = 12;
    protected static int z =40;

    //static/Class variables which can be viewed throughout the class and outside the class also
    public static String students = "learning";
    public static String tutors = "earning";
    
    public static int a =16;


    //Main method
    public static void main (String []args){

        SampleProgramDay2 d = new SampleProgramDay2();  //creating an aobject of the class by reference data type
        d.newStatement("peacock", "Tiger", 24);     //calling a non static method
        int result = addNumbers();
        System.out.println("******************  "+ result);
        statement();

    }

    public void oldStatement() {
        System.out.println("******************  The "+name+" started from "+date+"");
    }

    //method with void keyword and static
    public static void statement(){
        System.out.println("******************  "+students+" and "+tutors+" are required in life");
    }


    //method with return type 'int'
    public static int addNumbers(){

       
        int b = 4;
        int c = a+b;
        int d = c+ month;
        return d;
    }

    //method with return type and non - static
    public String newStatement(String bird, String animal, int age){
        oldStatement();
        String newLine = "******************  "+bird+" and "+animal+" are beautiful with "+age+"";
        System.out.println(newLine);
        return newLine;
}
}
