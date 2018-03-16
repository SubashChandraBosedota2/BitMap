import java.util.Scanner;
/*start of the program*/
public class Editor
{
    //creating a char array to set the pixel value 
    private final char[][] field = new char[250+ 1][250+ 1];
	private int m;
	private int n;
        Scanner sc = new Scanner(System.in);
        
        //cheking the value of enterd pixel is  valid 
        private boolean isValid(int x, int y)
	{
            if( (x>=1) && x <= m  && y>=1 && y <= n)
		{
			return true;
		}
		return false;
        }
        //creating an pixel array 
        private boolean getPixel(int x, int y)
	{
            if (isValid(x, y)==true){
             for (int i = 0; i <m; ++i)
		{
                    for (int j = 0; j< n ; ++j)
			{
			field[i][j] = 'O';
                           }
                        }        
             
                return true;
            }	
            return false;
	}
        // cloring at desierd positon
         private void L_setPixel(int x, int y, char color)
	    {
            if (isValid(x, y)==true)
		{
                  field[x- 1][y - 1] =  color;
                        }
                    }
         //resting all the pixel
                private void C_clear()
        {
            for (int i = 0; i < m ; ++i)
		{
			for (int j = 0; j < n ; ++j)
			{
				field[i][j] = 'O';
                      System.out.print(field[i][j]);     
                                
			}
                        System.out.println("");       
                }                
        }
        //constructor
        public Editor()
	{
	}
        // method for accesing the editor 
        public void inputCommand(String command) 
	{
                 char charArg;
                 int a []=new int [2];
                 if (command.equals("Y")){
                 System.out.println("Pls type I to create the pixel");
                 String ai=sc.next();
                 if (ai.equals("I"))
                 {
                     m = sc.nextInt();
			n = sc.nextInt();
                        getPixel(m, n);
                        String l=sc.next();
                        if (l.equals("L")){
                         a[0]= sc.nextInt();
                          a[1]= sc.nextInt();
			charArg = sc.next().charAt(0);
                        L_setPixel(a[0], a[1], charArg);
			String br=sc.next();
                        //By typing s only we ca able to print the value 
                        if (br.equals("S")){
                            for (int i = 0; i < m +1; ++i)
		{
			for (int j = 0; j < n +1; ++j)
			{
                      System.out.print(field[i][j]);     
                                
			}
                        System.out.println(" ");       
                }    
             }
}
                        String str=sc.next();
                         if(str.equals("C")){
                        
                          String br=sc.next();
                         if (br.equals("S")){
                              C_clear();
                            }
                         }
                 }
                         
                        else {
                                System.out.println("wrong input ");
                                }
                 }
                 else {
                      System.out.println(" thank you and choose Y in future to use the program");

                 }
                   
                }
}
/*end of the program*/
                 
