package com.maketimecountUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.logging.log4j.message.StringFormattedMessage;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Common {
	public static WebDriver driver;
	public static Properties pro;
	public static FileInputStream fis;
	public static XSSFWorkbook w1;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static FileInputStream filecall() throws Exception {
		pro=new Properties();
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\PropertiesFile\\config.properties");
	return fis;
	}
	public static String userName() throws IOException {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
	w1=new XSSFWorkbook(fis);
	sheet=w1.getSheetAt(0);
	row=sheet.getRow(1);
	cell=row.getCell(0);
	String UserName=cell.getStringCellValue();
	return UserName;
}
	    public static String setPassword() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
		w1=new XSSFWorkbook(fis);
		sheet=w1.getSheetAt(0);
		row=sheet.getRow(1);
		cell=row.getCell(1);
		String Password=cell.getStringCellValue();
		return Password;
		
	}
	    public static String firstName() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
		w1=new XSSFWorkbook(fis);
		sheet=w1.getSheetAt(0);
		row=sheet.getRow(1);
		cell=row.getCell(2);
		String FirstName=cell.getStringCellValue();
		return FirstName;
	}
	    public static String mName() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(3);
        String MiddleName=cell.getStringCellValue();
        return MiddleName;
	    }
	    
	    public static String  lastName() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(4);
        String LastName=cell.getStringCellValue();
        return LastName;
	    	
	    }
	    public static String prefeName() throws Exception {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
          w1=new XSSFWorkbook(fis);
          sheet=w1.getSheetAt(0);
          row=sheet.getRow(1);
          cell=row.getCell(5);
          String PreferredName=cell.getStringCellValue();
          return PreferredName;
	    }
		public static String previName() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(6);
        String PreviousName=cell.getStringCellValue();
        return PreviousName;
		}
		
		public static String MobileNumber() throws Exception {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(7);
        String ContactNoMobile=cell.getStringCellValue();
        return ContactNoMobile;
		}
		
		public static String HomeNumber() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(8);
        String ContactNoHome=cell.getStringCellValue();
        return ContactNoHome;
		}
		
		public static String WorkNumber() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(9);
        String ContactNoWork=cell.getStringCellValue();
        return ContactNoWork;


		}
		public static String DOB() throws Exception {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(10);
        String DOB=cell.getStringCellValue();
        return DOB;
		}
		
		public static String email() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(11);
        String Email=cell.getStringCellValue();
        return Email;
		}
		
		public static String password() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(12);
        String Password=cell.getStringCellValue();
        return Password;
		}
		
		public static String tbd2() throws Exception {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
           w1=new XSSFWorkbook(fis);
           sheet=w1.getSheetAt(0);
           row=sheet.getRow(1);
           cell=row.getCell(13);
           String TBD2=cell.getStringCellValue();
           return TBD2;
		}
		public static String  tbd1() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(14);
            String TBD1=cell.getStringCellValue();
            return TBD1;
            }
		public static String disability() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(15);
            String Disability=cell.getStringCellValue();
            return Disability;
		}
		public static String sexualOri() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
             w1=new XSSFWorkbook(fis);
             sheet=w1.getSheetAt(0);
             row=sheet.getRow(1);
             cell=row.getCell(16);
             String SexualOrientation=cell.getStringCellValue();
             return SexualOrientation;
		}
		public static String tbd3() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(17);
            String TBD3=cell.getStringCellValue();
            return TBD3;
		}
		
		public static String tbd4() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(18);
            String TBD4=cell.getStringCellValue();
            return TBD4;
		}
    
		public static String tbd5() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(19);
            String TBD5=cell.getStringCellValue();
            return TBD5;
            
		}
		
		public static String tbd6() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(20);
            String TBD6=cell.getStringCellValue();
            return TBD6;
            
		}
		public static String tbd7() throws IOException {
	    fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(21);
        String TBD7=cell.getStringCellValue();
        return TBD7;
		}
		public static String tbd8() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(22);
            String TBD8=cell.getStringCellValue();
            return TBD8; 		
		}
		public static String tbd9() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(23);
            String TBD9=cell.getStringCellValue();
            return TBD9;
		}
		public static String tbd10() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(24);
            String TBD10=cell.getStringCellValue();
            return TBD10;
		}
		public static String tbd11() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(25);
            String TBD11=cell.getStringCellValue();
            return TBD11;
		}
		public static String tbd12() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(26);
            String TBD12=cell.getStringCellValue();
            return TBD12;
			
		}
		public static String tbd13() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(27);
            String TBD13=cell.getStringCellValue();
            return TBD13;		
		}
		public static String tbd14() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(28);
            String TBD14=cell.getStringCellValue();
            return TBD14;
		}
		public static String tbd15() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(29);
            String TBD15=cell.getStringCellValue();
            return TBD15;
		}
		public static String tbd16() throws IOException {
			fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
            w1=new XSSFWorkbook(fis);
            sheet=w1.getSheetAt(0);
            row=sheet.getRow(1);
            cell=row.getCell(30);
            String TBD16=cell.getStringCellValue();
            return 	TBD16;
     
		}
public static String pnc() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(31);
    String pnc=cell.getStringCellValue();
    return pnc;
	//Pnc 

}

public static String oypid() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(32);
    String Oypid=cell.getStringCellValue();
    return Oypid;
}
public static String offenderID() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(33);
    String OffenderID=cell.getStringCellValue();
    return OffenderID;
}
public static String pnomis() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(34);
    String Pnomis=cell.getStringCellValue();
    return Pnomis;
	
}
    public static String nicheID() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(35);
    String   NICHEPERSONID=cell.getStringCellValue();
    return NICHEPERSONID;
	
}
public static String other() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(36);
    String Other2=cell.getStringCellValue();
    return Other2;
}
public static String educationtrainingSH() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(37);
    String EducationTrainingStartHours=cell.getStringCellValue();
    return EducationTrainingStartHours;
}

public static String educationTrainSNotes() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(38);
    String EducationTrainingStartNotes=cell.getStringCellValue();
    return EducationTrainingStartNotes;
}
public static String educationTraingEndNote() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
     w1=new XSSFWorkbook(fis);
     sheet=w1.getSheetAt(0);
     row=sheet.getRow(1);
     cell=row.getCell(39);
     String EducationTrainingEndNotes=cell.getStringCellValue();
     return EducationTrainingEndNotes;
}
public static String edutraEndHours() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(40);
    String EducationTrainingEndHours=cell.getStringCellValue();
    return EducationTrainingEndHours;
}
public static String  accmodaStartNotes() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(41);
    String AccommodationStartNotes=cell.getStringCellValue();
    return AccommodationStartNotes;
}

public static String accomatEndNotes() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(42);
    String AccommodationEndNotes=cell.getStringCellValue();
    return AccommodationEndNotes;
}
public static String note() throws IOException {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\MakeTimeCountTodayServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(43);
    String Notes=cell.getStringCellValue();
    return Notes;
}
//Notes



}


























