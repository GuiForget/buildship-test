package test.api;

import test.impl.UsefulServiceImpl;
import test.model.CoolObject;
import test.service.UsefulService;

public class Application {

	public static void main(String[] args) {

		UsefulService service = new UsefulServiceImpl();
		CoolObject o = new CoolObject();
		service.doSomething(o);

	}

}
