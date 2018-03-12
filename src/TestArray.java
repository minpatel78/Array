

public class TestArray {


    public static void main(String a[]) {
        int[] array1 = {1, 4, 1, 4, 2, 1, 3, 5, 6, 2, 3, 7};
        int[] array2 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] array3 = {2, 7, 1, 8, 2, 8, 1};
        int[] array4 = {};
        int[] array5 = null;

       if(array5!=null)
           System.out.println(" INPUT EXAMPLE 1 ");
           orignalArray(array1);
           System.out.println(" EXPECTED OUTPUT " + maxLength(array1));
           System.out.println(" INPUT EXAMPLE 2 ");
           orignalArray(array2);
           System.out.println(" EXPECTED OUTPUT " + maxLength(array2));
           System.out.println(" INPUT EXAMPLE 3 ");
           orignalArray(array3);
           System.out.println(" EXPECTED OUTPUT " + maxLength(array3));
           System.out.println(" INPUT EXAMPLE 4 ");
           orignalArray(array4);
           System.out.println(" EXPECTED OUTPUT " + maxLength(array4));
           System.out.println(" INPUT EXAMPLE 5 ");
          if(array5==null) {

             // orignalArray(array5);
              System.out.println(" null array " );
          }



    }

    public  static void orignalArray(int[] arrray) {
           for (int i : arrray) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static int maxLength(int[] array) {
        if (array.length <= 1) return array.length; // check for null also
        int maxLength = 1;
        int curLength = 1;

            for (int i = 1; i < array.length; i++) {

                //extra check to finish earlier if possible (you may omit it)
                if ((array.length - i + curLength) <= maxLength)
                    return maxLength;

                if (array[i] > array[i - 1]) //use >= if equal elements count too
                    curLength++;
                else {
                    if (maxLength < curLength)
                        maxLength = curLength;
                    curLength = 1;
                }

            }

        //final check (in case the last element is included in maxLength)
        if (maxLength < curLength)
            return curLength;
        return maxLength;
    }
}
