class Movie {
    /** Instance variables */
    String name;
    double musicRating;
    double scriptRating;
    double actorRating;

    /** Constructor - default, with no paramaters */
    Movie () {
        name = "Movie";
        musicRating = scriptRating = actorRating = 0;
    }

    /** Constructor with all fields */
    Movie (String n, double music, double script, double actor) {
        name = n;
        musicRating = music;
        scriptRating = script;
        actorRating = actor;
    }

    /** Intance method - returns the overall rating*/
    double overallRating() {
        return (musicRating + scriptRating + actorRating) / 3;
    }

    /** Instance method - returns the movie name */
    String getName() {
        return name;
    }

    /** Instance method - update the music rating */
    void updateMusic(double newMusic) {
        musicRating = newMusic;
    }

    /** Instance method - update the script rating */
    void updateScript(double newScript) {
        scriptRating = newScript;
    }

    /** Instace method - update the actor rating */
    void updateActor(double newActor) {
        actorRating = newActor;
    }
}