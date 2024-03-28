package Data_driven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class fetchdata_demo {
@DataProvider(name="testdata")
	public String[][]getData()
	{
		String[][] data=new String[2][4];
		data[0][0]="Priya";
		data[0][1]="Ahmedabad";
		data[0][2]="9898987678";
		data[0][3]="A+";
		
		data[1][0]="Riya";
		data[1][1]="Nagpur";
		data[1][2]="786756788";
		data[1][3]="O+";
		return data;
	}

@Test(dataProvider="testdata")
public void demo(String name, String place, String no, String bloodgroup)
{
	System.out.println(name);
	System.out.println(place);
	System.out.println(no);
	System.out.println(bloodgroup);
}
}
