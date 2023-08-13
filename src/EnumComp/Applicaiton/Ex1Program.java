package EnumComp.Applicaiton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import EnumComp.Entities.Department;
import EnumComp.Entities.HourContract;
import EnumComp.Entities.Worker;
import EnumComp.Enums.WorkerLevel;

public class Ex1Program {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc= new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter Department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter Worker data");
		System.out.print("Name:" );
		String workerName = sc.nextLine();
		System.out.print("Level:" );
		String workerLevel = sc.nextLine();
		System.out.print("Base salary:" );
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int x = 1; x <= n; x++) {
			System.out.println("Enter Contract #" + x + " data:");
			System.out.print("Date (dd/MM/yyyy): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration hour(s): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + month + "/" + year + ": R$ " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}
}
