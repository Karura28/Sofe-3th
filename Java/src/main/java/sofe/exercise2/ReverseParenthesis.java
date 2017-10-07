package sofe.exercise2;

public class ReverseParenthesis {

    public static String reverseParenthesis(String text) {
        String res = "";
        int c = 0;
        int[] posi = new int[text.length()];
        String sub = "";
        boolean prim = false;
        for(int i = 0; i<text.length();i++)
        {
            
           if(text.charAt(i)=='(')
           {
               posi[i]=c;
               c++;  
            }if (text.charAt(i)==')'){
                
            }
           else
           {
               res=res+text.charAt(i);
           }
        }
        /*for(int i = 0; i<c;i++)
        {
            sub=text.substring(posi[c-i]);
            for(int j = 0; j<sub.length();j++)
            {
                if(text.charAt(j)==')')
                {
                    String sub2;
                    sub2=sub.substring(posi[c], j);
                    sub2=new StringBuilder(sub2).reverse().toString(); 
                    res=res+sub2;
                }
            }
            
        }
         */
        for (int i = text.length()-1; i > 0; i--) {
            if (text.charAt(i) == '(') {
                sub = text.substring(i);
                for (int j = 0; j < sub.length(); j++) {
                    if (text.charAt(j) == ')') {
                        sub =sub.substring(posi[c],j);
                        sub = new StringBuilder(sub).reverse().toString();
                        res=res+text.replace(text.substring(i,j),sub);
                    }
                }
            }
        }
        return text;

    }
}
