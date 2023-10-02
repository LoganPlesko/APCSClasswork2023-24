/* Logan Plesko, AP CS, Fall 2023.
Static Methods, Algorithms and Pseudo-code
This program prints the schedule for a normal day in AP CS.*/
public class StaticMethods {
    public static void main(String[] args) {
        EnterClass();
        PrepareWorkstation();
        LookForTrash();
        DoDailyWork();
        SaveYourProgress();
        LookForTrash();
        LeaveClass();
    }

    // Step 1, Enter and prepare your workstation
    public static void EnterClass() {
        System.out.println("Enter the classroom.");
        System.out.println("Find your preferred or assigned workstation.");
    }
    //Step 2, Make sure the workstation is clean   
    public static void LookForTrash() {
        System.out.println("If there is trash around your workstation, please notify Mr. Krokower.");
    }
    //Step 3, Open up the work needed for the day 
    public static void PrepareWorkstation() {
        System.out.println("Log into your workstation.");
        System.out.println("Open up the application that is relevant to that day's work (e.g. jGrasp, Github, AP Classroom).");
    }

    // Step 4, Do your work for the day
    public static void DoDailyWork() {
        System.out.println("Write code, read documentation or work ahead until the rest of the class is ready.");
        System.out.println("Listen to a lecture.");
        System.out.println("Do a programming challenge or project.");
        System.out.println("Submit your assignments.");
        System.out.println("Watch an AP video.");
        System.out.println("Work ahead on a project.");
    }

    // Step 5, Save any work you've made progress on
    public static void SaveYourProgress() {
        System.out.println("Save all your work.");
        System.out.println("Commit all your work to Git.");
        System.out.println("Upload all of your work to Git.");
        System.out.println("Close all of your open applications.");
        System.out.println("Log out of your workstation.");
    }

    public static void LeaveClass() {
        System.out.println("Push in your chair.");
        System.out.println("Exit the classroom.");
    }
 }

