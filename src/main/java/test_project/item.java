package test_project;

public class item {
private String name;
private int price ;


item (String n , Integer p){
	name = n ; 
	price =p.intValue() ;
	
}

public String getName () {
	return name;
}

public int getPrice () {return price ; }
}
