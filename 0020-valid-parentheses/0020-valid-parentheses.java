class Solution {
       public boolean isValid(String s) {
        //odd number always false
        if(s.length() % 2 == 1) return false;


        Stack stack = new Stack();

        for(int i = 0; i < s.length(); i++){

            char currentChar = s.charAt(i);

            if(currentChar == '(' || currentChar == '{' || currentChar == '[')
            {
//                System.out.println("pushing " + currentChar);
                stack.push(currentChar);
            }
            else{
                if(stack.isEmpty()) return false;

                char stacksTop = (char) stack.pop();

                if(currentChar == ')' && stacksTop != '(') return false;
                if(currentChar == '}' && stacksTop != '{') return false;
                if(currentChar == ']' && stacksTop != '[') return false;
            }
        }

        //if all brackets matched, would be empty
        return stack.isEmpty();
    }
}