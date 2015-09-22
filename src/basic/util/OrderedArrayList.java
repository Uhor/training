package basic.util;

public class OrderedArrayList<E extends Comparable> extends ArrayList {

	
	public OrderedArrayList(){super();}
	
	public void add(Object obj){
		
		E ob = (E) obj;
		if(numElementos == array.length){
			aumentamosTamArray();
		}
		
		if(numElementos == 0){
			array[0] = ob;
		}
		else{
			boolean insertado = false;
			for(int i = 0; i < numElementos && !insertado; i++){
				if (array[i] != null && ob.compareTo(array[i]) < 0){
					//add object
					for(int j = numElementos; j > i; j--){
						array[j] = array[j-1]; 
					}					
					array[i] = ob;
					insertado = true;
				}
			}
			if(!insertado) array[numElementos]= ob;
		}
		numElementos++;
	}	
	
	
}
