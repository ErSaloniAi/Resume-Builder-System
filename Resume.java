import java.util.Scanner;
// User class to store resume details
class User {
    int year; // Year of graduation or study
    String degree[], nameOfUni, certificates[], skills[], strengths[], achievements[], languagesKnown[], hobbies[];

    // Default constructor
    User() {}

    // Parameterized constructor to initialize user details
    User(int year, String degree[], String nameOfUni, String certificates[], String skills[], String hobbies[], String strengths[], String achievements[], String languagesKnown[]) {
        this.year = year;
        this.degree = degree;
        this.nameOfUni = nameOfUni;
        this.certificates = certificates;
        this.achievements = achievements;
        this.strengths = strengths;
        this.skills = skills;
        this.languagesKnown = languagesKnown;
        this.hobbies = hobbies;
    }

    // Method to display university details
    void displayUniversityDetails() {
        System.out.println("- I studied at " + nameOfUni + " in the year " + year + ".");
    }

    // Method to display certificate details
    void displayCertificateDetails() {
		 System.out.println("---------------------------------------------");
        if (certificates == null || certificates.length == 0) {
            System.out.println("Invalid input!! No certificates available.");
            return;
        }
        for (int i = 0; i < certificates.length; i++) {
            System.out.println("- I earned " + (i + 1) + ". " + certificates[i] + " certificate.");
        }
    }

    // Method to display achievement details
    void displayAchievementDetails() {
		 System.out.println("---------------------------------------------");
        if (achievements == null || achievements.length == 0) {
            System.out.println("Invalid input!! No achievements available.");
            return;
        }
        for (int i = 0; i < achievements.length; i++) {
            System.out.println("- I achieved " + (i + 1) + ". " + achievements[i] + ".");
        }
    }

    // Method to display additional details
    void displayAdditionalDetails() {
        System.out.println("# Additional Details:");
        System.out.println("---------------------------------------------");
        
        // Display Skills
        System.out.println("~ Skills:");
        if (skills != null) {
            for (int i = 0; i < skills.length; i++) {
                System.out.println("- I am proficient in " + (i + 1) + ". " + skills[i] + ".");
            }
        }
        
        System.out.println("---------------------------------------------");
        
        // Display Strengths
        System.out.println("~ Strengths:");
        if (strengths != null) {
            for (int i = 0; i < strengths.length; i++) {
                System.out.println((i + 1) + ". My expertise in "  + strengths[i] + ".");
            }
        }
        
        System.out.println("---------------------------------------------");
        
        // Display Hobbies
        System.out.println("~ Hobbies:");
        if (hobbies != null) {
            for (int i = 0; i < hobbies.length; i++) {
                System.out.println( "-"+(i + 1) +". I enjoy pursuing creative hobbies such as " + hobbies[i] + ".");
            }
        }
        
        System.out.println("---------------------------------------------");
        
        // Display Languages Known
        System.out.println("~ Languages Known:");
        if (languagesKnown != null) {
            for (int i = 0; i < languagesKnown.length; i++) {
                System.out.println("- " + (i + 1) + ". " + languagesKnown[i]);
            }
        }
    }
}

class Student extends User {
    int sem;
    double result1, result2;
    int year1, year2;
    String board1, board2;

    Student() {}

    Student(int year, String degree[], String nameOfUni, String certificate[], String skills[], String hobby[], String strength[], String achievement[], String languagesKnown[], int sem, String board1, String board2, double result1, double result2, int year1, int year2) {
        super(year, degree, nameOfUni, certificate, skills, hobby, strength, achievement, languagesKnown);
        this.sem = sem;
        this.year1 = year1;
        this.year2 = year2;
        this.result1 = result1;
        this.result2 = result2;
        this.board1 = board1;
        this.board2 = board2;
    }

    void display() {
        //System.out.println("--------------------------------------------");
        System.out.println("# Educational Details");
        System.out.println("I study at " + nameOfUni + " in semester " + sem);
        System.out.println("I got " + result2 + "% in my H.S.C.");
       System.out.println("I studied at " + board2 + " from " + year2 + ".");
        System.out.println("I got " + result1 + "% in my S.S.C.");
		  System.out.println("I studied at " + board1 + " from " + year1 + ".");
        System.out.println("---------------------------------------------");
        System.out.println("# Achievements:");
        super.displayAchievementDetails();
		 System.out.println("---------------------------------------------");
        System.out.println("Certifications:");
        super.displayCertificateDetails();
		 System.out.println("---------------------------------------------");
        super.displayAdditionalDetails();
    }
}

class Fresher extends User {
    String internships[], post, board1, board2;
    double result1, result2;
    int year1, year2;

    Fresher() {}

