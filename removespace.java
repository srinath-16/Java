public class removespace{
    public static void main(String[] args) {
        
        String str ="how are you?";
        //approch 1 - using replace
        String strReplace =str.replace(" ","");
        System.out.println(" after removing space : "+strReplace);

        //approch 2 - using for loop
        String newstring ="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                newstring = newstring+ch;
            
            }
        }
        System.out.println(" after removing space(for loop) : "+newstring);
    }   
        
}

