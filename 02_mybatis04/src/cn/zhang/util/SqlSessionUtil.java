package cn.zhang.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
	private static SqlSessionFactory sqlSessionFactory;
	//使用ThreadLocal保存需要整个执行过程一致的对象
	private static ThreadLocal<SqlSession> tl=new ThreadLocal<SqlSession>();
	//加载配置，创建单例工厂，只执行一次
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
			//如果不存在session，创建并保存到ThreadLocal中
			session=sqlSessionFactory.openSession();
			tl.set(session);
		}
		return session;
	}
	
	public static void close(SqlSession session){//关指定的session
		if(session!=null){
			session.close();//关闭session
			//由于可能使用线程池，如果不删除tl中的内容，那么它会长久的存在，导致错误
			tl.remove();
		}
	}
}
