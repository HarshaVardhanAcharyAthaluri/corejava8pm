class 2DArrayDemo{

	public static void main(String[] args){

		int demo[][]	= new int[3][2];	

		demo[0][0] = 10;
		demo[0][1] = 20;
		
		demo[1][0] = 30;
		demo[1][1] = 40;

		demo[2][0] = 50;
		demo[2][1] = 60;

		for(int i = 0;i<demo.length;i++){
			for(int j = 0;j<demo[i].length;j++){
				System.out.println(" Value at indexes of "+ i + " & " +j +" :: "+demo[i][j]);
			}
			
		}
		System.out.println("::=====Second Way of creating 2D Array====::");
		int sample[][] = { {100,200}, {300,400}, {500,600}};
		for(int i = 0;i<sample.length;i++){
			for(int j = 0;j<sample[i].length;j++){
				System.out.println(" Value at indexes of "+ i + " & " +j +" :: "+sample[i][j]);
			}
			
		}
	}
}

