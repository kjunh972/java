package kjunh972.java;

import java.util.Scanner;

public class 모스부호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력해주세요 : ");
		String word = sc.nextLine();
		
		String[] arr = word.split(""); //배열에 한글자씩 저장하기
				
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("a")){
				arr[i]=".-";
	        } else if(arr[i].equals("b")){
	        	arr[i]="-...";
	        } else if(arr[i].equals("c")){
	        	arr[i]="-.-.";
	        } else if(arr[i].equals("d")){
	        	arr[i]="-..";
	        } else if(arr[i].equals("e")){
	        	arr[i]=".";
	        } else if(arr[i].equals("f")){
	        	arr[i]="..-.";
	        } else if(arr[i].equals("g")){
	        	arr[i]="--.";
	        } else if(arr[i].equals("h")){
	        	arr[i]="....";
	        } else if(arr[i].equals("i")){
	        	arr[i]="..";
	        } else if(arr[i].equals("j")){
	        	arr[i]=".---";
	        } else if(arr[i].equals("k")){
	        	arr[i]="-.-";
	        } else if(arr[i].equals("l")){
	        	arr[i]=".-..";
	        } else if(arr[i].equals("n")){
	        	arr[i]="--";
	        } else if(arr[i].equals("m")){
	        	arr[i]="-.";
	        } else if(arr[i].equals("o")){
	        	arr[i]="---";
	        } else if(arr[i].equals("p")){
	        	arr[i]=".--.";
	        } else if(arr[i].equals("q")){
	        	arr[i]="--.-";
	        } else if(arr[i].equals("r")){
	        	arr[i]=".-.";
	        } else if(arr[i].equals("s")){
	        	arr[i]="...";
	        } else if(arr[i].equals("t")){
	        	arr[i]="-";
	        } else if(arr[i].equals("u")){
	        	arr[i]="..-";
	        } else if(arr[i].equals("v")){
	        	arr[i]="...-";
	        } else if(arr[i].equals("w")){
	        	arr[i]=".--";
	        } else if(arr[i].equals("x")){
	        	arr[i]="-..-";
	        } else if(arr[i].equals("y")){
	        	arr[i]="-.--";
	        } else if(arr[i].equals("z")){
	        	arr[i]="--..";
	        }
		}
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
