package Algorithms;

/*Complete the method/function so that it converts dash/underscore
delimited words into camel casing. The first word within the output
should be capitalized only if the original word was capitalized
(known as Upper Camel Case, also often referred to as Pascal case).
The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

*/
public class CamelCase {

    public static void main(String[] args) {
        toCamelCase("the-stealth-warrior");
        toCamelCase("The_Stealth_Warrior" );
    }
    static String toCamelCase(String s){
        String newString = "";
        int symbolsCount =0;
        //keep track of the index array
        int c=0;
        char[] arrayChar = s.toLowerCase().toCharArray();

//     StringBuilder sb = new Stringbuilder(s);
        for(int i=0; i<arrayChar.length; i++){
            if(i==0){
                arrayChar[i] = Character.toLowerCase(arrayChar[i]);
            }
            if(arrayChar[i] == '-' || arrayChar[i] == '_'){
                symbolsCount++;
                arrayChar[i + 1] = Character.toUpperCase(arrayChar[i+1]);
            }

            else
                // if the space is not encountered simply copy the character
                arrayChar[ c++ ] = arrayChar[i];
        }
        // The size of new string will be reduced as the spaces have been removed
        // Thus, returning the new string with new size
        return String.valueOf( arrayChar, 0, s.length() - symbolsCount ) ;
    }

}
