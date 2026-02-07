import java.util.LinkedList;

public class s53 {

    public String countAndSay(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        n--;
        while(n!=0) {
           LinkedList<Integer> list2 = inject(list);
           list = list2;
            n--;
        }
        //System.out.println(list.size());
        StringBuilder sb = new StringBuilder();
        for(int i: list) {
            sb.append(i);
        }
        return sb.toString();
    }
    public static LinkedList<Integer> inject(LinkedList<Integer> ls) {
        ls.add(-1);
        LinkedList<Integer> list = new LinkedList<>();
        int prev = -1 ;
        int c = 0;
        for(int i: ls) {
            if(prev==-1) {
              prev=i;  
            }
            if(i!=prev) {
                list.add(c);
                list.add(prev);
                prev = i;
                c = 0;
            }
            c++;
            if(i==-1) {
                break;
            }
        }

        return list;
    }

}
