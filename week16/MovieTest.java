class MovieTest {
    public static void main(String[] args) {
        // Create some movie objects
        Movie shrek = new Movie("Shrek", 10, 10, 10);
        Movie shrek4 = new Movie("Shrek 4", 7, 6, 10);

        // Some disagreement with shrek 4 rating
        shrek4.updateMusic(10);
        shrek4.updateScript(10);
        
    
        // Print the average rating
        System.out.println(shrek.getName() + " has an average rating of " + shrek.overallRating());
        System.out.printf("%s has an average rating of %.2f\n", shrek4.getName(), shrek4.overallRating());
    }
}