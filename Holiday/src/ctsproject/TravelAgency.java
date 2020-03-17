package ctsproject;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import utilities.DBHandler;

public class TravelAgency {
	Connection connection;
	List<Package> findPackagesWithMinimumNumberOfDays(){
		
		return null;
		
	}
	
	boolean validate(String packageId) {
		Pattern pattern = Pattern.compile("[0-9]{3}/[A-Z]{3}");
		boolean flag = pattern.matcher(packageId).matches();
		return flag;
	}
	
	List<Package> generatePackageCost(String filePath) throws SQLException, IOException{
		int discount = 0;
		try {
			connection = DBHandler.establishConnection();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql="insert into package_details values(?,?,?,?,?)";
		PreparedStatement pst = connection.prepareStatement(sql);
		FileInputStream fstream = new FileInputStream(filePath);
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		ArrayList list = new ArrayList();
		try {
			while ((strLine = br.readLine()) != null) {
				list.add(strLine);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		Iterator itr;
		for (itr=list.iterator(); itr.hasNext();) {
			String str = itr.next().toString();
			String[] splitSt = str.split(",");
			String id="", source = "",dest="", cost="",nod=" ";
			int nd;
			float cst;
			for(int i=0;i<splitSt.length ; i++) {
				id=splitSt[0];
				boolean flag = validate(splitSt[0]);
				if(flag) {
					source = splitSt[1];
					dest=splitSt[2];
					cst=Float.parseFloat(splitSt[3]);
					nd=Integer.parseInt(nod=splitSt[4]);
					if(nd<5) {
						discount = 0;
					}
					else if(nd>=5 && nd<=8) {
						discount = 3;
					}
					else if(nd>8 && nd<=10) {
						discount = 5;
					}
					else {
						discount = 7;
					}
					double gst=0.12;
					cst=cst-((discount/100)*cst);
					double tcost = cst+(cst*gst);
					pst.setString(1, id);
					pst.setString(2, source);
					pst.setString(3, dest);
					pst.setDouble(4, tcost);
					pst.setInt(5, nd);
					pst.executeUpdate();
				}
			}
		}
		
		System.out.println("DRecords processed...");
		return list;
	}
	

	
}
