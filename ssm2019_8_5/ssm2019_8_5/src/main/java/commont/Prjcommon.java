package commont;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * 注入属性文件中的值
 * @author Administrator
 *
 */

@Component
public class Prjcommon {
	private static String uploadpath;
	private static int pageSize;

	public static int getPageSize() {
		return pageSize;
	}
	@Value("${pageSize}")
	public  void setPageSize(int pageSize) {
		Prjcommon.pageSize = pageSize;
	}

	public static String getUploadpath() {
		return uploadpath;
	}
	
	@Value("${uploadpath}")
	public  void setUploadpath(String uploadpath) {
		Prjcommon.uploadpath = uploadpath;
	}
}
