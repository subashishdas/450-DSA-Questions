public class ImplementAtoi {
    public static int atoi(String s){
    if(s == null || s.isEmpty()){
        return -1;
    }
    int result = 0;
    int sign = 1;
    if(s.charAt(0) == '-'){
        sign = -1;
        s = s.substring(1);
    }
    for(char c : s.toCharArray()){
        if(!Character.isDigit(c)){
            return -1;
        }
        int digit = Character.getNumericValue(c);
        result = result * 10 + digit;
    }
    return result * sign;
    }

    public static void main(String[] args) {
        String s = "-123a";
        int ans = atoi(s);
        System.out.println(ans);
    }
}
