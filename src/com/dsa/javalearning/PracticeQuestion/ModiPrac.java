package com.dsa.javalearning.PracticeQuestion;

public class ModiPrac {
    public static void main(String[] args) {
//        int val = 15;
//        for(int i=1;i<6;i++){
//            int temp = val;
//            for(int j=1;j<=i;j++){
//                if (temp < 0 ){
//                    temp = 1;
//                }
//                System.out.print(temp+" ");
//                if( j%2 != 0){
//                    temp = temp - (2*(5-i))- 1;
//                }else if(j%2 == 0 && i%2 == 0){
//                    temp = temp - (i);
//                }else if(j%2 == 0 && i ==5){
//                    temp = temp - i -1;
//                }
//                else if(j%2 == 0){
//                    temp = temp - (5 - i);
//                }
//            }
//            val--;
//            System.out.println();
//        }
        System.out.println("--------------------------------");
        int N = 5; // Change N to generate different triangular number sequences

        int currentNumber = 1;

        // Generate and print the triangular number sequence
        for (int row = 1; row <= N; row++) {
            int startingNumber = currentNumber;

            // Print numbers in the current row
            for (int col = 1; col <= row; col++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }

            // Update the currentNumber for the next row
            if (row % 2 == 1) {
                currentNumber = startingNumber + (row + 1) / 2;
            } else {
                currentNumber = startingNumber + (row + 1) / 2 - 1;
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}