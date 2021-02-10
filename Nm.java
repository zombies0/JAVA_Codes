class Nm{

	public static void main(String ...args){


		B.show(10,20);

	}


}

Class B{

	static void show(String ...a){

		System.out.println("hi");

		for(String b : a){
			System.out.println(b);

		}
	

	}




}