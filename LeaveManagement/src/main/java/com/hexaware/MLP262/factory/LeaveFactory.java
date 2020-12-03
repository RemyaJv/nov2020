package com.hexaware.MLP262.factory;
import com.hexaware.MLP262.persistance.DbConnection;
import com.hexaware.MLP262.model.LeaveDetails;
import com.hexaware.MLP262.model.LeaveType;
import com.hexaware.MLP262.model.LeaveStatus;
import com.hexaware.MLP262.persistance.LeaveDAO;
import java.util.List;


public class LeaveFactory {

    private static LeaveDAO dao() {
        DbConnection db = new DbConnection();
        return db.getConnect().onDemand(LeaveDAO.class);
    }

    public static LeaveDetails[] showLeave() {
        List<LeaveDetails> leaves = dao().show();
        return leaves.toArray(new LeaveDetails[leaves.size()]);

    }

    /**public static String addAgent(Agent agent) {
        dao().insertAgent(agent);
        return "Record Inserted Successfully...";
    }*/


    public static LeaveDetails searchLeave(int leaveId) {
        LeaveDetails leave = dao().show(leaveId);
        return leave;

    }
}