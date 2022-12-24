import java.util.Stack;

public class CheckParentheses {
    public boolean checkParentheses(String s){
        if (s.length()==0) return true;
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (Character.isDigit(c) || c == '+' || c=='-' || c==' ' || c=='*' || c=='/') {continue;}
            if (c=='('){
                stack.push(')');
            }
            else if (c == '{'){
                stack.push('}');
            }
            else if (c == '['){
                stack.push(']');
            }
            else if (stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }
        return true;
    }

    public void calculate(String s){
        boolean c  = checkParentheses(s);
        if (c==false){System.out.println("cannot calculate");}
        else{
            char[] temp = s.toCharArray();
            for (int i=0; i<temp.length; i++){
                if (temp[i]=='{'){
                    temp[i] = '(';
                }
                else if (temp[i]=='['){
                    temp[i] = '(';
                }
                else if (temp[i]==']'){
                    temp[i] = ')';
                }
                else if (temp[i]=='}'){
                    temp[i] = ')';
                }
            }
            String text = String.copyValueOf(temp);
            text = text.replaceAll("\\s", "");
            System.out.println(text);
        }
    }

}
