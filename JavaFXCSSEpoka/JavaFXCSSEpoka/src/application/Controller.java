package application;
import java.io.IOException;
import java.sql.*;

import javafx.event.ActionEvent; 
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class Controller {
	@FXML
		private Stage sg; 
		private Scene sc; 
		private Parent pr;
		@FXML
		private TextField finaltext;
		@FXML
		private TextField midterm12;	
		@FXML
		private TextField final12;
		@FXML
		private TextField hw12;
		@FXML
		private Button Button1;
		@FXML
		int grade1;
		@FXML
		int grade2;
		@FXML
		int grade3;
		@FXML
		String letter;
		@FXML
		private TextField finaltext2;
		@FXML
		private TextField midterm22;	
		@FXML
		private TextField final22;
		@FXML
		private TextField hw22;
		
		@FXML
		int grade7;
		@FXML
		int grade8;
		@FXML
		int grade9;
		@FXML
		String letter2;
		@FXML
		private TextField finaltext22;
		@FXML
		private TextField midterm32;	
		@FXML
		private TextField final32;
		@FXML
		private TextField hw32;
		
		@FXML
		int grade4;
		@FXML
		int grade5;
		@FXML
		int grade6;
		@FXML
		String letter1;
		
		@FXML
		private Button Button2;
		@FXML
		private TextField firstn;
		@FXML
		private TextField lname;
		@FXML
		private TextField ID;
		@FXML
		private TextField dep;
		@FXML
		private TextField prog;
		@FXML
		private TextField CGPA;
		@FXML
		private TextField place;
		@FXML
		private TextField country;
		@FXML
		private TextField birth;
		@FXML
		private TextField ffname;
		@FXML
		private TextField mmname;
		@FXML
		private TextField st;
		
		@FXML
		String letter0;
		String letter01;
		String letter02;
		String letter03;
		String letter04;
		String letter05;
		String letter06;
		String letter07;
		String letter08;
		String letter09;
		String letter31;
		String letter32;
		
		@FXML 
		private TextField course1;
		@FXML 
		private TextField course2;
		@FXML 
		private TextField course3;
		@FXML 
		private TextField old1;
		@FXML 
		private TextField old2;
		@FXML 
		private TextField old3;
		
		public void submit2(ActionEvent Event) {
			letter0=firstn.getText();
		 	System.out.println(letter0);
		 	letter01=lname.getText();
		 	System.out.println(letter01);
		 	letter02=ID.getText();
		 	System.out.println(letter02);
		 	letter03=dep.getText();
		 	System.out.println(letter03);
		 	letter04=prog.getText();
		 	System.out.println(letter04);
		 	letter05=CGPA.getText();
		 	System.out.println(letter05);
		 	letter06=place.getText();
		 	System.out.println(letter06);
		 	letter07=country.getText();
		 	System.out.println(letter07);
		 	letter08=birth.getText();
		 	System.out.println(letter08);
		 	letter09=ffname.getText();
		 	System.out.println(letter09);
		 	letter31=mmname.getText();
		 	System.out.println(letter31);
		 	letter32=st.getText();
		 	System.out.println(letter32);
		 	
		}
		@FXML
		private TextField F1;
		
		@FXML
		private Button Button3;
		@FXML
		private TextField name;
		@FXML
		private TextField lastname;
		@FXML
		private TextField birthday;
		@FXML
		private TextField birthplace;
		@FXML
		private TextField fname;
		@FXML
		private TextField mname;
		@FXML
		private TextField id;
		@FXML
		private TextField course;
		@FXML
		private TextField year;
		@FXML
		private TextField semester;
		@FXML
		private TextField date;
		@FXML
		private TextField status;
		@FXML
		private TextField cgpa;
		
		String letter11;
		String letter12;
		String letter13;
		String letter14;
		String letter15;
		String letter16;
		String letter17;
		String letter18;
		String letter19;
		String letter20;
		String letter21;
		String letter22;
		String letter23;
		
		
		
		
		
		public void submit3(ActionEvent e) {
//			letter11=name.getText();
//		 	System.out.println(letter11);
//		 	letter12=lastname.getText();
//		 	System.out.println(letter12);
//		 	letter13=birthday.getText();
//		 	System.out.println(letter13);
//		 	letter14=birthplace.getText();
//		 	System.out.println(letter14);
//		 	letter15=fname.getText();
//		 	System.out.println(letter15);
//		 	letter16=mname.getText();
//		 	System.out.println(letter16);
//		 	letter17=id.getText();
//		 	System.out.println(letter17);
//		 	letter18=course.getText();
//		 	System.out.println(letter18);
//		 	letter19=year.getText();
//		 	System.out.println(letter19);
//		 	letter20=semester.getText();
//		 	System.out.println(letter20);
//		 	letter21=date.getText();
//		 	System.out.println(letter21);
//		 	letter22=status.getText();
//		 	System.out.println(letter22);
//		 	letter23=cgpa.getText();
//		 	System.out.println(letter23);
				String name1 = name.getText();
				String lastname1 = lastname.getText();
				String birthday1 = birthday.getText();
				String birthplace1 = birthplace.getText();
				String fname1 = fname.getText();
				String mname1 = mname.getText();
				int id1 = Integer.parseInt(id.getText());
				String course1 = course.getText();
				int year1 = Integer.parseInt(year.getText());
				String semester1 = semester.getText();
				String date1 = date.getText();
				String status1 = status.getText();
				String cgpa1 = cgpa.getText();
 				insertStudentInfo(name1,lastname1,birthday1,birthplace1, fname1, mname1 , id1, course1, year1 , semester1, date1, status1, cgpa1);
			}
			
			private void insertStudentInfo(String name1, String lastname1 ,String birthday1, String birthplace1, String fname1 , String mname1, int id1,
					String course1, int year1 , String semester1 , String date1 , String status1 , String cgpa1 ) {
				Connection conn = null;
				PreparedStatement st = null; 
				
				try {
				
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epokainfo","root", "anjezadurres2003");
				
					st = conn.prepareStatement("INSERT INTO epokainfo.nxenesinfo (name, lastname, birthday ,birthplace, fname, mname, id ,course , year,semester ,date ,status ,cgpa) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");			
					st.setString(1,name1);
					st.setString(2,lastname1);
					st.setString(3,birthday1);
					st.setString(4,birthplace1);
					st.setString(5,fname1);
					st.setString(6,mname1);
					st.setInt(7,id1);
					st.setString(8,course1);
					st.setInt(9,year1);
					st.setString(10,semester1);
					st.setString(11,date1);
					st.setString(12,status1);
					st.setString(13,cgpa1);

					
					System.out.println("Emri eshte: "+ name1 + " \nMbiemri eshte: "
					+ lastname1 + " \nbirthday: " + birthday1 + " \nbirthplace eshte: "
					+ birthplace1 + " \nfname: " + fname1 );
					st.executeUpdate();
					
				} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							try {
								if (st != null) {
									st.close();	
								}
								if (conn != null) {
						conn.close();
								}
							} catch (SQLException e) {
					e.printStackTrace();
					}
					
				}
			
			
		}
		
		
			
			
			
		public void submit(ActionEvent e) {
			
			 	grade1=Integer.parseInt(midterm12.getText());
			 	System.out.println(grade1);
			 	grade2=Integer.parseInt(final12.getText());
			 	System.out.println(grade2);
			 	grade3=Integer.parseInt(hw12.getText());
			 	System.out.println(grade3);
			 	double average=(double)(0.35*grade1)+(0.45*grade2)+(0.2*grade3);
				System.out.println(average);
			 	if(average>=90 && average<=100) {
			 		letter="AA";
			 	}
			 	else if(average<90 && average>=85) {
			 		letter="BA";
			 	}
			 	else if(average<85 && average>=80) {
			 		letter="BB";
			 	}
			 	else if(average<80 && average>=75) {
			 		letter="CB";
			 	}
			 	else if(average<75 && average>=70) {
			 		letter="CC";
			 	}
			 	else if(average<70 && average>65) {
			 		letter="DC";
			 	}
			 	else if(average<65 && average>=60) {
			 		letter="DD";	
			 	}
			 	else {
			 	
			 		letter="FF";
			 		
			 	}	 
			 	finaltext.setText(letter);
			 
			 	
			 	grade4=Integer.parseInt(midterm22.getText());
			 	System.out.println(grade4);
			 	grade5=Integer.parseInt(final22.getText());
			 	System.out.println(grade5);
			 	grade6=Integer.parseInt(hw22.getText());
			 	System.out.println(grade6);
			 	double average1=(double)(0.35*grade4)+(0.45*grade5)+(0.2*grade6);
			 	System.out.println(average1);
				if(average1>=90 && average1<=100) {
			 		letter1="AA";
			 	}
			 	else if(average1<90 && average1>=85) {
			 		letter1="BA";
			 	}
			 	else if(average1<85 && average1>=80) {
			 		letter1="BB";
			 	}
			 	else if(average1<80 && average1>=75) {
			 		letter1="CB";
			 	}
			 	else if(average1<75 && average1>=70) {
			 		letter1="CC";
			 	}
			 	else if(average1<70 && average1>65) {
			 		letter1="DC";
			 	}
			 	else if(average1<65 && average1>=60) {
			 		letter1="DD";	
			 	}
			 	else {
			 		letter1="FF";
			 	}
				finaltext2.setText(letter1);
				
				
				
				grade7=Integer.parseInt(midterm32.getText());
			 	System.out.println(grade7);
			 	grade8=Integer.parseInt(final32.getText());
			 	System.out.println(grade8);
			 	grade9=Integer.parseInt(hw32.getText());
			 	System.out.println(grade9);
			 	double average2=(double)(0.35*grade7)+(0.45*grade8)+(0.2*grade9);
				System.out.println(average2);
			 	if(average2>=90 && average2<=100) {
			 		letter2="AA";
			 	}
			 	else if(average2<90 && average2>=85) {
			 		letter2="BA";
			 	}
			 	else if(average2<85 && average2>=80) {
			 		letter2="BB";
			 	}
			 	else if(average2<80 && average2>=75) {
			 		letter2="CB";
			 	}
			 	else if(average2<75 && average2>=70) {
			 		letter2="CC";
			 	}
			 	else if(average2<70 && average2>65) {
			 		letter2="DC";
			 	}
			 	else if(average2<65 && average2>=60) {
			 		letter2="DD";	
			 	}
			 	else {
			 		letter2="FF";
			 	}	 
			 	finaltext22.setText(letter2);
			 	
			 	
				
				
				int nota1 = Integer.parseInt(midterm12.getText());
				int nota2 = Integer.parseInt(final12.getText());
				int nota3 = Integer.parseInt(hw12.getText());
				int nota4 = Integer.parseInt(midterm22.getText());
				int nota5 = Integer.parseInt(final22.getText());
				int nota6 = Integer.parseInt(hw22.getText());
				int nota7 = Integer.parseInt(midterm32.getText());
				int nota8 = Integer.parseInt(final32.getText());
				int nota9 = Integer.parseInt(hw32.getText());
 				insertNotaInfo(nota1, nota2 , nota3 , nota4, nota5 , nota6 , nota7 , nota8 , nota9);
			}
			
			private void insertNotaInfo(int nota1, int nota2 , int nota3 , int nota4, int nota5 , int nota6 , int nota7, int nota8, int nota9 ) {
				Connection conn = null;
				PreparedStatement st = null; 
				
				try {
				
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epokainfo","root", "anjezadurres2003");
				
					st = conn.prepareStatement("INSERT INTO epokainfo.notat (mterm12, final12, hw12 ,mterm22, final22, hw22, mterm32, final32, hw32) VALUES(?,?,?,?,?,?,?,?,?)");			
					st.setInt(1,nota1);
					st.setInt(2,nota2);
					st.setInt(3,nota3);
					st.setInt(4,nota4);
					st.setInt(5,nota5);
					st.setInt(6,nota6);
					st.setInt(7,nota7);
					st.setInt(8,nota8);
					st.setInt(9,nota9);


					System.out.println("nota1 " + nota1 + "\n nota2 " + nota2);
					st.executeUpdate();
					
				} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							try {
								if (st != null) {
									st.close();	
								}
								if (conn != null) {
						conn.close();
								}
							} catch (SQLException e) {
					e.printStackTrace();
					}
					
				}
			
			 	
			 	
		}
	
		
		
		public void loginwithepokamail(ActionEvent e) throws IOException{
			 pr = FXMLLoader.load(getClass().getResource("Home.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();	
			 }
		
		public void greenLogin(ActionEvent e) throws IOException {
			 pr = FXMLLoader.load(getClass().getResource("Home.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
			 
		}
		public void profilelog(ActionEvent e) throws IOException {
			
			 pr = FXMLLoader.load(getClass().getResource("Profile.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
		}
		public void Courselog(ActionEvent e) throws IOException {
			
			 pr = FXMLLoader.load(getClass().getResource("Course.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
		}
		public void Interimlog(ActionEvent e) throws IOException {
			
			 pr = FXMLLoader.load(getClass().getResource("InterimGrades.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
		}
		
		public void Transcriptlog(ActionEvent e) throws IOException {
			
			 pr = FXMLLoader.load(getClass().getResource("Transcript.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
		}
		public void Syllabus(ActionEvent e) throws IOException {
			
			 pr = FXMLLoader.load(getClass().getResource("Syllabus.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
		}
		public void Syllabus1(ActionEvent e) throws IOException {
			 pr = FXMLLoader.load(getClass().getResource("Syllabus.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
		}
		public void Syllabus2(ActionEvent e) throws IOException {
			
			 pr = FXMLLoader.load(getClass().getResource("Syllabus.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
		}
		public void categories(ActionEvent e) {
			
			 String text1 = course1.getText();
			 String text2 = course2.getText();
			 String text3 = course3.getText();
			 String text4 = old1.getText();
			 String text5 = old2.getText();
			 String text6 = old3.getText();
				insertCourseInfo(text1, text2, text3, text4 , text5 , text6);
			}
			
			private void insertCourseInfo(String text1, String text2, String text3, String text4 , String text5 , String text6) {
				Connection conn = null;
				PreparedStatement st = null; 	
				
				try {
				
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epokainfo","root", "anjezadurres2003");
				
					st = conn.prepareStatement("INSERT INTO epokainfo.kurset (t1, t2, t3, t4, t5, t6) VALUES(?,?,?,?,?,?)");			
					st.setString(1,text1);
					st.setString(2,text2);
					st.setString(3,text3);
					st.setString(4,text4);
					st.setString(5,text5);
					st.setString(6,text6);
					System.out.println("Course 1 " + text1 );
					st.executeUpdate();
					
				} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							try {
								if (st != null) {
									st.close();	
								}
								if (conn != null) {
						conn.close();
								}
							} catch (SQLException e) {
					e.printStackTrace();
					}
					
				}
			
			 
		}
		
		public void BACK2(ActionEvent e) throws IOException {
			
			 pr = FXMLLoader.load(getClass().getResource("Home.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
		}
		public void BACK3(ActionEvent e) throws IOException {
			
			 pr = FXMLLoader.load(getClass().getResource("Home.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
			 
			
			 
		}
		public void previous(ActionEvent e) throws IOException {
			
			 pr = FXMLLoader.load(getClass().getResource("Home.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
		}
		public void previous1(ActionEvent e) throws IOException {
			
			 pr = FXMLLoader.load(getClass().getResource("InterimGrades.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
		}
		public void previous3(ActionEvent e) throws IOException {
			
			 pr = FXMLLoader.load(getClass().getResource("Home.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show(); 
		}
		public void previous4(ActionEvent e) throws IOException {
			
			 pr = FXMLLoader.load(getClass().getResource("Course.fxml"));
			 sg = (Stage)((Node)e.getSource()).getScene().getWindow();
			 sc = new Scene(pr);	
			 sg.setScene(sc);
			 sg.show();
		}
		
		
}
