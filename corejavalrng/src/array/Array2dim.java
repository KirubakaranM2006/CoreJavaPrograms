package array;

public class Array2dim {

	public static void main(String[] args) {
		int[][]matrix=new int[3][3];//2d matrix format 3X3 matrix
		matrix[0][0]=1;
		matrix[0][1]=1;
		matrix[0][2]=1;
		matrix[1][0]=1;
		matrix[1][1]=1;
		matrix[1][2]=1;
		matrix[2][0]=1;
		matrix[2][1]=1;//stored values in matrix
		matrix[2][2]=1;
		
		for(int i=0;i<3;i++) {//for rows
			for(int j=0;j<3;j++) {//for columns
				System.out.print(matrix[i][j]);//print the matrix in same order
			}
			System.out.println();
		}
		
		

	}

}
//when i=0,0<3 true->go inner forloop
//j=0;0<3->true-> print the statement(i=0,j=0)MAtrix[0]->(i)[0]->j
//j=1;1<3->true-> print the statement(i=0,j=0)MAtrix[1]->(i)[0]->j         (1st column and row over)
//j=2;2<3->true-> print the statement(i=0,j=0)MAtrix[2]->(i)[0]->j
//j=3;3<3->false-> get out of the loop

//when i=1,1<3 true->go inner forloop
//j=0;0<3->true-> print the statement(i=0,j=0)MAtrix[1]->(i)[0]->j
//j=1;1<3->true-> print the statement(i=0,j=0)MAtrix[1]->(i)[1]->j         (2nd column and row over)
//j=2;2<3->true-> print the statement(i=0,j=0)MAtrix[1]->(i)[2]->j
//j=3;3<3->false-> get out of the loop


//when i=2,1<3 true->go inner forloop
//j=0;0<3->true-> print the statement(i=0,j=0)MAtrix[2]->(i)[0]->j
//j=1;1<3->true-> print the statement(i=0,j=0)MAtrix[2]->(i)[1]->j         (3rd column and row over)
//j=2;2<3->true-> print the statement(i=0,j=0)MAtrix[2]->(i)[2]->j
//j=3;3<3->false-> get out of the loop

//i=3,3<3 condition fails -> get out of program