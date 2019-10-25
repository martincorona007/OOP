import java.io.FileInputStream;
import java.until.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo1 {
    public static void main(String[] args)throws Exception {
    
    /*
    //D1********************************
        FileInputStream fis=new FileInputStream("demo.txt");
        Scanner sc =new Scanner(fis);
            int i=sc.nextInt();
            String n=sc.next();
            while (!n.equals("FIN")){
                System.out.println(i+", Nombre: "+n);
                i=sc.nextInt();
                n=sc.next();
            }
        fis.close();
    */
    /*
    //D2*********************************
        FileOutputStream fos = null;
        PrintStream stdErr = null;
        try {
            fos = new FileOutputStream("errores.txt");
            stdErr = new PrintStream(fos);
            System.setErr(stdErr);
            int[] arr = new int[5];
                for (int i = 0; i < 10; i++) {
                arr[i] = 0;
                }
        } catch (Exception ex) {
             ex.printStackTrace();
        }
        finally {
                try {
                    if (stdErr !=null)stdErr.close();
                    if (fos !=null)fos.close();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
        }
    */
    /*
    //D3***************************
    FileInputStream fis=new FileInputStream(args[0]);
    int c= fis.read();
        while (c!=1){
            System.out.println((char)c);
            c=fis.read();
        }
    fis.close();
    */
    /*
    //D4****************************
    FileReader fr= new FileReader(args[0]);
    FileWriter fw=new FileWriter(args[1]);
          int c= fr.read();
            while (c != -1){
            fw.write(c);
            c=fr.read();
            }
    fw.close();
    fr.close();
    */
    /*
    //D5****************************
    BufferedReader br=new BufferedReader(new FileReader(args[0]));
    BufferedWriter bw=new BufferedWriter(new FileWriter(args[1]));
        int c=br.read();
            while (c!=-1){
                bw.write(c);
                c=br.read();
            }
    bw.close();
    br.close();
    */
 /*
    //D6******************************
    BufferedOutputStream bos = new BufferedOutputStream(new
    FileOutputStream(args[0]));
    DataOutputStream dos = new DataOutputStream(bos);
    Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
            while( i>0 )
            {
            dos.writeInt(i);
            i = scanner.nextInt();
            }
    dos.close();
    bos.close();
*/
/*
    //D7**********************************
    BufferedInputStream bis= new BufferedInputStream(new FileInputStream(args[0]));
    DataInputStream dis = new DataInputStream(bis);
        try{
                int i = dis.readInt();
            while( true ){
                System.out.println(i);
                i = dis.readInt();
            }
        }catch(EOFException ex){
            System.out.println("-- EOF --");
        }
    dis.close();
    bis.close();
    */
  /*
    //D8************************************
     String arch = "persona.dat";
     BufferedOutputStream bos = new BufferedOutputStream(new
     FileOutputStream(arch));
     ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(new Persona(10,"Pablo","23.112.223"));
        oos.writeObject(new Persona(20,"Pedro","35.213.321"));
        oos.writeObject(new Persona(30,"Juan","17.554.843"));
    oos.close();
    bos.close();
*/
    /*
    //D9***************************************
    String arch = "personas.dat";
    BufferedInputStream bis = new BufferedInputStream(
    new FileInputStream(arch));
    ObjectInputStream ois = new ObjectInputStream(bis);
    
    try{
        Persona p = (Persona)ois.readObject();
        while( true ){
            System.out.println( p );
            p = (Persona)ois.readObject();
        }
    }catch(EOFException ex){
        System.out.println("-- EOF --");
    }
    ois.close();
    bis.close();
    */
    }

}
