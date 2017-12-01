package cn.zth.mongodb.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zth.mongodb.dao.MongoGridFsDao;
import cn.zth.mongodb.service.MongoGridFSService;

@Service
public class MongoGridFSServiceImpl implements MongoGridFSService {

	@Autowired
	private MongoGridFsDao mongGridFSDao;

	@Override
	public Object saveFile(byte[] bytes, Map<String, Object> map, String collectionName) throws Exception {
		return mongGridFSDao.saveFile(bytes, map, collectionName);
	}

}
