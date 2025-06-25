public class book {
    private String title;
    private String author;
    private int year;

    public book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public String getTitle() {
        return this.title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int setYear() {
        return this.year;
    }
}



