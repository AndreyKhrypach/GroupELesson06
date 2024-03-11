import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson06Program {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][][] array3D = new int[5][][];

//        int[][] arr = new int[6][8];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int[][] manualArray2D = new int[][]{{1,2,3}, {1,2,3,4}, {1,2,3}};
//        System.out.println(manualArray2D.length);
//        System.out.println(manualArray2D[0].length);
//
//        int[][] array2D = new int[5][];
//        array2D[0] = new int[]{1, 2, 3, 4, 5};
//        array2D[1] = new int[]{1, 2, 3, 4, 5};
//        array2D[2] = new int[]{1, 2, 3, 4, 5};
//        array2D[3] = new int[]{1, 2, 3, 4, 5};
//        array2D[4] = new int[]{1, 2, 3, 4, 5};
//
//        System.out.println(Arrays.deepToString(array2D));

//        int[][] manualArray2D = new int[][]{{1,2,3}, {1,2,3,4}, {1,2,3}};
//        for (int i = 0; i < manualArray2D.length; i++) {
//            System.out.println(Arrays.toString(manualArray2D[i]));
//        }
//
//        System.out.println("Enter value M");
//        int m = scanner.nextInt();
//        System.out.println("Enter value N");
//        int n = scanner.nextInt();
//
//        int[][] array2DOriginal = new int[m][n];
//        int[][] array2DTransported = new int[n][m];
//        for (int i = 0; i < array2DOriginal.length; i++) {
//            for (int j = 0; j < array2DOriginal[i].length; j++) {
//                array2DOriginal[i][j] = random.nextInt(10);
//            }
//        }

        //System.out.println(Arrays.deepToString(array2D));

//        for (int i = 0; i < array2D.length; i++) {
//            System.out.println(Arrays.toString(array2D[i]));
//        }

//        for (int i = 0; i < array2D.length; i++) {
//            for (int j = 0; j < array2D[i].length; j++) {
//                System.out.print(array2D[i][j] + ", ");
//            }
//            System.out.println();
//        }

//        int[] arr1 = new int[]{1, 2, 3, 4, 5};
////        int[] arr2 = arr1;
//        int[] arr2 = new int[arr1.length];
//        arr2 = Arrays.copyOf(arr1, arr1.length);
//        System.arraycopy(arr1, 0, arr2,0, arr1.length);
////        for (int index = 0; index < arr2.length; index++) {
////            arr2[index] = arr1[index];
////        }
//        arr2[0] = 10;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

//        String str = "Hello world";
//        char[] chars = str.toCharArray();
//        System.out.println(Arrays.toString(chars));
//        String strNew = new String(chars);
//        System.out.println(strNew);
//        System.out.println(str == strNew);
//
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == 'l'){
//                System.out.println("index = " + i +
//                        " symbol = " + chars[i]);
//            }
//        }

//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == 'l'){
//                System.out.println("index = " + i +
//                        " symbol = " + chars[i]);
//            }
//        }

//        String str1 = "Hello world";
//        String str2 = "Hello world";
//        String str3 = new String("Hello world");
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1.equals(str3));


//        int[] array = new int[]{3, 8, 2, 1, 0, 10, 9, 5};
//        int[] array = new int[100];
//        int elementToSearch = 2;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);
//        }
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int indexElement = Arrays.binarySearch(array, elementToSearch);
//        System.out.println(indexElement);
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        long beforeTime = System.currentTimeMillis();

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == elementToSearch) {
//                System.out.println("Element " + elementToSearch +
//                        " exist, index = " + i);
//                break;
//            }
//        }

//        int firstIndex = 0;
//        int lastIndex = array.length - 1;
//
//        // умова зупинки
//        while (firstIndex <= lastIndex) {
//            int middleIndex = (firstIndex + lastIndex) / 2;
//            // якщо середній елемент - цільовий елемент, вернути його індекс
//            if (array[middleIndex] == elementToSearch) {
//                System.out.println("Index element = " + middleIndex);
//                break;
//            }
//
//            // якщо середній елемент менший
//            // прирівнюємо наш індекс в middle+1, прибираючи першу частину для перебирання
//            else if (array[middleIndex] < elementToSearch) {
//                firstIndex = middleIndex + 1;
//            }
//            // якщо середній елемент більший
//            // прирівнюємо наш індекс в middle-1, прибираючи другу частину для перебирання
//            else if (array[middleIndex] > elementToSearch) {
//                lastIndex = middleIndex - 1;
//            }
//        }
//
//        long afterTime = System.currentTimeMillis();
//        System.out.println("Time = " + (afterTime - beforeTime));
//        int[] array = new int[]{5, 1, 10, 43, 3, 12, 8, 7};

//        System.out.println(Arrays.toString(array));

//        int[] array = new int[100_000];
//        for (int index = 0; index < array.length; index++) {
//            array[index] = random.nextInt(100_000);
//        }
//
//        long beforeTime = System.currentTimeMillis();
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array.length - 1; j > i; j--) {
//                if (array[i] < array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//
//        Arrays.sort(array);
//
//        long afterTime = System.currentTimeMillis();
//        System.out.println("Time = " + (afterTime - beforeTime));

        //System.out.println(Arrays.toString(array));
    }
}
