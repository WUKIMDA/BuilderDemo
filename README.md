#Builder建造者


##讲解顺序
	PersonDemo01
	TextViewBuilder01
	
	TextViewBuilder02
	PersonDemo02



##介绍什么是建造者Builder
	Android中常见有:
		对话框AlertDialog.Builder bulider = new Builder(this);
		通知栏Notification notification = new Notification.Builder(this)
		等等...
	java中....
		
		
##面试官:简单介绍一下Builder模式
	有2种模式:
		经典的Builder模式，变种Builder模式，而现在Android开发普遍使用的是第二种的变种Builder模式

	用于构建复杂对象的一种模式，解决构造方法传参过多的问题
	Builder模式就是使用一个代理完成对象的构建过程。
	好处是易于扩展和类的使用，但同时失去了一些效率

	独立，扩展性强
	
	缺点:
		产生多余的Builder对象等，消耗内存
		成员变量过多,对象复制代码臃肿
	
	


##怎么写//最简单举例
	java
	Android
	灵活



##区别
	[1]经典的Builder模式重点在于抽象出对象创建的步骤，并通过调用不同的具体实现类从而得到不同的结果
	[2]变种的Builder模式的目的在于减少对象创建过程中引入的多个重载构造函数，可选参数以及setters过度使用导致的不必要的复杂性

##变种Builder模式自动化生成

	下载插件 InnerBuilder


##备注:
	PersonDemo01  TextViewBuilder 01是经典
	
	PersonDemo02  TextViewBuilder 02是变种
	