package lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CopyDataThread extends Thread {
	FileReader fr;
	FileWriter fw;

	public CopyDataThread(FileReader fr, FileWriter fw) {
		this.fr = fr;
		this.fw = fw;
	}

	public void run() {
		int cnt = 0;
		int i;
		try {
			while ((i = fr.read()) != -1) {
				System.out.println(((char) i));
				fw.write(((char) i));
				cnt++;
				if (cnt == 10) {
					cnt = 0;
					System.out.println("10 characters are copied");
					Thread.sleep(1000);
				}
			}
			fr.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task completed");
	}

}

// Instead of FileProgram.java I have used Exercise1.java
public class Exercise1 {
	public static void main(String[] args) {
		try {
			// Please use proper path here ...
			FileReader fr = new FileReader("C:\\Users\\Nilavro\\Desktop\\Source.txt");
			FileWriter fw = new FileWriter("C:\\Users\\Nilavro\\Desktop\\Target.txt");
			CopyDataThread th1 = new CopyDataThread(fr, fw);
			th1.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
