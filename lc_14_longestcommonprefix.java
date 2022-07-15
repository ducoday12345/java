public class lc_14_longestcommonprefix {

    public String longestCommonPrefix(String[] strs) {
        String str = "";
        int len0 = strs[0].length();
        for (int i = 0; i<len0;i++){ // take char from element[0] in strs
            char temp = strs[0].charAt(i); // take char of element[0] base on number i

            for (int j = 0; j<strs.length;j++){ // j is counting ement in strs not char of one element
                if( strs[j].length()<=i  || temp != strs[j].charAt(i) ){
                    return str;
                }
                if(j == strs.length - 1){
                    str = str+temp;
                }
            }

        }
        return str;
    }

}
