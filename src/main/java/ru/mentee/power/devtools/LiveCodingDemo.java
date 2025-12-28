package ru.mentee.power.devtools;

public class LiveCodingDemo {
  public static void main(String[] args) {
    printFizzBuzz(15);
  }

  public static void printFizzBuzz(int n) {
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }

  public static int sumEven(int[] numbers){
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        sum += numbers[i];
      }
    }
    return sum;
  }

  public static int findMax(int[] numbers){
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    return max;
  }
}
