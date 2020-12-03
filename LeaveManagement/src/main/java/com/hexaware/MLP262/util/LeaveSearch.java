package com.hexaware.MLP262.util;

import java.util.Scanner;
import com.hexaware.MLP262.factory.LeaveFactory;
import com.hexaware.MLP262.model.LeaveDetails;
import com.hexaware.MLP262.model.LeaveType;
import com.hexaware.MLP262.model.LeaveStatus;
import java.util.Date;

public class LeaveSearch {
    public static void main(String[] args) {
        int leaveId;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter LeaveId  ");
        leaveId = sc.nextInt();
        LeaveDetails result = LeaveFactory.searchLeave(leaveId);
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Leave Record Not Found...");
        }
    }
}