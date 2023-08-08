////using thread class
///*class A extends Thread {
//public void run() {
//        System.out.println("running");
//        System.out.println("finished");
//        }
//        };
//class B extends Thread{
//    public void run(){
//        System.out.println("sleeping");
//        System.out.println("finished");
//
//    }
//}
//public class Practice2 {
//    public static void main(String[] args) {
//        A o = new A();
//         B o1=new B();
//         o.start();
//            o1.start();
//    }
//}*/
///*import java.util.*;
//import java.util.Scanner;
//public class Practice2{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n;
//        System.out.println("Enter the size of an array");
//        n=sc.nextInt();
//        int arr[]=new int[n];
//        System.out.println("Enter the elements:");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt( );
//        }
//        int temp;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[i]);
//                }
//            }
//        }
//        System.out.println();
//    }
//}*/
///*class Practice2 {
//    public static void main(String[] args) {
//        String s = "Lopa is left for armed forces";
//        int count = 0;
//        for (int i = 1; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
//                count++;
//            }}
//            System.out.println(count);
//        }
//    }*/
//
//import org.w3c.dom.ls.LSOutput;
//
//import javax.swing.*;
//import java.sql.SQLOutput;
//import java.util.*;
//import java.util.Scanner;
//
///*public class Practice2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ENter  a string:");
//        String str = sc.nextLine();
//        int length = str.length();
//        // length=sc.nextInt();
//        int midIn = length / 2;
//        // midchar=sc.nextInt();
//        char midChar;
//        if (midIn % 2 == 0) {
//            midChar = str.charAt(midIn - 1);
//            System.out.println("middle character is:" + midChar+str.charAt(midIn));
//        } else {
//            midChar = str.charAt(midIn);
//            System.out.println("middle character is:" + midChar);
//        }
//    }
//}*//*public class Practice2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ENter  a string:");
//        String str = sc.nextLine();
//        char[] arr = str.toCharArray();
//        Arrays.sort(arr);
//        String newS = new String(arr);
//        System.out.println("Sorted string is:" + newS);
//
//    }
//}*/
///*public class Practice2 {
//    enum color {
//        red, blue, green;
//    }
//
//    public static void main(String[] args) {
//        color c = color.red;
//        System.out.println(c);
//        switch (c) {
//            case red:
//                System.out.println("Color is red");
//                break;
//            case blue:
//                System.out.println("color is blue");
//                break;
//            case green:
//                System.out.println("color is green");
//                break;
//
//        }
//
//    }
//
//}*/
///*enum days {
//    sun(30),mon(20),tue(10);
//    int k;
//    days(int i)
//    {
//        k=i;
//    }
//    public int getData(){
//        return k;
//    }
//}
//
//public class Practice2{
//
//    public static void main(String[] args) {
//        days d=days.sun;
//        System.out.println(d.getData());
//    }
//
//}*/
///*import java.lang.reflect.*;
//class x
//{
//        private int a=10;
//    }
//public class Practice2{
//    public static void main(String[] args) throws Exception {
//        x ob=new x();
//        Field f=x.class.getDeclaredField("a");
//        f.setAccessible(true);
//        System.out.println(f.get(ob));
//    }
//}*/
///*public class Practice2{
//    public static void main(String[] args) {
//        String ss="hello";
//        String aa=ss.replace('l','w');
//        if(ss==aa)
//        {
//            System.out.println("equals");
//        }
//        else{
//            System.out.println("not equal");
//        }
//        StringBuffer ab1=new StringBuffer("Ilikejava");
//        StringBuffer sb1=ab1.delete(0,2);
//        if(sb1==ab1){
//            System.out.println("equals");
//        }
//        else{
//            System.out.println("not equal");
//        }
//    }
//}*/
///*public class Practice2 {
//    int data;
//    public static void main(String[] args) {
//
//        Practice2 tt=new Practice2();
//        tt.data=100;
//        Practice2 aa=new Practice2();
//        aa.data=100;
//        System.out.println(tt.hashCode());
//        System.out.println(aa.hashCode());
//        if(tt.equals(aa)){
//            System.out.println("equals");
//        }
//    else {
//            System.out.println("not equal");
//        }
//    aa=tt;
//        System.out.println(tt.hashCode());
//        System.out.println(aa.hashCode());
//        if(aa.equals(tt)){
//            System.out.println("equls");
//        }
//        else {
//            System.out.println("not equal");
//        }
//}*/
///*public class Practice2 {
//    public static void main(String[] args) {
//        Object ob = new String("hello");
//        Object ob1 = new String("hello");
//        System.out.println(ob.hashCode() + "xt" + ob1.hashCode());
//        if (ob.equals(ob1)) {
//            System.out.println("equal");
//        } else
//            System.out.println("not equal");
//        Object ob2 = new StringBuffer("hello");
//        Object ob3 = new StringBuffer("hello");
//        System.out.println(ob2.hashCode() + "xt" + ob3.hashCode());
//        if (ob2.equals(ob3)) {
//            System.out.println("equals");
//        } else
//            System.out.println("not equal");
//    }
//}*/
///*public class Practice2{
//    public static void main(String[] args) {
//        String ss=new String("java");
//         Class aa=ss.getClass();
//        String name=aa.getName();
//        Practice2 tt=new Practice2();
//        Class tt1=tt.getClass();
//        String s=tt1.getName();
//        System.out.println(name);
//        System.out.println(s);
//    }
//}*/
///*public class Practice2 implements Cloneable {
//    String name;
//    int roll;
//    public String getName(){
//        return name;
//    }
//    public int getRoll(){
//        return roll;
//    }
//    public void SetName(String name)
//    {
//        this.name=name;
//    }
//    public void setRoll(int roll){
//        this.roll=roll;
//    }
//
//    public static void main(String[] args) {
//        Practice2 tt=new Practice2();
//        tt.SetName("java");
//        tt.setRoll(34);
//        try {
//            Practice2 aa = (Practice2) tt.clone();
//            System.out.println("NAme is" + tt.getName() + "roll no is" + tt.getRoll());
//            System.out.println(aa.getName() + "\t" + aa.getRoll());
//            if (aa.equals(tt)) {
//                System.out.println("equals");
//            } else System.out.println("not equal");}
//        catch (CloneNotSupportedException e){
//            System.out.println("object is not cloned");
//        }
//
//    }
//}*/
///*public class Practice2 {
//    int i;
//
//    int fun() {
//        i++;
//        return i;
//    }
//
//    static void show() {
//        Practice2 c = new Practice2();
//        c.i++;
//        c.fun();
//        System.out.println("value of i=" + c.i);
//    }
//
//    public static void main(String[] args) {
//            show();
//            System.gc();
//        }
//        public void finalize()
//
//        {
//            System.out.println("job over");
//        }
//    }*/
///*public class Practice2{
//    public static void main(String[] args) {
//        String name=System.getProperty("java.version");
//        System.out.println(name);
//    }
//}*/
///*public class Practice2{
//    public static void main(String[] args) {
//        Runtime rr=Runtime.getRuntime();
//        System.out.println("Total memory is:"+ rr.totalMemory());
//        System.out.println("Free memory is:"+rr.freeMemory());
//        System.out.println("java");
//    }
//}*/
///*import java.io.*;
//public class Practice2 {
//    public static void main(String[] args) throws Exception{
//        String str={"mspaint","HD.jpg"};
//        Runtime rr=Runtime.getRuntime();
//        Process pp=rr.exec(str);
//        InputStream is=pp.getInputStream();
//        int ch;
//        while((ch=is.read)!=-1){
//            System.out.println(char(ch));
//        }
//
//    }
//}*/////////////////Doubt
//import java.io.*;
///*public class Practice2 {
//    public static void main(String[] args)throws Exception {
//       File f=new File("a.txt");
//       f.createNewFile();
//       f.setReadOnly();
//
//    }
//}*/
///*public class Practice2 {
//    public static void main(String[] args)throws Exception {
//        File f = new File("a.txt");
//        File f1 = new File("b.txt");
//        boolean b=f.renameTo(f1);
//        if(b){
//            System.out.println("file is rename");
//        }
//        else{
//            System.out.println("not");
//        }
//    }}*/
///*public class Practice2 {
//    public static void main(String[] args) {
//        File f = new File(" ");
//        File roots[]=f.listRoots();
//        for(int i=0;i<roots.length;i++){
//            System.out.println(roots[i]);
//        }
//        java.util.Scanner sc=new java.util.Scanner(System.in);
//        System.out.println("Enter your drive name");
//        String dname=sc.nextLine();
//        File f1=new File(dname);
//        File fname[]=f1.listFiles();
//        for(int i=0;i< fname.length;i++){
//            System.out.println(fname[i]);
//        }
//
//    }
//}*/
///*import java.lang.*;
//public class Practice2 {
//    void show() {
//        System.out.println("checked exception");
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("caught");
//            System.out.println(e.getMessage());//returns the reason of exception
//        }
//        System.out.println("check the code");
//    }
//void display() throws Exception{
//    throw new Exception();
//    }
//    public static void main(String[] args) {
//    Practice2 c=new Practice2();
//    c.show();
//    try{
//        c.display();
//    }
//    catch(Throwable t){
//        System.out.println("Checked exception is handled");
//    }
//
//    }
//}*/
///*import java.lang.*;
//public class Practice2{
//
//        public void show(){
//            System.out.println("Unchecked Exception");
//        try{
//            throw new Error();
//        }
//        catch(Error e){
//            System.out.println("caught");
//        }
//            System.out.println("java");}
//        void display()
//        {
//            throw new Error();
//            }
//            public static void main(String[] args) {
//            Practice2 p=new Practice2();
//            p.show();
//            try{
//                p.display();
//            }
//            catch(Throwable t){
//                System.out.println("Handled by unchecked exception");
//            }
//            }
//    }*/
///*public class Practice2{
//    public static void main(String[] args) {
//        int j=100;
//        int i=args.length;
//        try {
//            System.out.println(j / i);
//        }
//        catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}*/
//import java.util.Scanner;
///*class zeroException extends Exception {
//    public zeroException(String msg) {
//        super("Don't enter zero");
//        this.msg = msg;
//    }
//
//    String msg;
//
//    public String getMessage() {
//        return msg;
//    }
//
//    public String toString() {
//        return "Zero Exception";
//    }
//}
//public class Practice2 {
//    int get() throws zeroException{
//       Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int data=sc.nextInt();
//        if(data==0){
//            throw new zeroException("As input value is zero");
//        }
//        else{
//            return data;
//        }
//}
//
//    public static void main(String[] args) {
//        Practice2 p=new Practice2();
//        try{
//            int a=p.get();
//            System.out.println("input number is "+a);
//        }catch(zeroException i){
//            System.out.println(i.getMessage());
//            System.out.println(i);
//        }
//    }
//
//}*/
///*public class Practice2{
//    public static void main(String[] args) {
//        try{
//            System.out.println(10/args.length);
//            try{
//                System.out.println(args[1]);
//            }
//            catch(StringIndexOutOfBoundsException e){
//                System.out.println("caught");
//            }}
//        catch(ArithmeticException r){
//            r.printStackTrace();
//        }
//    }
//}*/
///*public class Practice2 {
//    public static void main(String[] args) {
//        int a=100;
//        try{
//            System.out.println(a/args.length);
//            System.out.println(args[3]);
//            int arr[] [];
//            arr= new int[1] [];
//            System.out.println(arr[0].length);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Enter command line");
//        }
//        catch(ArrayIndexOutOfBoundsException Aoe){
//            System.out.println("enter four element in command line");
//        }
//        catch(NullPointerException Re){
//            System.out.println("Construct the column");
//        }
//    }
//}*/
//import java.io.*;
//
///*public class Practice2 {
//    void Printnumber() throws IOException{
//        try{
//            DataInputStream dis=new DataInputStream(System.in);
//            System.out.println("Enter A number");
//            int num=Integer.parseInt(dis.readLine());
//            System.out.println("number is"+num);
//        }
//        catch(NumberFormatException ne){
//            System.out.println("Enter a number");
//        }
//        finally{
//            System.out.println("Exception is caught");
//        }
//    }
//    void display() {
//        char ch[] = {'A', 'B', 'C'};
//        try {
//            String s1 = new String(ch, 2, 2);
//            System.out.println(s1);
//        } catch (ArrayIndexOutOfBoundsException Aoe) {
//            System.out.println("caught");
//        } finally {
//            System.out.println("unable to caught exception");
//        }
//    }
//       public static void main(String[] args)throws IOException{
//            Practice2 p=new Practice2();
//            p.Printnumber();
//            p.display();
//        }
//    }*/
///*public class Practice2{
//    int getNumber() throws Exception{
//        int num=10;
//        num++;
//        try{
//            throw new Exception();
//        }
//        catch(Exception e){
//            System.out.println("Number is:"  +num);
//            throw e;
//        }
//        finally{
//            return num;
//        }}
//        public static void main(String args[]){
//          Practice2 p=new Practice2();
//          try{
//              int i=p.getNumber();
//              System.out.println(i);
//          }
//          catch(Exception e) {
//          }
//          }
//}*/
///*class Ex1 extends Exception {
//}
//class Ex2 extends Exception{
//
//}
//class Practice2{
//    void m1()throws Ex1{
//        throw new Ex1();
//    }
//    void m2()throws Ex2{
//
//    }
//
//    public static void main(String[] args) {
//        int a,b,c,d;
//        a=b=c=d=0;
//        Practice2 p=new Practice2();
//        try{
//            p.m1();
//          a++;
//        }
//        catch(Ex1 e)
//        {
//            b++;
//        }
//        try{
//            p.m2();
//            c++;
//        }
//        catch(Ex2 e1){
//            d++;
//        }
//        System.out.println(a+b+c+d);
//    }
//}*/
///*class Ex1 extends Exception{
//
//}
//public class Practice2 {
//    void m1() throws Exception
//    {
//        throw new Ex1();
//    }
//
//    public static void main(String[] args) {
//        Practice2 p = new Practice2();
//        try {
//            p.m1();
//        } catch (Exception e) {
//            System.out.println("java");
//        }
//    }
//}*/
///*class Ex1 extends Exception {
//}
//
//class Ex2 extends Ex1 {
//}
//
//class Ex3 extends Ex2 {
//}
//
//public class Practice2 {
//    public static void main(String[] args) {
//        int a, b, c, d, e, f;
//        d = c = b = e = f = a = 0;
//            int x = 1;
//            try {
//                switch (x) {
//                    case 1:
//                        throw new Ex1();
//                    case 2:
//                        throw new Ex2();
//                    case 3:
//                        throw new Ex3();
//                }
//                a++;
//            } catch (Ex3 ex3) {
//                b++;
//            } catch (Ex2 e2) {
//                d++;
//            } catch (Ex1 ex1) {
//
//            } catch (Exception ee) {
//                e++;
//            } finally {
//                c++;
//                f++;
//            }
//            System.out.println("a=" + a + "b=" + b + "c=" + c + "d=" + d + "e=" + e + "f=" + f);
//    }
//}*/
///*public class Practice2{
//    void display() throws Exception{
//        if(true){
//            throw new Error();
//        }
//        else {
//            throw new Exception();
//        }}
//        public static void main(String[] args){
//           Practice2 p=new Practice2();
//           try {
//               p.display();
//        }
//           catch(Error e){
//               System.out.println("caught Error");
//           }
//           catch(Exception ee){
//               System.out.println("hello");
//           }
//    }
//}*/
///*import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//public class Practice2 {
//    public static void main(String[] args) {
//        try {
//            FileInputStream fis = new FileInputStream("e:/java/aa.txt");
//            System.out.println("\n read the data from the file");
//            int ch;
//            while ((ch = fis.read()) != -1) {
//                System.out.println((char) ch);
//            }
//        } catch (FileNotFoundException fe) {
//            System.out.println("enter the original path of file");
//        } catch (IOException Ie) {
//
//        }
//    }
//}*/
///*class Base {
//    int data;
//}
//
//class Child extends Base {
//
//}
//
//public class Practice2 {
//    public static void main(String[] args) {
//        Base ab = new Child();
//        Child aa = (Child) ab;
//        //child some = new Base();
//        System.out.println(ab.data);
//        System.out.println(aa.data);
//        //Child cc = (Child) new Base();
//        try {
//            Child cc = (Child) new Base();
//        } catch (ClassCastException e) {
//            System.out.println("caught");
//        }
//    }
//}*/
///*class X{
//    public void show(){
//        System.out.println("java");
//    }
//}
//class Y extends X{
//    public void show() throws Exception{
//        throw new Exception();
//    }
//}
//public class Practice2{
//    public static void main(String[] args) {
//        Y ab=new Y();
//
//        try {
//            ab.show();
//        } catch (Exception e) {
//            System.out.println("java");
//        }
//
//    }
//}*///so methods  throw exception can't be override
///*import java.io.InputStream;
//import java.io.IOException;
//public class Practice2{
//    public static void main(String[] args) {
//        Runtime rr=Runtime.getRuntime();
//        String str="hostname";
//        try {
//            Process pp = rr.exec(str);
//            InputStream is = pp.getInputStream();
//            int ch;
//            System.out.println("read the host name");
//            while ((ch = is.read()) != -1) {
//                System.out.println((char) ch);
//            }
//            is. close();
//        }
//        catch(IOException ie){
//            ie.printStackTrace();
//            }
//        }
//    }*/
//import java.io.*;
///*public class Practice2 {
//    public static void main(String[] args) {
//        PrintStream ps=new PrintStream(System.out);
//        ps.println("Welcome to java");
//    }
//}*/
///*public class Practice2 {
//    void writeData()throws IOException,FileNotFoundException{
//        FileOutputStream fos=new FileOutputStream("F/java/k1.txt");
//        System.out.println("Write the data in the file:");
//        String data=get();
//        byte Input[]=data.getBytes();
//        fos.write(Input);
//        fos.close();}
//    String get()throws IOException {
//        System.out.println("Enter the data:");
//        DataInputStream dis = new DataInputStream(System.in);
//        String line = dis.readLine();
//        return line;
//    }
//     void readData() throws IOException,FileNotFoundException{
//         System.out.println("read the data from the file");
//         FileInputStream fis=new FileInputStream("f:/java/k1.txt");
//         int ch;
//         while((ch=fis.read())!=-1){
//             System.out.println((char)ch);
//             fis.close();
//         }}
//         public static void main(String[] args){
//        Practice2 p=new Practice2();
//        try {
//            p.writeData();
//        }
//        catch(IOException fe) {
//            if (fe instanceof FileNotFoundException) {
//                System.out.println("file not present");
//            } else {
//                System.out.println("Exception");
//            }
//        }
//        try
//            {
//                p.readData();
//            }
//                 catch(IOException ioe)
//                 {
//                     System.out.println("yes");
//                 }
//    }
//}*/
///*import java.io.*;
//public class Practice2{
//    public static void main(String[] args) {
//        try {
//            DataInputStream dis = new DataInputStream(System.in);
//            System.out.println("Enter the number of lines:");
//            int size = Integer.parseInt(dis.readLine());
//            FileOutputStream fos = new FileOutputStream("F:/java/k2.txt");
//            String ss[] = new String[size];
//            System.out.println("Enter the data");
//            int j = 0;
//            c1:
//            for (int i = 0; i < size; i++) {
//                ss[i] = dis.readLine();
//                int m = ss[i].length();
//                byte c[] = ss[i].getBytes();
//                c2:
//                for (j = 0; j < m; j++) {
//                    if ((c[j] == 'e') && (c[j + 1] == 'n') && (c[j + 2] == 'd')) {
//                        c[j] = '\n';
//                        break c2;
//                    }
//                    fos.write(c[j]);
//                }
//
//                    if (j == (m - 1)) {
//                        c[j] = '\n';
//                        fos.write(c[j]);
//                    }
//
//                }
//
//            System.out.println("read the data from the file");
//            FileInputStream fis = new FileInputStream("F:/java/k2.txt");
//            int ch;
//            while ((ch = fis.read()) != -1) {
//                System.out.println((char) ch);
//            }
//            fis.close();
//            fos.close();
//        }
//                catch(FileNotFoundException e){
//                    System.out.println("file not found");
//                }
//                catch(IOException ie){
//                    System.out.println("y");
//                }
//            }
//        }*/
///*import java.io.*;
//
//public class Practice2 {
//    public static void main(String[] args) {
//        try {
//            DataInputStream dis = new DataInputStream(System.in);
//            System.out.println("Enter the data:");
//            String data = dis.readLine();
//            System.out.println("\n write data in the buffer");
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            byte b[] = data.getBytes();
//            bos.write(b);
//            System.out.println("copy the content of the buffer file");
//            FileOutputStream fos = new FileOutputStream("F:/java/kk.txt");
//            bos.writeTo(fos);
//            fos.close();
//            bos.close();
//            System.out.println("\n read the data from the buffer");
//            byte input[]=bos.toByteArray();
//            ByteArrayInputStream bis = new ByteArrayInputStream(input, 0, 15);
//            int ch;
//            while ((ch = bis.read()) != -1) {
//                System.out.println((char) ch);
//                bis.close();
//                System.out.println("Read the data from the file");
//                FileInputStream fis = new FileInputStream("F:/java/kk.txt");
//                while ((ch = fis.read()) != -1) {
//                    System.out.print((char)ch);
//                }
//                fis.close();
//            }
//        } catch (FileNotFoundException fe) {
//            System.out.println("filenotfound");
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//    }
//}*/
///*import java.io.*;
//public class Practice2 {
//    public static void main(String[] args) {
//        try{
//            FileInputStream fis=new FileInputStream("d:/Batch1/Buffer.java");
//            FileInputStream fis1=new FileInputStream("d:/Batch1/sequence.java");
//            SequenceInputStream s=new SequenceInputStream(fis,fis1);
//            BufferedInputStream bis=new BufferedInputStream(s);
//            BufferedOutputStream bos=new BufferedOutputStream(System.out);
//            int ch;
//            while((ch=bis.read())!=-1){
//                bos.write((char)ch);
//            }
//           fis.close();
//            fis1.close();
//            s.close();
//            bis.close();
//            bos.close();
//        }catch(FileNotFoundException fe){
//            System.out.println("File not found");
//        }
//        catch(IOException ie){
//            ie.printStackTrace();
//        }
//    }
//}*/
///*import java.io.*;
//public class Practice2{
//    public static void main(String[] args) {
//        try{
//            FileOutputStream fos=new FileOutputStream("F:/java/kk.txt");
//            DataOutputStream dos=new DataOutputStream(fos);
//            String name="Ayaskant";
//            int roll=23;
//            double fee=789.99;
//            char gender='M';
//            boolean data=true;
//            dos.writeUTF(name);
//            dos.writeInt(roll);
//            dos.writeDouble(fee);
//            dos.writeChar(gender);
//            dos.writeBoolean(data);
//            fos.close();
//            dos.close();
//            FileInputStream fis;
//            fis=new FileInputStream("F:/java/kk.txt");
//            DataInputStream dis=new DataInputStream(fis);
//            fis.close();
//            dis.close();
//        }
//        catch(IOException ie){
//            System.out.println("Error occurred");
//            ie.printStackTrace();
//        }
//    }
//}*/
///*import java.io.*;
//class Test implements Serializable{
//    String name;
//    int roll;
//    transient double fee;
//    void display(String nm,int roll,double fee) {
//        this.name = name;
//        this.roll = roll;
//        this.fee = fee;
//    }
//    }
//    public class Practice2 {
//        public static void main(String[] args) {
//
//            try {
//                Test tt = new Test();
//                tt.display("Binod", 34, 786.99);
//                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:/java/y.txt"));
//                oos.writeObject(tt);
//                oos.close();
//            } catch (Exception e) {
//                System.out.println("exception is there");
//            }
//        }
//    }*/
///*import java.io.*;
//class Test implements Serializable{
//    String name;
//    int roll;
//    transient double fee;
//    void display(String nm,int roll,double fee){
//        this.roll=roll;
//        this.fee=fee;
//        this.name=name;
//    }
//
//}
//public class Practice2{
//    public static void main(String[] args) {
//        try{
//            Test tt = new Test();
//            tt.display("Binu",15,1799);
//            System.out.println("Read the state of object from the file");
//            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("F:/java/y.txt"));
//            Test aa= (Test)ois.readObject();
//            System.out.println("name is"+aa.name+"Roll no is"+aa.roll+"fee is"+aa.fee);
//            ois.close();
//        }
//        catch(Exception e){
//            System.out.println("Exception occur");
//        }
//    }
//}*/
///*import java.io.*;
//public class Practice2{
//    public static void main(String[] args) {
//        InputStreamReader is=new InputStreamReader(System.in);
//        BufferedReader  br=new BufferedReader(is);
//        try{
//            System.out.println("Enter the name");
//            String name=br.readLine();
//            System.out.println("Enter the roll no");
//            int roll=Integer.parseInt(br.readLine());
//            System.out.println("name is"+name+"\n"+"roll no is"+roll);
//        }
//        catch(Exception e){
//            System.out.println("exeption");
//        }
//
//    }
//}*/
///*
//import java.io.*;
//public class Practice2
//{
//    public static void main(String[] args) {
//        InputStreamReader is = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(is);
//        try {
//            System.out.println("Enter the data");
//            String data = br.readLine();
//            FileWriter fw = new FileWriter("F:/java/kk.java");
//            fw.write(data);
//            fw.close();
//            System.out.println("Read the data from the file");
//            int ch;
//            FileReader fi = new FileReader("F:/java/kk:java");
//            while ((ch = fi.read()) != -1) {
//                System.out.println((char) ch);
//                fi.close();
//            }
//        }
//
//        catch(IOException e){
//        System.out.println("Exception");
//        }
//    }
//}*/
///*import java.util.*;
//public class Practice2 {
//    public static void main(String[] args){
//        ArrayList l=new ArrayList();
//        l.add("A");
//        l.add(10);
//        l.add("A");
//        l.add(null);
//        System.out.println(l);
//        l.remove(2);
//        System.out.println(l);
//        l.add(2,"15");
//        System.out.println(l);
//
//    }
//}*/
///*import java.util.*;
//import java.util.ArrayList;
//
//public class Practice2 {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(); // Creating an ArrayList of Strings
//
//        // Adding elements to the list
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Orange");
//
//        // Accessing elements
//        String firstElement = list.get(0);
//        System.out.println("First element: " + firstElement);
//
//        // Iterating over the list
//        for (String fruit : list) {
//            System.out.println(fruit);
//        }
//
//        // Removing an element
//        list.remove("Banana");
//
//        // Checking if an element exists
//        boolean containsOrange = list.contains("Orange");
//        System.out.println("Contains Orange: " + containsOrange);
//
//        // Getting the size of the list
//        int size = list.size();
//        System.out.println("List size: " + size);
//    }
//}*/
///*import java.util.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//public class Practice2{
//    public static void main(String[] args) {
//        ArrayList<Object> p=new ArrayList<Object>();
//        p.add(11);
//        p.add(15);
//        p.add("lopa");
//        p.add(20);
//        p.add(4.5);
//        System.out.println(p);
//        System.out.println("size is:"+p.size());
//        p.remove(2);
//        p.trimToSize();
//        System.out.println("After removing size is:"+p.size());
//        System.out.println();
//        System.out.println(p);
//        System.out.println( p.contains(11));
//        ArrayList<Object> cloned=(ArrayList<Object>)p.clone();
//        cloned.add("Hi");
//        System.out.println("Cloned Array is:"+cloned);
//        System.out.println(p.get(3));
//        List<Object> retainCollection=Arrays.asList(p);
//        System.out.println(p.retainAll(retainCollection));
//        ArrayList<String> s=new ArrayList<String>();
//        s.add("Lopa");
//        s.add("is");
//        s.add("girl");
//        try {
//            s.add(2, "a");
//            //System.out.println(s);
//            for (int i = 0; i <= s.size(); i++) {
//                System.out.print(s.get(i) + " ");
//            }
//        }
//        catch(Exception e){
//            System.out.println( ".");
//        }
//        System.out.println( );
//        for(String str:s)
//            System.out.println(s+" ");
//    }
//}*/
///*import java.util.*;
//public class Practice2 {
//    public static void main(String[] args) {
//        LinkedList l=new LinkedList();
//        l.add(100);
//        l.add("rupees");
//        l.add(200);
//        l.add("rupees");
//        l.addFirst("Examples");
//        l.add(1,"of");
//        System.out.println(l);
//        List<String> collection=new LinkedList<>();
//        collection.add("apple");
//        collection.add("Orange");
//        collection.add("grapes");
//        boolean m=l.addAll(collection);
//        System.out.println(l);
//        System.out.println(m);
//        l.removeFirstOccurrence(100);
//        System.out.println(l);
//
//    }
//}*/
///*import java.util.*;
//import java.util.Vector;
//public class Practice2 extends Vector{
//    public static void main(String[] args) {
//       Practice2 v=new Practice2();
//        v.add(10);
//        v.add("Hi");
//        v.add("Salina");
//        v.add(200);
//        v.add("books");
//        v.add("are");
//        v.add("available");
//        v.add(17.555);
//        System.out.println("the vector class is:"+v);
//        v.remove(2);
//        v.set(1,"L");
//        System.out.println(v);
//        List<Integer> collection=new Vector<Integer>();
//        collection.add(10);
//        collection.add(1000);
//        collection.add(100);
//        System.out.println( v.addAll(collection));
//        System.out.println(v);
//        v.spliterator();
//        System.out.println(v);
//        v.removeRange(1, 3);
//        System.out.println(v);
//
//    }
//}*/
///*import java.util.*;
//public class Practice2{
//    public static void main(String[] args) {
//        Vector v=new Vector();
//        System.out.println(v.capacity());
//        for(int i=1;i<=10;i++){
//            v.addElement(i);
//        }
//        System.out.println(v.capacity());
//        v.addElement("hii");
//        System.out.println(v);
//        System.out.println(v.capacity());
//        //System.out.println(v);
//    }
//}*/
///*import java.util.*;
//public class Practice2 {
//    public static void main(String[] args) {
//        int n=10;
//        Stack s=new Stack();
//        for(int i=1;i<n;i++){
//            s.push(i);
//        }
//        System.out.println(s);
//        s.pop();
//        System.out.println(s);
//    }
//}*/
///*import java.util.*;
//public class Practice2 {
//    public static void main(String[] args) {
//        Stack<String> s=new Stack<String>();
//        s.push("english");
//        s.push("math");
//        s.push("hindi");
//        s.push("science");
//        System.out.println(s);
//        System.out.println(s.search("math"));
//        System.out.println(s.search("history"));
//        System.out.println(s.search("english"));
//        //System.out.println(s.peek());
//        //System.out.println(s.pop());
//        while(!s.isEmpty()){
//            System.out.println(s.pop());
//        }
//    }
//}*/
///*import java.util.*;
//public class Practice2 {
//    public static void main(String[] args) {
//        AbstractList<Integer> a=new ArrayList<Integer>();
//        a.add(10);
//        a.add(100);
//        a.add(200);
//        a.add(400);
//        a.add(500);
//        System.out.println(a);
//        AbstractList<Integer> al=new LinkedList<Integer>();
//        al.add(50);
//        al.add(60);
//        al.add(70);
//        al.add(80);
//        System.out.println(al);
//        a.addAll(0,al);
//        System.out.println(a);
//        a.remove(2);
//        a.get(4);
//        System.out.println(a);
//    }
//}*/
///*import java.util.AbstractSequentialList;
//public class Practice2{
//    public static void main(String[] args) {
//        AbstractSequentialList<Integer> als=new LinkedList<>();
//         als.add(8);
//         als.add(99);
//         als.add(100);
//        System.out.println(als);
//        AbstractSequentialList<String> ab=new LinkedList<>();
//        ab.add("10");
//        ab.add("salina");
//        ab.add("lina");
//        ab.add("radha");
//        ab.add("50");
//        System.out.println(ab);
//        System.out.println(ab.isEmpty());
//    }
//}*/
///*import java.util.*;
//public class Practice2 {
//    public static void main(String[] args) {
//        Vector<Integer> b = new Vector<Integer>();
//        for (int i = 0; i <= 11; i++) {
//            b.add(i);
//        }
//        //System.out.println(b);
//        Enumeration e = b.elements();
//        while(e.hasMoreElements()){
//            Integer i=(Integer)e.nextElement();
//            if(i%2==0){
//                System.out.println(i);
//            }}
//            System.out.println(b);
//
//    }
//}*/
///*import java.util.*;
//public class Practice2 {
//    public static void main(String[] args) {
//        ArrayList m=new ArrayList();
//        for(int i=1;i<=10;i++){
//           m.add(i);
//        }
//        System.out.println(m);
//        Iterator itr=m.iterator();
//        while(itr.hasNext()){
//           Integer n=(Integer)itr.next();
//           if(n%2==0)
//           {
//               System.out.println(n);
//           }
//            else
//               itr.remove();
//        }
//        System.out.println(m);
//    }
//}*/
///*import java.util.*;
//public class Practice2 {
//    public static void main(String[] args) {
//        LinkedList l=new LinkedList();
//        l.add("hari");
//        l.add("Ram");
//        l.add("priya");
//        l.add("sanu");
//        System.out.println(l);
//        ListIterator ltr=l.listIterator();
//        while(ltr.hasNext()){
//            String s=(String)ltr.next();
//            if(s.equals("Ram")){
//                ltr.add("Radha");
//                System.out.println(l);
//            }
//            else if(l.equals("sanu")){
//                ltr.remove();
//                System.out.println(l);
//            }
//            else if(l.equals("priya")){
//                ltr.set("Rupa");
//                System.out.println(l);
//            }
//        }
//        System.out.println(l);
//  }
//}*/
//import java.util.*;
///*import java.util.Scanner;
//public class Practice2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<Integer> r = new ArrayList<Integer>();
//        System.out.println("Enter the elements of l:");
//        List<Integer> l = new ArrayList<Integer>();
//        int x = sc.nextInt();
//        for(int i=0;i<x;i++){
//            l.add(sc.nextInt());
//        }
//        List<Integer> Even = new ArrayList<Integer>();
//        for (int num : l) {
//            if (num % 2 == 0) {
//                Even.add(num);
//            }
//        }
//        System.out.println(Even);
//
//        System.out.println("Enter the elements of m:");
//        List<Integer> m = new ArrayList<Integer>();
//        int y=sc.nextInt();
//        for (int j=0;j<y;j++) {
//            m.add(sc.nextInt());
//        }
//        List<Integer> Odd = new ArrayList<Integer>();
//        for (int num : m) {
//            if (num % 2 != 0) {
//                Odd.add(num);
//            }
//        }
//        System.out.println(Odd);
//        int size=Math.max(Even.size(),Odd.size());
//        int i = 0;
//        int j = 0;
//            while (i < Even.size() || j < Odd.size()) {
//                if (i < Even.size()) {
//                    r.add(Even.get(i));
//                    i++;
//                }
//                if (j < Odd.size()) {
//                    r.add(Odd.get(j));
//                    j++;
//                }
//            }
//            System.out.println(r);
//    }
//}*/
///*class Practice2{
//    public static void main(String[] args) {
//        Vector v=new Vector();
//        Enumeration e=v.elements();
//        Iterator i=v.iterator();
//        ListIterator ltr=v.listIterator();
//        System.out.println(e.getClass().getName());
//        System.out.println(i.getClass().getName());
//        System.out.println(ltr.getClass().getName());
//
//    }
//}*/
///*import java.util.*;
//import java.util.concurrent.CopyOnWriteArrayList;
//public class Practice2 extends Thread {
//    static CopyOnWriteArrayList<String> cAl = new CopyOnWriteArrayList<String>();
//
//    public void run() {
//        cAl.add("D");
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        cAl.add("A");
//        cAl.add("F");
//        cAl.add("E");
//        cAl.add("B");
//        Practice2 p = new Practice2();
//        p.start();
//        Thread.sleep(1000);
//        Iterator itr = cAl.iterator();
//        while (itr.hasNext()) {
//            String s = (String) itr.next();
//            System.out.println(s);
//            Thread.sleep(2000);
//        }
//        System.out.println(cAl);
//    }
//}*/
///*import java.util.*;
//import java.util.concurrent.CopyOnWriteArrayList;
//public class Practice2 {
//    public static void main(String[] args) {
//        CopyOnWriteArrayList<String> c=new CopyOnWriteArrayList<>();
//        Iterator itr=c.iterator();
//        c.add("GFG");
//        System.out.println("List Contains");
//        while(itr.hasNext())
//            System.out.println(itr.next());
//        itr=c.iterator();
//        System.out.println("List Contains:");
//        while(itr.hasNext())
//            System.out.println(itr.next());
//    }
//}*/
///*import java.util.ArrayList;
//class Data{
//    int roll;
//    String name;
//    int mark;
//    Long phoneNo;
//    Data(int roll,String name,int mark,Long phoneNo){
//        this.roll=roll;
//        this.name=name;
//        this.mark=mark;
//        this.phoneNo=phoneNo;
//    }
//
//}
//public class Practice2 {
//    int n=4;
//    public void addValues(int roll[],String name[],int mark[],long phoneNo[]){
//        ArrayList<Data> list=new ArrayList<>();
//        for(int i=0;i<n;i++){
//            list.add(new Data(roll[i],name[i],mark[i],phoneNo[i]));
//        }
//        printValues(list);
//    }
//    public void printValues(ArrayList<Data> list){
//        for(int i=0;i<n;i++){
//            Data data=list.get(i);
//            System.out.println(data.roll+" "+data.name+" "+data.mark+" "+data.phoneNo);
//        }
//    }
//
//    public static void main(String[] args) {
//        int roll[]={1,2,3,4};
//        String name[]={"Salina","sipu","lipu","kreepa"};
//        int mark[]={10,12,13,14};
//        long phoneNo[]={5465261659652L,95845161545L,98565262156L,5465262654163L};
//        Practice2 p=new Practice2();
//        p.addValues(roll,name,mark,phoneNo);
//    }
//}*/
///*import java.util.*;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Practice2 {
//    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<>();
//        queue.add("Apple");
//        queue.add("banana");
//        queue.add("hari");
//        queue.add("mango");
//        System.out.println("Queue is:" + queue);
//        String front = queue.remove();
//        System.out.println(front);
//        System.out.println("after removal:"+queue);
//        queue.add("sita");
//        System.out.println(queue);
//        String peeked=queue.peek();
//        System.out.println(peeked);
//        System.out.println("After peeking:"+queue);
//    }
//}*/
///*import java.util.*;
//import java.util.Queue;
//public class Practice2 {
//    public static void main(String[] args) {
//        Queue<Integer> q=new PriorityQueue<Integer>();
//        q.add(10);
//        q.add(15);
//        q.add(19);
//        q.add(20);
//       // Iterator iter=q.iterator();
//        //while(iter.hasNext()){
//           // System.out.println(iter.next()+" ");
//        //}
//        System.out.print(q);
//        System.out.println();
//        System.out.println(q.remove());
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//    }
//}*/
///*import java.util.*;
//import java.util.Queue;
//public class Practice2 {
//    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<Integer>();
//        q.add(10);
//        q.add(15);
//        q.add(20);
//        q.add(40);
//        System.out.println(q);
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//    }
//}*/
///*import java.util.*;
//import java.util.concurrent.LinkedBlockingQueue;
//public class Practice2 {
//    public static void main(String[] args)throws Exception {
//        AbstractQueue<Integer> q=new LinkedBlockingQueue<Integer>();
//        q.add(15);
//        q.add(14);
//        q.add(18);
//        q.add(20);
//        System.out.println("The queue is:"+q);
//        AbstractQueue<Integer> r=new LinkedBlockingQueue<Integer>();
//        r.add(3);
//        r.add(9);
//        System.out.println(r);
//        r.addAll(q);
//        System.out.println("After addition the queue is:"+r);
//        int first= r.remove();
//        System.out.println(first);
//        System.out.println(r);
//        int s=r.element();
//        System.out.println(s);
//        int z=r.poll();
//        System.out.println(z);
//        boolean offer=r.offer(70);
//        System.out.println(offer);
//        System.out.println(r);
//        r.clear();
//        System.out.println(r);
//    }
//}*/
///*import java.util.*;
//import java.util.concurrent.LinkedBlockingQueue;
//public class Practice2 {
//    public static void main(String[] args) {
//        int capacity=5;
//        LinkedBlockingQueue<String> q=new LinkedBlockingQueue<String>(capacity);
//        q.offer("Apple");
//        q.offer("banana");
//        q.offer("water");
//        q.offer("lime");
//        System.out.println(q);
//        Iterator itr=q.iterator();
//        System.out.println();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//    }
//}*/
////Palindrome number
///*import java.util.*;
//import java.util.Scanner;
//public class Practice2 {
//    public static void main(String[] args) {
//        int r,n;
//        int sum=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number n:");
//        n=sc.nextInt();
//        int temp=n;
//        while(n>0) {
//            r = n % 10;
//            sum = (sum * 10) + r;
//            n = n / 10;
//        }
//        if(temp==sum){
//            System.out.println("no is palindrome");
//        }
//        else{
//            System.out.println("Not a palindrome no");
//        }
//
//    }
//}*/
////Prime number
//import java.util.*;
//import java.util.Scanner;
//
///*public class Practice2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size, i, j;
//        System.out.println("Enter the size of an array");
//        size = sc.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter the elements of an array");
//        for (i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int k = 0; k < size; k++) {
//            boolean isPrime = true;
//            for (j = 2; j <= Math.sqrt(arr[k]); j++) {
//                if (arr[k] % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println(arr[k] + "is the prime number");
//            }
//        }
//    }
//}*/
////Palindrome String
///*public class Practice2 {
//    public static boolean isPalindrome(String str) {
//        int start = 0;
//        int end = str.length() - 1;
//        while (start <= end) {
//            if (str.charAt(start) != str.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string:");
//        String s = sc.nextLine();
//        if (isPalindrome(s)) {
//            System.out.println("is a palindrome string");
//        } else
//            System.out.println("Not a palindrome string");
//    }
//}*/
////Reverse a String
///*public class Practice2 {
//    public  static String reversedString(String str){
//        int length=str.length();
//        StringBuilder reversed=new StringBuilder();
//        for(int i=length-1;i>=0;i--){
//            reversed.append(str.charAt(i));
//        }
//        return reversed.toString();
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string s:");
//        String s = sc.nextLine();
//        String newR=reversedString(s);
//        System.out.println(newR);
//    }
//}*/
///*import java.util.*;
//import java.util.concurrent.PriorityBlockingQueue;
//public class Practice2{
//    public static void main(String[] args) {
//        int capacity=4;
//        PriorityBlockingQueue<Integer> q= new PriorityBlockingQueue<Integer>(capacity);
//        q.add(15);
//        q.add(4);
//        q.add(10);
//        q.add(18);
//        System.out.println(q);
//        q.remove(10);
//        int head=q.peek();
//        System.out.println(head);
//        System.out.println(q);
//        q.clear();
//        System.out.println(q);
//    }
//}*/
///*import java.util.*;
//import java.util.concurrent.PriorityBlockingQueue;
//public class Practice2 {
//    public static void main(String[] args) {
//        PriorityBlockingQueue<Integer> ppq=new PriorityBlockingQueue<Integer>(10);
//        ppq.add(12);
//        ppq.add(15);
//        ppq.add(20);
//        ppq.add(32);
//        Iterator itr=ppq.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//    }
//}*/
///*import java.util.*;
//import java.util.concurrent.PriorityBlockingQueue;
//public class Practice2 {
//    public static void main(String[] args) throws InterruptedException {
//        PriorityBlockingQueue<Integer> ppq=new PriorityBlockingQueue<Integer>(10,new Comparator<Integer>(){
//            public int compare(Integer a,Integer b){
//            return a-b;
//        }
//        });
//        ppq.put(231456);
//        ppq.put(545796);
//        ppq.put(865621);
//        ppq.put(8956232);
//        String str=ppq.toString();
//        Comparator comp=ppq.comparator();
//        System.out.println("Comparator value is"+comp);
//        if(comp==null){
//            System.out.println("ppq follows nayural ordering");
//        }
//        else
//            System.out.println("ppq follows"+comp);
//    }
//    }*/
///*import java.util.*;
//import java.util.concurrent.*;
//public class Practice2 {
//    public static void main(String[] args) {
//        ConcurrentLinkedQueue<Integer> l=new ConcurrentLinkedQueue<Integer>();
//        l.add(15);
//        l.add(17);
//        l.add(20);
//        l.add(25);
//        System.out.println(l);
//        System.out.println(l.peek());
//        System.out.println(l.element());
//        System.out.println(l.poll());
//    }
//}*/
//import java.util.*;
//import java.util.concurrent.*;
///*public class Practice2 {
//    public static void main(String[] args) {
//        LinkedTransferQueue<String> s=new LinkedTransferQueue<String>();
//        s.add("Apple");
//        s.add("Goa");
//        s.add("Iron");
//        s.add("Grapes");
//        System.out.println(s);
//        System.out.println(s.size());
//        System.out.println(s.offer("Sondesh"));
//        System.out.println(s);
//    }
//}*/
///*public class Practice2 {
//    public static void main(String[] args) {
//        LinkedTransferQueue<Integer> s = new LinkedTransferQueue<Integer>();
//        for(int i=10;i<=15;i++){
//            s.add(i);
//            }
//        System.out.println(s);
//        System.out.println("adding 17"+s.offer(17,5,TimeUnit.SECONDS));
//        for(int i=18;i<21;i++){
//            s.put(i);
//        }
//        for(Integer i:s)
//        System.out.println(i+" ");
//        System.out.println( );
//        LinkedTransferQueue<String> t=new LinkedTransferQueue<String>();
//        new Thread (new Runnable(){
//            public void run(){
//            try{
//
//            }
//        }
//    }
//}*/
///*public class Practice2 {
//    public static void main(String[] args) {
//        Deque <String> q=new LinkedList<String>();
//        q.add("apple");
//        q.add("monkey");
//        q.add("Horse");
//        q.add("Rabbit");
//        System.out.println(q);
//        q.addFirst("Salina");
//        q.addLast("Prateek");
//        q.offer("tail");
//        q.push("Hi");
//        System.out.println(q);
//        q.removeFirst();
//        q.removeLast();
//        System.out.println(q);
//        q.pollFirst();
//        q.pollLast();
//        System.out.println(q);
//        q.push("Raja");
//        System.out.println(q);
//        q.remove();
//        System.out.println(q);
//        for(Iterator itr=q.iterator();
//        itr.hasNext();){
//            System.out.println(itr.next()+" ");
//        }
//        System.out.println();
//        for(Iterator iTr=q.descendingIterator();iTr.hasNext();){
//            System.out.println(iTr.next()+" ");
//        }
//    }
//}*/
///*import java.util.*;
//public class Practice2 {
//    public static void main(String[] args) {
//        Deque<Integer> d=new ArrayDeque<Integer>(10);
//        d.add(150);
//        d.add(450);
//        d.addFirst(14);
//        d.addLast(18);
//        System.out.println(d);
//        d.pop();
//        System.out.println(d);
//        d.pollFirst();
//        System.out.println(d);
//        System.out.println(d.peek());
//        System.out.println(d.peekFirst());
//    }
//}*/
///*import java.util.HashMap;
//import java.util.ArrayList;
//import java.util.Map;
//public class Practice2 {
//    public static void main(String[] args) {
//        Map map=new HashMap<>();
//        map.put(15,"Salina");
//        map.put(17,"Raja");
//        map.put(18,"Sipu");
//        map.put(20,"Prateek");
//        map.put(null,null);
//        map.put(null,"AAA");
//        map.put(15,"Lopa");
//        map.put(17,"Rama");
//        System.out.println(map);
//        System.out.println(map.containsValue("Raja"));
//        System.out.println(map.containsKey(17));
//        System.out.println(map.size());
//        System.out.println(map.get(15));
//        System.out.println(map.isEmpty());
//        Map map1=new HashMap<>();
//        map1.putAll(map);
//        System.out.println(map1);
//        map1.remove(17);
//        map1.replace(20,"Hari");
//        System.out.println(map1.size());
//         map.clear();
//    }
//}*/
///*import java.util.HashMap;
//import java.util.Set;
//public class Practice2{
//    public static void main(String[] args) {
//        HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
//        hashMap.put("lOPA",18);
//        hashMap.put("Salina",10);
//        hashMap.put("Sipu",15);
//        hashMap.put("Apple",99);
//        System.out.println(hashMap.get("Sipu"));
//        System.out.println(hashMap.remove("Apple"));
//        System.out.println(hashMap.size());
//        Set set=hashMap.entrySet();
//        for(Map.Entry<String,Integer> e:hashMap.entrySet()){
//            System.out.println("key is:"+e.getKey()+"VAlue is:"+e.getValue());
//        //Iterator itr=set.iterator();
//        //while(itr.hasNext()){
//         //   Map.Entry<String,Integer> entry=(Map.Entry)itr.next();
//           // System.out.println(entry.getKey()+"->"+entry.getValue());
//        }
//    }
//}*/
///*import java.util.TreeMap;
//public class Practice2 {
//    public static void main(String[] args) {
//        TreeMap<Integer,String> tree=new TreeMap<Integer,String>();
//        tree.put(101,"Salina");
//        tree.put(102,"Raha");
//        tree.put(100,"Apple");
//        tree.put(99,"Grapes");
//        tree.put(97,"Fruits");
//        System.out.println(tree);
//        System.out.println(tree.ceilingEntry(102));
//        System.out.println(tree.ceilingKey(100));
//        System.out.println(tree.remove(102));
//        System.out.println(tree.keySet());
//        System.out.println(tree.pollFirstEntry());
//        System.out.println(tree.navigableKeySet());
//        System.out.println(tree.firstKey());
//        System.out.println(tree.replace(99,"Hii"));
//        System.out.println(tree.size());
//        tree.clear();
//    }
//}*/
///*import java.util.HashMap;
//import java.util.Scanner;
//public class Practice2 {
//    public static void findNoOfChar(String str){
//        Map<Character,Integer> map=new HashMap<Character,Integer>();
//         char[] charArray=str.toCharArray();
//
//          int v;
//         for(char c:charArray){
//             if(map.containsKey(c)){
//                 v = map.get(c);
//                 map.put(c, v+1);
//             }
//             else
//                 map.put(c, 1);
//         }
//        for(Map.Entry<Character,Integer> e:map.entrySet()) {
//            if(e.getValue()>1){
//                System.out.println(e.getKey()+" "+e.getValue());
//            }
//        }
//    }
//    public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a String str:");
//           String str=sc.nextLine();
//           findNoOfChar(str);
//
//
//    }
//}*/
///*import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//public class Practice2 {
//    public static void repeatStringNo(String[] s){
//        Map<String,Integer> map=new HashMap <String,Integer>();
//        int v;
//        for(String s1:s){
//            if(map.containsKey(s1)){
//               v=map.get(s1);
//                map.put(s1,v+1);
//            }
//            else
//                map.put(s1,1);
//        }
//        for(Map.Entry<String,Integer> e:map.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
//        }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of String Array:");
//        int n;
//        n=sc.nextInt();
//        sc.nextLine();
//        String[] s=new String[n];
//        System.out.println("Enter the elements of that String");
//        for(int i=0;i<n;i++){
//            s[i]=sc.nextLine();
//        }
//        repeatStringNo(s);
//
//    }
//}*/
///*import java.util.HashMap;
//import java.util.Scanner;
//public class Practice2 {
//    public static void repeatStringNo(String[] s){
//        Map<String,Integer> map=new HashMap <String,Integer>();
//        int v;
//        for(String s1:s){
//            if(map.containsKey(s1)){
//                v=map.get(s1);
//                map.put(s1,v+1);
//            }
//            else
//                map.put(s1,1);
//        }
//        for(Map.Entry<String,Integer> e:map.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the String:");
//        String str=sc.nextLine();
//        String[] arr=null;
//        arr=str.split(" ");
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]+",");
//        }
//        repeatStringNo(arr);
//    }
//}*/
//import java.util.*;
///*import java.lang.*;
//class Employee implements Comparable {
//    String name;
//    int age;
//
//    Employee(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public int compareTo(Object o) {
//        return age = this.age - ((Employee) o).age;
//    }
//}
//public class Practice2{
//    public static void main(String[] args) {
//        List<Employee> list=new ArrayList();
//        list.add(new Employee("Barsha",34));
//        list.add(new Employee("arsha",30));
//        list.add(new Employee("rsha",29));
//        list.add(new Employee("sha",28));
//        list.add(new Employee("Ba",40));
//        for(Employee e:list)
//        System.out.println("Emp name is:"+e.name+"Age is:"+e.age);
//        Collections.sort(list);
//        System.out.println("After sorting: ");
//        for (Employee e : list) {
//            System.out.print("[ EMP : age = " + e.age + " ] ");
//        }
//    }
//}*/
///*public class Practice2{
//    public static void main(int args) {
//        System.out.println("Integer main method");
//        System.out.println(args);
//    }
//    public static void main(boolean args) {
//        if (args) {
//            System.out.println("boolean main method");
//            System.out.println(args);
//        }
//    }
//    public static void main(String str){
//        System.out.println("String main method");
//        System.out.println(str);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Original main method");
//        System.out.println("Hello");
//        Practice2.main("Lopa");
//        Practice2.main(70);
//        Practice2.main(true);
//    }
//}*/
////COMPARABLE
///*import java.util.*;
//import java.util.List;
//import java.lang.*;
//class Practice implements Comparable {
//    private String name;
//    private int rollno;
//    private int id;
//
//    Practice(String nm, int n, int id) {
//        this.name = nm;
//        this.rollno = n;
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getRollno() {
//        return rollno;
//    }
//
//    public void setRollno(int rollno) {
//        this.rollno = rollno;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "Practice[Name="+name+",rollno"+rollno+",id"+id+"]";
//    }
//    @Override
//    public int compareTo(Object o) {
//        return this.id-((Practice)o).id;
//    }
//}
//
//public class Practice2{
//    public static void main(String[] args) {
//        ArrayList<Practice> list=new ArrayList<Practice>();
//        list.add(new Practice("Lopa",12,15));
//        list.add(new Practice("sipu",15,70));
//        list.add(new Practice("kuhu",17,80));
//        Collections.sort(list);
//        System.out.println(list);
//
//    }
//}*/
////COMPARATOR
///*import java.util.*;
//import java.lang.*;
//class Practice{
//    String name;
//    int rollNo;
//    int age;
//    Practice(String nm,int rN,int age){
//        this.name=nm;
//        this.rollNo=rN;
//        this.age=age;
//    }
//}
//class ageComparator implements Comparator{
//    public int compare(Object o1,Object o2){
//        Practice s1=(Practice)o1;
//        Practice s2=(Practice)o2;
//        if(s1.age==s2.age)
//            return 0;
//        else if(s1.age>s2.age)
//            return 1;
//        else
//            return -1;
//    }
//}
//class nameComparator implements Comparator{
//    public int compare(Object o1,Object o2){
//        Practice s1=(Practice)o1;
//        Practice s2=(Practice)o2;
//        return s1.name.compareTo(s2.name);
//    }
//}
//public class Practice2{
//    public static void main(String[] args) {
//        ArrayList<Practice> list=new ArrayList<>();
//        list.add(new Practice("Lopa",15,17));
//        list.add(new Practice("Raja",10,80));
//        list.add(new Practice("Dhara",50,8));
//        list.add(new Practice("Sam",10,101));
//        System.out.println("Sorting by name");
//        Collections.sort(list,new nameComparator());
//        Iterator itr=list.iterator();
//        while(itr.hasNext()){
//            Practice p=(Practice)itr.next();
//            System.out.println(p.name+" "+p.rollNo+" "+p.age);
//        }
//        System.out.println("Sorting by age");
//        Iterator it=list.iterator();
//        while (it.hasNext()) {
//          Practice st=(Practice)it.next();
//            System.out.println(st.name+" "+st.rollNo+" "+st.age);
//        }
//
//    }
//}*/
///*class Practice implements Runnable{
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println("Child Thread");
//        }
//    }
//}
//public class Practice2{
//    public static void main(String[] args) {
//        Practice p=new Practice();
//        Thread t=new Thread(p);
//        t.start();
//        for(int i=0;i<5;i++){
//            System.out.println("main thread");
//        }
//    }
//}*/
///*import java.lang.*;
//
//public class Practice2 implements Runnable {
//    public static void main(String[] args) {
//        Practice2 p = new Practice2();
//        Thread t = new Thread(p, "First");
//        Thread t1 = new Thread(p, "Second");
//        Thread t2 = new Thread(p, "Third");
//        t.start();
//        t1.start();
//        t2.start();
//    }
//
//    public void run() {
//        for (int i = 0; i < 3; i++) {
//            Thread aa = Thread.currentThread();
//            String name = aa.getName();
//            System.out.println(name+":" + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//            }
//        }
//    }
//}*/
//import java.util.*;
///*class myThread extends Thread{
//
//}
//class Practice2{
//    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        myThread t=new myThread();
//        System.out.println(t.getName());
//        Thread.currentThread().setName("Kuhu");
//        System.out.println(Thread.currentThread().getName());
//    }
//}*/
///*class myThread extends Thread{
//  public void run(){
//      System.out.println("Run method executed by Thread"+Thread.currentThread().getName());
//  }
//}
//class Practice2{
//    public static void main(String[] args) {
//        myThread p=new myThread();
//        p.start();
//        System.out.println("Run method excuted by thread:"+Thread.currentThread().getName());
//    }
//}*/
//import java.util.*;
//import java.util.concurrent.locks.ReentrantLock;
//
///*class myThread extends Thread{
//
//}
//public class Practice2 {
//    public static void main(String[] args) {
//        Thread.currentThread().setPriority(9);
//        myThread m=new myThread();
//        Thread.currentThread().getPriority();
//        System.out.println(m.getPriority());
//    }
//}*/
///*class myThread extends Thread{
//    public void run(){
//        System.out.println("The name of the thread:");
//        System.out.println(Thread.currentThread().getName());
//    }
//}
//public class Practice2{
//    public static void main(String[] args) {
//        myThread t=new myThread()Thread();
//        t.start();
//    }
//}*/
///*class myThread extends Thread{
//    public void run(){
//    for(int i=1;i<15;i++)
//    {
//        System.out.println("S thread");
//        try{
//            Thread.sleep(20000);}
//        catch(InterruptedException e){
//
//        }
//    }
//    }
//}
//public class Practice2 {
//    public static void main(String[] args)throws InterruptedException {
//        myThread m=new myThread();
//        m.start();
//        m.join(10000);
//        for(int i=1;i<=12;i++){
//            System.out.println("P thread");
//        }
//    }
//}*/
///*class myThread extends Thread{
//    static Thread t;
//    public void run(){
//        try{
//            t.join();
//        }
//        catch(InterruptedException e){
//
//        }
//        for(int i=1;i<7;i++){
//            System.out.println("Child Thread");
//        }
//    }
//}
//public class Practice2{
//    public static void main(String[] args)throws InterruptedException {
//        myThread.t=Thread.currentThread();
//        myThread m=new myThread();
//        m.start();
//        for(int i=1;i<6;i++){
//            System.out.println("Main thread");
//            Thread.sleep(1000);
//        }
//    }
//}*/
///*public class Practice2{
//    public static void main(String[] args)throws InterruptedException {
//      for(int i=0;i<10;i++){
//          System.out.println("Slide is:"+i);
//          Thread.sleep(2000);
//      }
//    }
//}*/
///*class myThread extends Thread {
//    public void run() {
//        try {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("I am lazy Thread");
//                Thread.sleep(2000);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("I got interrupted");
//        }
//    }
//}
//
//public class Practice2 {
//    public static void main(String[] args) {
//        myThread t = new myThread();
//        t.start();
//        t.interrupt();
//        System.out.println("End of main thread");
//    }
//}*/
///*class Display {
//    public synchronized void wish(String name) {
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Good Morning:");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//            }
//            System.out.println(name);
//        }
//    }
//}
//
//    class myThread extends Thread {
//        Display d;
//        String name;
//
//        myThread(Display d, String name) {
//            this.name = name;
//            this.d = d;
//        }
//
//        public void run() {
//            d.wish(name);
//        }
//    }
//
//
//    class Practice2 {
//        public static void main(String[] args) {
//            Display p = new Display();
//            myThread t1 = new myThread(p, "Dhoni");
//            myThread t2 = new myThread(p, "Yuvraj");
//
//            t1.start();
//            t2.start();
//        }
//    }*/
//
///*class Display {
//    public void wish(String name) {
//        //public synchronized void wish(String name) {
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Good Morning:");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//            }
//            System.out.println(name);
//        }
//    }
//}
//
//class myThread extends Thread {
//    Display d;
//    String name;
//
//    myThread(Display d, String name) {
//        this.name = name;
//        this.d = d;
//    }
//
//    public void run() {
//        d.wish(name);
//    }
//}
//
//
//class Practice2 {
//    public static void main(String[] args) {
//        Display p = new Display();
//        Display p1=new Display();
//        myThread t1 = new myThread(p, "Dhoni");
//        myThread t2 = new myThread(p, "Yuvraj");
//
//        t1.start();
//        t2.start();
//    }
//}*/
///*class Display1 {
//    public synchronized void displayn() {
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//
//            }
//        }
//    }
//
//    public synchronized void displayc() {
//        for (int i = 65; i <= 75; i++) {
//            System.out.println((char) i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ei) {
//
//            }
//        }
//    }
//}
//
//class MyThread extends Thread {
//        Display1 d;
//
//        MyThread(Display1 d) {
//            this.d = d;
//        }
//
//        public void run() {
//            d.displayn();
//        }
//    }
//
//     class MyThread2 extends Thread {
//        Display1 d;
//
//        MyThread2(Display1 d) {
//            this.d = d;
//        }
//
//        public void run() {
//            d.displayc();
//        }
//    }
//
//    public class Practice2 {
//        public static void main(String[] args) {
//            Display1 p = new Display1();
//            MyThread t1 = new MyThread(p);
//            MyThread2 t2 = new MyThread2(p);
//            t1.start();
//            t2.start();
//        }
//    }*/
///*class Display{
//    public void wish(String name){
//        ;;;;;;;;;//1 lakh lines of code
//        synchronized(Display.class){
//            for(int i=0;i<=10;i++){
//            System.out.println("Good Morning");
//            try {
//                Thread.sleep(1000);
//            }
//            catch(InterruptedException e){
//
//            }
//            System.out.println(name);
//        }}
//        ;;;;;//1 lakh lines of code
//    }
//}
///*class MyThread extends Thread{
//    Display d;
//    String name;
//    MyThread(Display d,String name){
//        this.d=d;
//        this.name=name;
//    }
//    public void run(){
//        d.wish(name);
//    }
//}
//public class Practice2 {
//    public static void main(String[] args) {
//        Display o=new Display();
//        Display t=new Display();
//        MyThread t1=new MyThread(o,"Dhoni");
//        MyThread t2=new MyThread(t,"Yuvraj");
//        t1.start();
//        t2.start();
//    }
//}*/
///*public class Practice2{
//    public static void main(String[] args)throws InterruptedException {
//        ThreadB b=new ThreadB();
//        b.start();
//        synchronized(b){
//            System.out.println("Main thread trying to call wait()");
//            b.wait();
//            System.out.println("Main thread got notified");
//            System.out.println(b.total);
//        }
//    }
//}
//class ThreadB extends Thread{
//    int total=0;
//    public void run(){
//        synchronized(this){
//            System.out.println("Chile Thread starts calculation");
//            for(int i=0;i<=100;i++){
//                total=total+i;
//            }
//            System.out.println("Child thread trying to notify");
//            this.notify();
//        }
//    }
//
//}*/
///*class A{
//    public synchronized void d1(B b){
//        System.out.println("Thread 1 starts exceution of d1()");
//        try{
//            Thread.sleep(1000);
//        }
//        catch(InterruptedException e){ }
//            System.out.println("Thread1 trying to call b.last()");
//            b.last();
//        }
//        public synchronized void last(){
//            System.out.println("Inside A this is the last method");
//        }
//    }
//class B{
//    public synchronized void d2(A a){
//        System.out.println("Thread 2starts exceuting of d2()");
//        try{
//            Thread.sleep(1000);
//        }
//        catch(InterruptedException e){
//        }
//        System.out.println("Thred2 trying to call a.last()");
//        a.last();
//    }
//    public synchronized void last(){
//        System.out.println("Inside B this is the last method");
//    }
//}
//class Practice2 extends Thread{
//    A a=new A();
//    B b=new B();
//    public void m1(){
//        this.start();
//        a.d1(b);
//    }
//    public void run(){
//        b.d2(a);
//    }
//    public static void main(String[] args) {
//            Practice2 p=new Practice2();
//            p.m1();
//    }
//}*/
///*class MyThread extends Thread{
//
//}
//public class Practice2 {
//    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().isDaemon());
//        MyThread t=new MyThread();
//        System.out.println(t.isDaemon());
//        t.setDaemon(true);
//        System.out.println(t.isDaemon());
//
//    }
//}*/
///*class myThread extends Thread{
//    public void run(){
//        for(int i=0;i<11;i++){
//            System.out.println("chile Thread");
//            try{
//                Thread.sleep(1000);
//            }
//            catch(InterruptedException e){
//            }
//        }
//    }
//}
//public class Practice2 {
//    public static void main(String[] args) {
//        myThread t=new myThread();
//        t.setDaemon(true);
//        t.start();
//        System.out.println("End of main thread");
//    }
//}*/
///*public class Practice2{
//    public static void main(String[] args) {
//        //System.out.println(Thread.currentThread().getThreadGroup().getName());
//        ThreadGroup g1=new ThreadGroup("First Group");
//        System.out.println(g1.getParent().getName());
//        ThreadGroup g2=new ThreadGroup(g1,"Second Group");
//        System.out.println(g2.getParent().getName());
//    }
//}*/
///*public class Practice2{
//    public static void main(String[] args) {
//        ThreadGroup g1=new ThreadGroup("tg");
//        Thread t1=new Thread(g1,"First Thread");
//        Thread t2=new Thread(g1,"Second Thread");
//        g1.setMaxPriority(3);
//        Thread t3=new Thread(g1,"Third Thread");
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(t3.getPriority());
//
//    }
//}*/
//   /* class myThread extends Thread{
//        myThread(ThreadGroup g,String name){
//            super(g,name);
//        }
//        public void run() {
//            System.out.println("Child Thread");
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//            }
//        }
//    }
//public class Practice2 {
//    public static void main(String[] args)throws Exception {
//        ThreadGroup g1=new ThreadGroup("tg");
//        ThreadGroup g2=new ThreadGroup(g1,"tg1");
//        myThread t1=new myThread(g1,"First Thread");
//        myThread t2=new myThread(g2,"Second Thread");
//        t1.start();
//        t2.start();
//        System.out.println(g1.activeCount());
//        System.out.println(g1.activeGroupCount());
//        Thread.sleep(10000);
//        g1.list();
//        System.out.println(g2.activeCount());
//        System.out.println(g2.activeGroupCount());
//        g1.list();
//    }
//}*/
///*public class Practice2 {
//    public static void main(String[] args) {
//        ThreadGroup system=Thread.currentThread().getThreadGroup().getParent();
//        Thread[] t=new Thread[system.activeCount()];
//        system.enumerate(t);
//        for(Thread t1:t){
//            System.out.println(t1.getName()+"..."+t1.isDaemon());
//        }
//
//    }
//}*/
//import java.util.concurrent.locks.ReentrantLock;
//
///*public class Practice2{
//    public static void main(String[] args) {
//        ReentrantLock p=new ReentrantLock();
//        p.lock();
//        p.lock();
//        System.out.println(p.isLocked());
//        System.out.println(p.isHeldByCurrentThread());
//        p.unlock();
//        System.out.println(p.getHoldCount());
//        System.out.println(p.hasQueuedThreads());
//        System.out.println(p.isLocked());
//        p.unlock();
//        System.out.println(p.getQueueLength());
//        System.out.println(p.isFair());
//        System.out.println(p.isLocked());
//    }
//}*/
///*
//class Display {
//    ReentrantLock l = new ReentrantLock();
//
//    public void wish(String name) {
//        l.lock();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("GoodMorning:");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//            }
//            System.out.println(name);
//        }
//            l.unlock();
//    }
//}
//class myThread extends Thread{
//    Display d;
//    String name;
//    myThread(Display d,String name){
//        this.d=d;
//        this.name=name;
//
//     }
//    public void run(){
//        d.wish(name);
//    }
//}
//public class Practice2 {
//    public static void main(String[] args) {
//        Display d1=new Display();
//        myThread t1=new myThread(d1,"Dhoni");
//        myThread t2=new myThread(d1,"Yuvraj");
//        myThread t3=new myThread(d1,"kohli");
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}*/
//import java.util.concurrent.locks.ReentrantLock;
//
///*class myThread extends Thread{
//    ReentrantLock l=new ReentrantLock();
//    myThread(String name){
//        super(name);
//    }
//    public void run(){
//        if(l.tryLock()){
//            System.out.println(Thread.currentThread().getName()+"...Got lock and performing safe opns");
//            try{
//                Thread.sleep(1000);
//            }
//            catch(InterruptedException e){
//            }
//        }
//        else{
//            System.out.println(Thread.currentThread().getName()+"...Not getting lock and performing unsafe opns");
//        }
//    }
//}
//public class Practice2 {
//    public static void main(String[] args) {
//        myThread m=new myThread("First Thread");
//        myThread n=new myThread("Second Thread");
//        m.start();
//        n.start();
//    }
//}*/
///*class myThread extends Thread {
//    myThread(String name) {
//        super(name);
//    }
//
//    ReentrantLock l = new ReentrantLock();
//
//    public void run() {
//        do {
//            try {
//                if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
//                    System.out.println(Thread.currentThread().getName() + "..Got Lock");
//                    Thread.sleep(30000);
//                    l.unlock();
//                    System.out.println(Thread.currentThread().getName() + "..Unlock the thread n got the lock");
//                    break;
//                } else {
//                    System.out.println(Thread.currentThread().getName() + "..unable to Get the lock");
//                }
//            } catch (Exception e) {
//            }
//        }
//            while (true) ;
//        }
//    }
//
//    public class Practice2 {
//        public static void main(String[] args) {
//            myThread t1 = new myThread("First Thread");
//            myThread t2 = new myThread("Second Thread");
//            t1.start();
//            t2.start();
//        }
//    }*/
///*class PrintJob implements Runnable{
//    String name;
//    PrintJob(String name){
//        this.name=name;
//    }
//    public void run(){
//        System.out.println(name+"..job started by thread"+Thread.currentThread().getName());
//        try{
//            Thread.sleep(1000);
//        }
//        catch(InterruptedException e){}
//        System.out.println(name+"..job completed by thread"+Thread.currentThread().getName());
//    }
//}
//public class Practice2 {
//    public static void main(String[] args) {
//        PrintJob[] jobs={new PrintJob("Radha"),new PrintJob("Hari"),new PrintJob("sali"),new PrintJob("Krishna"),new PrintJob("Jaga")};
//        ExecutorService service=Executors.newFixedThreadPool(3);
//        for(PrintJob job:jobs){
//            service.submit(job);
//        }
//     service.shutdown();
//    }
//}*/
///*class sum implements Callable {
//    int num;
//
//    sum(int num) {
//        this.num = num;
//    }
//
//    public Object call() throws Exception {
//        System.out.println(Thread.currentThread().getName() + "..is responsible" +
//                " to get the sum first" + num + "numbers");
//        int total = 0;
//        for (int i = 0; i < num; i++) {
//            total = total + i;
//        }
//        return total;
//    }
//}
//
//public class Practice2 {
//    public static void main(String[] args) throws Exception {
//        sum[] s = {new sum(10), new sum(20), new sum(30), new sum(50), new sum(60)};
//        ExecutorService service = Executors.newFixedThreadPool(3);
//        for (sum s1 : s) {
//            Future f = service.submit(s1);
//            System.out.println(f.get());
//        }
//        service.shutdown();
//    }
//}*/
///*public class Practice2{
//    public static void main(String[] args) {
//        ThreadLocal tl=new ThreadLocal();
//        System.out.println(tl.get());
//        tl.set("Durga");
//        System.out.println(tl.get());
//        tl.remove();
//        System.out.println(tl.get());
//    }
//}*/
///*public class Practice2{
//    static ThreadLocal<String> tl=new ThreadLocal<String>()
//        {
//            public String initialValue(){
//                return "abc";
//        }
//        };
//
//    public static void main(String[] args) {
//        System.out.println(tl.get());
//        tl.set("Durga");
//        System.out.println(tl.get());
//        tl.remove();
//        System.out.println(tl.get());
//    }
//}*/
///*class CsThread extends Thread{
//    static Integer custId=0;
//    private static ThreadLocal tl=new ThreadLocal()
//    {
//        protected Integer initialValue(){
//            return ++custId;
//        }
//    };
//    CsThread(String name){
//        super(name);
//    }
//    public void run(){
//        System.out.println(Thread.currentThread().getName()+"Executing with customer ID"+tl.get());
//    }
//}
//public class Practice2{
//    public static void main(String[] args) {
//        CsThread c1=new CsThread("Thraed 1");
//        CsThread c2=new CsThread("Thread 2");
//        CsThread c3=new CsThread("Thraed 3");
//        CsThread c4=new CsThread("Thread 4");
//        c1.start();
//        c2.start();
//        c3.start();
//        c4.start();
//    }
//}*/
///*class ParentThread extends Thread {
//    public static InheritableThreadLocal tl = new InheritableThreadLocal() {
//        public Object childValue(Object p) {
//            return "cc";
//        }
//    };
//
//    public void run() {
//        tl.set("pp");
//        System.out.println("Parent Thread VAlue" + tl.get());
//        ChildThread ct = new ChildThread();
//        ct.start();
//    }
//}
//class ChildThread extends Thread{
//    public void run(){
//        System.out.println("Child THread value:"+ParentThread.tl.get());
//    }
//}
//public class Practice2 {
//    public static void main(String[] args) {
//        ParentThread pt=new ParentThread();
//        pt.start();
//    }
//}*/
///*public class Practice2{
//    public static void main(String[] args) {
//        CopyOnWriteArrayList<String> c=new CopyOnWriteArrayList<String>();
//        Iterator itr=c.iterator();
//        c.add("SAlina");
//        System.out.println(c);
//        while(itr.hasNext())
//            System.out.println(itr.next());
//        itr=c.iterator();
//        System.out.println("List contains");
//        while(itr.hasNext())
//            System.out.println(itr.next());
//
//    }
//}*/
///*class Student {
//    String name;
//    int roll;
//    long phNo;
//    int id;
//
//    public Student(String name, int roll, long phNo, int id) {
//        this.id = id;
//        this.name = name;
//
//        this.roll = roll;
//        this.phNo = phNo;
//    }
//}
//    public class Practice2{
//        int n=4;
//        public void addValues(String name[],int roll[],long phNo[],int id[]){
//            ArrayList<Student> list=new ArrayList<Student>();
//            for(int i=0;i<n;i++){
//                list.add(new Student(name[i],roll[i],phNo[i],id[i]));
//            }
//            printValues(list);
//        }
//        public void printValues(ArrayList<Student> list){
//            for(int i=0;i<n;i++){
//                Student student=list.get(i);
//                System.out.println(student.roll+" "+student.name+" "+student.id+" "+student.phNo);
//            }
//        }
//
//        public static void main(String[] args) {
//            int roll[]={1,2,3,4};
//            String name[]={"Salina","Sipu","Prateek","Kuhu"};
//            int id[]={145,165,155,195};
//            long phNo[]={9437852927L,8889636629L,9748212628L,8509291012L};
//            Practice2 obj=new Practice2();
//            obj.addValues(name,roll,phNo,id);
//        }
//}*/
///*public class Practice2 {
//    public static void main(String[] args) {
//        File f = new File("abc.txt");
//        System.out.println(f.exists());
//        try {
//            if (f.createNewFile())
//                System.out.println("File Created Succesfully");
//            else
//                System.out.println("File Alreday exists");
//        } catch (IOException e) {
//            System.out.println("Getting error while creating the file");
//        }
//        System.out.println(f.exists());
//    }
//}*/
///*public class Practice2 {
//    public static void main(String[] args) {
//        File f=new File("E://xyz");
//        f.mkdir();
//        //File f1=new File("Salina123","abc.txt");
//        File f1 = new File(f, "abc.txt");
//        try {
//            if (f1.createNewFile())
//                System.out.println("New File generated");
//            else
//                System.out.println("THis file already exists");
//        }
//        catch(IOException e){
//            System.out.println("Error while creating the file");
//        }
//        System.out.println(f1.exists());
//
//    }
//}*/
///*public class Practice2 {
//    public static void main(String[] args) {
//        File f = new File("Salina.xyz");
//        f.mkdir();
//        //File f1=new File("Salina123","abc.txt");
//        File f1 = new File(f, "abc.txt");
//        try {
//            if (f1.createNewFile())
//                System.out.println("New File generated");
//            else
//                System.out.println("THis file already exists");
//        } catch (IOException e) {
//            System.out.println("Error while creating the file");
//        }
//        System.out.println(f1.exists());
//    }
//}*/
///*public class Practice2{
//    public static void main(String[] args)throws Exception {
//        int count=0;
//        File f=new File("c:\\ durga classes");
//        if(f.exists()&& f.isDirectory()) {
//            String[] s = f.list();
//            for (String s1 : s) {
//                File f1 = new File(f, s1);
//                if (f1.isFile()) {
//                    count++;
//                    System.out.println(s1);
//                }
//                System.out.println("The total number:" + count);
//            }
//        }
//        else{
//                System.out.println("Directory doesnot exist");
//            }
//        }
//    }*/
///*public class Practice2 {
//    public static void main(String[] args) throws IOException {
//        FileWriter f = new FileWriter("abc.txt");
//        f.write(100);
//        f.write("urga/Software");
//        f.write("\n");
//        char ch[] = {'a', 'b', 'c', 'd'};
//        f.write(ch);
//        f.write("\n");
//        f.flush();
//        f.close();
//    }
//}*/
///*import java.util.HashMap;
//import java.util.List;
//
//public class Practice2 {
//    public static void main(String[] args) {
//        HashMap<String, List<String>> myMap = new HashMap<>();
//        List<String> myList1 = new ArrayList<>();
//        myList1.add("Ruhi");
//        myList1.add("Tarun");
//        myList1.add("Simi");
//        //System.out.println(myList1);
//        List<String> myList2 = new ArrayList<>();
//        myList2.add("Ruhi");
//        myList2.add("Trisha");
//        myList2.add("Sipu");
//        //System.out.println(myList2);
//        List<String> myList3 = new ArrayList<>();
//        myList3.add("Raman");
//        myList3.add("Tarun");
//        myList3.add("Simi");
//        //System.out.println(myList3);
//        myMap.put("Bhubaneswar", myList1);
//        myMap.put("Delhi", myList2);
//        myMap.put("Hyderabad", myList3);
//        System.out.println(myMap);
//        HashMap<String,List<String>> newMap=new HashMap<>();
//       for(Map.Entry<String,List<String>> entry:myMap.entrySet()){
//           String city=entry.getKey();
//           List<String> names=entry.getValue();
//           for(String name:names){
//               if(newMap.containsKey(name)){
//                   newMap.get(name).add(city);
//               }
//               else{
//                   List<String> cities=new ArrayList<String>();
//                   cities.add(city);
//                   newMap.put(name,cities);
//               }
//           }
//       }
//        System.out.println(newMap);
//    }
//}*/

