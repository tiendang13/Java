package ioStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//write byte
		FileOutputStream bout = null;
        try {
            bout = new FileOutputStream("D:\\testout.txt");
            bout.write(65);
            bout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // close file output stream
            try {
				bout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        //read byte
        FileInputStream bin = null;
        try {
            bin = new FileInputStream("D:\\testout.txt");
            int i = bin.read();
            System.out.print((char) i);
            System.out.println("");
            bin.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
				bin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        //write String
        FileOutputStream sout = null;
        try {
            sout = new FileOutputStream("D:\\testout.txt");
            String s = "Welcome to java.";
            byte b[] = s.getBytes();// converting string into byte array
            sout.write(b);
            sout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
				sout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        //read string
        FileInputStream sin = null;
        try {
            sin = new FileInputStream("D:\\testout.txt");
            int i = 0;
            while ((i = sin.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("");
            sin.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
				sin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }



	}

}
