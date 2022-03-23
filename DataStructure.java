
import java.util.*;
import java.io.*;
import java.lang.Math;
public class DataStructure {


    public static void main(String[] args)throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=sc.readLine())!=null){
            int n = Integer.parseInt(s);
            Stack<Integer> stack = new Stack<Integer>(); boolean bStack = true;
            Queue<Integer> queue = new LinkedList<Integer>(); boolean bQueue = true; 
            PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); boolean bpQ = true;
            for(int i = 0; i < n; i++){
                StringTokenizer st=new StringTokenizer(sc.readLine());
                String in1 = st.nextToken();
                //System.out.print(in1+" ");
                int in2 = Integer.parseInt(st.nextToken());
                //System.out.println(in2);
                if(in1.equals("1")){
                    if(bStack){stack.push(in2);}
                    if(bQueue){queue.offer(in2);}
                    if(bpQ){pQ.offer(in2);}
                }
                else if(in1.equals("2")){
                    if(bStack && (stack.size() == 0 || !stack.pop().equals(in2))){bStack = false;}
                    if(bQueue && (queue.size() == 0 || !queue.poll().equals(in2))){bQueue = false;}
                    if(bpQ && (pQ.size() == 0 || !pQ.poll().equals(in2))){bpQ = false;}
                }
            }
            if(!bStack && !bQueue && !bpQ){System.out.println("impossible");}
            else if((bStack && bQueue) || (bQueue && bpQ) || (bpQ && bStack)){System.out.println("not sure");}
            else if(bStack){System.out.println("stack");}
            else if(bQueue){System.out.println("queue");}
            else if(bpQ){System.out.println("priority queue");}
        }
    }
}

 