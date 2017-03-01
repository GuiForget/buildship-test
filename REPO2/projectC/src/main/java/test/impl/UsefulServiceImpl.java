package test.impl;

import test.model.CoolObject;
import test.service.UsefulService;

public class UsefulServiceImpl implements UsefulService {

	@Override
	public void doSomething(CoolObject object) {
		System.out.println(object);
	}

}
