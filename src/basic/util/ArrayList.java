package basic.util;

public class ArrayList<E> implements List {

	protected E[] array;
	protected int numElementos;
	
	public ArrayList(){
		array = (E[]) new Object[10];
		numElementos = 0;
	}
	
	public void add(Object obj){
		if(numElementos == array.length){
			aumentamosTamArray();
		}
		array[numElementos] = (E) obj;
		numElementos++;		
	}
	
	protected void aumentamosTamArray(){
		E[] arrayAux = (E[]) new Object[(int) (numElementos*1.1)];		
		for(int i = 0; i < array.length; i++){
			arrayAux[i] = array[i];
		}		
		array = arrayAux;		
	}
	
	public E remove(int pos){
		E res = array[pos];		
		for(int i = pos; i < array.length-1; i++){
			array[i] = array[i+1];
		}
		numElementos--;
		return res;		
	}
	
	public void remove(Object obj){
		int pos = getIndexOf(obj);
		if(pos >= 0) remove(pos);
	}
	
	public int size(){
		return numElementos;
	}
	
	public boolean isEmpty(){
		return numElementos == 0;
	}
	
	public int getIndexOf(Object obj){		
		for(int i = 0; i < array.length; i++){
			if(array[i].equals(obj)){
				return i;
			}				
		}		
		return -1;
	}
	
	public String toString(){
        String res = "{";
        
        for(int i = 0; i < numElementos; i++){
            res += array[i];
            if(i<numElementos-1)res += ", ";
        }
        
        res += "}";
        
        return res;
    }



	
}
