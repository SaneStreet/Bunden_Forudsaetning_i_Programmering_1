public class DatHoldet {

    //Metoden DatHoldet
    public void DatHoldet() {
        //Laver et objekt til en studerende (stud1) og indsætter værdier:
        Studerende stud1 = new Studerende(
                "Michael",
                "Hansen",
                "http://www.github.com/SaneStreet");
        //Udskriver fornavn, efternavn og github link til den studerende (stud1)
        System.out.println(stud1.getfNavn() + " " + stud1.geteNavn());
        System.out.println(stud1.getGhLink()+ '\n');

        //Laver et objekt til en studerende (stud2) og indsætter værdier:
        Studerende stud2 = new Studerende(
                "Mads",
                "Hartelius Dideriksen",
                "https://github.com/MHDideriksen");
        //Udskriver fornavn, efternavn og github link til den studerende (stud2)
        System.out.println(stud2.getfNavn() + " " + stud2.geteNavn());
        System.out.println(stud2.getGhLink()+ '\n');

        //Laver et objekt til en studerende (stud3) og indsætter værdier:
        Studerende stud3 = new Studerende(
                "Lasse",
                "Bjørn Nielsen",
                "https://github.com/lasseko654");
        //Udskriver fornavn, efternavn og github link til den studerende (stud3)
        System.out.println(stud3.getfNavn() + " " + stud3.geteNavn());
        System.out.println(stud3.getGhLink()+ '\n');

        //Laver et objekt til en studerende (stud4) og indsætter værdier:
        Studerende stud4 = new Studerende(
                "Sebastian",
                "Bukhave",
                "https://github.com/Sebbenseb4");
        //Udskriver fornavn, efternavn og github link til den studerende (stud4)
        System.out.println(stud4.getfNavn() + " " + stud4.geteNavn());
        System.out.println(stud4.getGhLink()+ '\n');

        //Laver et objekt til en studerende (stud5) og indsætter værdier:
        Studerende stud5 = new Studerende(
                "Kasper",
                "Achton Truelsen",
                "https://github.com/kasp010k");
        //Udskriver fornavn, efternavn og github link til den studerende (stud5)
        System.out.println(stud5.getfNavn() + " " + stud5.geteNavn());
        System.out.println(stud5.getGhLink() + '\n');
    }
}
