package basic.util;

public class OrderedArrayList<E extends Comparable> extends ArrayList{

	
	public OrderedArrayList(){super();}
	
	public void add(Object ob){
		
		E obj = (E) ob;
		if(numElementos == array.length){
			aumentamosTamArray();
		}
		
		if(numElementos == 0){
			array[0] = obj;
		}
		else{
			boolean insertado = false;
			for(int i = 0; i < numElementos && !insertado; i++){
				if (array[i] != null && obj.compareTo(array[i]) < 0){
					//add object
					for(int j = numElementos; j > i; j--){
						array[j] = array[j-1]; 
					}					
					array[i] = obj;
					insertado = true;
				}
			}
			if(!insertado) array[numElementos]= obj;
		}
		numElementos++;
	}	
	
	
}
