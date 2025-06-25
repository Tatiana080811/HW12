//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author Tolstoy = new Author("Lev", "Tolstoy");
        book WarAndPeace = new book("Война и мир", "Tolstoy", 1867);
        Author Golol = new Author("Nikolay", "Gogol");
        book TarasBulba = new book("Тарас Бульба", "Gogol", 1852);
        System.out.println("Tolstoy.name = " + Tolstoy.getName());
        System.out.println("Tolstoy.firstName = " + Tolstoy.getFirstName());
        System.out.println("WarAndPeace.name = " + WarAndPeace.getTitle());
        System.out.println("WarAndPeace.year = "  + WarAndPeace.getYear());
        System.out.println("Gogol.name = " + Golol.getName());
        System.out.println("Gogol.firstName = " + Golol.getFirstName());
        System.out.println("TarasBulba.name = " + TarasBulba.getTitle());
        System.out.println("TarasBulba.year = " + TarasBulba.getYear());
        TarasBulba.setYear(1853);
        System.out.println("TarasBulba.year = " + TarasBulba.setYear());

    }
}












