public class ArraysMulti
{
    public static void main(String args[])
    {
     /*  int [][] array={{4,7,9,8,9,8,9,8,9,9,7,8},{8,4,7,9,8,9,8,9,8,9,9,7}};
        int countof7=0;
        for(int i=0; i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                if(array[i][j]==7)
                {
                    countof7++;
                }
            }
        }
        System.out.println("count of 7 is "+countof7);
   
        




    int [][] nums={{1,9,7},{11,3,4},{2,2,3}};
    int sum=0;
    for(int j=0;j<nums[0].length;j++)
    {
    sum+=nums[2][j];
    }
    System.out.println("sum is "+sum);
*/ 
     int row=2,column=3;
     int [][] matrix={{2,3,5},{9,8,6}};
      printMatrix(matrix);
      int [][] transpose=new int[column][row];
      for(int i=0;i<row;i++)
      {
      for(int j=0;j<column;j++)
      {
        transpose[j][i]=matrix[i][j];
      }
    }
    printMatrix(transpose);

 }
 public static void printMatrix(int[][] , int matrix)
 {
    System.out.println("the matrix is.....");
    for(int i=0; i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            System.out.print(matrix[i][j])+" ");
        }
        System.out.println();
    }
}
}

