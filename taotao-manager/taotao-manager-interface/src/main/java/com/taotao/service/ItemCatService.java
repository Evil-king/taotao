package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNode;

public interface ItemCatService {
	//根据父节点ID来查询树形机构，因为是懒加载，即最开始只显示第一级目录，只有当点击下一级目录的时候
	//才会去查询第二级目录的内容
	List<EasyUITreeNode> getItemCatList(long parentId);
}
