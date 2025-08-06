package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket {

	public static int checkNumber(String msg) {
		Scanner s = new Scanner(System.in);
		int input = 0;
		while (true) {
			System.out.print(msg + " : ");
			input = s.nextInt();

			if (msg.equals("가격")) {
				if (input % 100 != 0) {
					System.out.println("가격은 100단위로 입력해 주세요 ");
					continue;
				}
			}
			if (input <= 0) {
				System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
			} else
				break;

		}

		return input;
	}

	public static HashMap<String, Object> searchFruit(String fruitName, ArrayList<HashMap<String, Object>> list) {

		for (int i = 0; i < list.size(); i++) {
			if (fruitName.equals(list.get(i).get("fruitName"))) {
				return list.get(i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 과일가게 프로그램
		// 메뉴 1. 과일명, 가격, 개수 추가(map)한후 list에 담기
		// 메뉴 2. 과일명을 이볅받고 해당 과일명의 가격, 개수 출력
		// 만약 없는 과일명이면 '해당 과일이 존재하지 않습니다' 출력
		// 메뉴 3. 과일명과 개수를 입력받아서 해당 과일명의 개수에서 차감
		// 'oo개가 판매되었습니다.' 출력
		// 먼역 없는 과일이면 '해당 과일이 존재하지 않습니다' 출력
		// 메뉴 -1. 종료되었습니다 출력후 프로그램 종료

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("======= 과일가게 프로그램 =======");
		while (true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 판매 (4) 가격수정 (-1) 종료 ] : ");
			int menu = s.nextInt();

			if (menu == 1) {
				System.out.print("과일명 : ");
				String fruitName = s.next();
				HashMap<String, Object> fruit = searchFruit(fruitName, list);
				if (fruit == null) {
					fruit = new HashMap<String, Object>();
					fruit.put("fruitName", fruitName);
					fruit.put("price", checkNumber("가격"));
					fruit.put("count", checkNumber("개수"));
					list.add(fruit);
				} else {
					int sum = (int) fruit.get("count") + checkNumber("개수");
					fruit.put("count", sum);
				}
//				HashMap<String, Object> fruit = new HashMap<>();
//				boolean searchFlg = false;
//				System.out.print("과일명 : ");
//				String fruitName = s.next();
//				for (int i = 0; i < list.size(); i++) {
//					if (fruitName.equals(list.get(i).get("fruitName"))) {
//						searchFlg = true;
//						System.out.print("개수 : ");
//						int count = s.nextInt();
//						list.get(i).put("count", count + (int) list.get(i).get("count"));
//
//					}
//				}
//				if (!searchFlg) {
//					fruit.put("fruitName", fruitName);
//					System.out.print("가격 : ");
//					int price = s.nextInt();
//					if (price < 0) {
//						System.out.println("0보다 큰 값을 입력해주세요");
//						continue;
//					} else if (price % 100 != 0) {
//						System.out.println("가격은 100단위로 입력해주세요");
//						continue;
//					}
//					fruit.put("price", price);
//
//					System.out.print("개수 : ");
//					int count = s.nextInt();
//					if (count < 0) {
//						System.out.println("0보다 큰 값을 입력해주세요");
//						continue;
//					}
//					fruit.put("count", count);
//					list.add(fruit);
//				}

			} else if (menu == 2) {
				System.out.print("검색할 과일명 : ");
				String fruitName = s.next();

				HashMap<String, Object> fruit = searchFruit(fruitName, list);
				if (fruit == null) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				} else {
					System.out.print("가격 : " + fruit.get("price") + ", ");
					System.out.println("개수 : " + fruit.get("count") + "개");
				}

//				boolean searchFlg = false;
//				for (int i = 0; i < list.size(); i++) {
//					if (list.get(i).get("fruitName").equals(fruitName)) {
//						searchFlg = true;
//						System.out.print("가격 : " + list.get(i).get("price") + ", ");
//						System.out.println("개수 : " + list.get(i).get("count") + "개");
//					}
//				}
//				if (!searchFlg) {
//					System.out.println("해당 과일이 존재하지 않습니다.");
//				}

			} else if (menu == 3) {
				System.out.print("검색할 과일명 : ");
				String fruitName = s.next();
				
				HashMap<String, Object> fruit = searchFruit(fruitName, list);
				if (fruit == null) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				} else {
					System.out.print("판매할 개수 : ");
					int sellCount = s.nextInt();
					if((int) fruit.get("count") < sellCount) {
						System.out.println("판매 가능한 개수는 " + fruit.get("count") + "개 입니다.");
						continue;
					}
					fruit.put("count", (int) fruit.get("count") - sellCount);	
				}

//				boolean searchFlg = false;
//				for (int i = 0; i < list.size(); i++) {
//					if (list.get(i).get("fruitName").equals(fruitName)) {
//						searchFlg = true;
//						System.out.print("판매할 개수 : ");
//						int sellCount = s.nextInt();
//						if ((int) list.get(i).get("count") < sellCount) {
//							System.out.println("판매 가능한 개수는 " + list.get(i).get("count") + "개 입니다.");
//							break;
//						}
////						int count = (int)list.get(i).get("count") - sellCount;
//						list.get(i).put("count", (int) list.get(i).get("count") - sellCount);
//					}
//				}
//				if (!searchFlg) {
//					System.out.println("해당 과일이 존재하지 않습니다.");
//				}

			} else if (menu == 4) {
				System.out.print("가격을 수정할 과일명 : ");
				String fruitName = s.next();
				boolean searchFlg = false;

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).get("fruitName").equals(fruitName)) {
						searchFlg = true;
						list.get(i).put("price", checkNumber("수정할 가격"));
					}
				}
				if (!searchFlg) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				}

			} else if (menu == -1) {
				System.out.println("종료되었습니다");
				break;
			} else {

			}
		}
	}

}
