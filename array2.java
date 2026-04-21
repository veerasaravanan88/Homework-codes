class array2 {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 8, 3},
            {4, 2, 6}
        };

        int largest = arr[0][0]; // assume first element is largest

        // Find largest
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }

        // Output
        System.out.println("Largest = " + largest);
    }
}