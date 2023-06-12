class CountOdd{
public static void main(String args[]){
int number[]={2,5,11,17,20,26,14,31};
int Ocount=0;
for(int i=0; i<number.length; i++){
if(number[i]%2!=0){
Ocount++;
}
}
System.out.println("Total number of odd in an Array:"+Ocount);
}
}