package cn.zhang.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.ibatis.session.SqlSession;

public class TransactionInvocationHandler  implements InvocationHandler{
	private Object target;
	
	public TransactionInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		SqlSession session=null;
		Object obj=null;
		
		try {
			session=SqlSessionUtil.getSession();
			obj=method.invoke(target, args);
			session.commit();
		} catch (Exception e) {
			session.rollback();
		}finally{
			SqlSessionUtil.close(session);
		}
		return obj;
	}
	
	public Object getProxy(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
}
