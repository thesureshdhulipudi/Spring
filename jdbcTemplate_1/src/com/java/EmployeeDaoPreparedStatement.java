package com.java;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDaoPreparedStatement {
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jdbcTemplate) {
		this.jt = jdbcTemplate;
	}

	public Boolean saveEmployeeByPreparedStatement(final Employee e){  
	    String query="insert into employee values(?,?,?)";  
	    return jt.execute(query,new PreparedStatementCallback<Boolean>(){  
	    @Override  
	    public Boolean doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	              
	        ps.setInt(1,e.getId());  
	        ps.setString(2,e.getName());  
	        ps.setFloat(3,e.getSalary());  
	              
	        return ps.execute();  
	              
	    }  
	    });  
	}  

}
