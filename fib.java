public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        System.out.println(F(6));
     }
     public static int F(int N) {
        if (N==0) {
            return 0;
        }
        if (N==1) {
            return 1;
        }
        return F(N-1) + F(N-2);
    }
}
