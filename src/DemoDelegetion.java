/**
 * Created by Egor on 27.04.2015.
 */
public class DemoDelegetion {

    public static void main(String[] args) {
        A a = new A(200);
        B b = new B();
       // b.a = 300;
        System.out.println(a.a);
        System.out.println(b.a);
    }

}
 class A {
    int a;
    String str = "A string";
     A(int a){
         this.a = a;
     }
     A(){

     }



}

 class B extends A {

}
