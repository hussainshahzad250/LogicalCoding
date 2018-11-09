/**
 * 
 */
package java8;

import java.io.File;

/**
 * @author shahzad.hussain
 *
 */
public class Directory {

	public static void main(String[] args) {

//		String maindirpath = "D:\\Study\\Android Tutorial";
		String maindirpath = "D:\\Study\\Video Tutorial";

		// File object
		File maindir = new File(maindirpath);

		if (maindir.exists() && maindir.isDirectory()) {
			File arr[] = maindir.listFiles();
			System.out.println("**********************************************");
			System.out.println("Files from main directory : " + maindir);
			System.out.println("**********************************************");
			recursivePrint(arr, 0, 0);
		}
		System.out.println("done");
		
		
	}

	private static void recursivePrint(File[] arr, int index, int level) {
		if (index == arr.length)
			return;
		// tabs for internal levels
		for (int i = 0; i < level; i++)
			System.out.print("\t");

		// for files
		if (arr[index].isFile()) {
			System.out.println(arr[index].getName());
		}
		

		// for sub-directories
		else if (arr[index].isDirectory()) {
			System.out.println("[" + arr[index].getName() + "]");
			// recursion for sub-directories
			recursivePrint(arr[index].listFiles(), 0, level + 1);
		}
		// recursion for main directory
		recursivePrint(arr, ++index, level);

	}
}
