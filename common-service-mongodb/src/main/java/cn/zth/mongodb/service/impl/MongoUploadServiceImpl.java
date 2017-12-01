package cn.zth.mongodb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zth.mongodb.UUIDUtils;
import cn.zth.mongodb.dao.MongoDao;
import cn.zth.mongodb.service.MongoUploadService;

/**
 * @author zth
 *
 */
@Service
public class MongoUploadServiceImpl implements MongoUploadService {

	@Autowired
	private MongoDao mongoDao;

	@Override
	public String createFile(byte[] bytes, String originalFilename, Map<String, Object> map) throws Exception {
		if (map == null) {
			map = new HashMap<>();
		}
		// 重新给file命名
		originalFilename = UUIDUtils.uuid2() + "_" + originalFilename;
		map.put("filename", originalFilename);
		return mongoDao.createFile(bytes, map, null);
	}

	@Override
	public String createFile(byte[] bytes, Map<String, Object> map, String collectionName) throws Exception {
		return mongoDao.createFile(bytes, map, collectionName);
	}

	@Override
	public String createFile(byte[] bytes, Map<String, Object> map) throws Exception {
		return mongoDao.createFile(bytes, map, null);
	}

	@Override
	public void removeFile(String filename) throws Exception {
		mongoDao.remove(filename, null);
	}

	@Override
	public void removeFile(String filename, String collectionName) throws Exception {
		mongoDao.remove(filename, collectionName);
	}

	@Override
	public String findFileUrl(Map<String, Object> map) throws Exception {
		return mongoDao.findFileUrl(map, null);
	}

	@Override
	public String findFileUrl(Map<String, Object> map, String collectionName) throws Exception {
		return mongoDao.findFileUrl(map, collectionName);
	}

	@Override
	public String findFileUrlFileName(Map<String, Object> map) throws Exception {
		return mongoDao.findFileUrlFileName(map, null);
	}

	@Override
	public String findFileUrlFileName(Map<String, Object> map, String collectionName) throws Exception {
		return mongoDao.findFileUrlFileName(map, collectionName);
	}

	@Override
	public Object findIdByMap(Map<String, Object> map) throws Exception {
		return mongoDao.findIdByMap(map, null);
	}

	@Override
	public Object findIdByMap(Map<String, Object> map, String collectionName) throws Exception {
		return mongoDao.findIdByMap(map, collectionName);
	}

	@Override
	public List<Object> findIdsByMap(Map<String, Object> map) throws Exception {
		return mongoDao.findIdsByMap(map, null);
	}

	@Override
	public List<Object> findIdsByMap(Map<String, Object> map, String collectionName) throws Exception {
		return mongoDao.findIdsByMap(map, collectionName);
	}

	@Override
	public void removeByMap(Map<String, Object> map) throws Exception {
		mongoDao.remove(map, null);
	}

	@Override
	public void removeByMap(Map<String, Object> map, String collectionName) throws Exception {
		mongoDao.remove(map, collectionName);
	}

}
