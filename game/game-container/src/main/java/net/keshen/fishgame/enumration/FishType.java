package net.keshen.fishgame.enumration;

/**
 * 鱼的种类
 * @author shenke
 *
 */
public enum FishType {
	/**
	 * 燕鱼
	 */
	MACKEREL("fish01"),
	/** 红鱼*/
	SNAPPER("fish02"),
	/** 绿鱼*/
	GREENFISH("fish03"),
	/** 乌贼*/
	SQUID("fish04"),
	/** 小丑鱼*/
	CLOWNFISH("fish05"),
	/** 红绿灯鱼*/
	TRAFFICLIGHTSFISH("fish06"),
	/** 蓝鱼*/
	BLUEFISH("fish07"),
	/** 乌龟*/
	TORTOISE("fish08"),
	/** 灯笼鱼*/
	LANTERNFISH("fish09"),
	/** 鳐鱼*/
	SKATE("fish10"),
	/** 美人鱼1*/
	MERMAID1("fish11"),
	/** 美人鱼2*/
	MERMAID2("fish12"),
	/** 鲨鱼*/
	SHARK("fish13"),
	/** 海姆*/
	HEIM("fish14"),
	/** 剑鱼*/
	SWORDFISH("fish15"),
	/** 鲸鱼*/
	WHALE("fish16"),
	/** 青蛙*/
	FROG("fish17");
	private String name;

	
	private FishType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
