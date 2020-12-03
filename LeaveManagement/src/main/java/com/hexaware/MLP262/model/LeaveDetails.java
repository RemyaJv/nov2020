package com.hexaware.MLP262.model;

import java.util.Objects;
import java.util.Date;

/**
* Leave class to store all leave details.
* @author hexware
*/
public class LeaveDetails {
/**
* leaveId to store leave Id.
*/    
private int leaveId;
/**
* numberOfDays to store number of days of availed leave.
*/
private int numberOfDays;
/**
* empId to store employee Id.
*/
private int  empId;
/**
* startDate to store starting date.
*/
private Date startDate;
/**
* endId to store ending date.
*/
private Date endDate;
/**
* leaveType to store type of leave.
*/
private LeaveType leaveType;
/**
* leaveStatus to store status of availed leave.
*/
private LeaveStatus leaveStatus;
/**
* leaveReason to store reason for the leave.
*/
private String leaveReason;
    
public final int getLeaveId() {
    return leaveId;
}
public final void setLeaveId(final int argLeaveId) {
    this.leaveId = argLeaveId;
}
public final int getNumberOfDays() {
    return numberOfDays;
}
public final void setNumberOfDays(final int argNumberOfDays) {
    this.numberOfDays = argNumberOfDays;
}
public final int getEmpId() {
    return empId;
}
public final void setEmpId(final int argEmpId) {
    this.empId = argEmpId;
}
public final Date getStartDate() {
    return startDate;
}
public final void setStartDate(final Date argStartDate) {
    this.startDate = argStartDate;
}
public final Date getEndDate() {
    return endDate;
}
public final void setEndDate(final Date argEndDate) {
    this.endDate = argEndDate;
}
public final LeaveType getLeaveType() {
    return leaveType;
}
public final void setLeaveType(final LeaveType argLeaveType) {
    this.leaveType = argLeaveType;
}
public final LeaveStatus getLeaveStatus() {
    return leaveStatus;
}
public final void setLeaveStatus(final LeaveStatus argLeaveStatus) {
    this.leaveStatus = argLeaveStatus;
}
public final String getLeaveReason() {
    return leaveReason;
}
public final void setLeaveStatus(final String argLeaveReason) {
    this.leaveReason = argLeaveReason;
}

/**
 * @param argLeaveId to initialize Leave Id.
 * @param argNumberOfDays to initialize number of days.
 * @param argEmpId to initialize employee Id.
 * @param argStartDate to initialize starting date.
 * @param argEndDate to initialize ending date.
 * @param argLeaveType to initialize leave type.
 * @param argLeaveStatus to initialize leave status.
 * @param argLeaveReason to initialize reason for the leave.
 * used to get details through constructor.
 */

  public LeaveDetails() {

  }
  public LeaveDetails(int argLeaveId, int argNumberOfDays,
        int argEmpId, Date argStartDate, Date argEndDate,
        LeaveType argLeaveType, LeaveStatus argLeaveStatus,
        String argLeaveReason) {
    this.leaveId = argLeaveId;
    this.numberOfDays = argNumberOfDays;
    this.empId = argEmpId;
    this.startDate = argStartDate;
    this.endDate = argEndDate;
    this.leaveType = argLeaveType;
    this.leaveStatus = argLeaveStatus;
    this.leaveReason = argLeaveReason;
  }
 
  @Override
  public String toString() {
      return String.format("%10d %10d %10d %10d %10d %10s %10s %10s",
        leaveId, numberOfDays, empId, startDate, endDate, leaveType, leaveStatus, leaveReason);
      
  }

}