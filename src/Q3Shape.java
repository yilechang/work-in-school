
public class Q3Shape {
	protected int height, weight ;
	protected boolean filled ;
	protected String a ;
	public void draw(){
		if(filled = true){
			for(int i = 0 ; i < height ; i ++){
				for(int j = 0 ; j < weight ; j ++){
					System.out.print("a");
				}
				System.out.println();
			}
		}
		else{
			for(int j = 0 ; j < weight ; j ++){
				System.out.print("a");
			}
			for(int i = 0 ; i < height-1 ; i ++){
				System.out.print("a");
				for(int j = 0 ; j < weight-1 ; j ++){
					System.out.print(" ");
				}
				System.out.println("a");
			}
			for(int j = 0 ; j < weight ; j ++){
				System.out.print("a");
			}
		}
	}
}
