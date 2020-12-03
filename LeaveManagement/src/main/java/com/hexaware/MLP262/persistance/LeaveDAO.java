package com.hexaware.MLP262.persistance;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import com.hexaware.MLP262.model.LeaveDetails;
import com.hexaware.MLP262.model.LeaveType;
import com.hexaware.MLP262.model.LeaveStatus;
import java.util.List;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;


public interface LeaveDAO {

    @SqlUpdate("INSERT INTO LEAVEMANAGEMENT(Leave_Id,Number_Of_Days ,Employee_Id,Start_Date,End_Date,Leave_Type, Leave_Status,Leave_Reason) VALUES(:leaveId,:numberOfDays,:empId,:startDate,:endDate,:leaveType,:leaveStatus,:leaveReason)")
    int insertAgent(@BindBean LeaveDetails leave);
    
    @SqlQuery("SELECT * FROM LEAVEMANAGEMENT")
    @Mapper(LeaveMapper.class)
    List<LeaveDetails> show();

    @SqlQuery("SELECT * FROM LEAVEMANAGEMENT WHERE Leave_Id=:leaveId")
    @Mapper(LeaveMapper.class)
    LeaveDetails show(@Bind("leaveId") int leaveId);
    
}    