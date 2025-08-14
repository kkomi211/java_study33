package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserSystem_RE {
	static String ID = "";
	static boolean login = false;
	static DBClass db = new DBClass();
	static Scanner s = new Scanner(System.in);

	public static ResultSet sqlSelect(String id) throws SQLException {
		String sql = "SELECT * FROM TBL_USER WHERE USERID = '" + id + "'";
		ResultSet rs = db.stmt.executeQuery(sql);
		return rs;

	}

	public static String checkID(int num) throws SQLException {
		while (true) {
			System.out.print("아이디 입력 : ");
			String obj = s.next();

			String sql = "SELECT * FROM TBL_USER WHERE USERID = '" + obj + "'";
			ResultSet rs = db.stmt.executeQuery(sql);

			if (num == 1) {
				if (rs.next()) {
					System.out.println("아이디가 중복됩니다! 다시 입력해주세요!");
					continue;
				}
			} else {
				if (!rs.next()) {
					System.out.println("없는 아이디 입니다!");
					return "false";
				}
			}
			return obj;
		}

	}

	public static void join() throws SQLException {
		while (true) {
			String id = checkID(1);

			System.out.print("비밀번호 입력 : ");
			String password = s.next();

			System.out.print("이름 입력 : ");
			String name = s.next();

			String sql = "INSERT INTO TBL_USER VALUES ('" + id + "', '" + password + "', '" + name + "', " + null + ", "
					+ null + ", " + "SYSDATE)";

			int num = db.stmt.executeUpdate(sql);
			if (num > 0) {
				System.out.println("회원가입이 완료되었습니다~");
				break;
			} else {
				System.out.println("오류로 인해 회원가입 실패");
				continue;
			}
		}
	}

	public static void login() throws SQLException {
		String id = checkID(2);
		if (id.equals("false"))
			return;

		System.out.print("비밀번호 입력 : ");
		String password = s.next();

		ResultSet rs = sqlSelect(id);
		if (rs.next()) {
			if (rs.getString("PASSWORD").equals(password)) {
				System.out.println("로그인 성공!");
				ID = id;
				login = true;
			} else {
				System.out.println("비밀번호를 확인해주세요");
			}
		} else {
			System.out.println("비밀번호를 확인해주세요");
		}
	}

	public static void pwdUpdate() throws SQLException {
		System.out.print("수정할 비밀번호를 입력해 주세요 : ");
		String password = s.next();

		String sql = "UPDATE TBL_USER SET PASSWORD = '" + password + "' WHERE USERID = '" + ID + "'";

		int num = db.stmt.executeUpdate(sql);
		if (num > 0) {
			System.out.println("비밀번호가 수정되었습니다");
		} else {
			System.out.println("비밀번호 수정 실패");
		}
	}

	public static void userInfo() throws SQLException {
		ResultSet rs = sqlSelect(ID);

		if (rs.next()) {
			String id = rs.getString("USERID");
			String name = rs.getString("NAME");
			String cdatetime = rs.getString("CDATETIME");

			System.out.println("아이디 : " + id);
			System.out.println("이름 : " + name);
			System.out.println("가입날짜 : " + cdatetime);
		} else
			System.out.println("오류 발생");
	}

	public static void userDel() throws SQLException {
		System.out.println("정말 탈퇴하시겠습니까? 진심이면 Y를 입력하세요");
		String del = s.next();
		if (!del.equals("Y")) {
			return;
		}
		String sql = "DELETE TBL_USER WHERE USERID = '" + ID + "'";
		int num = db.stmt.executeUpdate(sql);

		if (num > 0) {
			System.out.println("아이디가 삭제되었습니다");
			login = false;
		} else {
			System.out.println("아이디 삭제 실패");
		}
	}

	public static void main(String[] args) throws SQLException {
		while (true) {
			if (!login) {
				System.out.println("회원가입을 하시려면 1, 로그인을 하시려면 2를 입력해 주세요");
				int first = s.nextInt();
				if (first == 1) {
					join();
				}
				if (first == 2) {
					login();

				} else {
					System.out.println("프로그램 종료");
					break;
				}
			} else {
				System.out.println(ID + " 회원님 로그인 중");
				System.out.print("| 비밀번호 수정: 3 | 정보 확인: 4 | 탈퇴: 5 | : ");
				int after = s.nextInt();
				if (after == 3) {
					pwdUpdate();
				} else if (after == 4) {
					userInfo();
				} else if (after == 5) {
					userDel();
				} else {
					System.out.println("프로그램 종료");
					break;
				}

			}

		}
	}

}
