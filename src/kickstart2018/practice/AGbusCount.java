/*package kickstart2018.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AGbusCount {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(new File("D:\\Workspace\\events\\A-large-practice.in"));
		int t = 0;
		t = reader.nextInt();
		BufferedWriter writer = new BufferedWriter(
				new FileWriter("D:\\Workspace\\events\\output.out"));
		// treat each of the t cases
		int caz = 1;
		// while (reader.hasNext()) {
		while (caz <= t) {
			// read
			int n = 0;
			n = reader.nextInt();
			int n2 = n * 2;
			int ranges[] = new int[n2];
			for (int i = 0; i < n2; i++) {
				ranges[i] = reader.nextInt();
			}
			int p = 0;
			p = reader.nextInt();
			int cities[] = new int[p];
			int rez[] = new int[p];
			for (int i = 0; i < p; i++) {
				cities[i] = reader.nextInt();
				//process
				int count = 0;
				int city = cities[i];
				for (int j = 0; j < n2; j += 2) {
					if (ranges[j] <= city && ranges[j + 1] >= city) {
						count++;
					}
				}
				rez[i] = count;
			}
			writer.write("Case #" + caz + ": ");
			for (int i = 0; i < p; i++) {
				writer.write(rez[i] + " ");
			}
			writer.write("\n");
			caz++;
		}
		reader.close();
		writer.close();
	}
}*/
