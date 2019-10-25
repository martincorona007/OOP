/**
* Created by Martincorona007 on 07/04/2017.
*/
public class InvocacionMetodos {
    public static void main(String[] args) {
        C obj=new D();
           obj.p(obj);
          ((D)obj).p(obj);
        obj.p((D)obj);
    }
}