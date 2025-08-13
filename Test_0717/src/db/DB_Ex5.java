package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DB_Ex5 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// 2. 아이디 비밀번호 이름 성별 나이를 입력받은 후
		// TBL_USER에 저장.(CDATETIME는 현재시간 저장)
		// 단, 아이디 입력시에 이미 테이블에서 사용하는 아이디를 입력할 경우
		// '이미 사용중인 아이디 입니다' 출력 후 다시 입력받도록 함
		DBClass db = new DBClass();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("아디 비번 이름 성별 나이를 입력하세요");
			String id = s.next();
			String check_sql = "SELECT * FROM TBL_USER WHERE USERID = '" + id + "'";
			ResultSet rs = db.stmt.executeQuery(check_sql);
		
			if(rs.next()) {
				System.out.println("이미 사용중인 아이디입니다.");
				continue;
			}
				
			

			String password = s.next();
			String name = s.next();
			String gender = s.next();
			int age = s.nextInt();

			String insert_sql = "INSERT INTO TBL_USER VALUES ('" + id + "', '" + password + "', '" + name + "', '"
					+ gender + "', '" + age + "', SYSDATE)";
			int num = db.stmt.executeUpdate(insert_sql);
			if (num > 0) {
				System.out.println("입력 되었습니다!");
			} else {
				System.out.println("오류 발생");
			}
			break;
		}

	}

}