//import java.io.FileWriter;
//import java.io.BufferedWriter;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.PrintWriter;

/*public class Practice2{
    public static void main(String[] args)throws Exception {
        FileWriter fw=new FileWriter("abc.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        char[] ch1={'a','b','c','d'};
        bw.write(ch1);
        bw.newLine();
        bw.write("Durga");
        bw.newLine();
        bw.write("Software solution");
        bw.flush();
        bw.close();
    }
}*/
/*public class Practice2{
    public static void main(String[] args)throws Exception {
        PrintWriter pw=new PrintWriter("file3.txt");
        BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
        String Line=br.readLine();
        while(Line!=null){
            pw.println(Line);
            Line=br.readLine();
        }
        br=new BufferedReader(new FileReader("file2.txt"));
        Line=br.readLine();
        while(Line!=null){
            pw.println(Line);
            Line=br.readLine();
        }
        pw.flush();
        pw.close();
        br.close();
    }
}*/
/*public class Practice2 {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("file2.txt"));
        String Line = br.readLine();
        String Line1 = br1.readLine();
        while (Line != null || Line1 != null) {
            if (Line != null) {
                pw.println(Line);
                Line = br.readLine();
            }
            if (Line1 != null) {
                pw.println(Line1);
                Line1 = br1.readLine();
            }
        }
        pw.flush();
        br.close();
        br1.close();
    }
}*/
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.File;
/*public class Practice2{
    public static void main(String[] args)throws Exception {
        PrintWriter pw=new PrintWriter("Output.txt");
        File f=new File("file2.txt");
        String[] s=f.list();
        for(String s1:s){
            File f1=new File(f,s1);
            BufferedReader br=new BufferedReader(new FileReader(f1));
            String Line=br.readLine();
            while(Line!=null){
                pw.println(Line);
                Line=br.readLine();
            }
        }
        pw.flush();
    }
}*/
/*public class Practice2{
    public static void main(String[] args)throws Exception {
        PrintWriter pw=new PrintWriter("Result.txt");
        BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
        String line=br.readLine();
        while(line!=null){
            boolean available=false;
            BufferedReader br1=new BufferedReader(new FileReader("file2.txt"));
            String tLine=br1.readLine();
            while(tLine!=null) {
                if (line.equals(tLine)) {
                    available = true;
                    break;
                }
                tLine = br1.readLine();
            }
                if(available==false){
                    pw.println(line);
                }
                    line=br.readLine();
            }
        pw.flush();
        pw.close();
        br.close();
    }
}*/
/*public class Practice2 {
    public static void main(String[] args)throws Exception {
        PrintWriter pw=new PrintWriter("res1.txt");
        BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
        String line=br.readLine();
        while(line!=null){
            boolean available=false;
        BufferedReader br1=new BufferedReader(new FileReader("res1.txt"));
        String line1=br1.readLine();
        while(line1!=null){
            if(line.equals(line1)) {
                available = true;
                break;
            }
            line1=br1.readLine();
            }
        if(available==false){
            pw.println(line);
            pw.flush();
        }
        line=br.readLine();
        }
    }
}*/
