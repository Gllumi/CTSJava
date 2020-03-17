package ctsproject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;



public class VarunTourTest {

	public static void main(String[] args) throws SQLException, IOException  {
		// TODO Auto-generated method stub
		TravelAgency vtr = new TravelAgency();
		List list = vtr.generatePackageCost("d://VarshTourPackageDetails.txt");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
