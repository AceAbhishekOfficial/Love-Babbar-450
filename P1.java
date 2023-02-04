class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        String ret="";
        for(int a=0;a<str.length();a++)
        ret=str.charAt(a)+ret;
        return ret;
    }
}