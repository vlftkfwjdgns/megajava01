package 일기장;

import java.io.File;

public class 파일에저장 {

	public static void main(String[] args) {
		// 20200121.txt
		File file = new File("c:/my/readme.txt");
		boolean ex = file.exists();
		System.out.println("존재여부: " + ex);

		System.out.println("폴더여부: " + file.isDirectory());
		System.out.println("파일여부: " + file.isFile());
		System.out.println("위치확인: " + file.getPath());

		
		
		
		
		System.out.println();
		File file2 = new File("c:/windows/");
		String[] list = file2.list();
		int foldercount = 0;
		int filecount = 0;
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			File file3 = new File("c:/windows/"+list[i]);
			if(file3.isFile()) {//file3.isFile()file2.isFile()==true
				filecount++;
			}else {
				foldercount++;
			}
				
		}
		System.out.println("폴더의 개수: "+foldercount+"개");
		System.out.println("파일의 개수: "+filecount+"개");
		
	}

}
