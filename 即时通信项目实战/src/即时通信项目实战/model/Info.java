package 即时通信项目实战.model;

import 即时通信项目实战.util.EnumInfoTyoe;

public class Info 
{
	private String fromUSer;
	private String toUSer;
	private String sendTime;
	private String content;
	
	
	private EnumInfoTyoe infoType;


	public String getFromUSer() {
		return fromUSer;
	}


	public void setFromUSer(String fromUSer) {
		this.fromUSer = fromUSer;
	}


	public String getToUSer() {
		return toUSer;
	}


	public void setToUSer(String toUSer) {
		this.toUSer = toUSer;
	}


	public String getSendTime() {
		return sendTime;
	}


	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public EnumInfoTyoe getInfoType() {
		return infoType;
	}


	public void setInfoType(EnumInfoTyoe infoType) {
		this.infoType = infoType;
	}


	@Override
	public String toString() {
		return "Info [fromUSer=" + fromUSer + ", toUSer=" + toUSer
				+ ", sendTime=" + sendTime + ", content=" + content
				+ ", infoType=" + infoType + "]";
	}


	public Info(String fromUSer, String toUSer, String sendTime,
			String content, EnumInfoTyoe infoType) {
		super();
		this.fromUSer = fromUSer;
		this.toUSer = toUSer;
		this.sendTime = sendTime;
		this.content = content;
		this.infoType = infoType;
	}


	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
