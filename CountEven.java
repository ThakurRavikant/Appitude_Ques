class CountEven{
	public static void main(String args[]){
		int number[]={32,12,18,17,15,11};
		int ecount=0;
		for(int i=0; i<number.length; i++){
			if(number[i]%2==0){
				ecount++;
			}
		}
		System.out.println("number of EvenNumber:"+ecount);
		
		
	}
}