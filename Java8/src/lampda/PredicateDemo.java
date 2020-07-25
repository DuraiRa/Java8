package org.cap.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate= (num) -> num>0;
		
		System.out.println(predicate.test(-34));
		System.out.println(predicate.test(34));
		
		Predicate<UserLogin> checkLogin= (user) -> user.getUserName().equals("tom") &&
				user.getUserPassword().equals("tom123");
		
		Predicate<String> checkUser=(str) -> str.equals("tom");
		Predicate<String> checkPwd=(str) -> str.equals("tom123");
		
		
		UserLogin login=new UserLogin("tom", "tom123");
		UserLogin login1=new UserLogin("jack", "jack345");
		
		System.out.println(checkLogin.test(login));
		System.out.println(checkLogin.test(login1));
		
		//and operator
		System.out.println(checkUser.and(checkPwd).test("tom"));
		System.out.println(checkUser.or(checkPwd).test("tom"));
		System.out.println(checkUser.negate().test("tom"));
		
		
		System.out.println("======================================");
		BiPredicate<String, Integer> check= (str,age) -> {
			if(str.length()>4) {
				if(str.startsWith("C")) {
					if (age>=18)
						return true;
				}
			}
			return false;
		};
		
		System.out.println(check.test("Capgemini", 23));
		System.out.println(check.test("Cat", 23));
	}

}
