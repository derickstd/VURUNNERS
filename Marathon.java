public class Marathon {

    public static void main(String[] args) {
        
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
        };

        
        int[] times = {
            341, 273, 278, 329, 445, 402, 388,
            275, 243, 334, 412, 393, 299, 343, 317, 265
        };

        
        int fastestIndex = findFastestRunner(times);
        System.out.println("Fastest runner: " + names[fastestIndex] + " with a time of " + times[fastestIndex] + " minutes.");

       
        int secondFastestIndex = findSecondFastestRunner(times, fastestIndex);
        System.out.println("Second fastest runner: " + names[secondFastestIndex] + " with a time of " + times[secondFastestIndex] + " minutes.");
    }

    
    public static int findFastestRunner(int[] times) {
        int fastestIndex = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[fastestIndex]) {
                fastestIndex = i;
            }
        }
        return fastestIndex;
    }

    
    public static int findSecondFastestRunner(int[] times, int fastestIndex) {
        int secondFastestIndex = fastestIndex == 0 ? 1 : 0;
        for (int i = 0; i < times.length; i++) {
            if (i != fastestIndex && times[i] < times[secondFastestIndex]) {
                secondFastestIndex = i;
            }
        }
        return secondFastestIndex;
    }
}