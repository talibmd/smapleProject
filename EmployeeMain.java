import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;
import com.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao edao1 = (EmployeeDao)context.getBean("empDao1");
		
		
/*	
 * ------Employee creation through update method--------
		int status=edao1.saveEmployee(new Employee(123,"talibn",12121));
		if(status>0)
			System.out.println("values got inserted");
		else
			System.out.println("no insertion!!!!!");
 * 
 */
		Scanner sc=new Scanner(System.in);
		int decision=0;
		do
		{
			System.out.println("*****************CRUD MENU*********************");
			System.out.println("Enter you choice");
			System.out.println("1.Create");
			System.out.println("2.Read");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			decision=sc.nextInt();
			
			switch(decision)
			{	//creating employee
				case 1:  	{
								Boolean createstatus=edao1.saveEmployeeByPS(new Employee(127,"talib127",2700));
								if(createstatus==true)
									{
										System.out.println("Unsuccessful prep");
										break;
									}
								else
									{
										System.out.println("successful prepstatemnt data addition");
										break;
									}
							}
				//fetching data from table
				case 2:  	{
								List<Employee> l=edao1.getEmployees();
								for(Employee e:l)
								{
									System.out.println(e);
									break;
								}
							}
				//UPDATING EMPLOYEE.....
				case 3:  	{
								int updatestatus=edao1.UpdateEmployee(new Employee(127,"128update",888));
								if(updatestatus>0)
									{
										System.out.println("updated");
										break;
									}
								else
									{
										System.out.println("Not updated");
										break;
									}
							}
				//deletion
				case 4:  	{
								int deletestatus=edao1.DeleteEmployee(new Employee(126,"",0));
								if(deletestatus>0)
									{
										System.out.println("successfully deleted");
										break;
									}
								else
									{
										System.out.println("No element found for deletion");
										break;
									}
							}
				case 5:		{
								System.out.println("Bye Bye");
								System.exit(0);
							}
					
				default:	{
								System.out.println("WRONG CHOICE!!!pls select correct option");
								break;
							}
			}
			
		}while (decision!=5);
		
		
		
	
		
		
		
		
		
		
		
		
	
		
		
	}

}
