class Project
{
	String name;
	String startDate;
    String endDate;
    String role;
    String[]responsibilities;
    Project(String name,String startDate,String endDate,String role,String responsibilities[])
    {
    	this.name= name;
    	this.startDate= startDate;
    	this.endDate= endDate;
    	this.role= role;
    	this.responsibilities= responsibilities;
    }  
}