package review_final;

public class Review5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 30, 170.5);
		hong.eat();
		Student kim = new Student("김철수", 25, 180.3, 1234);
		Student kim2 = new Student("김철수", 25, 180.3, 1234);
		kim.eat();
		kim.study();
		
		Person p[] = new Person[3];
		p[0] = hong;
		p[1] = kim;
		
		Student s[] = new Student[3];
//		s[0] = (Student) hong;
		s[1] = kim;
		
		System.out.println(kim.equals(kim2));
		
		
		
	}

}
