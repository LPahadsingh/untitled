//import java.util.*;
//import java.util.Scanner;
//
//class Practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n, i, j, m, k, x;
//        System.out.println("Enter the size of an array1:");
//        n = sc.nextInt();
//        int arr1[] = new int[n];
//        System.out.println("Enter the elements:");
//        for (i = 0; i < n; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        System.out.println("Enter the size of an array2:");
//        m = sc.nextInt();
//        int arr2[] = new int[m];
//        System.out.println("Enter the elements:");
//        for (j = 0; j < m; j++) {
//            arr2[j] = sc.nextInt();
//        }
//        int count = 0;
//        for (k = 0; k < n; k++) {
//            if (arr1[k] % 2 == 0) {
//                count++;
//            }
//        }
//        int[] arr3= new int[count];
//        int p=0;
//            for (k= 0; k <n; k++) {
//                if (arr1[k] % 2 == 0) {
//            arr3[p]=arr1[k];
//            p++;
//                }}
//        int count1 = 0;
//        for (i = 0; i < m; i++) {
//            if (arr2[i] % 2 == 0) {
//                count1++;
//            }
//        }
//        int[] arr4= new int[count1];
//        int q=0;
//        for (i = 0; i < m; i++) {
//            if (arr2[i] % 2 == 0) {
//            arr4[q]=arr2[i];
//            q++;
//        }}
//        int length = Math.min(arr3.length, arr4.length);
//        int arr5[] = new int[length];
//        for (i = 0,x = 0; x < length;x++, i++)
//            arr5[x] = arr3[i] + arr4[i];
//        for(i=0;i<length;i++) {
//            System.out.println(arr5[i] + " ");
//        }
//    }
//}
//

