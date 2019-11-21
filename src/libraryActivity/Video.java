package libraryActivity;

public class Video implements Media {
    private String title, director;
    private int numberOfCopiesOwned;
    private boolean isAvailable;
    private int quanity;
    public Video(String title, String director, int numberOfCopiesOwned){
        this.title = title;
        this.director = director;
        this.numberOfCopiesOwned = numberOfCopiesOwned;
       this.quanity = numberOfCopiesOwned;
       if(quanity > 0 ) {
           isAvailable = true;
       }
       else {
           isAvailable = false;
       }

    }
    public String getTitle(){
        return title;
    }
    public void isAvailable(){
        if(quanity > 0 ) {
            isAvailable = true;
        }
        else {
            isAvailable = false;
        }
    }
    public boolean checkOut() {
        if (this.isAvailable) {
            quanity--;
            isAvailable();
            return true;

        } else {
            return false;


        }
    }
    public boolean checkIn(){
            if(quanity<numberOfCopiesOwned) {
                quanity ++;
                isAvailable();
                return true;

            } else {
                return false;
            }

    }
    public String toString(){
        String output = title + " " + director + " " + quanity;
        return output;
    }

}
