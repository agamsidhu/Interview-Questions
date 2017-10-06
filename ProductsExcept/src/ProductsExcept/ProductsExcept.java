package ProductsExcept;
//Get an array of integers and returns array of the products of all int except at that index
public class ProductsExcept {
	
	
	//This is really dirty and needs to be cleaned up.
	
	public static void getresult(int[] input) {
		
		int[] productResult = new int[input.length];
		int productSoFar =1;
		for(int i =0; i<input.length;i++) {
			productResult[i] = productSoFar;
			productSoFar = productSoFar * input[i];
		}
		
		productSoFar =1;
		for(int i = input.length-1; i >= 0; i--) {
			productResult[i] = productResult[i] * productSoFar;
			productSoFar = productSoFar * input[i];
		}
		
		for(int j =0; j < input.length; j++) {
			System.out.println(productResult[j]);
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,7,3,4};
		getresult(input);
	}

}
