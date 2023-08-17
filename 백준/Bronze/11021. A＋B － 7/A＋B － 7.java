import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 1 ; i <= A ; i ++) {
			String strnum = br.readLine();
			String[] strnumArray = strnum.split(" ");
			sum = Integer.parseInt(strnumArray[0])+Integer.parseInt(strnumArray[1]);
			bw.write("Case #"+i+": "+sum);
			bw.newLine();
		}
		bw.flush();
		
	}

}