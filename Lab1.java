public class Lab1 {
    public static void main(String[] args) {
        boolean exit = true;
        int userLocation = 0;
        java.util.Scanner console = new java.util.Scanner(System.in);
        int prev = 0;
        int prev2 = 0;
        int turns = 0;


        while (exit) {


            if (turns > 7){
                System.out.println("start over, you are going in circles!");
                userLocation = 0;
            }
            if (userLocation == 0) {
                System.out.println("If you can navigate the rooms correctly you can win! \n if you want to exit enter 99 for your room ");
                System.out.println("Which room would you like to enter first 1, 2, 3?");
                userLocation = Integer.parseInt(console.nextLine());
            }

            if (userLocation != 1 && userLocation != 2 && userLocation != 3 && userLocation != 99) {
                System.out.println("Sorry please enter a room number 1,2 or 3");
                userLocation = Integer.parseInt(console.nextLine());
            }
            if (userLocation == 99) {
                exit = false;
            }
            if (userLocation == 1 && prev == 0) {
                prev = 1;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
            }
            if (userLocation == 2 && prev == 0) {
                prev = 2;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
            }
            if (userLocation == 3 && prev == 0) {
                prev = 3;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());

            }
            /////// Moved from initial room 0 into a second room /////////


            if (userLocation == 1 && prev == 2) {
                prev = 1;
                prev2 = 2;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
                turns++;
            }
            if (userLocation == 1 && prev == 3) {
                prev = 1;
                prev2 = 3;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
                turns++;
            }

            if (userLocation == 2 && prev == 1) {
                prev = 2;
                prev2 = 1;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
                turns++;

//                /////// 1 room away /////
            }
            if (userLocation == 2 && prev == 3) {
                prev = 2;
                prev2 = 3;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
                turns++;
                ///////// 1 room away ///////
            }
            if (userLocation == 3 && prev == 1) {
                prev = 3;
                prev2 = 1;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
                turns++;
            }
            if (userLocation == 3 && prev == 2) {
                prev = 3;
                prev2 = 2;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
                turns++;
            }

            //////// Now has gone from first room to a second room //////

            /////winner/////

            if (userLocation == 1 && prev == 2 && prev2 == 3) {
                prev = 1;
                prev2 = 2;
                System.out.println("you are in room" + userLocation);
                System.out.println("You win, the code was to go from room 3 to 2 to 1");
                System.out.println("If you would like to quit press 99 and enter");
                userLocation = Integer.parseInt(console.nextLine());
            }
            ///// winner ///////////


            if (userLocation == 1 && prev == 3) {
                prev = 1;
                prev2 = 3;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
                turns++;
            }
            if (userLocation == 1 && prev == 1) {
                prev = 1;
                prev2 = 1;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
                turns++;
            }
            if (userLocation == 2 && prev == 1) {
                prev = 2;
                prev2 = 1;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
                turns++;
            }
            if (userLocation == 2 && prev == 3) {
                prev = 2;
                prev2 = 3;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
                turns++;
            }
            if (userLocation == 2 && prev == 2) {

                prev2 = 2;
                System.out.println("you are in room" + userLocation);
                System.out.println("where would you like to go next");
                userLocation = Integer.parseInt(console.nextLine());
                turns++;
            }

        }
    }
}
