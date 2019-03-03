package com.verify;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class PrintingAttendanceSheet extends JInternalFrame implements Printable {
	/***************************************************************************
	 ***      declaration of the private variables used in the program       ***
	 ***************************************************************************/

	//for setting the connection and statement
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;
        
	//for creating the text area
	private JTextArea textArea = new JTextArea();
	//for creating the vector to use it in the print
	private Vector lines;
	public static final int TAB_SIZE = 10;

        
        String myText;
	//constructor of JLibrary
	public PrintingAttendanceSheet(String query, String exam) {
		super("Printing Attendance Sheet", false, true, false, true);
		//for getting the graphical user interface components display area
		Container cp = getContentPane();
		//for setting the font
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 9));
                textArea.setForeground(Color.blue);
                textArea.setBackground(Color.green);
		//for adding the textarea to the container
		cp.add(textArea);

		/***************************************************************
		 * for making the connection,creating the statement and update *
		 * the table in the database. After that,closing the statmenet *
		 * and connection. There is catch block SQLException for error *
		 ***************************************************************/
		try {
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/examination_verification", "root", "");
                    statement=connection.createStatement();
                    
                    String sql = "select * from exam_info where exam_id = '"+exam+"'";
                    resultset = statement.executeQuery(sql);
                    resultset.next();
                    myText = "===Examination Information ============================\n\n";
                    
                    myText += "        Examination ID : "+resultset.getString("exam_id")+"\n";
                    myText += "      Examination Date : "+resultset.getString("exam_date")+"\n";
                    myText += "Examination Start time : "+resultset.getString("start_time")+"\n";
                    myText += "  Examination End Time : "+resultset.getString("end_time")+"\n";
                    myText += "           Course Code : "+resultset.getString("course_code")+"\n";
                    myText += "          Course Title : "+resultset.getString("course_title")+"\n\n\n\n";
                    
                    myText += String.format("%-40s %-15s %-40s %-15s %-15s \n", "Student Name", "Reg. Number", "Course of Student", "Entry Time", "Exit Time");
                    
                    resultset = statement.executeQuery(query);
                    while (resultset.next()) {
                        myText += String.format("%-40s %-15s %-40s %-15s %-15s \n", resultset.getString("fname")+" "+resultset.getString("lname"), resultset.getString("reg_no"), resultset.getString("dept"), resultset.getString("sign_in"), resultset.getString("sign_out"));
                    }
                    
                    //System.out.println(myText);
                    textArea.append(myText);
                    
                    resultset.close();
                    statement.close();
		}
		catch (SQLException SQLe) {
                    System.out.println(SQLe.toString());
		}
		//for setting the visible to true
		setVisible(true);
		//to show the frame
		pack();
	}

	public int print(Graphics pg, PageFormat pageFormat, int pageIndex) throws PrinterException {
		pg.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());
		int wPage = (int) pageFormat.getImageableWidth();
		int hPage = (int) pageFormat.getImageableHeight();
		pg.setClip(0, 0, wPage, hPage);

		pg.setColor(textArea.getBackground());
		pg.fillRect(0, 0, wPage, hPage);
		pg.setColor(textArea.getForeground());

		Font font = textArea.getFont();
		pg.setFont(font);
		FontMetrics fm = pg.getFontMetrics();
		int hLine = fm.getHeight();

		if (lines == null)
			lines = getLines(fm, wPage);

		int numLines = lines.size();
		int linesPerPage = Math.max(hPage / hLine, 1);
		int numPages = (int) Math.ceil((double) numLines / (double) linesPerPage);
		if (pageIndex >= numPages) {
			lines = null;
			return NO_SUCH_PAGE;
		}
		int x = 0;
		int y = fm.getAscent();
		int lineIndex = linesPerPage * pageIndex;
		while (lineIndex < lines.size() && y < hPage) {
			String str = (String) lines.get(lineIndex);
			pg.drawString(str, x, y);
			y += hLine;
			lineIndex++;
		}
		return PAGE_EXISTS;
	}

	protected Vector getLines(FontMetrics fm, int wPage) {
		Vector v = new Vector();

		String text = textArea.getText();
		String prevToken = "";
		StringTokenizer st = new StringTokenizer(text, "\n\r", true);
		while (st.hasMoreTokens()) {
			String line = st.nextToken();
			if (line.equals("\r"))
				continue;
			// StringTokenizer will ignore empty lines, so it's a bit tricky to get them...
			if (line.equals("\n") && prevToken.equals("\n"))
				v.add("");
			prevToken = line;
			if (line.equals("\n"))
				continue;

			StringTokenizer st2 = new StringTokenizer(line, " \t", true);
			String line2 = "";
			while (st2.hasMoreTokens()) {
				String token = st2.nextToken();
				if (token.equals("\t")) {
					int numSpaces = TAB_SIZE - line2.length() % TAB_SIZE;
					token = "";
					for (int k = 0; k < numSpaces; k++)
						token += " ";
				}
				int lineLength = fm.stringWidth(line2 + token);
				if (lineLength > wPage && line2.length() > 0) {
					v.add(line2);
					line2 = token.trim();
					continue;
				}
				line2 += token;
			}
			v.add(line2);
		}
		return v;
	}
}