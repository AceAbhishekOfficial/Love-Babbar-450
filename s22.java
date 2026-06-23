import java.util.ArrayList;

class s22 {
    public ArrayList<Integer> factorial(int n) {
        // code here
        // Time take 18m 45 sec
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for(int i=2;i<=n;i++) {
            multiply(list,i);
        }
        return list;
    }
    public static void multiply(ArrayList<Integer> list, int n ) {
        int carry = 0;
        int s = list.size();
        for(int a = s-1;a>=0;a--) {
            int d = list.get(a);
            int p = d*n + carry;
            carry = p/10;
            p%=10;
            
            list.set(a,p);
        }
        while(carry>0) {
            int rem = carry%10;
            list.add(0,rem);
            carry/=10;
        }
    }
}