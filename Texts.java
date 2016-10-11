/*
GAME OF LIFE
NEWTON - YAPP OOP
Giovanni Palusa
Giovanni@palusa.se
*/

import java.io.IOException;





public class Texts {
    
    
    public static final void welcome () {
        String welcomeMessage =
" ██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ███████╗    ██╗     ██╗███████╗███████╗\n"+
"██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██╔════╝    ██║     ██║██╔════╝██╔════╝\n"+
"██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║█████╗      ██║     ██║█████╗  █████╗  \n"+
"██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║██╔══╝      ██║     ██║██╔══╝  ██╔══╝  \n"+
"╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝██║         ███████╗██║██║     ███████╗\n"+
" ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝ ╚═╝         ╚══════╝╚═╝╚═╝     ╚══════╝\n"+
"                                                                                        \n"+
"███╗   ██╗███████╗██╗    ██╗████████╗ ██████╗ ███╗   ██╗                                \n"+
"████╗  ██║██╔════╝██║    ██║╚══██╔══╝██╔═══██╗████╗  ██║                                \n"+
"██╔██╗ ██║█████╗  ██║ █╗ ██║   ██║   ██║   ██║██╔██╗ ██║                                \n"+
"██║╚██╗██║██╔══╝  ██║███╗██║   ██║   ██║   ██║██║╚██╗██║                                \n"+
"██║ ╚████║███████╗╚███╔███╔╝   ██║   ╚██████╔╝██║ ╚████║                                \n"+
"╚═╝  ╚═══╝╚══════╝ ╚══╝╚══╝    ╚═╝    ╚═════╝ ╚═╝  ╚═══╝                                \n";
                                                                                        
        System.out.println(welcomeMessage);
        System.out.println();
    }
    

    public static void width () {
            System.out.println();
            String widthMessage = "What width would you like?";
            System.out.println(widthMessage);
    }
    
    

        public static void error () {
            System.out.println();
            String errorMessage = "Unfortunately, something went wrong =(";
            System.out.println(errorMessage);
    }
    
    
    public static void height () {
            System.out.println();
            String heightMessage = "What height would you like?";
            System.out.println(heightMessage);
    }
        
    public static void speed () {
            System.out.println();
            String speedMessage = "What speed would you like between 1-10?\n(1 is the fastest)";
            System.out.println(speedMessage);
    }
        
    public static void readFile () throws IOException {
            System.out.println();
            String readMessage = "would you like to use a saved field? (y/n)";
            System.out.println(readMessage);
    }        
    
    public static void askForFileName () {
            System.out.println();
            String readMessage = "Enter the filename of the file you wish to load:\n"
                            + "if the file is in the same folder as the game, you don't have to write the full path,\n"
                            + "\nFields that come pre-packaged is:\n-gun.gol\t-train.gol\n-test.gol\t-plan.gol\nTry some of them (or load you own file)";
            System.out.println(readMessage);
    }         
    
    
        public static final void cred () {

            for (int i = 0; i <=30; i++)
            System.out.println();
            
        String credMessage = 
                
" __ _                     _                   \n" +
"/ _\\ | ____ _ _ __   __ _| |_    __ ___   ___ \n" +
"\\ \\| |/ / _` | '_ \\ / _` | __|  / _` \\ \\ / (_)\n" +
"_\\ \\   < (_| | |_) | (_| | |_  | (_| |\\ V / _ \n" +
"\\__/_|\\_\\__,_| .__/ \\__,_|\\__|  \\__,_| \\_/ (_)\n" +
"   ___ _     |_|                     _        \n" +
"  / _ (_) _____   ____ _ _ __  _ __ (_)       \n" +
" / /_\\/ |/ _ \\ \\ / / _` | '_ \\| '_ \\| |       \n" +
"/ /_\\\\| | (_) \\ V / (_| | | | | | | | |       \n" +
"\\____/|_|\\___/ \\_/ \\__,_|_| |_|_| |_|_|       \n";

        System.out.println(credMessage);
        }
    
    
    
    
    
}
