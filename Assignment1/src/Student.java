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
    	this.project=project;
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
        this.eMail= eMail;
        this.contactNo= contactNo;
    }
    Display()
    {
        System.out.println("First name: "+this.firstName);
        System.out.print("Last Name: "+this.lastName);
        this.addr.Display;
        for(int i=0;i<qual.length;i++)
        {
           qual[i].Display; 
        }
        System.out.print("Skills: "+skills[i]);
        for(int i=0;i<project.length;i++)
        {
            project[i].Display;
        }
        System.out.print("E-mail: "+this.eMail);
        System.out.print("Contact No: "+this.contactNo);

    }

}