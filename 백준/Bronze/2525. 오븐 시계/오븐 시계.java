import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String timeString = br.readLine();
		String [] timeStringArray = timeString.split(" ");
		int A = Integer.parseInt(timeStringArray[0]);
		int B = Integer.parseInt(timeStringArray[1]);
		String requireTimeString = br.readLine();
		int C = Integer.parseInt(requireTimeString);
		B += C;
		if(B>=60) {
			A += B/60;
			B = B%60;
			
		}
		if(A>=24) {
			A = A%24;
		}
		bw.write(A + " " + B);
		bw.flush();
		br.close();
		bw.close();
	}

}