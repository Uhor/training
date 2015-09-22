package basic.ordenacion;

import basic.util.Comparable;

public class Ordenacion<E extends Comparable>{

	public E[] MergeSort(E[] a){
		E[] b = (E[]) new Object[a.length];
		return MergeSort(a, 0, a.length-1, b);		
	}
	
	public E[] MergeSort(E[] a, int ini, int fin, E[] b){
		
		int sizeAux = (fin-ini)/2;
		if(sizeAux == 1){
			System.out.println("ok");
			return a;
		}
		else{
			E[] left = MergeSort(a, ini, fin/2); //left
			E[] right = MergeSort(a, fin/2, fin); //right
			
			int cont = 0, i = ini, j = fin;
			
			while(i < left.length || j < right.length){
				if(left[i].compareTo(right[j]) < 0){
					a[cont] = left[i];
					i++;
				}
				else{
					a[cont] = right[j];
					j++;
				}
				cont++;				
			}
			
			for(;i < left.length; i++, cont++)	a[cont] = left[i];
			for(;j < right.length; j++, cont++)	a[cont] = right[j];
				
		}
		
		return a;
	}
	
}
