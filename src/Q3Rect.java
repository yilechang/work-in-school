
public class Q3Rect extends Q3Shape{
	public Q3Rect(int x1,int x2,int y1,int y2,boolean filled){
		this.height = x1 - x2 ;
		this.weight = y1 - y2 ;
	}
	public Q3Rect(int x1,int x2,int y1,int y2,String a ,boolean filled){
		this.height = x1 - x2 ;
		this.weight = y1 - y2 ;
	}
}
