package es03;

public class Intersaction {
	//assumiamo che gli elementi negli array non siano ripetuti
	public static int[] intersect(int[] arr1, int[] arr2){
		int[] result;
		int sizeOfResult = 0;
		for (int el1 : arr1){
			for (int el2 : arr2){
				if(el1 == el2){
					sizeOfResult++;
					break; //evitare di contare elementi ripetuti
				}
			}
		}
		
		result = new int[sizeOfResult];
		int k = 0;
		for (int el1 : arr1){
			for (int el2 : arr2){
				if(el1 == el2){
					result[k++] = el1;
					break;
				}
			}
		}
		return result;
	}
	
	public static void printArray(int[] result){
		for (int el : result)
			System.out.println(el);
	}
	
	public static void main(String[] args){
	int [] arr1 = {1,2,3,4};
	int [] arr2 = {3,4,5,6,7};
	
	int []result = intersect(arr1,arr2);
	printArray(result);
	}
}
