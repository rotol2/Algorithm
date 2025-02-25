import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(System.in, 32768);

		int numCases = readInt(bis);
		BufferedOutputStream bos = new BufferedOutputStream(System.out, numCases*6);

		while (numCases-- > 0) {
			bos.write(Integer.toString(readInt(bis) + readInt(bis)).getBytes());
			bos.write('\n');
		}

		bos.flush();
		bos.close();
	}

	static int readInt(BufferedInputStream bis) throws IOException {
	        int n = 0;
	        int c;
	        while ((c = bis.read()) != ' ' && c != '\n') {
	            n = 10 * n + c - '0';
	        }
	        return n;
	}
}