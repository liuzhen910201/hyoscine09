public class select{
    //static int min=0;
    public static void main(String[] args){
	int[] list={3,2,0,4,1,13,44,5,4,23,21};
	selectsort(list,0,0,0);
	for(int n=0;n<=list.length-1;n++)
	    System.out.println(list[n]);
}
    public static void selectsort(int[] list, int x, int y,int min){
	int temp;
	if(x<list.length){
	    if(min!=x){
		temp=list[x];
		list[x]=list[min];
		list[min]=temp;
	    }
	    if(y<list.length){
		if(list[y]<list[min])
		    min=y;
		selectsort(list,x,y+1,min);
	    }
	    selectsort(list,x+1,x+1,x+1);
	}
    }
}
