package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.CustomerVO;
import util.DBManager;

public class CustomerDAO {
	private CustomerDAO() {
		
	}
	
	private static CustomerDAO instance = new CustomerDAO();
	
	public static CustomerDAO getInstance() {
		return instance;
	}
	
	public List<CustomerVO> selectAllCustomer(){
		String sql = "select * from customer order by customer_num";
		
		List<CustomerVO> list = new ArrayList<CustomerVO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				CustomerVO cVo = new CustomerVO();
				
				cVo.setCustomer_num(rs.getInt("customer_num"));
				cVo.setName(rs.getString("name"));
				cVo.setId(rs.getString("id"));
				cVo.setPw(rs.getString("pw"));
				cVo.setPhone(rs.getString("phone"));
				cVo.setReg_num(rs.getString("reg_num"));
				cVo.setEmail(rs.getString("email"));
				cVo.setJob(rs.getString("job"));
				
				list.add(cVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, stmt, rs);
		}
		return list;
	}
}
