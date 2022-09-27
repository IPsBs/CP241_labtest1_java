import javax.swing.*;

public class balancingsymbol {
    public static void main(String[] args) throws Exception {
        String str = JOptionPane.showInputDialog(null,"input message");
        StackADT st =  new LinkedStack();
        str = str.replace(" ","");
        char a;
        boolean t = false;
        try{
            for(int i = 0; i < str.length(); i++) {
                a = str.charAt(i);
                if (a == '{' || a == '[' || a == '(') {
                    st.push(a);
                }
            if ((a == '}' || a == ']' || a == ')')) {
                if (st.empty()) {
                    throw new Exception("Stack is empty :Not Balancing Symbol");
                } else {
                    char b = (Character) st.top();
                    if (a == ']' && b == '[' || a == '}' && b == '{' || a == ')' && b == '(') {
                        st.pop();
                    } else {
                        throw new Exception("Symbol doesn't match at position " + (i + 1) + ":Not balance");
                    }
                }
            }
        }
        if(st.empty()){
            JOptionPane.showMessageDialog(null,"Balancing Symbol");
        }else{
            JOptionPane.showMessageDialog(null,"Illegal Expression : Not Balancing Symbol");
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}