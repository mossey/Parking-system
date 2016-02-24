package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.util.Map;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mossey
 */

class school extends JFrame {
	public static void connect(){
String JDBC_DRIVER="com.mysql.jdbc.Driver";
String DB_URL="jdbc:mysql://localhost/school";
String USER="root";
String PASS="qwerty41";
Connection conn=null;
Statement stmt=null;
try{
	Class.forName("com.mysql.jdbc.Driver");}
	catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
	try{

	conn=DriverManager.getConnection(DB_URL, USER, PASS);
	stmt=conn.createStatement();
}
catch(SQLException se){
      
      se.printStackTrace();
   }catch(Exception e){
      
      e.printStackTrace();
   }finally{
      
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
  
}

public static void login(){
		JFrame login=new JFrame("login");
	login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	login.setSize(300,300);
	login.setVisible(true);
	JLabel lUsername=new JLabel("username");
	JLabel lPassword=new JLabel("password");

	JTextField tUsername=new JTextField();
	JPasswordField pPassword=new JPasswordField();

	JButton bSubmit=new JButton("login");
	JButton bExit=new JButton("quit");


	lUsername.setBounds(50,50,120,20);
	tUsername.setBounds(50,70,120,20);
	lPassword.setBounds(50,100,120,20);
	pPassword.setBounds(50,120,120,20);

	bSubmit.setBounds(50,150,120,20);
	bExit.setBounds(50,180,120,20);
	login.setLayout(null);
	login.add(lUsername);
	login.add(tUsername);
	login.add(lPassword);
	login.add(pPassword);
	
	login.add(bSubmit);
	login.add(bExit);
}
	//submit.addActionListener(this);
	public static void startPage(){
		JFrame home=new JFrame("home");
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		home.setSize(500,500);
		home.setVisible(true);

		JButton bAddNewStudent=new JButton("add new student");
		JButton bFeedResults=new JButton("feed results");
		JButton bViewRecords=new JButton("view results");
		JButton bPerformCalculations=new JButton("perfprm calculations");
		JButton bQuit=new JButton("quit");


		bAddNewStudent.setBounds(80, 80, 100, 30);
		bFeedResults.setBounds(80, 120, 100,30);
		bViewRecords.setBounds(80, 160, 100, 30);
		bPerformCalculations.setBounds(80, 200, 100,30);
		bQuit.setBounds(80,250,100,30);
		home.setLayout(null);
                
                bQuit.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        System.exit(0);


                    }});
                bAddNewStudent.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        selectClass();


                    }});
                
                 bFeedResults.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        selectClass();


                    }});
                  bQuit.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        System.exit(0);


                    }});
                  
                   bViewRecords.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        viewRecords();


                    }});
                    bPerformCalculations.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        calculate();


                    }});

		home.add(bAddNewStudent);
		home.add(bFeedResults);
		home.add(bViewRecords);
		home.add(bPerformCalculations);
		home.add(bQuit);
	}

	public static void selectClass(){
		JFrame jSelectClass=new JFrame("select class");
		jSelectClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jSelectClass.setSize(500,500);
		jSelectClass.setVisible(true);
		JButton bOption12=new JButton("form 1 and 2");
		JButton bOption34=new JButton("form 3 and 4");
		JButton bExit=new JButton("exit");
                jSelectClass.setLayout(null);

		bOption12.setBounds(80,80,100,30);
		bOption34.setBounds(80,120, 100, 30);
		bExit.setBounds(80, 120, 100, 30);
		jSelectClass.setLayout(null);
		jSelectClass.add(bOption34);
		jSelectClass.add(bOption12);
		jSelectClass.add(bExit);
		jSelectClass.add(bOption12);
		jSelectClass.add(bOption34);
		jSelectClass.add(bExit);
                
                bOption12.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        enrollStudent12();


                    }});
                bOption34.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        enrollstudent34();


                    }});
                bExit.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        System.exit(0);


                    }});
	}
	public static void enrollStudent12(){
		JFrame jEnroll=new JFrame("enroll new stdent");
		jEnroll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jEnroll.setSize(500,500);
		jEnroll.setVisible(true);

		JLabel lFirstName=new JLabel("first name");
		JLabel lMiddlename=new JLabel("middle name");
		JLabel lLastname=new JLabel("last name");
		JLabel lAdmissionNumber=new JLabel("admission number");
		JLabel lClass=new JLabel("class");
		JLabel lStream=new JLabel("stream");
		lFirstName.setBounds(50, 50, 100, 30);
		lMiddlename.setBounds(170,50, 100, 30);
		lLastname.setBounds(300,50, 100,30);
		lClass.setBounds(50, 140, 100,30);
		lStream.setBounds(170,140,100, 30);
		lAdmissionNumber.setBounds(300, 140, 100, 30);
		
		final JTextField tFirstName=new JTextField();
		final JTextField tMiddlename=new JTextField();
		final JTextField tLastname=new JTextField();
		final JTextField tAdmissionNumber=new JTextField();
		String[] classs={"form 1" , "form 2"};
		final JComboBox bClass=new JComboBox(classs);
		String[] stream={"a", "b"};
		final JComboBox bStream=new JComboBox(stream);
		JButton benroll=new JButton("enroll");
		benroll.setBounds(300, 250, 100, 30);
		 
			
		tFirstName.setBounds(50, 90, 100, 30);
		tMiddlename.setBounds(170, 90, 100,30);
		tLastname.setBounds(300, 90, 100, 30);
		bClass.setBounds(50, 180, 100,30);
		bStream.setBounds(170, 180,100, 30 );
		tAdmissionNumber.setBounds(300, 180, 100, 30);
		jEnroll.setLayout(null);
		jEnroll.add(benroll);

		jEnroll.add(lFirstName);
		jEnroll.add(lMiddlename);
		jEnroll.add(lLastname);
		jEnroll.add(lClass);
		jEnroll.add(lStream);
		jEnroll.add(lAdmissionNumber);
		jEnroll.add(tFirstName);
		jEnroll.add(tMiddlename);
		jEnroll.add(tLastname);
		jEnroll.add(tAdmissionNumber);
		jEnroll.add(bClass);
		jEnroll.add(bStream);
                
                
                
                
               // daro= bClass.getSelectedIndex();
                
		




benroll.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        
                        String JDBC_DRIVER="com.mysql.jdbc.Driver";
String DB_URL="jdbc:mysql://localhost/school";
String USER="root";
String PASS="qwerty41";
Connection conn=null;
Statement stmt=null;
try{
	Class.forName("com.mysql.jdbc.Driver");}
	catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
	try{
            
	conn=DriverManager.getConnection(DB_URL, USER, PASS);
	stmt=conn.createStatement();
        String Firstname=tFirstName.getText();
                 String Middlename=tMiddlename.getText();
                 String Lastname=tLastname.getText();
                 String daro=String.valueOf(bClass.getSelectedItem());
                 String branch=String.valueOf(bStream.getSelectedItem());
                 int admissionNumber=Integer.parseInt(tAdmissionNumber.getText());
                 String sql= "INSERT INTO students (admission_number, firstName,lastname,middleName, class, stream ) values (?,?,?,?,?,?)";
                 
                 PreparedStatement ps=conn.prepareStatement(sql);
                 ps.setInt(1, admissionNumber);
                 ps.setString(2, Firstname);
                 ps.setString(3, Lastname);
                 ps.setString(4, Middlename);
                 ps.setString(5, daro);
                 ps.setString(6, branch);
                ps.executeUpdate();
					
        
	
               
        
               // stmt.executeUpdate(sql);	
    
                               
        
        
				//System.out.println("done");

}
catch(SQLException se){
      
      se.printStackTrace();
   }catch(Exception e){
      
      e.printStackTrace();
   }finally{
      
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
  
}
                    
                    
                });

	}
   
		


		
	public static void enrollstudent34(){
				JFrame jEnroll=new JFrame("enroll new stdent");
		jEnroll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jEnroll.setSize(500,500);
                jEnroll.setVisible(true);

		JLabel lFirstName=new JLabel("first name");
		JLabel lSecondName=new JLabel("second name");
		JLabel lLastname=new JLabel("last name");
		JLabel lAdmissionNumber=new JLabel("admission number");
		JLabel lClass=new JLabel("class");
		JLabel lStream=new JLabel("stream");
		JLabel lscience1=new JLabel("science option 1");
		JLabel lscience2=new JLabel("science option 2");
		JLabel lhumanities1=new JLabel("humanities option 1");
		JLabel lhumanities2=new JLabel("humanities option 2");
		JLabel lTechnical=new JLabel("technical");
		lFirstName.setBounds(50, 50, 100, 30);
		lSecondName.setBounds(170,50, 100, 30);
		lLastname.setBounds(300,50, 100,30);
		lClass.setBounds(50, 140, 100,30);
		lStream.setBounds(170,140,100, 30);
		lAdmissionNumber.setBounds(300, 140, 100, 30);
		lscience1.setBounds(50, 200, 100, 30);
		lscience2.setBounds(170, 200, 100, 30);
		lhumanities1.setBounds(50, 270,100, 30);
		lhumanities2.setBounds(170,270, 100, 30);
		lTechnical.setBounds(50, 340, 100, 30);
		JButton benroll=new JButton("enroll");
		benroll.setBounds(170, 400, 100, 30);


		/*JLabel lMathemaics=new  JLabel("mathematics");
		JLabel lEnglish=new JLabel("english");
		JLabel lKiswahili=new JLabel("kiswahili");
		JLabel lBiology=new JLabel("biology");
		JLabel lPhysics=new JLabel("physics");
		JLabel lChemistry=new JLabel("chemistry");
		JLabel lHistory=new JLabel("history");
		JLabel lGeography=new JLabel("Geography");
		JLabel lCRE=new JLabel("CRE");
		JLabel lComputerStudies=new JLabel("computer studies");
		JLabel lBusinessStudies=new JLabel("Business Studies");
		*/

		final JTextField tFirstName=new JTextField();
		final JTextField tMiddlename=new JTextField();
		final JTextField tLastname=new JTextField();
		final JTextField tAdmissionNumber=new JTextField();
		String[] classs={"form 4" , "form 3"};
		final JComboBox bClass=new JComboBox(classs);
		String[] stream={"a", "b"};
		final JComboBox bStream=new JComboBox(stream);
		String[] science={"biology", "chemistry", "physics"};
		String[] humanities={"history", "CRE", "Geography"};
		String[] technical={"Computer Studies", "Business Studies"};
		JComboBox bScience1= new JComboBox(science);
		JComboBox bScience2=new JComboBox(science);
		JComboBox bHumanities1=new JComboBox(humanities);
		JComboBox bHumanities2=new JComboBox(humanities);
		JComboBox bTechnical=new JComboBox(technical);
		tFirstName.setBounds(50, 90, 100, 30);
		tMiddlename.setBounds(170, 90, 100,30);
		tLastname.setBounds(300, 90, 100, 30);
		bClass.setBounds(50, 180, 100,30);
		bStream.setBounds(170, 180,100, 30 );
		tAdmissionNumber.setBounds(300, 180, 100, 30);
		bScience1.setBounds(50, 240, 100, 30);
		bScience2.setBounds(170,240, 100, 30);
		bHumanities1.setBounds(50, 310, 100, 30);
		bHumanities2.setBounds(170, 310, 100, 30);
		bTechnical.setBounds(50,390, 100, 30);
		jEnroll.setLayout(null);
                
		jEnroll.add(benroll);
		jEnroll.add(lFirstName);
		jEnroll.add(lSecondName);
		jEnroll.add(lLastname);
		jEnroll.add(lClass);
		jEnroll.add(lStream);
		jEnroll.add(lAdmissionNumber);
		jEnroll.add(tFirstName);
		jEnroll.add(tMiddlename);
		jEnroll.add(tLastname);
		jEnroll.add(tAdmissionNumber);
		jEnroll.add(bClass);
		jEnroll.add(bStream);
		jEnroll.add(bScience1);
		jEnroll.add(bScience2);
		jEnroll.add(bTechnical);
		jEnroll.add(bHumanities1);
		jEnroll.add(bHumanities2);
                //JButton benroll=new JButton("enroll");
		//benroll.setBounds(300, 250, 100, 30);
                
                benroll.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        
                        String JDBC_DRIVER="com.mysql.jdbc.Driver";
String DB_URL="jdbc:mysql://localhost/school";
String USER="root";
String PASS="qwerty41";
Connection conn=null;
Statement stmt=null;
try{
	Class.forName("com.mysql.jdbc.Driver");}
	catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
	try{conn=DriverManager.getConnection(DB_URL, USER, PASS);
	stmt=conn.createStatement();
        String Firstname=tFirstName.getText();
                 String Middlename=tMiddlename.getText();
                 String Lastname=tLastname.getText();
                 String daro=String.valueOf(bClass.getSelectedItem());
                 String branch=String.valueOf(bStream.getSelectedItem());
                 int admissionNumber=Integer.parseInt(tAdmissionNumber.getText());
                 String sql= "INSERT INTO students (admission_number, firstName,lastname,middleName, class, stream ) values (?,?,?,?,?,?)";
                 
                 PreparedStatement ps=conn.prepareStatement(sql);
                 ps.setInt(1, admissionNumber);
                 ps.setString(2, Firstname);
                 ps.setString(3, Lastname);
                 ps.setString(4, Middlename);
                 ps.setString(5, daro);
                 ps.setString(6, branch);
                ps.executeUpdate();
					
        
}
catch(SQLException se){
      
      se.printStackTrace();
   }catch(Exception e){
      
      e.printStackTrace();
   }finally{
      
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
  
}
                    
                    
                });







	}
	public static void selectFeedClass(){
		JFrame fSelect=new JFrame("select class");
		fSelect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fSelect.setSize(500,500);
        fSelect.setVisible(true);

        JButton bForm12=new JButton("form 1 and 2");
        JButton bform34=new JButton("form 3 and 4");
        JButton bExit=new JButton("exit");

        bForm12.setBounds(50, 50, 100, 30);
        bform34.setBounds(50, 100, 100, 30);
        bExit.setBounds(50, 150, 100, 30);

        fSelect.add(bForm12);
        fSelect.add(bform34);
        fSelect.add(bExit);
        
        bForm12.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        feedResults12();


                    }});
        bform34.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        feedResults34();


                    }});
          bExit.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        System.exit(0);


                    }});


	}

	public static void feedResults12(){
		JFrame feedResults=new JFrame("feed results");
		feedResults.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		feedResults.setSize(1000, 1000);
        feedResults.setVisible(true);
        JLabel lAdmissionNumber=new JLabel("admission number");
        JLabel lClass=new JLabel("admission number");
        JLabel lStream=new JLabel("class");
        JLabel lOpener=new JLabel("opener");
        JLabel lMidterm=new JLabel("midterm");
        JLabel lEndTerm=new JLabel("end term");
        JLabel lMathemaics=new JLabel("mathematics");
        JLabel lEnglish=new JLabel("english");
        JLabel lKiswahili=new JLabel("kiswahili");
        JLabel lBiology=new JLabel("biology");
        JLabel lChemistry=new JLabel("chemistry");
        JLabel lPhysics=new JLabel("physics");
        JLabel lHistory=new JLabel("history");
        JLabel lGeography=new JLabel("Geography");
        JLabel lCRE=new JLabel("CRE");
        JLabel lComputerStudies=new JLabel("Computer Studies");
        JLabel lBusinessStudies=new JLabel("Business studies");

        final JTextField tAdmissionNumber=new JTextField();
        final JTextField tMathematics1=new JTextField();
        final JTextField tMathematics2=new JTextField();
        final JTextField tMathematics3=new JTextField();
        final JTextField tEnglish1=new JTextField();
        final JTextField tEnglish2=new JTextField();
        final JTextField tEnglish3=new JTextField();
        final JTextField tKiswahili1=new JTextField();
        final JTextField tKiswahili2=new JTextField();
        final JTextField tKiswahili3=new JTextField();
        final JTextField tBiology1=new JTextField();
        final JTextField tBiology2=new JTextField();
        final JTextField tBiology3= new JTextField();
        final JTextField tChemistry1=new JTextField();
        final JTextField tChemistry2=new JTextField();
        final JTextField tChemistry3=new JTextField();
        final JTextField tPhysics1=new JTextField();
        final JTextField tPhysics2=new JTextField();
        final JTextField tPhysics3 =new JTextField();
        final JTextField tHistory1=new JTextField();
        final JTextField tHistory2=new JTextField();
        final JTextField tHistory3=new JTextField();
        final JTextField tGeography1=new JTextField();
        final JTextField tGeography2=new JTextField();
        final JTextField tGeography3=new JTextField();
        final JTextField tCRE1=new JTextField();
        final JTextField tCRE2=new JTextField();
        final JTextField tCRE3=new JTextField();
        final JTextField tComputerStudies1=new JTextField();
        final JTextField tComputerStudies2=new JTextField();
        final JTextField tComputerStudies3=new JTextField();
        final JTextField tBusinessStudies1=new JTextField();
        final JTextField tBusinessStudies2=new JTextField();
        final JTextField tBusinessStudies3=new JTextField();

        String[] classs={"1", "2"};
        String[] stream={"a", "b"};
        final JComboBox bClass=new JComboBox(classs);
        final JComboBox bStream=new JComboBox(stream);
        String[] term={"term 1", "term 2","term 3"};
        final JComboBox jTerm=new JComboBox(term);
        JLabel lterm=new JLabel("term");
        lterm.setBounds(500,50, 100, 30);
        

      //  jterm.setBounds(500, 50, 300, 30);
        jTerm.setBounds(500,80, 300, 30);
        bClass.setBounds(300, 80, 100, 30);
        bStream.setBounds(350, 80, 100, 30);
        lAdmissionNumber.setBounds(50, 50, 100, 30);
        tAdmissionNumber.setBounds(50, 100, 100,30);
        lClass.setBounds(200, 50, 100, 30);
        lStream.setBounds(350, 50, 100, 30);
        lOpener.setBounds(200, 100, 100, 30);
        lMidterm.setBounds(350, 100, 100, 30);
        lEndTerm.setBounds(500, 100, 100, 30);
        lMathemaics.setBounds(50, 150, 100, 30);
        tMathematics1.setBounds(200, 150, 100, 30);
        tMathematics2.setBounds(350, 150, 100, 30);
        tMathematics3.setBounds(500, 150, 100, 30);
        lEnglish.setBounds(50, 200, 100, 30);
        tEnglish1.setBounds(200, 200, 100, 30);
        tEnglish2.setBounds(350, 200, 100, 30);
        tEnglish3.setBounds(500, 200, 100, 30);
        lKiswahili.setBounds(50, 250, 100, 30);
        tKiswahili1.setBounds(200, 250, 100, 30);
        tKiswahili2.setBounds(350, 250, 100, 30);
        tKiswahili3.setBounds(500, 250, 100, 30);
        lBiology.setBounds(50, 300, 100, 30);
        tBiology1.setBounds(200, 300, 100, 30);
        tBiology2.setBounds(350, 300, 100, 30);
        tBiology3.setBounds(500, 300, 100, 30);
        lPhysics.setBounds(50,350, 100, 30);
        tPhysics1.setBounds(200, 350, 100, 30);
        tPhysics2.setBounds(350, 350, 100, 30);
        tPhysics3.setBounds(500, 350, 100, 30);
        lHistory.setBounds(50, 400, 100, 30);
        tHistory1.setBounds(200, 400, 100, 30);
        tHistory2.setBounds(350, 400, 100, 30);
        tHistory3.setBounds(500, 400, 100, 30);
        lGeography.setBounds(50, 450, 100, 30);
        tGeography1.setBounds(200, 450, 100, 30);
        tGeography2.setBounds(350, 450, 100, 30);
        tGeography3.setBounds(500, 450, 100, 30);
        lCRE.setBounds(50, 500, 100, 30);
        tCRE1.setBounds(200, 500, 100, 30);
        tCRE2.setBounds(350, 500, 100, 30);
        tCRE3.setBounds(500, 500, 100, 30);
        lComputerStudies.setBounds(50, 550, 100, 30);
        tComputerStudies1.setBounds(200, 550, 100, 30);
        tComputerStudies2.setBounds(350, 550, 100, 30);
        tComputerStudies3.setBounds(500, 550, 100, 30);
        lBusinessStudies.setBounds(50, 600, 100, 30);
        tBusinessStudies1.setBounds(200, 600, 100, 30);
        tBusinessStudies2.setBounds(350, 600, 100, 30);
        tBusinessStudies3.setBounds(500, 600, 100, 30);
        lChemistry.setBounds(50, 650,100, 30);
        tChemistry1.setBounds(200, 650, 100, 30);
        tChemistry2.setBounds(350, 650, 100,30);
        tChemistry3.setBounds(500, 650, 100, 30);
		

		JButton bAdd=new JButton("add record");

		bAdd.setBounds(500, 700, 100, 30);
		feedResults.setLayout(null);
		feedResults.add(bStream);
		feedResults.add(bClass);
		feedResults.add(bAdd);
		feedResults.add(lAdmissionNumber);
		feedResults.add(tAdmissionNumber);
		feedResults.add(lClass);
		feedResults.add(lStream);
		feedResults.add(lOpener); 
		feedResults.add(lMidterm);
		feedResults.add(lEndTerm);
		feedResults.add(lMathemaics);
		feedResults.add(tMathematics1);
		feedResults.add(tMathematics2);
		feedResults.add(tMathematics3);
		feedResults.add(tEnglish2);
		feedResults.add(tEnglish1);
		feedResults.add(lEnglish);
		feedResults.add(tEnglish3);
		feedResults.add(tKiswahili1);
		feedResults.add(lKiswahili);
		feedResults.add(tKiswahili2);
		feedResults.add(tKiswahili3);
		feedResults.add(lBiology);
		feedResults.add(tBiology1);
		feedResults.add(tBiology2);
		feedResults.add(tBiology3);
		feedResults.add(tPhysics1);
		feedResults.add(lPhysics);
		feedResults.add(tPhysics3);
		feedResults.add(tPhysics2);
		feedResults.add(lChemistry);
		feedResults.add(tChemistry1);
		feedResults.add(tChemistry2);
		feedResults.add(tChemistry3);
		feedResults.add(lHistory);
		feedResults.add(tHistory1);
		feedResults.add(tHistory2);
		feedResults.add(tHistory3);
		feedResults.add(lGeography);
		feedResults.add(tGeography1);
		feedResults.add(tGeography2);
		feedResults.add(tGeography3);
		feedResults.add(lCRE);
		feedResults.add(tCRE1);
		feedResults.add(tCRE2);
		feedResults.add(tCRE3);
		feedResults.add(lComputerStudies);
		feedResults.add(tComputerStudies1);
		feedResults.add(tComputerStudies2);
		feedResults.add(tComputerStudies3);
		feedResults.add(lBusinessStudies);
		feedResults.add(tBusinessStudies1);
		feedResults.add(tBusinessStudies2);
		feedResults.add(tBusinessStudies3);
		feedResults.add(lterm);
        feedResults.add(jTerm);
        
        bAdd.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        
                                               String JDBC_DRIVER="com.mysql.jdbc.Driver";
String DB_URL="jdbc:mysql://localhost/school";
String USER="root";
String PASS="qwerty41";
Connection conn=null;
Statement stmt=null;
try{
	Class.forName("com.mysql.jdbc.Driver");}
	catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
	try{conn=DriverManager.getConnection(DB_URL, USER, PASS);
	stmt=conn.createStatement();
        int admission=Integer.parseInt(tAdmissionNumber.getText());
        int mathematics1=Integer.parseInt(tMathematics1.getText());
        int mathematics2=Integer.parseInt(tMathematics2.getText());
        int mathematics3=Integer.parseInt(tMathematics3.getText());
        int english1=Integer.parseInt(tEnglish1.getText());
        int english2=Integer.parseInt(tEnglish2.getText());
        int english3=Integer.parseInt(tEnglish3.getText());
        int kiswahili1=Integer.parseInt(tKiswahili1.getText());
        int kiswahili2=Integer.parseInt(tKiswahili2.getText());
        int kiswahili3=Integer.parseInt(tKiswahili3.getText());
        int biology1=Integer.parseInt(tBiology1.getText());
        int biology2=Integer.parseInt(tBiology2.getText());
        int biology3=Integer.parseInt(tBiology3.getText());
        int chemistry1=Integer.parseInt(tChemistry1.getText());
        int chemistry2=Integer.parseInt(tChemistry2.getText());
        int chemistry3=Integer.parseInt(tChemistry3.getText());
        int physics1=Integer.parseInt(tPhysics1.getText());
        int physics2=Integer.parseInt(tPhysics2.getText());
        int physics3=Integer.parseInt(tPhysics3.getText());
        int history1=Integer.parseInt(tHistory1.getText());
        int history2=Integer.parseInt(tHistory2.getText());
        int history3=Integer.parseInt(tHistory3.getText());
        int geo1=Integer.parseInt(tGeography1.getText());
        int geo2=Integer.parseInt(tGeography2.getText());
        int geo3=Integer.parseInt(tGeography3.getText());
        int CRE1=Integer.parseInt(tCRE1.getText());
        int CRE2=Integer.parseInt(tCRE2.getText());
        int CRE3=Integer.parseInt(tCRE3.getText());
        int BS1=Integer.parseInt(tBusinessStudies1.getText());
        int BS2=Integer.parseInt(tBusinessStudies2.getText());
        int BS3=Integer.parseInt(tBusinessStudies3.getText());
        int CS1=Integer.parseInt(tComputerStudies1.getText());
        int CS2=Integer.parseInt(tComputerStudies2.getText());
        int CS3=Integer.parseInt(tComputerStudies3.getText());
        String darom=String.valueOf(bClass.getSelectedItem());
        String streamm=String.valueOf(bStream.getSelectedItem());
        String ter=String.valueOf(jTerm.getSelectedItem());
        
        String sql="INSERT INTO marks(admission_number, math1,math2,math3, english1,english2,english3,kiswahili1,kiswahili2,kiswahili3,biology1, biology2,biology3,chemistry1,chemistry2,chemistry3,physics1,physics2,physics3,business1,business2,business3,computer1, computer2,computer2,computer3,geography1,geography2,geography3,history1,history2,history3,cre1,cre2,cre3,term,class,stream) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,??)";
        
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setInt(1, admission);
        ps.setInt(2, mathematics1);
        ps.setInt(3, mathematics2);
        ps.setInt(4, mathematics3);
        ps.setInt(5, english1);
        ps.setInt(6, english2);
        ps.setInt(7, english3);
        ps.setInt(8, kiswahili1);
        ps.setInt(9, kiswahili2);
        ps.setInt(10, kiswahili3);
        ps.setInt(11, biology1);
        ps.setInt(12, biology2);
        ps.setInt(13, biology3);
        ps.setInt(14, chemistry1);
        ps.setInt(15, chemistry2);
        ps.setInt(16, chemistry3);
        ps.setInt(17, physics1);
        ps.setInt(18, physics2);
        ps.setInt(19, physics3);
        ps.setInt(20, BS1);
        ps.setInt(21, BS2);
        ps.setInt(22, BS3);
        ps.setInt(23, CS1);
        ps.setInt(24, CS2);
        ps.setInt(25, CS3);
        ps.setInt(26, geo1);
        ps.setInt(27, geo2);
        ps.setInt(28, geo3);
        ps.setInt(29, history1);
        ps.setInt(30, history2);
        ps.setInt(31, history3);
        ps.setInt(32,CRE1 );
        ps.setInt(33, CRE2);
        ps.setInt(34, CRE3);
        ps.setString(35, ter);
        ps.setString(36, darom);
        ps.setString(37, streamm);
        ps.executeUpdate();
       
       //JOptionPane.showMessageDialog("entered");
                
        
}
catch(SQLException se){
      
      se.printStackTrace();
   }catch(Exception e){
      
      e.printStackTrace();
   }finally{
      
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
                    }
                }
        );












	
	}
	public static void feedResults34(){JFrame feedResults=new JFrame("feed results");
		feedResults.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		feedResults.setSize(1000, 1000);
        feedResults.setVisible(true);
        JLabel lAdmissionNumber=new JLabel("admission number");
        JLabel lClass=new JLabel("admission number");
        JLabel lStream=new JLabel("class");
        JLabel lOpener=new JLabel("opener");
        JLabel lMidterm=new JLabel("midterm");
        JLabel lEndTerm=new JLabel("end term");
        JLabel lMathemaics=new JLabel("mathematics");
        JLabel lEnglish=new JLabel("english");
        JLabel lKiswahili=new JLabel("kiswahili");
        JLabel lBiology=new JLabel("biology");
        JLabel lChemistry=new JLabel("chemistry");
        JLabel lPhysics=new JLabel("physics");
        JLabel lHistory=new JLabel("history");
        JLabel lGeography=new JLabel("Geography");
        JLabel lCRE=new JLabel("CRE");
        JLabel lComputerStudies=new JLabel("Computer Studies");
        JLabel lBusinessStudies=new JLabel("Business studies");

        final JTextField tAdmissionNumber=new JTextField();
        final JTextField tMathematics1=new JTextField();
        final JTextField tMathematics2=new JTextField();
        final JTextField tMathematics3=new JTextField();
        final JTextField tEnglish1=new JTextField();
        final JTextField tEnglish2=new JTextField();
        final JTextField tEnglish3=new JTextField();
        final JTextField tKiswahili1=new JTextField();
        final JTextField tKiswahili2=new JTextField();
        final JTextField tKiswahili3=new JTextField();
        final JTextField tBiology1=new JTextField();
        final JTextField tBiology2=new JTextField();
        final JTextField tBiology3= new JTextField();
        final JTextField tChemistry1=new JTextField();
        final JTextField tChemistry2=new JTextField();
        final JTextField tChemistry3=new JTextField();
        final JTextField tPhysics1=new JTextField();
        final JTextField tPhysics2=new JTextField();
        final JTextField tPhysics3 =new JTextField();
        final JTextField tHistory1=new JTextField();
        final JTextField tHistory2=new JTextField();
        final JTextField tHistory3=new JTextField();
        final JTextField tGeography1=new JTextField();
        final JTextField tGeography2=new JTextField();
        final JTextField tGeography3=new JTextField();
        final JTextField tCRE1=new JTextField();
        final JTextField tCRE2=new JTextField();
        final JTextField tCRE3=new JTextField();
        final JTextField tComputerStudies1=new JTextField();
        final JTextField tComputerStudies2=new JTextField();
        final JTextField tComputerStudies3=new JTextField();
        final JTextField tBusinessStudies1=new JTextField();
        final JTextField tBusinessStudies2=new JTextField();
        final JTextField tBusinessStudies3=new JTextField();

        String[] classs={"3", "4"};
        String[] stream={"a", "b"};
        final JComboBox bClass=new JComboBox(classs);
        final JComboBox bStream=new JComboBox(stream);
        String[] term={"term 1", "term 2","term 3"};
        final JComboBox jTerm=new JComboBox(term);
        JLabel lterm=new JLabel("term");
        lterm.setBounds(500,50, 100, 30);
        

      //  jterm.setBounds(500, 50, 300, 30);
        jTerm.setBounds(500,80, 300, 30);
        bClass.setBounds(300, 80, 100, 30);
        bStream.setBounds(350, 80, 100, 30);
        lAdmissionNumber.setBounds(50, 50, 100, 30);
        tAdmissionNumber.setBounds(50, 100, 100,30);
        lClass.setBounds(200, 50, 100, 30);
        lStream.setBounds(350, 50, 100, 30);
        lOpener.setBounds(200, 100, 100, 30);
        lMidterm.setBounds(350, 100, 100, 30);
        lEndTerm.setBounds(500, 100, 100, 30);
        lMathemaics.setBounds(50, 150, 100, 30);
        tMathematics1.setBounds(200, 150, 100, 30);
        tMathematics2.setBounds(350, 150, 100, 30);
        tMathematics3.setBounds(500, 150, 100, 30);
        lEnglish.setBounds(50, 200, 100, 30);
        tEnglish1.setBounds(200, 200, 100, 30);
        tEnglish2.setBounds(350, 200, 100, 30);
        tEnglish3.setBounds(500, 200, 100, 30);
        lKiswahili.setBounds(50, 250, 100, 30);
        tKiswahili1.setBounds(200, 250, 100, 30);
        tKiswahili2.setBounds(350, 250, 100, 30);
        tKiswahili3.setBounds(500, 250, 100, 30);
        lBiology.setBounds(50, 300, 100, 30);
        tBiology1.setBounds(200, 300, 100, 30);
        tBiology2.setBounds(350, 300, 100, 30);
        tBiology3.setBounds(500, 300, 100, 30);
        lPhysics.setBounds(50,350, 100, 30);
        tPhysics1.setBounds(200, 350, 100, 30);
        tPhysics2.setBounds(350, 350, 100, 30);
        tPhysics3.setBounds(500, 350, 100, 30);
        lHistory.setBounds(50, 400, 100, 30);
        tHistory1.setBounds(200, 400, 100, 30);
        tHistory2.setBounds(350, 400, 100, 30);
        tHistory3.setBounds(500, 400, 100, 30);
        lGeography.setBounds(50, 450, 100, 30);
        tGeography1.setBounds(200, 450, 100, 30);
        tGeography2.setBounds(350, 450, 100, 30);
        tGeography3.setBounds(500, 450, 100, 30);
        lCRE.setBounds(50, 500, 100, 30);
        tCRE1.setBounds(200, 500, 100, 30);
        tCRE2.setBounds(350, 500, 100, 30);
        tCRE3.setBounds(500, 500, 100, 30);
        lComputerStudies.setBounds(50, 550, 100, 30);
        tComputerStudies1.setBounds(200, 550, 100, 30);
        tComputerStudies2.setBounds(350, 550, 100, 30);
        tComputerStudies3.setBounds(500, 550, 100, 30);
        lBusinessStudies.setBounds(50, 600, 100, 30);
        tBusinessStudies1.setBounds(200, 600, 100, 30);
        tBusinessStudies2.setBounds(350, 600, 100, 30);
        tBusinessStudies3.setBounds(500, 600, 100, 30);
        lChemistry.setBounds(50, 650,100, 30);
        tChemistry1.setBounds(200, 650, 100, 30);
        tChemistry2.setBounds(350, 650, 100,30);
        tChemistry3.setBounds(500, 650, 100, 30);
		

		JButton bAdd=new JButton("add record");

		bAdd.setBounds(500, 700, 100, 30);
		feedResults.setLayout(null);
		feedResults.add(bStream);
		feedResults.add(bClass);
		feedResults.add(bAdd);
		feedResults.add(lAdmissionNumber);
		feedResults.add(tAdmissionNumber);
		feedResults.add(lClass);
		feedResults.add(lStream);
		feedResults.add(lOpener); 
		feedResults.add(lMidterm);
		feedResults.add(lEndTerm);
		feedResults.add(lMathemaics);
		feedResults.add(tMathematics1);
		feedResults.add(tMathematics2);
		feedResults.add(tMathematics3);
		feedResults.add(tEnglish2);
		feedResults.add(tEnglish1);
		feedResults.add(lEnglish);
		feedResults.add(tEnglish3);
		feedResults.add(tKiswahili1);
		feedResults.add(lKiswahili);
		feedResults.add(tKiswahili2);
		feedResults.add(tKiswahili3);
		feedResults.add(lBiology);
		feedResults.add(tBiology1);
		feedResults.add(tBiology2);
		feedResults.add(tBiology3);
		feedResults.add(tPhysics1);
		feedResults.add(lPhysics);
		feedResults.add(tPhysics3);
		feedResults.add(tPhysics2);
		feedResults.add(lChemistry);
		feedResults.add(tChemistry1);
		feedResults.add(tChemistry2);
		feedResults.add(tChemistry3);
		feedResults.add(lHistory);
		feedResults.add(tHistory1);
		feedResults.add(tHistory2);
		feedResults.add(tHistory3);
		feedResults.add(lGeography);
		feedResults.add(tGeography1);
		feedResults.add(tGeography2);
		feedResults.add(tGeography3);
		feedResults.add(lCRE);
		feedResults.add(tCRE1);
		feedResults.add(tCRE2);
		feedResults.add(tCRE3);
		feedResults.add(lComputerStudies);
		feedResults.add(tComputerStudies1);
		feedResults.add(tComputerStudies2);
		feedResults.add(tComputerStudies3);
		feedResults.add(lBusinessStudies);
		feedResults.add(tBusinessStudies1);
		feedResults.add(tBusinessStudies2);
		feedResults.add(tBusinessStudies3);
		feedResults.add(lterm);
        feedResults.add(jTerm);
        
        bAdd.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        
                                               String JDBC_DRIVER="com.mysql.jdbc.Driver";
String DB_URL="jdbc:mysql://localhost/school";
String USER="root";
String PASS="qwerty41";
Connection conn=null;
Statement stmt=null;
try{
	Class.forName("com.mysql.jdbc.Driver");}
	catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
	try{conn=DriverManager.getConnection(DB_URL, USER, PASS);
	stmt=conn.createStatement();
        int admission=Integer.parseInt(tAdmissionNumber.getText());
        int mathematics1=Integer.parseInt(tMathematics1.getText());
        int mathematics2=Integer.parseInt(tMathematics2.getText());
        int mathematics3=Integer.parseInt(tMathematics3.getText());
        int english1=Integer.parseInt(tEnglish1.getText());
        int english2=Integer.parseInt(tEnglish2.getText());
        int english3=Integer.parseInt(tEnglish3.getText());
        int kiswahili1=Integer.parseInt(tKiswahili1.getText());
        int kiswahili2=Integer.parseInt(tKiswahili2.getText());
        int kiswahili3=Integer.parseInt(tKiswahili3.getText());
        int biology1=Integer.parseInt(tBiology1.getText());
        int biology2=Integer.parseInt(tBiology2.getText());
        int biology3=Integer.parseInt(tBiology3.getText());
        int chemistry1=Integer.parseInt(tChemistry1.getText());
        int chemistry2=Integer.parseInt(tChemistry2.getText());
        int chemistry3=Integer.parseInt(tChemistry3.getText());
        int physics1=Integer.parseInt(tPhysics1.getText());
        int physics2=Integer.parseInt(tPhysics2.getText());
        int physics3=Integer.parseInt(tPhysics3.getText());
        int history1=Integer.parseInt(tHistory1.getText());
        int history2=Integer.parseInt(tHistory2.getText());
        int history3=Integer.parseInt(tHistory3.getText());
        int geo1=Integer.parseInt(tGeography1.getText());
        int geo2=Integer.parseInt(tGeography2.getText());
        int geo3=Integer.parseInt(tGeography3.getText());
        int CRE1=Integer.parseInt(tCRE1.getText());
        int CRE2=Integer.parseInt(tCRE2.getText());
        int CRE3=Integer.parseInt(tCRE3.getText());
        int BS1=Integer.parseInt(tBusinessStudies1.getText());
        int BS2=Integer.parseInt(tBusinessStudies2.getText());
        int BS3=Integer.parseInt(tBusinessStudies3.getText());
        int CS1=Integer.parseInt(tComputerStudies1.getText());
        int CS2=Integer.parseInt(tComputerStudies2.getText());
        int CS3=Integer.parseInt(tComputerStudies3.getText());
        String darom=String.valueOf(bClass.getSelectedItem());
        String streamm=String.valueOf(bStream.getSelectedItem());
        String ter=String.valueOf(jTerm.getSelectedItem());
        
        String sql="INSERT INTO marks(admission_number, math1,math2,math3, english1,english2,english3,kiswahili1,kiswahili2,kiswahili3,biology1, biology2,biology3,chemistry1,chemistry2,chemistry3,physics1,physics2,physics3,business1,business2,business3,computer1, computer2,computer2,computer3,geography1,geography2,geography3,history1,history2,history3,cre1,cre2,cre3,term,class,stream) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,??)";
        
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setInt(1, admission);
        ps.setInt(2, mathematics1);
        ps.setInt(3, mathematics2);
        ps.setInt(4, mathematics3);
        ps.setInt(5, english1);
        ps.setInt(6, english2);
        ps.setInt(7, english3);
        ps.setInt(8, kiswahili1);
        ps.setInt(9, kiswahili2);
        ps.setInt(10, kiswahili3);
        ps.setInt(11, biology1);
        ps.setInt(12, biology2);
        ps.setInt(13, biology3);
        ps.setInt(14, chemistry1);
        ps.setInt(15, chemistry2);
        ps.setInt(16, chemistry3);
        ps.setInt(17, physics1);
        ps.setInt(18, physics2);
        ps.setInt(19, physics3);
        ps.setInt(20, BS1);
        ps.setInt(21, BS2);
        ps.setInt(22, BS3);
        ps.setInt(23, CS1);
        ps.setInt(24, CS2);
        ps.setInt(25, CS3);
        ps.setInt(26, geo1);
        ps.setInt(27, geo2);
        ps.setInt(28, geo3);
        ps.setInt(29, history1);
        ps.setInt(30, history2);
        ps.setInt(31, history3);
        ps.setInt(32,CRE1 );
        ps.setInt(33, CRE2);
        ps.setInt(34, CRE3);
        ps.setString(35, ter);
        ps.setString(36, darom);
        ps.setString(37, streamm);
        ps.executeUpdate();
       
       //JOptionPane.showMessageDialog("entered");
                
        
}
catch(SQLException se){
      
      se.printStackTrace();
   }catch(Exception e){
      
      e.printStackTrace();
   }finally{
      
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
                    }
                }
        );


	}
	

	public static void viewRecords(){


	}

	public static void calculate(){
            String JDBC_DRIVER="com.mysql.jdbc.Driver";
String DB_URL="jdbc:mysql://localhost/school";
String USER="root";
String PASS="qwerty41";
Connection conn=null;
Statement stmt=null;
try{
	Class.forName("com.mysql.jdbc.Driver");}
	catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
	try{
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            stmt=conn.createStatement();
  
       // String sql="INSERT INTO marks(admission_number, math1,math2,math3, english1,english2,english3,kiswahili1,kiswahili2,kiswahili3,biology1, biology2,biology3,chemistry1,chemistry2,chemistry3,physics1,physics2,physics3,business1,business2,business3,computer1, computer2,computer2,computer3,geography1,geography2,geography3,history1,history2,history3,cre1,cre2,cre3,term,class,stream) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,??)";
        //JOptionPane.showMessageDialog("entered");
            String sql="Select * from test";
           ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                int admissionnumber=rs.getInt("admission_number");
                int math1=rs.getInt("math1");
                int math2=rs.getInt("math2");
                int math3=rs.getInt("math3");
                int english1=rs.getInt("english1");
                int english2=rs.getInt("english2");
                int english3=rs.getInt("english3");
                int kiswahili1=rs.getInt("kiswahili1");
                int kiswahili2=rs.getInt("kiswahili2");
                int kiswahili3=rs.getInt("kiswahili3");
                int biology1=rs.getInt("biology1");
                int biology2=rs.getInt("biology2");
                int biology3=rs.getInt("biology3");
                int chemistry1=rs.getInt("chemistry1");
                int chemistry2=rs.getInt("chemistry2");
                int chemistry3=rs.getInt("chemistry3");
                int physics1=rs.getInt("physics1");
                int physics2=rs.getInt("physics2");
                int physics3=rs.getInt("physics3");
                int bs1=rs.getInt("business1");
                int bs2=rs.getInt("business2");
                int bs3=rs.getInt("business3");
                int cs1=rs.getInt("computer1");
                int cs2=rs.getInt("computer2");
                int cs3=rs.getInt("computer3");
                int geo1=rs.getInt("geography1");
                int geo2=rs.getInt("geography2");
                int geo3=rs.getInt("geography3");
                int hist1=rs.getInt("history1");
                int hist2=rs.getInt("history2");
                int hist3=rs.getInt("history3");
                int cre1=rs.getInt("cre1");
                int cre2=rs.getInt("cre2");
                int cre3=rs.getInt("cre3");
                String term=rs.getString("term");
                String classs=rs.getString("class");
                String stream=rs.getString("stream");
                
                
                
                
                
                
                
                
                
                
            }
        
                
        
}
catch(SQLException se){
      
      se.printStackTrace();
   }catch(Exception e){
      
      e.printStackTrace();
   }finally{
      
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }


            

	}

	public static void displaySummaryOptions(){
		            String JDBC_DRIVER="com.mysql.jdbc.Driver";
String DB_URL="jdbc:mysql://localhost/school";
String USER="root";
String PASS="qwerty41";
Connection conn=null;
Statement stmt=null;
try{
	Class.forName("com.mysql.jdbc.Driver");}
	catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
	try{
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            stmt=conn.createStatement();
  
       // String sql="INSERT INTO marks(admission_number, math1,math2,math3, english1,english2,english3,kiswahili1,kiswahili2,kiswahili3,biology1, biology2,biology3,chemistry1,chemistry2,chemistry3,physics1,physics2,physics3,business1,business2,business3,computer1, computer2,computer2,computer3,geography1,geography2,geography3,history1,history2,history3,cre1,cre2,cre3,term,class,stream) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,??)";
        //JOptionPane.showMessageDialog("entered");
            String sql="Select * from test";
           ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                int admissionnumber=rs.getInt("admission_number");
                int math1=rs.getInt("math1");
                int math2=rs.getInt("math2");
                int math3=rs.getInt("math3");
                int english1=rs.getInt("english1");
                int english2=rs.getInt("english2");
                int english3=rs.getInt("english3");
                int kiswahili1=rs.getInt("kiswahili1");
                int kiswahili2=rs.getInt("kiswahili2");
                int kiswahili3=rs.getInt("kiswahili3");
                int biology1=rs.getInt("biology1");
                int biology2=rs.getInt("biology2");
                int biology3=rs.getInt("biology3");
                int chemistry1=rs.getInt("chemistry1");
                int chemistry2=rs.getInt("chemistry2");
                int chemistry3=rs.getInt("chemistry3");
                int physics1=rs.getInt("physics1");
                int physics2=rs.getInt("physics2");
                int physics3=rs.getInt("physics3");
                int bs1=rs.getInt("business1");
                int bs2=rs.getInt("business2");
                int bs3=rs.getInt("business3");
                int cs1=rs.getInt("computer1");
                int cs2=rs.getInt("computer2");
                int cs3=rs.getInt("computer3");
                int geo1=rs.getInt("geography1");
                int geo2=rs.getInt("geography2");
                int geo3=rs.getInt("geography3");
                int hist1=rs.getInt("history1");
                int hist2=rs.getInt("history2");
                int hist3=rs.getInt("history3");
                int cre1=rs.getInt("cre1");
                int cre2=rs.getInt("cre2");
                int cre3=rs.getInt("cre3");
                String term=rs.getString("term");
                String classs=rs.getString("class");
                String stream=rs.getString("stream");
                
                
                
                
                
                
                
                
                
                
            }
        
                
        
}
catch(SQLException se){
      
      se.printStackTrace();
   }catch(Exception e){
      
      e.printStackTrace();
   }finally{
      
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }



		JFrame home=new JFrame("home");
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		home.setSize(500,500);


		JButton bmeanForm1=new JButton("form1");
		JButton bmeanForm2=new JButton("form2");
		JButton bmeanForm3=new JButton("form3");
		JButton bmeanForm4=new JButton("form4");
		JButton bresultsForm1=new JButton("form1");
		JButton bresultsForm2=new JButton("form 2");
		JButton bresultsForm3=new JButton("form 3");
		JButton bresultsForm4=new JButton("form 4");
		JLabel mean=new JLabel("view mean");
		JLabel ranked=new jlabel("view resilts per class");
		mean.setBounds(50, 50, 200, 30);
		rank.setBounds(50, 250, 200, 30);
		bmeanForm1.setBounds(50, 100, 80, 30);
		bmeanForm2.setBounds(200, 100, 80, 30);
		bmeanForm3.setBounds(350, 100, 80, 30);
		bmeanForm4.setBounds(500, 100, 80, 30);

		bresultsForm1.setBounds(50, 250, 80, 30);
		bresultsForm2.setBounds(200, 250, 80, 30);
		bresultsForm3.setBounds(350, 250, 80, 30);
		bresultsForm4.setBounds(500, 250, 80, 30);


		home.add(bmeanForm2);

		home.add(bmeanForm1);
		home.add(bmeanForm3);
		home.add(bmeanForm4);
		home.add(bresultsForm1);
		home.add(bresultsForm2);
		home.add(bresultsForm3);
		home.add(bresultsForm4);
		home.add(mean);
		home.add(ranked);


		bAdd.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                    	JFrame results=new JFrame("home");
						home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						home.setSize(500,500);

jTable1 rt = new javax.swing.JTable();

jTable1.setModel(new javax.swing.table.DefaultTableModel(
    new Object [37][]= {
        
    }
    new String [] {
        "admission", "mathematics1", "mathematics2", "mathematics2", "mathematics3", "mathematics3", "english1", "english3", "kiswahili1", "kiswahili2", "kiswahili3", "biology1", "biology2", "Biology3", "chemistry1", "chemistry2", "chemistry2", "chemistry3", "physics1", "physics2", "physics3", "history1", "history2" , "history3" , "geography1", "geography2", "geography3", "cre1", "cre2", "cre3", "business1", "business2", "business3", "computer1", "computer2","computer3"
    }
));

jScrollPane1.setViewportView(jTable1);



                    }}
                    );





	}
	public static void main (String[] args){
		//school connect=new school();
		//school.getData();
		startPage();
         	


//startPage();

	}}