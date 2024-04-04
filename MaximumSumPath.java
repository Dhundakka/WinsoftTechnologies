class MaximumSumPath {
    public static int maxSumPath(int[] x, int[] y) {
        int length1 = x.length;
        int length2 = y.length;

        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0, result = 0;

        while (i < length1 && j < length2) {
            if (x[i] < y[j]) {
                sum1 += x[i++];
            } else if (x[i] > y[j]) {
                sum2 += y[j++];
            } else { 
                result += Math.max(sum1, sum2) + x[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        
        while (i < length1)
            sum1 += x[i++];

         
        while (j < length2)
            sum2 += y[j++];

        result += Math.max(sum1, sum2);
        return result;
    }

    public static void main(String[] args) {
        int[] x = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        System.out.println("Maximum sum path is: " + maxSumPath(x, y));
    }
}
