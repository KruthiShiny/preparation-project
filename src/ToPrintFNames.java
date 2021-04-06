import java.io.File;
import java.io.IOException;

public class ToPrintFNames implements HoldingNames {

	public void first() {
		File fe=new File("FIRST.txt");
		try {
			if(fe.createNewFile())
			{
				System.out.println(fe.getName());
			}
			else
			{				
				System.out.println("FILE NAME ALREADY EXIST");
			
			}
		} catch (IOException e) {
			System.out.println("an error occured");
		
			e.printStackTrace();
		}
		
		
	}

	
	public void second() {
		File fe=new File("second.txt");
		try {
			if(fe.createNewFile())
			{
				System.out.println(fe.getName());
			}
			else
			{				
				System.out.println("FILE NAME ALREADY EXIST");
			
			}
		} catch (IOException e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}
		
		
	}

	
		

	}


