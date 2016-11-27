
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class DS_hw1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("numberData.txt");
		Scanner read = new Scanner(file);
		ArrayList<Integer> info = new ArrayList<>();
//		ArrayList<Integer> nums = new ArrayList<>();
//		ArrayList<Integer> accounts = new ArrayList<>();
		
		while(read.hasNext()){
			int num = read.nextInt();
			info.add(num);
		}
		
		read.close();
		
		int nums[] = new int[info.size()];
		nums[0] = info.get(0);
		
		for(int i = 0;i<info.size();i++){
			for(int j = 0;j<i+1;j++){
				if(info.get(i)==nums[j]){
					
				}
			}
		}
		

	}

}
