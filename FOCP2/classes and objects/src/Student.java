class Student
{
	String firstName;
	String lastName;
	Address address;
	String[]skills;
	Qualification[]qual;
	Project[]project;
	String eMail;
	String contactNo;
    Student(String firstName,String lastName,Address address,String skills[],Qualification qual[],Project project[],String eMail,String contactNo)
    {
    	this.firstName= firstName;
    	this.lastName= lastName;
    	this.address= address;
    	this.skills=skills;
    	this.qual=qual;
    	this.projects=projects;
    	this.eMail= eMail;
    	this.contactNo= contactNo;
    } 
    Student(String firstName,String lastName,Address address,String skills[],Qualification qual[],String eMail,String contactNo)
    {
        this.firstName= firstName;
        this.lastName= lastName;
        this.address= address;
        this.skills= skills;
        this.qual= qual;
        this.skills= eMail;
        this.contactNo= contactNo;
    }
    Display()
    {
        System.out.println("First name: "+this.firstName);
        System.out.print("Last Name: "+this.lastName);
        this.aadr.display;
        for(int i=0;i<qual.length;i++)
        {
           this.qual[i].display; 
        }
        System.out.print("Skills: "+skills[i]);
        for(int i=0;i<project.length;i++)
        {
            this.project[i].display;
        }
        System.out.print("E-mail: "+this.eMail);
        System.out.print("Contact No: "+this.contactNo);

    }

}