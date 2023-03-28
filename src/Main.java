public class Main {

    public static String getReverse(String str){
        String rev="";
        for (int i = str.length()-1; i>=0 ; i--) {
            rev+=str.charAt(i);
        }
        return rev;
    }

    public static boolean isPalindrome(String str){
        if(str.toLowerCase().equals(getReverse(str).toLowerCase())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str1="rotator";
        String str2="hello";
        String str3="KAyak";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
    }
}
