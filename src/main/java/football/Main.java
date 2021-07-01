package football;

public class Main {
    public static void main(String[] args) {

        Refrigerator refrigerator = new Refrigerator();

        for (int i = 0; i < 6; i++) {
            Beer beer = new Beer(5,"Soproni");
            refrigerator.AddBeer(beer);
        }
    }


}
