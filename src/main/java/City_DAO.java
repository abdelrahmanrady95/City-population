
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rady
 */
public class City_DAO extends Thread {
    public final List<City> c_list=new ArrayList<City>();
    BufferedReader br;
	String line; 

    public City_DAO() throws FileNotFoundException, IOException {
        this.br = new BufferedReader(new FileReader("C:\\Users\\Rady\\Documents\\NetBeansProjects\\Cities_and_countries\\CSV_files\\Cities.csv"));
        line=br.readLine();
        
        
        if(line!=null)
            System.out.println(line);
        do{   
            line=br.readLine(); 
            if(line!=null){
		String [] parts=line.split(",");
		if (parts[5].isEmpty()) {
                    c_list.add(new City(parts[1],parts[2]));
		}
		else{
                    c_list.add(new City(parts[1],parts[2]));
		}
		}
        }while(line!=null);
	for(int i=0;i<c_list.size();i++){
        System.out.println(c_list.get(i).getName()+","+c_list.get(i).getPopulation());
    }
    
    }   
}
