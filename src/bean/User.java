package bean;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private int id;
	private String nickname;
	private String account;
	private String password;
	private String signature;
	public User(){}
	public User(int id,String nickname, String account,String password,String signature){
		this.setId(id);
		this.setNickname(nickname);
		this.setAccount(account);
		this.setPassword(password);
		this.setSignature(signature);
	}
	
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}