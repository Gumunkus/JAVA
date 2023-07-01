package ru.java.Lesson4.Hw;

public class task2 {
    public boolean isValid(String s) {

        Stack<Character> st=new Stack<Character>();
        for(char i:s.toCharArray())
        {
            if(i=='(')
                st.push(')');
            else if(i=='[')
                st.push(']');
            else if(i=='{')
                st.push('}');
            else if(st.empty()||st.pop() !=i)
                return false;

        }
        return st.empty();
    }
}
