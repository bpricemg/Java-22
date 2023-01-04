class Movie {
    private static int numberOfMovieObjects = 0;
    
    /** Instance variables */
    private String name;
    private double musicRating;
    private double scriptRating;
    private double actorRating;

    /** Constructor - default, with no paramaters */
    public Movie () {
        name = "Movie";
        musicRating = scriptRating = actorRating = 0;
        numberOfMovieObjects++;
    }

    /** Constructor with all fields */
    public Movie (String n, double music, double script, double actor) {
        name = n;
        musicRating = music;
        scriptRating = script;
        actorRating = actor;
        numberOfMovieObjects++;
    }

    /** Intance method - returns the overall rating*/
    public double overallRating() {
        return (musicRating + scriptRating + actorRating) / 3;
    }

    /** Instance method - returns the movie name */
    public String getName() {
        return name;
    }

    /** Instance method - update the music rating */
    public void updateMusic(double newMusic) {
        musicRating = newMusic;
    }

    /** Instance method - update the script rating */
    public void updateScript(double newScript) {
        scriptRating = newScript;
    }

    /** Instace method - update the actor rating */
    public void updateActor(double newActor) {
        actorRating = newActor;
    }

    public static int getNumberOfMovieObjects() {
        return numberOfMovieObjects;
    }
}