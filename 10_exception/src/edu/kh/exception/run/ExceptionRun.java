package edu.kh.exception.run;

import edu.kh.exception.model.service.ExceptionService;
import edu.kh.exception.model.service.UserException;

public class ExceptionRun {

	public static void main(String[] args) {

		ExceptionService a = new ExceptionService();
		a.ex1();
		new ExceptionService().ex2();
		new ExceptionService().ex3();
		new ExceptionService().ex4();

		try {
			new ExceptionService().ex5();

		} catch (UserException e) {

			System.out.println(1);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
