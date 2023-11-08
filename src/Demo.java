public class Demo {
    int num; //Instance variables or global variables
    public int add(int n1, int n2){
        return n1+n2;
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
      int r1 = obj.add(3,7);
      System.out.println(r1);
      obj.multiDimenArray();
    }
}