    Fresher(int year, String degree[], String nameOfUni, String certificate[], String skills[], String hobby[], String strength[], String achievement[], String languagesKnown[], String board1, String board2, double result1, double result2, int year1, int year2, String internships[], String post) {
        super(year, degree, nameOfUni, certificate, skills, hobby, strength, achievement, languagesKnown);
        this.internships = internships;
        this.year1 = year1;
        this.year2 = year2;
        this.result1 = result1;
        this.result2 = result2;
        this.post = post;
        this.board1 = board1;
        this.board2 = board2;
    }

    void internship() {
        for (int i = 0; i < internships.length; i++) {
            System.out.println("I am an intern at " + internships[i] + " for " + post);
        }
    }

    void display() {
        System.out.println("# Educational Details");
        super.displayUniversityDetails();
        System.out.println("- I studied in " + board2 + " from " + year2 + ".");
        System.out.println("- I got " + result2 + "% in my H.S.C.");
        System.out.println("- I studied in " + board1 + " from " + year1 + ".");
        System.out.println("- I got " + result1 + "% in my S.S.C.");
        System.out.println("---------------------------------------------");
        System.out.println("# Internships:");
        internship();
        System.out.println("---------------------------------------------");
        System.out.println("# Achievements:");
        super.displayAchievementDetails();
        System.out.println("---------------------------------------------");
        System.out.println("Certifications:");
        super.displayCertificateDetails();
        System.out.println("---------------------------------------------");
        super.displayAdditionalDetails();
    }
}
class Experienced extends User {
    String internships[], experiencedCompany[], post1, post2;

    Experienced() {}

    Experienced(int year, String degree[], String nameOfUni, String certificate[], String skills[], String hobby[], String strength[], String achievement[], String languagesKnown[], String internships[], String experiencedCompany[], String post1, String post2) {
        super(year, degree, nameOfUni, certificate, skills, hobby, strength, achievement, languagesKnown);
        this.internships = internships;
        this.experiencedCompany = experiencedCompany;
        this.post1 = post1;
        this.post2 = post2;
    }

    void internship() {
        for (int i = 0; i < internships.length; i++) {
            System.out.println("- I am an intern at " + internships[i] + " for " + post1);
        }
    }

    void experiencedCompany() {
        for (int i = 0; i < experiencedCompany.length; i++) {
            System.out.println("- My experience is in " + experiencedCompany[i] + " for " + post2);
        }
    }

