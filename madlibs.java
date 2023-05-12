//class's and file's name must be the same

//import javax.print.DocFlavor.STRING;

public class madlibs {

    public static void main(String[] args) {
        String name1 = "Tris";
        String name2 = "four";

        String adjective1 = "well";
        String adjective2 = "good";
        String adjective3 = "cool";

        String verb1 = "sing"; 

        String noun1 = "things";
        String noun2 = "song";
        String noun3 = "protest";
        String noun4 = "";
        String noun5 = "";
        String noun6 = "People";
        String place1 = "Minesota";

        int numbernum = 54;
        //The template for the story
        String storys = "This morning "+ name1 +" woke up feeling "+adjective1+           
            ". 'It is going to be a "+adjective2+" day!' Outside, a bunch of"+noun1+ 
            "s were protesting to keep "+noun2+" in stores. They began to "+verb1+
            " to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "
            +name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1
            +" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+numbernum+
            ", in a world where "+noun6+"s ruled the world.";
        
        System.out.println(storys);
        
        }
        
}
