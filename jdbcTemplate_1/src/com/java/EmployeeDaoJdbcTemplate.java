package com.java;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoJdbcTemplate {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Map<String, Object> getEmpById(int id) {
		return jdbcTemplate.queryForMap("select * from employee where id=?", id);
	}

	public List<Map<String, Object>> getAllEmp() {
		return jdbcTemplate.queryForList("select * from employee");
	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee values(" + e.getId() + ",'" + e.getName() + "'," + e.getSalary() + ")";
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update employee set name='" + e.getName() + "',salary=" + e.getSalary() + " where id="
				+ e.getId();
		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(int empId) {
		String query = "delete from employee where id=" + empId;
		return jdbcTemplate.update(query);
	}

}
