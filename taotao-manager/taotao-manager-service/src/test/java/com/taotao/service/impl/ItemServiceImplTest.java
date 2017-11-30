package com.taotao.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext-service.xml","classpath:spring/applicationContext-dao.xml"})
public class ItemServiceImplTest {
	
	@Autowired
	private TbItemMapper itemMapper;
	
	@Test
	public void testGetitembuid() {
		Long itemId = 830972L;
		TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
		System.out.println(tbItem);
	}

}
