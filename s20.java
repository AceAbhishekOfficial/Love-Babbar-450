import java.util.ArrayList;

public class s20 {
	void rearrange(ArrayList<Integer> list) {
		
		int s =list.size();
		
		for(int i=0;i<s;i++) {
		    if(i%2==0 && list.get(i)<0) {
		        for(int a = i;a<s;a++){
		            int x = list.get(a);
		            if(x>=0) {
		                list.remove(a);
		                list.add(i,x);
		                break;
		            }
		        }
		        
		    } else if(i%2==1 && list.get(i)>=0) {
		        for(int a = i;a<s;a++){
		            int x = list.get(a);
		            if(x<0) {
		                list.remove(a);
		                list.add(i,x);
		                break;
		            }
		        }
		    }
		}
	}
} 