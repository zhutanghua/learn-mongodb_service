package cn.zth.mongodb.service;

import java.util.Map;

public interface MongoGridFSService {

	public Object saveFile(byte[] bytes, Map<String, Object> map, String collectionName) throws Exception;

}
