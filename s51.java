public class s51 {
    public boolean areRotations(String s1, String s2) {
        int l = s1.length();
        int i = 0;
        for(;i<l;i++) {
            String c1 = s1.substring(0,l-i);
            String c2 = s2.substring(i);
            c1.equals(c2);
        }
        if(i>=l) return false;
        String c1 = s1.substring(l-i);
        String c2 = s2.substring(0,i);
        return c1.equals(c2);
    }
}
