import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int arr[][]=new int[3][];
		arr[0]=new int[]{1,2,3};
		arr[1]=new int[]{4,5};
		arr[2]=new int[]{6};

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}



