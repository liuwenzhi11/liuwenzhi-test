package com.maxf;

/**
 * 单例模式验证类
 * @author wenzhi.liu
 *2017年3月14日上午10:45:46
 */
public class SingletonClass {
	//提供一个静态私有变量
	private static volatile SingletonClass slc = null;
	//构造方法私有
	private SingletonClass(){}
	
	//提供一个公共静态方法获得实例
	public static SingletonClass getSin(){
		//判空
		if(slc == null){
			//同步
			synchronized (SingletonClass.class) {
				//判空
				if(slc == null){
					//为空就获得实例
					slc = new SingletonClass();
				}
			}
		}
		return slc;
	}
}
