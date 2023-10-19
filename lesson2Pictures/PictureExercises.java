 //Logan Plesko, AP CS, Fall 2023, Program that prints your image with its width and height
public class PictureExercises
{
    public static void main(String[] args)
    {    	
        //Makes Picture variable as my directory
        Picture myPicture = new Picture("C:\\CS\\PleskoLogan\\lesson2Pictures\\");
        myPicture.pick();
        
        // Use Picture methods to draw your picture object HERE
        myPicture.draw();      
        
        // Use Picture methods & print\println to print out the height and width of your picture HERE
        int width = myPicture.getWidth(); //chat gpt helped with this code
        int height = myPicture.getHeight();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        
        
    }
}
