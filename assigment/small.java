class small{
    public static void main(String[] args) {
        int[] array = {2,0,0,1,2,1,2,0};
        int min,i,j;
        int n = array.length;

        for (i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min= j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        System.out.println("array:");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    
}
}
