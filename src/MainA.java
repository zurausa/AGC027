    import java.io.PrintWriter;
import java.util.Arrays;

    public class MainA {
    	static FastScanner sc;
    	static PrintWriter out;
    	public static void main(String[] args){
    		sc = new FastScanner();
    		out = new PrintWriter(System.out);
    		out.println(solve());
    		out.flush();
    	}

    	static int solve(){
    		int N = sc.nextInt();
    		int x = sc.nextInt();
    		int[] matMap = new int[N];
    		for(int i=0;i<N;i++){
    			matMap[i] = sc.nextInt();
    		}
    		Arrays.sort(matMap);
    		int count = 0;
    		for(int i=0;i<N-1;i++){
    			if(matMap[i]<=x){
    				count++;
    				x -= matMap[i];
    			}else{
    				break;
    			}
    		}
    		if(x==matMap[N-1])count++;
    		return count;
    	}


    }