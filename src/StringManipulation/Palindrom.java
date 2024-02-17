package StringManipulation;

public class Palindrom {
    public boolean isPalindrom(String s){
        int len=s.length();
        if(len==0||len==1){
            return true;
        }
        String firstIndex=s.substring(0,1);
        String lastIndex=s.substring(len-1);
        if(firstIndex.equals(lastIndex)){
            return isPalindrom(s.substring(1,len-1));
        }
        return false;
    }
    public static void main(String[] args) {

        String s1="madam";
        Palindrom p= new Palindrom();
        System.out.println(p.isPalindrom(s1));

    }
}
