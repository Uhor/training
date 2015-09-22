package basic.util;

public class Numero implements Comparable<Numero>{

	int num;
	
	public Numero (int n){
		num = n;
	}
	
	public int compareTo(Numero obj){
		Numero ob = (Numero) obj;
		if(this.num > ob.num) return 1;
		if(this.num < ob.num) return -1;
		return 0;
	}
	
	public String toString(){
        String res = " " + num;
        return res;
    }
}
