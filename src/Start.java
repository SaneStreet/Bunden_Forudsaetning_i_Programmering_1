public class Start {
    public static void main(String[] args) {

        //Udskriver en hilsen til Datholdet!
        System.out.println("Velkommen til DatHoldet!\nØnsker du at se de Studerende?");

        //Opretter et nyt objekt (minemetoder) af klassen MineMetoder
        MineMetoder minemetoder = new MineMetoder();

        //Objektet bruges til at udføre metoden seStud
        minemetoder.seStud();
        //ny linje
        System.out.println('\n');

        //Objektet bruges til at udføre metoden scanJS
        minemetoder.scanJS();
        //ny linje
        System.out.println('\n');

        //Objektet bruges til at udføre metoden randomJoke
        minemetoder.randomJoke();
        //ny linje
        System.out.println('\n');

        //Objektet bruges til at udføre metoden simpleWhile
        minemetoder.simpleWhile();
        //ny linje
        System.out.println('\n');

    }
}
