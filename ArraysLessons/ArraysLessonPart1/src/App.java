public class App {
    public static void main(String[] args) throws Exception {
        
        // // Declaring Arrays
        // int[] highscore = null;
        // String[] names = null;

        // // Create the array
        // highscore = new int[5];
        // names = new String[5];

        // // Set initial values invidiually
        // highscore[0] = 99;
        // names[0] = "george";

        // Declare, Create, and intialize at the same time
        int[] highscore = {99,98,98,88,68};
        String[] names = {"g","fred","wolf","fox","sutter"};

        System.out.println("The length is: " + names.length);



        // Default loop to go backwards
        for (int i = highscore.length - 1; i >= 0; i --){
            System.out.println("Item number "+ i + " is " + highscore[i]);
            System.out.println("Item number "+ i + " is " + names[i] + "\n");
        }
        // Default loop going forward
        for (int i = 0; i < highscore.length; i --){
            System.out.println("Item number "+ i + " is " + highscore[i]);
            System.out.println("Item number "+ i + " is " + names[i] + "\n");
        }





    }
}
