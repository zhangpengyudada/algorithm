public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strings ){
        String res=strings[0];
        for (int i=1;i<strings.length;i++) {
            int j = 0;
            for (;j<res.length()&&j<strings[i].length();i++){
                if(res.charAt(j)!=strings[i].charAt(j)){
                    break;
                }
                res=res.substring(0,j);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strings={"flower","flow","flight"};

    }
}
