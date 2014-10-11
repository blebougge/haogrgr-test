package com.haogrgr.test.server;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haogrgr.test.dao.BaseMapper;
import com.haogrgr.test.dao.TestMapper;
import com.haogrgr.test.model.TestModel;

@Service
public class TestService extends BaseServiceSupport<TestModel> {

	@Resource
	private TestMapper testMapper;

	@Override
	public BaseMapper<TestModel> getMapper() {
		return testMapper;
	}

}