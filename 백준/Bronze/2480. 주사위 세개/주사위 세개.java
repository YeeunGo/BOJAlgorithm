import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int num;
		if (A==B && B==C) {
			num = 10000 + A * 1000;
			bw.write(num+"");
		} else if (A==B || B==C) {
			num = 1000 + B * 100;
			bw.write(num+"");
		} else if (A==C) {
			num = 1000 + A *100;
			bw.write(num+"");
		} else {
			int max = A;
	        if (B > max) {
	            max = B;
	        }
	        if (C > max) {
	            max = C;
	        }
	        num = max * 100;
	        bw.write(num+"");
		}
		bw.flush();
	}

}