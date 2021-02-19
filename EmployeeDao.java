package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.model.Employee;

public class EmployeeDao {

	private JdbcTemplate jdbctemp;

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	public int saveEmployee(Employee e)
	{
		String sql="insert into springemployee values("
	+e.getEid()+",'"+e.getEname()+"',"+e.getSalary()+")";
		return jdbctemp.update(sql);
	}

	//prepared styatement
	public Boolean saveEmployeeByPS(Employee e)
	{
		String sql="insert into springemployee values(?,?,?)";
		return  jdbctemp.execute(sql,new PreparedStatementCallback<Boolean>(){

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, e.getEid());
				ps.setString(2, e.getEname());
				ps.setDouble(3, e.getSalary());
				return ps.execute();
			}
		});
	}
	
	//retrieving data from database
	public List<Employee> getEmployees()
	{
		String sql = "select * from springemployee";
		ResultSetExtractor rse = new ResultSetExtractor() {

			@Override
			public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				List<Employee> list = new ArrayList<>();
				while(rs.next())
				{
					list.add(new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
					
				}
				return list;	
			}
		};
		return (List<Employee>) jdbctemp.query(sql,rse);
		
	}
	
	//deleting operation....
	public int UpdateEmployee(Employee e)
	{
		String sql="update springemployee set ename='"+e.getEname()+"',salary='"+e.getSalary()+"' where eid='"+e.getEid()+"' "; 

		return jdbctemp.update(sql);	
	}
	
	public int DeleteEmployee(Employee e)
	{  
	    String sql="delete from springemployee where eid='"+e.getEid()+"' ";  
	    return jdbctemp.update(sql);  
	}  
}
