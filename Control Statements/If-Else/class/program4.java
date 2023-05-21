Given temperature of person in farenheit.
print whether person has high,normal,low temperature.
>98.6 ==>high
98.0<= and <=98.6 ==>normal
<98.0  ==>low

class Core2Web{
	public static void main(String[]args){

		float i=98.8f;
		if (i>98.6){
			System.out.println("HIGH");
		}else if(i<98.0){
			System.out.println("LOW");
		}else{
			System.out.println("NORMAL");
		}
	}
}

