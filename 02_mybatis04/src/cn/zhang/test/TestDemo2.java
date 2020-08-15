package cn.zhang.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.zhang.util.SqlSessionUtil;
import cn.zhang.vo.User_Project2;

public class TestDemo2 {
	public static void main(String[] args) {
		SqlSession session=SqlSessionUtil.getSession();
		//select1
//		User user=session.selectOne("cn.zhang.mappers.UserMapper2.select1","A0001");
//		System.out.println(user);
		//select2
//		List<User> users=session.selectList("cn.zhang.mappers.UserMapper2.select2",30);
//		for(User user:users)
//			System.out.println(user);
		//select4
//		User user=new User();
//		user.setAge(30);
//		user.setUsername("李靖");
//		List<User> users=session.selectList("cn.zhang.mappers.UserMapper2.select4",user);
//		for(User u:users)
//			System.out.println(u);
		//select5
//		Map<String,Object> map=new HashMap<>();
//		map.put("username", "李靖");
//		map.put("userage", 30);
//		List<User> users=session.selectList("cn.zhang.mappers.UserMapper2.select5",map);
//		for(User u:users)
//			System.out.println(u);
		
		//select6：使用${}拼接字符串，实现sql语句
//		User user=session.selectOne("cn.zhang.mappers.UserMapper2.select6", "A0003");
//		User user=session.selectOne("cn.zhang.mappers.UserMapper2.select6", 25);
//		System.out.println(user);
		
		//select7,使用${}拼接模糊查询值
//		List<User> users=session.selectList("cn.zhang.mappers.UserMapper2.select7","李");
//		for(User user:users)
//			System.out.println(user);
		
		//select8,在java代码中完成拼接
//		List<User> users=session.selectList("cn.zhang.mappers.UserMapper2.select8","%李%");
//		for(User user:users)
//			System.out.println(user);
		
		//select9,使用空格和#{}完成拼接
//		List<User> users=session.selectList("cn.zhang.mappers.UserMapper2.select9","佛");
//		for(User user:users)
//			System.out.println(user);
		
		//select10,结果类型为string
//		String name=session.selectOne("cn.zhang.mappers.UserMapper2.select10","A0001");
//		System.out.println(name);
		
		//select11,结果类型为String
//		List<String> names=session.selectList("cn.zhang.mappers.UserMapper2.select11");
//		for(String s:names)
//			System.out.println(s);
		
		//select12，结果类型为数字
//		int count=session.selectOne("cn.zhang.mappers.UserMapper2.select12");
//		System.out.println(count);
		
		//select13，结果类型为map，将记录保存到map中
//		List<Map<String,Object>> mapList=session.selectList("cn.zhang.mappers.UserMapper2.select13");
//		for(Map<String,Object> map:mapList){
//			Set<String> keys=map.keySet();
//			for(String key:keys){
//				System.out.print(key+":");
//				System.out.println(map.get(key));
//			}
//			System.out.println("-----------");
//		}
		
		//select14，结果为map，将分组查询的结果保存到map中
//		List<Map<String,Object>> mapList=session.selectList("cn.zhang.mappers.UserMapper2.select14");
//		for(Map<String,Object> map:mapList){
//			Set<String> keys=map.keySet();
//			for(String key:keys){
//				System.out.print(key+":"+map.get(key)+",");
//			}
//			System.out.println("-----------");
//		}
		
		//select15，使用别名解决属性名和字段名的映射
//		List<UnUser> userList=session.selectList("cn.zhang.mappers.UserMapper2.select15");
//		for(UnUser user:userList)
//			System.out.println(user);
		
		//select16，使用resultMap解决属性名和字段名的映射
//		List<UnUser> userList=session.selectList("cn.zhang.mappers.UserMapper2.select16");
//		for(UnUser user:userList)
//			System.out.println(user);
		
		//select17，动态sql语句
//		User user=new User();
//		user.setUsername("李");
//		user.setAge(30);
//		List<User> userList=session.selectList("cn.zhang.mappers.UserMapper2.select17",user);
//		for(User u:userList)
//			System.out.println(u);
		
		//select18，前端传递数组，后台sql使用foreach来解析
//		String[] ids={"A0001","A0003"};
//		List<User> userList=session.selectList("cn.zhang.mappers.UserMapper2.select18",ids);
//		for(User u:userList)
//			System.out.println(u);
		
		//select19，前端传递数组，后台sql使用foreach来解析
//		User user=session.selectOne("cn.zhang.mappers.UserMapper2.select19","A0001");
//		System.out.println(user);
		
		//select20,多表联查
//		List<Map<String,Object>> mapList=session.selectList("cn.zhang.mappers.UserMapper2.select20");
//		for(Map<String,Object> map:mapList){
//			Set<String> set=map.keySet();
//			for(String key:set){
//				System.out.print(key+":");
//				System.out.println(map.get(key));
//			}
//			System.out.println("--------------");
//		}
		
		//select21,使用vo封装显示数据
//		List<User_Project> List=session.selectList("cn.zhang.mappers.UserMapper2.select21");
//		for(User_Project up:List){
//			System.out.println(up);
//		}
		
		//select22,使用vo封装显示数据
//		List<User_Project2> List=session.selectList("cn.zhang.mappers.UserMapper2.select22");
//		for(User_Project2 up:List){
//			System.out.println(up);
//		}
		
		//select23
		List<User_Project2> List=session.selectList("cn.zhang.mappers.UserMapper2.select23","李");
		for(User_Project2 up:List){
			System.out.println(up);
		}
		
	}
}
