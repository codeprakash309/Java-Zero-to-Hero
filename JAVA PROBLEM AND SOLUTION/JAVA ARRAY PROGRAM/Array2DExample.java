class  Array2DExample
{
	public static void main(String[] args) 
	{
		int arr[][]=new int[][]{{11,12,13,14},{10,20,30,40}};
        for(int i=0;i<arr.length;i++)
		{
           for(int j=0;j<arr.length;j++)
			{
              System.out.println(arr[i][j]);
			}
		}
		
	}
}
