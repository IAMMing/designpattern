package com.lidaming.design15.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Leader implements ILeader {
	List<IMember> members=new ArrayList<IMember>();
	
	/**
	 * 注册观察者
	 * @param member
	 */
	public void register(IMember member){
		members.add(member);
	}
	/**
	 * 取消注册
	 * @param member
	 */
	public void unRegister(IMember member)
	{
		members.remove(member);
	}
	/**
	 * 通知所有观察者
	 */
	public void notifyMember() {
		for (IMember member : members) {
			
			member.action(this);
		}
	}
	
	public abstract String getState();
	
}
