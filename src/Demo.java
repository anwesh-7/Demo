class DemoParent
{
   private int age;
   private String name;
    public DemoParent(){
        super(); // Every Constructor has its own default super Constructor
        System.out.println("Inside Default DemoParent Constructor");
    }
    public DemoParent(String names){
        this();
        System.out.println("Inside Parameterized DemoParent Constructor");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // this key word represents the current object creation
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Demo extends DemoParent {
    protected int num; //Instance variables or global variables
    static String staticVariable = "Shared by Diff Objects and Called by Class name.";
    String nonstaticVariable = "Shared by Objects on creation and Called by Object name.";
    // Constructor will be called when ever object is created
    public Demo(){
        // Every Constructor has its own default super Constructor which is hidden. super()
        this("anvi");
        System.out.println("Inside Default Demo Constructor");
    }
    public Demo(String names){
        super(names);
        System.out.println("Inside Parameterized Demo Constructor");
    }
    // Static block will be executed first ahead of constructor. Static block will load only once at time of class loader
    static {
     System.out.println("Static block will be executed first ahead of constructor. " +
             "Static block will load only once at time of class loader");
    }
    public int add(int n1, int n2){
        return num = n1+n2;
    }
    // Passing Object as parameter
    public static void staticmethod(Demo object){
        System.out.println("staticVariable in staticmethod :" + Demo.staticVariable +
                "Can be accessible in Static Methods");
        System.out.println("nonstaticVariable in staticmethod :" + object.nonstaticVariable +
                "Cannot be accessible in Static Methods directly");
    }
    public void nonstaticmethod(){
        System.out.println("staticVariable in nonstaticmethod :" + Demo.staticVariable +
                "Can be accessible in non Static Methods");
        System.out.println("nonstaticVariable in nonstaticmethod :" + nonstaticVariable +
                "Can be accessible in non Static Methods");
    }
    public void multiDimenArray(){
        int[][] num1 = new int[3][4];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++) {
                double va=Math.random()* 100;
                num1[i][j] = (int)va;
                System.out.print(num1[i][j] + " ");
            }
        }
        System.out.println();
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++) {
                System.out.print(num1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(" Enhanced For Loop");
        for(int[] n : num1){
           for (int m : n){
               System.out.print(m+ " ");
           }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Demo obj = new Demo();
//      Demo obj1 = new Demo("anvi");
      DemoParent obj2 = new DemoParent();
      obj2.setAge(27);
      obj2.setName("Anwi");
      System.out.println(obj2.getName() + " : " + obj2.getAge());
      Demo.staticmethod(obj);
      obj.nonstaticmethod();
      int r1 = obj.add(3,7);
      System.out.println(r1);
      obj.multiDimenArray();
    }
}
