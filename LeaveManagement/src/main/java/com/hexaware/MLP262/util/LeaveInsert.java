package com.hexaware.MLP262.util;

import java.util.Scanner;
import com.hexaware.MLP262.factory.LeaveFactory;
import com.hexaware.MLP262.model.LeaveDetails;
import com.hexaware.MLP262.model.LeaveType;
import com.hexaware.MLP262.model.LeaveStatus;

public class LeaveInsert {
    public static void main(String[] args) {
        LeaveDetails leave = new LeaveDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter EmpId  ");
        leave.setEmpId(sc.nextInt());
        System.out.println("Enter Number Of Days  ");
        leave.setNumberOfDays(sc.nextInt());
        System.out.println("Enter StartDate  ");
        leave.setStartDate(sc.nextInt());
        System.out.println("Enter EndDate  ");
        leave.setEndDate(sc.nextInt());
        System.out.println("Enter Leave Type  ");
        String s=sc.next();
        if(s.equals("EL")){
            leave.setLeaveType(LeaveType.EL);
        }
        if(s.equals("ML")){
            leave.setLeaveType(LeaveType.ML);
        }
        if(s.equals("PL")){
            leave.setLeaveType(LeaveType.PL);
        }
        System.out.println("Enter Leave Status ");
        String s1=sc.next();
        if(s1.equals("APPROVED")){
            leave.setLeaveType(LeaveStatus.APPROVED);
        }
        if(s1.equals("PENDING")){
            leave.setLeaveType(LeaveStatus.PENDING);
        }
        if(s1.equals("DENIED")){
            leave.setLeaveType(LeaveStatus.DENIED);
        }
        System.out.println("Enter Leave Reason ");
        leave.setString(sc.next());
        System.out.println(LeaveFactory.addLeave(leave));
    }
}