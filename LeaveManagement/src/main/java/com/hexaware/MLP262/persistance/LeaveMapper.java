package com.hexaware.MLP262.persistance;

import com.hexaware.MLP262.model.LeaveDetails;
import com.hexaware.MLP262.model.LeaveType;
import com.hexaware.MLP262.model.LeaveStatus;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

public class LeaveMapper implements ResultSetMapper<LeaveDetails> {

    public final LeaveDetails map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Wallet
       */
     
      return new LeaveDetails(rs.getInt("Leave_Id"), 
        rs.getInt("Number_Of_Days"), rs.getInt("Employee_Id"),
        rs.getDate("Start_Date"), rs.getDate("End_Date"),
        LeaveType.valueOf(rs.getString("Leave_Type")),
        LeaveStatus.valueOf(rs.getString("Leave_Status")),
        rs.getString("Leave_Reason")
        );
  }
}