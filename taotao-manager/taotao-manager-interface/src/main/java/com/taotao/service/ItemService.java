package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	
	TbItem getitembuid(long itemId);
	
	EasyUIDataGridResult getItemlist(int page,int rows);

}
