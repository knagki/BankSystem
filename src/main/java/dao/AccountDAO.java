package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.AccountVO;
import util.DBManager;

public class AccountDAO {
	private AccountDAO() {

	}

	private static AccountDAO instance = new AccountDAO();

	public static AccountDAO getInstance() {
		return instance;
	}
	
	
	public  List<AccountVO> selectAllAccount(){
		String sql = "select * from account order by account_num desc";
		
		List<AccountVO> list = new ArrayList<AccountVO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				AccountVO aVo = new AccountVO();
				
				aVo.setAccount_num(rs.getString("account_num"));
				aVo.setBalance(rs.getInt("balance"));
				aVo.setCustomer_num(rs.getInt("customer_num"));
				
				list.add(aVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, stmt, rs);
		}
		return list;
	}
}
