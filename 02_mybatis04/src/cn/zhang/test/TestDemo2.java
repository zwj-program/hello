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
//		user.setUsername("�");
//		List<User> users=session.selectList("cn.zhang.mappers.UserMapper2.select4",user);
//		for(User u:users)
//			System.out.println(u);
		//select5
//		Map<String,Object> map=new HashMap<>();
//		map.put("username", "�");
//		map.put("userage", 30);
//		List<User> users=session.selectList("cn.zhang.mappers.UserMapper2.select5",map);
//		for(User u:users)
//			System.out.println(u);
		
		//select6��ʹ��${}ƴ���ַ�����ʵ��sql���
//		User user=session.selectOne("cn.zhang.mappers.UserMapper2.select6", "A0003");
//		User user=session.selectOne("cn.zhang.mappers.UserMapper2.select6", 25);
//		System.out.println(user);
		
		//select7,ʹ��${}ƴ��ģ����ѯֵ
//		List<User> users=session.selectList("cn.zhang.mappers.UserMapper2.select7","��");
//		for(User user:users)
//			System.out.println(user);
		
		//select8,��java���������ƴ��
//		List<User> users=session.selectList("cn.zhang.mappers.UserMapper2.select8","%��%");
//		for(User user:users)
//			System.out.println(user);
		
		//select9,ʹ�ÿո��#{}���ƴ��
//		List<User> users=session.selectList("cn.zhang.mappers.UserMapper2.select9","��");
//		for(User user:users)
//			System.out.println(user);
		
		//select10,�������Ϊstring
//		String name=session.selectOne("cn.zhang.mappers.UserMapper2.select10","A0001");
//		System.out.println(name);
		
		//select11,�������ΪString
//		List<String> names=session.selectList("cn.zhang.mappers.UserMapper2.select11");
//		for(String s:names)
//			System.out.println(s);
		
		//select12���������Ϊ����
//		int count=session.selectOne("cn.zhang.mappers.UserMapper2.select12");
//		System.out.println(count);
		
		//select13���������Ϊmap������¼���浽map��
//		List<Map<String,Object>> mapList=session.selectList("cn.zhang.mappers.UserMapper2.select13");
//		for(Map<String,Object> map:mapList){
//			Set<String> keys=map.keySet();
//			for(String key:keys){
//				System.out.print(key+":");
//				System.out.println(map.get(key));
//			}
//			System.out.println("-----------");
//		}
		
		//select14�����Ϊmap���������ѯ�Ľ�����浽map��
//		List<Map<String,Object>> mapList=session.selectList("cn.zhang.mappers.UserMapper2.select14");
//		for(Map<String,Object> map:mapList){
//			Set<String> keys=map.keySet();
//			for(String key:keys){
//				System.out.print(key+":"+map.get(key)+",");
//			}
//			System.out.println("-----------");
//		}
		
		//select15��ʹ�ñ���������������ֶ�����ӳ��
//		List<UnUser> userList=session.selectList("cn.zhang.mappers.UserMapper2.select15");
//		for(UnUser user:userList)
//			System.out.println(user);
		
		//select16��ʹ��resultMap������������ֶ�����ӳ��
//		List<UnUser> userList=session.selectList("cn.zhang.mappers.UserMapper2.select16");
//		for(UnUser user:userList)
//			System.out.println(user);
		
		//select17����̬sql���
//		User user=new User();
//		user.setUsername("��");
//		user.setAge(30);
//		List<User> userList=session.selectList("cn.zhang.mappers.UserMapper2.select17",user);
//		for(User u:userList)
//			System.out.println(u);
		
		//select18��ǰ�˴������飬��̨sqlʹ��foreach������
//		String[] ids={"A0001","A0003"};
//		List<User> userList=session.selectList("cn.zhang.mappers.UserMapper2.select18",ids);
//		for(User u:userList)
//			System.out.println(u);
		
		//select19��ǰ�˴������飬��̨sqlʹ��foreach������
//		User user=session.selectOne("cn.zhang.mappers.UserMapper2.select19","A0001");
//		System.out.println(user);
		
		//select20,�������
//		List<Map<String,Object>> mapList=session.selectList("cn.zhang.mappers.UserMapper2.select20");
//		for(Map<String,Object> map:mapList){
//			Set<String> set=map.keySet();
//			for(String key:set){
//				System.out.print(key+":");
//				System.out.println(map.get(key));
//			}
//			System.out.println("--------------");
//		}
		
		//select21,ʹ��vo��װ��ʾ����
//		List<User_Project> List=session.selectList("cn.zhang.mappers.UserMapper2.select21");
//		for(User_Project up:List){
//			System.out.println(up);
//		}
		
		//select22,ʹ��vo��װ��ʾ����
//		List<User_Project2> List=session.selectList("cn.zhang.mappers.UserMapper2.select22");
//		for(User_Project2 up:List){
//			System.out.println(up);
//		}
		
		//select23
		List<User_Project2> List=session.selectList("cn.zhang.mappers.UserMapper2.select23","��");
		for(User_Project2 up:List){
			System.out.println(up);
		}
		
	}
}