    void display() {
        System.out.println("# Educational Details:");
        super.displayUniversityDetails();
		System.out.println("---------------------------------------------");
        System.out.println("# Internships:");
        internship();
		System.out.println("---------------------------------------------");
        System.out.println("# Experienced Company:");
        experiencedCompany();
		System.out.println("---------------------------------------------");
        System.out.println("# Achievements:");
        super.displayAchievementDetails();
		   System.out.println("---------------------------------------------");
        System.out.println("Certifications:");
        super.displayCertificateDetails();
		   System.out.println("---------------------------------------------");
        super.displayAdditionalDetails();
    }
}
class GenerateDetails {
    int numInternships = 0, numCertificates=0, numSkills = 0, numHobbies = 0, numStrengths = 0, numAchievements = 0, numLanguagesKnown = 0, Year = 0, numDegrees=0,year=0,expirienceCompanyCount=0,internshipCount=0, year1=0, year2=0, sem=0;;
    String[] degrees, certificates, skills, hobbies, strengths, achievements, languagesKnown,internships, experienceCompanies;
    String universityName = null, post1 = null, post2 = null,board1=null, board2=null, post = null;
        double result1=0, result2=0;
    boolean valid = false;
    Scanner sc = new Scanner(System.in);
    void generateDetails() {
        System.out.println("Educational Details:");

        do {
            System.out.print("Enter the year you completed your graduation (For students, enter the current year): ");
            Year = sc.nextInt();
            if (Year < 1970 ||Year > 2025) {
                System.out.println("Invalid input. Please enter a year between 1970 and 2025.");
            }
        } while (Year < 1970 ||Year > 2025);

        System.out.print("Enter the number of degrees you have: ");
        numDegrees = sc.nextInt();
        degrees = new String[numDegrees];

        sc.nextLine(); // Consume the newline character

        for (int j = 0; j < numDegrees; j++) {
            System.out.print("Enter the name of your degree: ");
            degrees[j] = sc.nextLine().trim();
        }

        do {
            System.out.print("Enter the name of your university: ");
            universityName = sc.nextLine().trim();
        } while (universityName.isEmpty());

        System.out.print("Enter the number of certifications: ");
        numCertificates = sc.nextInt();
        certificates = new String[numCertificates];
        sc.nextLine();

        for (int i = 0; i < numCertificates; i++) {
            do {
                System.out.print("Enter certification " + (i + 1) + ": ");
                certificates[i] = sc.nextLine().trim();
            } while (certificates[i].isEmpty());
        }

        System.out.print("Enter the number of hobbies: ");
        numHobbies = sc.nextInt();
        hobbies = new String[numHobbies];
        sc.nextLine();

        for (int i = 0; i < numHobbies; i++) {
            do {
                System.out.print("Enter hobby " + (i + 1) + ": ");
                hobbies[i] = sc.nextLine().trim();
            } while (hobbies[i].isEmpty());
        }

        System.out.print("Enter the number of skills: ");
        numSkills = sc.nextInt();
        skills = new String[numSkills];
        sc.nextLine();

        for (int i = 0; i < numSkills; i++) {
            do {
                System.out.print("Enter skill " + (i + 1) + ": ");
                skills[i] = sc.nextLine().trim();
            } while (skills[i].isEmpty());
        }

        System.out.print("Enter the number of strengths: ");
        numStrengths = sc.nextInt();
        strengths = new String[numStrengths];
        sc.nextLine();

        for (int i = 0; i < numStrengths; i++) {
            do {
                System.out.print("Enter strength " + (i + 1) + ": ");
                strengths[i] = sc.nextLine().trim();
            } while (strengths[i].isEmpty());
        }

        System.out.print("Enter the number of achievements: ");
        numAchievements = sc.nextInt();
        achievements = new String[numAchievements];
        sc.nextLine();

        for (int i = 0; i < numAchievements; i++) {
            do {
                System.out.print("Enter achievement " + (i + 1) + ": ");
                achievements[i] = sc.nextLine().trim();
            } while (achievements[i].isEmpty());
        }

        System.out.print("Enter the number of languages you know: ");
        numLanguagesKnown = sc.nextInt();
        languagesKnown = new String[numLanguagesKnown];
        sc.nextLine();

        for (int i = 0; i < numLanguagesKnown; i++) {
            do {
                System.out.print("Enter known language " + (i + 1) + ": ");
                languagesKnown[i] = sc.nextLine().trim();
            } while (languagesKnown[i].isEmpty());
        }
	}
	void edu()
	{
		    System.out.print("Enter the year you completed your 10th: ");
                year1 = sc.nextInt();
                System.out.print("Enter the year you completed your 12th: ");
                year2 = sc.nextInt();
				if(!(year2==year1+2))
				{
					System.out.println("enter valid input!!");
				}
				do{
                System.out.print("Enter your 10th-grade result: ");
                result1 = sc.nextDouble();
				if(result1<0||result1>100)
				{
					System.out.println("enter valid result!!");
				}
				}while(result1<0||result1>100);
				do{
                System.out.print("Enter your 12th-grade result: ");
                result2 = sc.nextDouble();
				if(result2<0||result2>100)
				{
					System.out.println("enter valid result!!");
				}
				}while(result2>100||result2<0);
                System.out.print("Enter the name of your 10th board: ");
                board1 = sc.next();
                System.out.print("Enter the name of your 12th board: ");
                board2 = sc.next();
                }
	    void sem()
		 {
			 System.out.print("Enter your current semester: ");
                sem = sc.nextInt();
                if (sem < 1 || sem > 8)
					{
                    System.out.println("Invalid Input!!");
                    return;
					}
		}
		void internships()
		{
			 System.out.print("Enter number of internships: ");
                internshipCount = sc.nextInt();
                internships = new String[internshipCount];
                for (int i = 0; i < internshipCount; i++) {
                    System.out.print("Enter the name of your internship company: ");
                    internships[i] = sc.next();
                    System.out.print("Enter your post: ");
                    post1 = sc.next();
               }
		}
		 void expirience()
		{
			 System.out.print("Enter number of internships: ");
                expirienceCompanyCount = sc.nextInt();
                experienceCompanies = new String[expirienceCompanyCount];
                for (int i = 0; i < expirienceCompanyCount; i++) {
                    System.out.print("Enter the name of your internship company: ");
                     experienceCompanies[i] = sc.next();
                    System.out.print("Enter your post: ");
                    post2 = sc.next();
               }
		}//linkedin
    
    String objective1 = "Looking for opportunities to enhance my skills and gain practical experience while contributing to a dynamic learning environment.";
    String objective2 = "Seeking an entry-level position to apply my skills and knowledge while gaining practical experience and contributing to the organization's success.";
    String objective3 = "Seeking a challenging role to leverage my skills and experience while contributing to organizational growth and professional development.";
}
class Resume {
    boolean valid = false;
    Scanner sc = new Scanner(System.in);
    String firstName, lastName, phoneNo, emailId, linkedInId, jobTitle;

