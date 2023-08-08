//Reverse a String
/*import java.util.*;
public class PracticeR {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter a String:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String nstr="";
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("Reverse String is:"+nstr);
    }
}*/
//OR by using ArrayAList
/*import java.io.*;
import java.lang.*;
public class PracticeR {
    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        List<Character> list=new ArrayList<Character>();
        for(char ch1:ch){
            list.add(ch1);
        }
        System.out.println(list);
        Iterator itr=list.listIterator();
        Collections.reverse(list);
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}*/
//
/*import java.util.Scanner;
import java.lang.*;
public class PracticeR {
    public static void main(String[] args) {
        System.out.println("Enter the value for a:");
        System.out.println("Enter the value for b:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping:a is"+a+" the value of b is"+b);
    }
}*/
//Findout the vowel
/*import java.util.*;
import java.lang.*;
import java.io.*;
public class PracticeR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                System.out.println("Given String contains "+str.charAt(i)+"having inex no "+i);
        }
    }
}*/
//Findout the prime number
/*import java.util.*;
import java.lang.*;
public class PracticeR {
    public static boolean isPrime(int n){
        boolean ans=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                ans= false;
            }
        }
      return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n=sc.nextInt();
        if(isPrime(n)==true){
            System.out.println(n+"is a prime number");
        }
        else
            System.out.println(n+"is not a prime number");
    }
}*/
/*import java.util.Scanner;
public class PracticeR {
    static void fibSeries(int N){

        int num1,num2,num3;
        num1=0;
        num2=1;
        int counter=0;
        while(counter<N) {
            System.out.print(num1+" ");
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N=sc.nextInt();
        fibSeries(N);

    }
}*/
/*import java.util.*;
public class PracticeR{
    public static void main(String[] args) {
        Map<Integer,Map<String,Map<String,Map<String,Integer>>>> mMap1=new HashMap<Integer,Map<String,Map<String,Map<String,Integer>>>>();
        Map<String,Integer> innerMap1=new HashMap<>();
        innerMap1.put("Physics",90);
        innerMap1.put("Math",80);
        innerMap1.put("Chemistry",65);
        Map<String,Integer> innerMap2=new HashMap<>();
        innerMap2.put("Physics",88);
        innerMap2.put("Math",81);
        innerMap2.put("Chemistry",70);
        Map<String,Integer> innerMap3=new HashMap<>();
        innerMap3.put("Physics",81);
        innerMap3.put("Math",71);
        innerMap3.put("Chemistry",60);
        Map<String,Map<String,Integer>> stName1=new HashMap<>();
        stName1.put("Swastik",innerMap1);
        //System.out.println(stName1);
        Map<String,Map<String,Integer>> stName2=new HashMap<>();
        stName2.put("Sipu",innerMap2);
        //System.out.println(stName2);
        Map<String,Map<String,Integer>> stName3=new HashMap<>();
        stName2.put("Kreepa",innerMap3);
        Map<Integer,Map<String,Map<String,Integer>>> myMap1=new HashMap<>();
        myMap1.put(17,stName1);
        //System.out.println(myMap1);
        Map<Integer,Map<String,Map<String,Integer>>> myMap2=new HashMap<>();
        myMap2.put(18,stName2);
        //System.out.println(myMap2);
        Map<Integer,Map<String,Map<String,Integer>>> myMap3=new HashMap<>();
        myMap3.put(17,stName3);
        myMap1.putAll(myMap2);
        myMap3.putAll(myMap1);
        System.out.println(myMap3);
        for(Map.Entry<Integer,Map<String,Map<String,Integer>>> entry:myMap1.entrySet()){
          Map<String,Map<String,Integer>> value=entry.getValue();
          for(Map.Entry<String,Map<String,Integer>> entry1:value.entrySet()){
          Map<String,Integer> marks=entry1.getValue();{
              Integer Mathmark=marks.get("Math");
              Integer PhysicsMark=marks.get("Physics");
              Integer ChemistryMark=marks.get("Chemistry");
              if()
              }
            }
        }
    }
}*/
/*import java.util.*;
public class PracticeR {
    static int largest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i <length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int i;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

        public static void main(String[] args) {
            System.out.println(largest());

    }
}*/
import java.util.*;
public class PracticeR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Arraylist:(Enter -1 to stop)" +
                "");
        List<Integer> list = new ArrayList<Integer>();
        int input;
        while (true) {
            input = sc.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        if (list.size() < 2) {
            System.out.println("Insufficient elementss");
        } else {
            Set<Integer> set = new TreeSet<>(list);
            list.clear();
            for (int value : set) {
                list.add(value);
            }
            int m = list.size();
            System.out.println("the second largest number is:" + list.get(m - 2));
        }
    }
}