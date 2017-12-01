package cn.zth.mongodb.service;

import java.util.List;
import java.util.Map;

/**
 * @author tanghua.zhu mongodb增删接口
 *
 */
public interface MongoUploadService {

	/**
	 * @param bytes
	 * @param originalFilename
	 * @param map
	 *            用来给调用者自定义文件标识 此接口专为语音下载项目使用，因已上线提交测试，所以保留。
	 * @return
	 * @throws Exception
	 */
	@Deprecated
	public String createFile(byte[] bytes, String originalFilename, Map<String, Object> map) throws Exception;

	/**
	 * @Title: createFile
	 * @Description: TODO
	 * @param @param
	 *            bytes 文件
	 * @param @param
	 *            map 文件的属性值
	 * @param @param
	 *            collectionName 所存储的集合
	 * @author tanghua.zhu
	 * @date 2017年9月13日 下午3:58:48
	 */
	public String createFile(byte[] bytes, Map<String, Object> map, String collectionName) throws Exception;

	/**
	 * @Description: TODO 重载接口
	 * @author tanghua.zhu
	 * @date 2017年9月13日 下午4:01:34
	 */
	public String createFile(byte[] bytes, Map<String, Object> map) throws Exception;

	/**
	 * @param fileName
	 * @throws Exception
	 *             移除文件
	 */
	public void removeFile(String fileName) throws Exception;
	public void removeFile(String filename, String collectionName) throws Exception;

	/**
	 * @param map
	 * @return
	 * @throws Exception
	 *             查询文件url 用来给调用者自定义文件标识 此接口专为语音下载项目使用，因已上线提交测试，所以保留。
	 */
	public String findFileUrl(Map<String, Object> map) throws Exception;
	public String findFileUrl(Map<String, Object> map, String collectionName) throws Exception;

	/**
	 * 查找对应的文件名 用来给调用者自定义文件标识 此接口专为语音下载项目使用，因已上线提交测试，所以保留。
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public String findFileUrlFileName(Map<String, Object> map) throws Exception;
	public String findFileUrlFileName(Map<String, Object> map, String collectionName) throws Exception;
	
	/**
	* @Title: findIdByMap
	* @Description: TODO
	* @param @param map
	* @param @param collectionName
	* @param @return 返回值为文件在mongodb库里的唯一标示_id
	* @param @throws Exception
	* @author tanghua.zhu
	* @date 2017年9月13日 下午5:20:53
	*/ 
	public Object findIdByMap(Map<String, Object> map) throws Exception;
	public Object findIdByMap(Map<String, Object> map, String collectionName) throws Exception;
	
	public List<Object> findIdsByMap(Map<String, Object> map) throws Exception;
	public List<Object> findIdsByMap(Map<String, Object> map, String collectionName) throws Exception;
	
	public void removeByMap(Map<String, Object> map) throws Exception;
	public void removeByMap(Map<String, Object> map, String collectionName) throws Exception;
}
