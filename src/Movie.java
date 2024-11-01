public class Movie {
    private final String title;
    private final String year;
    private final String director;
    private double rating;

    private static int movieCounter = 0;

    public Movie(String title, String year, String director, double rating) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
        if (year == null || year.isEmpty()) {
            throw new IllegalArgumentException("Year cannot be null or empty");
        }
        this.year = year;
        if (director == null || director.isEmpty()) {
            throw new IllegalArgumentException("Director cannot be null or empty");
        }
        this.director = director;
        setRating(rating);
        movieCounter++;
    }

    public String getTitle() {
        return title;
    }
    public String getYear() {
        return year;
    }
    public String getDirector() {
        return director;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        if (rating < 0 || rating > 10)
            throw new IllegalArgumentException("Rating must be between 0 and 10");
        else
            this.rating = rating;
    }
}
