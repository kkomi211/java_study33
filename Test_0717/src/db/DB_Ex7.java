package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Ex7 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBClass db = new DBClass();
		String sql = "SELECT * "
				+ "FROM EMP E "
				+ "INNER JOIN ("
				+ "    SELECT ENAME, DNAME "
				+ "    FROM EMP E "
				+ "    INNER JOIN DEPT D ON E.DEPTNO = D.DEPTNO "
				+ "    WHERE ENAME = 'ALLEN'"
				+ ") T ON T.ENAME = E.ENAME'";
		
		ResultSet rs = db.stmt.executeQuery(sql);
		
		while(rs.next()) {
			String job = rs.getString("JOB");
			String deptno = rs.getString("DEPTNO");
			
			System.out.println(job +"\t" + deptno);
		}
		
	}

}
