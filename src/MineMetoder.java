import java.util.Scanner;

public class MineMetoder {

    public void scanJS(){

        //Ny scanner der hedder input
        Scanner input = new Scanner(System.in);
        System.out.println("Er du god til Java?");
        System.out.print("Indtast din Java score: ");
        //det næste som variablen score skal være, kommer fra input
        int score = input.nextInt();

        //Hvis værdien af score er under 0, udskriv følgende
        if (score < 0)
            System.out.println("Score MÅ IKKE være 0!");

        //Hvis værdien score er større eller lig med 60, udskriv følgende
        else if (score > 60 || score == 60)
            System.out.println("Du er god til Java!");

        //Hvis værdien score er alt andet, udskriv følgende
        else
            System.out.println("Du burde øve dig noget mere med Java.");

    }
    public void randomJoke() {
        System.out.println("Livet er for kort, til ikke at have det sjovt en gang imellem.");
        System.out.print("Vil du høre en one-liner? Skriv 1 for JA eller 0 for NEJ:");
        //Scanner user spørger om man vil høre en joke
        Scanner user = new Scanner(System.in);
        //Svaret fra user skal være variablen answer
        int answer = user.nextInt();
        //Hvis answer = 1, udfør følgende:
        if (answer == 1) {
            //Generate random number between 1 and 5:
            int joke = (int) ((Math.random() * 5) + 1);
            //System.out.println(joke);
            switch (joke) {
                case 1: //If random number from joke is 1, do the following:
                    System.out.println("Moses had the first tablet that could connect to the cloud.");
                    break;
                case 2: //If random number from joke is 2, do the following:
                    System.out.println("On a scale of North Korea to America, how free are you tonight?");
                    break;
                case 3: //If random number from joke is 3, do the following:
                    System.out.println("My doctor told me I needed to break a sweat once a day\nso I told him I'd start lying to my wife.");
                    break;
                case 4: //If random number from joke is 4, do the following:
                    System.out.println("As an HTML programmer, I always put <neck></neck> between the head and body on my websites.");
                    break;
                case 5: //If random number from joke is 5, do the following:
                    System.out.println("One Programmer to another: I can't access git! I guess I have... commitment issues.");
                    break;
            }
        }
        //Ellers hvis svaret er 0, så bare fortsæt
        else if (answer == 0){
            System.out.println("Okay, vi fortsætter:");
        }
        //Hvis alt andet, så gik noget galt
        else{
            System.out.println("Noget gik galt.");
        }
    }
    public void seStud(){

        System.out.print("Hvis JA, tast 1. Hvis NEJ, tast 0:");
        Scanner user = new Scanner(System.in);
        int input = user.nextInt();
        if (input == 1){
            //Udskriver DatHoldets studerende
            System.out.println("DatHoldets studerende: ");
            //Laver et objekt til Metoden DatHoldet
            DatHoldet dataholdet = new DatHoldet();
            //Brug objektet dataholdet til at kalde på Metoden DatHoldet
            dataholdet.DatHoldet();
        }
        //Ellers hvis input = 0, så bare fortsæt
        else if (input == 0){
            System.out.println("Okay, vi fortsætter:");
        }
        //Ellers hvis input hverken er 0 eller 1, så fortsæt alligevel
        else if (input != 0 || input != 1){
            System.out.println("Du har tydeligvis tastet andet end 1 eller 0. Vi fortsætter..");
        }
        //Hvis alt andet ikke virker, gik noget galt.
        else{
            System.out.println("Noget gik galt.");
        }
    }
    public void simpleWhile(){
        //Tæl til ti
        System.out.println("Super simpel While loop der tæller til 10: ");
        //Deklarer variablen counter og initialisere
        int counter = 1;
        //Imens counter er under 11, så læg 1 til:
        while (counter < 11){
            System.out.print(counter++ + " ");
        }
    }
}
