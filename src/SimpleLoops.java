public class SimpleLoops {


    public static void main(String[] args) {

        int number = getNumber();
        String Word = getWord();
        forCountUp(number);

    }

    public static int getNumber() {

        int number = IO.getInt("please enter an int for the number of times each counter-controlled loop will run");
        return number;

    }
    public static String getWord()  {
        String word = IO.getString("Please enter a 5-letter word");
        return word;
    }


        //void forCountUp(int)
        //Use a for loop that starts at 1 and go up to the entered number by 1 each iteration.
        //
        //Output:           1 2 3 … n

        public static void forCountUp(int number) {

        for (int x =  number; x > 0; x++ ){
            System.out.println(x);
        }
            System.out.println("n");


        }

        //void forCountDown(int)
        //Use a for loop that starts at the entered number and go down by 2 each iteration as long as it is greater or equal to 0. (Output depends on even or odd entered)
        //
        //           Output:           n          or         n
        //                                  .                       .
        //                                  .                       .
        //                                  4                      5
        //                                  2                      3
        //                                  0                      1
        //

        public static void forCountDown(int number) {

            for (int x =  number; x < 0; x-- ){
                System.out.println(x);
            }
            System.out.println("n");

        }

        //void whileCountUp(int)
        //Use a while loop to start at 1 and double each iteration until it reaches the entered number.
        //
        //
        //Output:          1
        //2
        //4
        //8
        //.
        //.
        //.
        //n



        //void whileCountDown(int)
        //Use a while loop to start at the entered number and goes down by 1 until it reaches 0.
        //
        //Output:            n . . . 3 2 1 0



        //void doWhileCountUp(int)
        //Use a do-while loop to start at 1 and double each iteration until it reaches the entered number.
        //
        //Output:          1
        //2
        //4
        //8
        //.
        //.
        //.
        //n



        //void sayTheWordWhile(String)
        //You will print the word to the screen, ask the user if they want to do it again and repeat this process until they decide to stop. Use a while loop.



        //void sayTheWordDoWhile(String)
        //You will print the word to the screen, ask the user if they want to do it again and repeat this process until they decide to stop. Use a do-while loop.


        //void wordStairs(String, int)
        //Use any type of loop to print the word entered, the number times entered, cascading down.
        //
        //Output:
        //
        //Word
        //            Word
        //                        Word
        //                                    Word
        //
        //
        //                                                . . .





    }
