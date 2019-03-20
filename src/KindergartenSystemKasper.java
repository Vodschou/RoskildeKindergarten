import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class KindergartenSystemKasper {
    // Make scanner objects
    Scanner sConsole = new Scanner(System.in);
    Scanner iConsole = new Scanner(System.in);

    public void systemRun() throws IOException {
        // Make a printstream object to write text to a file called "children.txt"
        PrintStream out = new PrintStream(new FileOutputStream("children.txt", true));
        boolean running = true;
        // While loop, so that the program runs until the user stops it manually with "case 0"
        while (running) {
            // Welcome message and start menu;
            System.out.println("****** Velkommen Til Roskilde Fri B�rnehave Administrative System ******");
            System.out.println("Du er ved at logge ind. Identificer hvem du er:");
            System.out.println("1: Bestyrer");
            System.out.println("2: Medarbejder");
            System.out.println("0: Luk programmet");
            int input = iConsole.nextInt();
            switch (input) {
                // Manager login
                case 1:
                
   boolean login = true;             
   while (login){ 
   
   
                
                
   for(int n=0; n <3; n++){

    System.out.println("Indtast dit login: ");    
              
   String login1;
   
   
    login1 = sConsole.next();

     boolean b = login1.equals("Sandra");                        

    if (b) {

      

        System.out.println("Login godtaget - Logger ind... ");
         

        
         // Hvis login fungere bruger vi break til at g� ud af loop, og fors�tter koden.
        
        break;     

    }  

     
    if (b == false){

        System.out.println();

        System.out.println("Forkert login informationer, pr�v igen.");

        // Hvis n == 2, 3 fors�g er blevet brugt(n starter ved 0) og skulle stoppe programmet.

        if(n >= 2){ // can also say if(n==2)

            System.out.println("Du har brugt 3 loginfors�g. G�r ud af programmet"); 
            
            login = false;


               break;
            //System.exit(0);

        }

    
  }
}
                   while(login) {

            
      
      

                    System.out.println("V�lg hvad du vil g�re:");
                    System.out.println("1. Indskriv et barn.");
                    System.out.println("0. Luk programmet.");
                    int adminInput = iConsole.nextInt();
                    switch (adminInput) {
                        // Enrollment
                        case 1:
                            System.out.println("Indtast navnet p� barnet:");
                            String childName = sConsole.nextLine();
                            System.out.println("Indtast f�dselsdatoen for barnet med formatet (Dag/M�ned/�r):");
                            String dateOfBirth = sConsole.nextLine();
                            System.out.println("Indtast alderen p� barnet:");
                            int age = iConsole.nextInt();
                            System.out.println("Indtast f�rste for�lders navn:");
                            String parent1 = sConsole.nextLine();
                            System.out.println("Indtast anden for�lders navn:");
                            String parent2 = sConsole.nextLine();
                            System.out.println("Indtast for�ldres adresse:");
                            String address = sConsole.nextLine();
                            System.out.println("Indtast for�ldres E-mail:");
                            String email = sConsole.nextLine();
                            System.out.println("Indtast for�ldres prim�re tlf. nummer:");
                            String phone1 = sConsole.nextLine();
                            System.out.println("Indtast for�ldres sekund�re tlf. nummer:");
                            String phone2 = sConsole.nextLine();
                            // Calling the constructor of Child
                            Child child = new Child(childName, dateOfBirth, age, parent1, parent2, address, phone1, phone2);
                            // Writing the input by the user to the text file "children.txt"
                            out.println(child);
                            break;
                    }
                    }
                 }
            }
        }
    }
}