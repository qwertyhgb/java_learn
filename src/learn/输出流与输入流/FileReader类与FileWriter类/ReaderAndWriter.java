package learn.输出流与输入流.FileReader类与FileWriter类;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReaderAndWriter {
	public static void main (String[] args) {
		while (true) {  // 设置无限循环输入
			try {
				File file = new File("D:\\文件\\项目文件\\java_learn\\file", "word1.txt");
				if (!file.exists()) {
					file.createNewFile();
				}
				System.out.println("请输入要执行的操作序号: (1.写入文件; 2.读取文件)");
				Scanner scanner = new Scanner(System.in);
				int choice = scanner.nextInt();
				switch (choice) {
					case 1 -> {
						System.out.println("请输入要写入的内容:");
						String tempStr = scanner.next();
						FileWriter fileWriter = null;
						try {
							fileWriter = new FileWriter(file, true);
							fileWriter.write(tempStr + "\r\n");
						} catch (IOException ioException) {
							ioException.printStackTrace();
						} finally {
							assert fileWriter != null;
							fileWriter.close();
						}
						System.out.println("已将内容写入文件了.");
					}
					case 2 -> {
						FileReader fileReader = null;
						if (file.length() == 0) {
							System.out.println("文件中的字符数为0");
						} else {
							try {
								fileReader = new FileReader(file);
								char[] cbuf = new char[1024];
								int hasread;  // 初始化以读取的字符
								while ((hasread = fileReader.read(cbuf)) != -1) {
									System.out.print("文件" + file.getName() + "内容是:" + new String(cbuf, 0, hasread));
								}
							} catch (IOException e) {
								//TODO: handle exception
								e.printStackTrace();
							} finally {
								assert fileReader != null;
								fileReader.close();
							}
						}
					}
					default -> System.out.println("请输入有效的数字.");
				}
		} catch (InputMismatchException inputMismatchException) {
			System.out.println("你输入的文本格式不正确，请重新输入...");
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}
}