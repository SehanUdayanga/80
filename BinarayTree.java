class Tree{
	int [] tree;
	int maxsize;
	int currentSize;
	
	public Tree(int maxsize){
		this.tree=new int[maxsize];
		this.maxsize=maxsize;
		this.currentSize=0;
		
	}
	
	public boolean isEmpty(){
		return currentSize==0;
	}
	
	public boolean isFull(){
		return currentSize==maxsize;
	}
	
	public void insert(int data){
		if(isFull()){
			System.out.println("full");
		}else{
			tree[currentSize]=data;
			currentSize++;
		}
	}
	
	public int search(int data){
		if(isEmpty()){
			System.out.println("empty")
		}else{
			for(int i =0;i<currentSize;i++){
					if(tree[i]==data){
						return i;
					}
			}
			
			
			
			
		}
	}
	
	public boolean delete(int data){
		int index  = search(data);
		
		if(index==-1){
			return false
		}else{
			tree[index]==tree[currentSize-1];
			tree[currentSize-1]=0
			currentSize--
		}
	}
	
	public void inordreTravesal(int i){
		if(isEmpty()){
			
		}else{
			if(index<0||index>=currentSize){
				
			}else if(tree[index]==0){
				
			}else{
				inordreTravesal(2*index+1);
				System.out.println(tree[index]);
				inordreTravesal(2*index+2)
			}
		}
	}
	
	
	for(int i=0;i<currentSize;i++){
		if(tree[index]!=0){
			sout(tree[index])
		}
	}
}

public class BinarayTree(){
	public static void main(String args[]){
	
	}
}