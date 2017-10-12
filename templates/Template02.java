// Working program with FastReader
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Template02
{
    
    public static void main(String[] args)
    {   
        String inputs[] = null;
        int n, k, count;
        FastReader s=new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = s.nextInt();
        k = s.nextInt();
        count = 0;
        while (--n >= 0) {

        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() throws IOException {
            return br.readLine();
        }
    }
}