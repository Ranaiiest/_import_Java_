import java.util.Stack;

public class learn_stack{
    public static void main(String[] args){
        // creating a stack
        Stack<Integer> st = new Stack<Integer>();

        // inserting ele
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        // removing ele
        st.pop(); // removes the top ele and returns it t.c = O(1)
        System.out.println(st);

        // accessing ele
        int top_ele = st.peek(); // returns the top ele without removing it t.c = O(1)
        System.out.println("Top ele: " + top_ele);
        System.out.println(st.isEmpty()); // to check if the stack is empty or not t.c = O(1)
        System.out.println(st.size()); // to get the size of the stack t.c = O(1)

        // traversing a stack
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }


    }
}