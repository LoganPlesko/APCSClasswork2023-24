public class Cryptography
{
    private int rotations = 13;  // used in the second part

    public Cryptography()
    {
        // no need to put anything here for now.
    }

    public int convertToNumbers(char letter)
    {
        // fill in this method!
        
        return (int)letter - 'A' + 1; //ChatGPT helped with the minus A plus 1
    }
    
    // create a similar method for the ROT13 portion.
    // This method will return a character instead.

    public char applyRotation(char letter) {
        
//Chat GPT helped with all below
        if (letter >= 'A' && letter <= 'Z') {
            char rotatedLetter = (char) ('A' + (letter - 'A' + rotations) % 26);
            return rotatedLetter;
        } else if (letter >= 'a' && letter <= 'z') {
            char rotatedLetter = (char) ('a' + (letter - 'a' + rotations) % 26);
            return rotatedLetter;
        } else {
            
            return letter;
        }
    }
}
