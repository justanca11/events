package kickstart2018.practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BGoogolString {

	public static long rez(long cat, long rest) {
		if (rest == 1)
			return 0;
		if (rest == 3)
			return 1;
		if (rest == 2) {
			if (cat % 2 == 0) {
				return 0;
			} else {
				return 1;
			}
		}
		return rez(cat / 4, cat % 4);
	}

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(new File("D:\\Anca's stuff\\downloads\\B-large-practice.in"));
		long t = 0;
		t = reader.nextLong();
		BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Workspace\\events\\output.out"));
		long caz = 1;
		while (caz <= t) {
			long k = 0;
			k = reader.nextLong();
			writer.write("Case #" + caz + ": " + rez(k / 4, k % 4) + "\n");
			caz++;
		}
		reader.close();
		writer.close();
	}

}
