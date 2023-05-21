Electricity bill problem.
Given an integer input A which represents units of electricity consumed at your house.
-calculate and print the bill amount.
-units <=10  price per unit is 1
-units >100 price per unit is 2


class Core2Web{
	public static void main(String[]args){
	
		int unit=200;
		if(unit<=100){
			System.out.println(unit*1);
		}else{
			System.out.println(100*1+(unit-100)*2);
		}
	}
}


