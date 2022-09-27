# Even palindrome generator

[LINK](https://interviewing.io/mocks/spotify-java-even-palindrome-generator/)

## Print out all the 8 digits palindrome. Limitation: we can not use string manipulation.

### Questions

1. when you say 'we can not use string manipulation', does it mean that I can only use number type?
2. What is the input?

=> there is no input, you have to write a function which print out all the results

3. Could it be leading 0? like is 00000000 a valid answer

=> No


#### My first thought

1. create an array with 4 elements: [10000001, 10000100, 1001000, 11000]
2. use elements by order, print them, and add then next one and print again
3. During printing, we can multipliy the number from 1 to 9 and print.
4. We can write the program by recursion.

```java
class Scratch {
  public static void main(String[] args) {
    Scratch o = new Scratch();
    o.printPalindrome();
  }

  void printPalindrome() {
    int[] arr = new int[] {10000001, 1000010, 100100, 11000};
    fn(arr, 0, 0);
  }

  private void fn(int[] arr, int index, int sum) {
    if (arr.length == index) {
      return;
    }
    for (int i = 1; i <= 9; i++) {
      int num = arr[index] * i + sum;
      System.out.println(num);
      fn(arr, index + 1, num);
    }
  }
}

```

#### Candidate's thought

1. create a series of number from 1000 - 9999
2. reverse it, and use original number to time 10000 and plus them toghther


### Follow-up : If only wants to print even result, which part should be modified?

#### My first thought

For even result, only the first element in the array should be judge if is even.

```java
class Scratch {
  public static void main(String[] args) {
    Scratch o = new Scratch();
    o.printPalindrome();
  }

  void printPalindrome() {
    int[] arr = new int[] {10000001, 1000010, 100100, 11000};
    fn(arr, 0, 0);
  }

  private void fn(int[] arr, int index, int sum) {
    if (arr.length == index) {
      return;
    }
    for (int i = 1; i <= 9; i++) {
      // --- here
      if (index == 0 && i % 2 == 1) {
        continue;
      }
      // ---
      int num = arr[index] * i + sum;
      System.out.println(num);
      fn(arr, index + 1, num);
    }
  }
}
```

