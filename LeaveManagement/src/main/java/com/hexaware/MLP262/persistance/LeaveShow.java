package com.hexaware.MLP262.persistance;

import com.hexaware.MLP262.factory.LeaveFactory;
import com.hexaware.MLP262.model.LeaveDetails;
import com.hexaware.MLP262.model.LeaveType;
import com.hexaware.MLP262.model.LeaveStatus;


public class LeaveShow {
    public static void main(String[] args) {
        LeaveDetails[] result = LeaveFactory.showLeave();
        for(LeaveDetails e : result) {
            System.out.println(e);
        }
    }
}