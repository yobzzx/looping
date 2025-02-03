import java.util.*;
public class Control
{
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("ENTER YOUR MAIN MENU : \nt - tea \nc - coffee \s - soup \nb - beaverages");
		char MainMenu = next().charAt(0);
		
		System.out.println("ENTER YOUR SUBMENU :");
		int SubMenu = nextInt();
		
		String result="INVALID OUTPUT";
		
		switch(MainMenu){
		    case 't':{
		    switch(SubMenu){
		        case 1: result="Plain Tea";
		        break;
		        case 2: result="Ginger Tea";
		        break;
		        case 3: result="Cardamon Tea";
		        break;
		        case 4: result="Masala Tea";
		        break;
		        case 5: result="Lemon Tea";
		        break;
		        case 6: result="Green Tea";
		        break;
		        case 7: result="Assam Tea";
		        break;
		    }
		    }
		    break;
		  }
	
		    case 'c':
		    switch(SubMenu){
		        case 1: result="Plain Tea";
		        break;
		        case 2: result="Ginger Tea";
		        break;
		        case 3: result="Cardamon Tea";
		        break;
		        case 4: result="Masala Tea";
		        break;
		        case 5: result="Lemon Tea";
		        break;
		        case 6: result="Green Tea";
		        break;
		        case 7: result="Assam Tea";
		        break;
		    }
		    }
		    break;
		  }  
		  System.out.println(result);
	}
}
 
