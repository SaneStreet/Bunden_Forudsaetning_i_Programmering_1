public class Studerende {

    //Deklarer variablerne fNavn, eNavn, ghLink, javaScore
    public static String fNavn;
    public static String eNavn;
    public static String ghLink;

    //Initialisere variablerne i metoden Studerende
    public Studerende(String fNavn, String eNavn, String ghLink){
        this.fNavn = fNavn;
        this.eNavn = eNavn;
        this.ghLink = ghLink;
    }
    //Getter til at hente fNavn variablen til den studerende (stud1, stud2, etc.)
    public static String getfNavn() {
        return fNavn;
    }
    //Getter til at hente eNavn variablen til den studerende (stud1, stud2, etc.)
    public static String geteNavn() {
        return eNavn;
    }
    //Getter til at hente ghLink variablen til den studerende (stud1, stud2, etc.)
    public static String getGhLink() {
        return ghLink;
    }


}
