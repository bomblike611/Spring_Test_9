package com.iu.s9;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SqlTest extends AbstractTest {
	
	@Inject
	private SqlSession SqlSession;
	
	@Test
	public void test() {
		assertNotNull(SqlSession);
	}

}
