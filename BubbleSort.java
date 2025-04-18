public class BubbleSort
{

	public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes= myNums.length-1;
		int comparisons=passes;
		int tempNum=0;


		//Loop once for each pass, where passes is one less than the number of items.
			for(int pass=0; pass<passes; pass++)
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			{
				for(int comp=0; comp<comparisons; comp++ )
				{
				//If they are out of order, swap the values
				if(myNums[comp]>myNums[comp+1]){
					tempNum=myNums[comp];
					myNums[comp]=myNums[comp+1];
					myNums[comp+1]=tempNum;
				}
			//End Loop for comparisons
				}
    
			//The next pass will use one less comparison
				comparisons--;
		//End Loop for passes
				
			}


  }
}