    static {
        System.out.println("--- Welcome to the Resume Builder System ---");
    }

    {
        do {
            System.out.print("Enter your First Name: ");
            firstName = sc.next();
            valid = firstName.matches("[A-Z][a-zA-Z]*");
            if (!valid) System.out.println("Enter a valid first name (First letter uppercase, no numbers or special characters)!");
        } while (!valid);

        do {
            System.out.print("Enter your Last Name: ");
            lastName = sc.next();
            valid = lastName.matches("[A-Z][a-zA-Z]*");
            if (!valid) System.out.println("Enter a valid last name (First letter uppercase, no numbers or special characters)!");
        } while (!valid);

        do {
            System.out.print("Enter your Phone Number: ");
            phoneNo = sc.next();
            valid = phoneNo.matches("[6789][0-9]{9}");
            if (!valid) System.out.println("Enter a valid 10-digit phone number starting with 6, 7, 8, or 9!");
        } while (!valid);

        do {
            System.out.print("Enter your Email ID: ");
            emailId = sc.next();
            valid = emailId.matches("[a-zA-Z0-9._%+-]+@gmail\\.com");
            if (!valid) System.out.println("Enter a valid Gmail address!");
        } while (!valid);

        do {
            System.out.print("Enter your LinkedIn URL: ");
            sc.nextLine(); // Consume leftover newline
            linkedInId = sc.nextLine().trim();
            String tempUrl = removeProtocol(linkedInId);
            if (tempUrl.startsWith("www.")) tempUrl = tempUrl.substring(4);
            String[] parts = tempUrl.split("/");
            valid = (parts.length >= 3 && parts[0].equalsIgnoreCase("linkedin.com") && parts[1].equalsIgnoreCase("in") && !parts[2].isEmpty());
            if (!valid) System.out.println("Invalid LinkedIn URL. Please try again.");
        } while (!valid);

        System.out.print("Enter your Job Title: ");
        jobTitle = sc.nextLine();
    }

    String removeProtocol(String url) {
        return url.startsWith("http://") ? url.substring(7) : url.startsWith("https://") ? url.substring(8) : url;
    }
    void display() {
        System.out.println("---------------------------------------------");
        System.out.println("- Name: " + firstName + " " + lastName);
        System.out.println("- Phone No: " + phoneNo);
        System.out.println("- Email ID: " + emailId);
        System.out.println("- LinkedIn ID: " + linkedInId);
        System.out.println("- Job Title: " + jobTitle);
		   System.out.println("---------------------------------------------");
}
// Main method to handle the user resume system
    public static void main(String[] args) 
	{
        GenerateDetails gd = new GenerateDetails();
        Scanner sc = new Scanner(System.in);
  Resume r = new Resume();
        System.out.println("1. Student\n2. Fresher\n3. Experienced\n4. Exit");
        System.out.print("Select your resume type from above: ");
        int choice = sc.nextInt();
        switch (choice)
		{
            case 1:
			
			    gd.edu();
                gd.generateDetails();
				gd.sem();
                 System.out.println("---------------------------------------------");
                System.out.println("+--- Objective ---+");
                System.out.println(gd.objective1);
                r.display();
                Student s = new Student(gd.year, gd.degrees, gd.universityName, gd.certificates, gd.skills, gd.hobbies, gd.strengths, gd.achievements, gd.languagesKnown, gd.sem, gd.board1, gd.board2, gd.result1, gd.result2, gd.year1, gd.year2);
                s.display();
                break;
            case 2:
			   gd.edu();
			   gd.generateDetails();
               gd.internships();
                System.out.println("--------------------------------------------");
                System.out.println("+--- Objective ---+");
                System.out.println(gd.objective2);
                r.display();
				
                Fresher f = new Fresher(gd.year, gd.degrees, gd.universityName, gd.certificates, gd.skills, gd.hobbies, gd.strengths, gd.achievements, gd.languagesKnown, gd.board1,gd. board2, gd.result1, gd.result2, gd.year1, gd.year2, gd.internships, gd.post1);
				
                f.display();
                break;
            case 3:
			 gd.generateDetails();
			 gd.internships();
			 gd.expirience();
                System.out.println("---------------------------------------------");
                System.out.println("+--- Objective ---+");
                System.out.println(gd.objective3);
                r.display();
                Experienced e = new Experienced(gd.year, gd.degrees, gd.universityName, gd.certificates, gd.skills, gd.hobbies, gd.strengths, gd.achievements, gd.languagesKnown, gd.internships,gd.experienceCompanies, gd.post1, gd.post2);
                e.display();
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}