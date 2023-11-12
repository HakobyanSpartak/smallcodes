
public class Main {
    public static void main(String[] args) {

        int[] mass = new int[]{2, 4, 7, 14, 25, 34, 35, 54};
        System.out.println(binarySearch(mass, 15));

    }




    public static int binarySearch(int[] arr, int search) {
        int start = 0;
        int end = arr.length-1;
        //int mid = (start + end)/2;

        while (start <= end ) {
            int mid = (start + end)/2;
            if ( arr[mid] == search ) {

                return mid;

            }
            else if (arr[mid] > search ) {
                start = start;
                end = mid-1;
            }
            else {
                end = end;
                start = mid+1;
            }
        }

            throw new IllegalArgumentException("There is no " + search);

        }

    public int factorial(int n) {
        int ans = 1;
        if (n == 0) {
            return 1;
        }
        else if( n>12 ) {
            throw(new IllegalArgumentException());
        }

        for (int i = 1; i <= n; i++) {
            ans*=i;
        }

        return ans;

    }

}