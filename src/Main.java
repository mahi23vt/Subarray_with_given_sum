import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
        static BufferedReader br;
        static PrintWriter ot;
        public static void main(String[] args) throws IOException {

            br = new BufferedReader(new InputStreamReader(System.in));
            ot = new PrintWriter(System.out);

            int t = Integer.parseInt(br.readLine());

            while(t-->0){

//                String s[] = br.readLine().trim().split(" ");
//
//                int n = Integer.parseInt(s[0]);
//                int k = Integer.parseInt(s[1]);
                int a[] = {2,3,5,7,4,8,9,10};
//                s = br.readLine().trim().split(" ");
//                for(int i = 0; i < n; i++)
//                    a[i] = Integer.parseInt(s[i]);
                Solution obj = new Solution();
                ArrayList<Integer> res = obj.subarraySum(a, 8, 16);
                for(int ii = 0;ii<res.size();ii++)
                    ot.print(res.get(ii) + " ");
                ot.println();
            }
            ot.close();
        }

    }