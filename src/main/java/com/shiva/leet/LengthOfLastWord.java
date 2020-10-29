package com.shiva.leet;

/*
    https://leetcode.com/problems/length-of-last-word/
    58. Length of Last Word
*/
class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lw = new LengthOfLastWord();
        System.out.println(lw.lengthOfLastWord("Hello World"));
    }

    public int lengthOfLastWord(String s) {
        String[] sArr = s.split(" ");
        //Arrays.stream(sArr).forEach(System.out::println);
        if (sArr.length == 0)
            return 0;
        return sArr[sArr.length - 1].length();
    }
}