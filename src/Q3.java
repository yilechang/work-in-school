
public class Q3 {
	public static void main(String[] args) {
	       int x1=0, y1=0, x2=0, y2=0;  // where x1<x2, y1<y2
	       // filled, draw from(1,1) to (5,9)
	       Q3Rect rect1 = new Q3Rect(1,1,5,9,true);

	       x1=2; y1=2; x2=5; y2=7;
	       // not filled, draw from (2,2) to (5,7), with @ 
	       Q3Rect rect2 = new Q3Rect(x1,y1,x2,y2,"@",false); 
	       
	       // Square extends Rect, starting from (1,5), height = 5
	       Q3Square sqr = new Q3Square(1,5,5,true); 
	     
	       Q3Shape shape[] = new Q3Shape[3];
	       shape[0] = rect1;
	       shape[1] = rect2;
	       shape[2] = sqr;

	       for(int i=0;i<3;i++){
	    	   shape[i].draw();
	    	   System.out.println();   
	       }
	}
}
