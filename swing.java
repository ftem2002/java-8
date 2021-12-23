package halakat;

import javax.swing.JOptionPane;

public class swing 
{

	public static void main(String[] args) 
	{
	int i ;
	double sum , x , avg ;
	String x_str ;
	
	sum = 0 ;
	{
	for ( i = 1 ; i<= 5 ; i++ )
		x_str = JOptionPane.showInputDialog(" enter a v : " );
	    x = Double.parseDouble("x_str");
	   sum = sum + x;
	}
	avg = sum/5 ;
	JOptionPane.showMessageDialog(null, " sum " + sum +"\n " + avg);
		
		

	}

}
