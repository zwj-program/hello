package cn.zhang.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
	private static SqlSessionFactory sqlSessionFactory;
	//ʹ��ThreadLocal������Ҫ����ִ�й���һ�µĶ���
	private static ThreadLocal<SqlSession> tl=new ThreadLocal<SqlSession>();
	//�������ã���������������ִֻ��һ��
	static{
		String resource="mybatis-config.xml";
		try {
			InputStream in=Resources.getResourceAsStream(resource);
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private SqlSessionUtil() {}

	public static SqlSession getSession(){
		SqlSession session=tl.get();
		if(session==null){
			//���������session�����������浽ThreadLocal��
			session=sqlSessionFactory.openSession();
			tl.set(session);
		}
		return session;
	}
	
	public static void close(SqlSession session){//��ָ����session
		if(session!=null){
			session.close();//�ر�session
			//���ڿ���ʹ���̳߳أ������ɾ��tl�е����ݣ���ô���᳤�õĴ��ڣ����´���
			tl.remove();
		}
	}
}
