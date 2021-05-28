package test.com;


public class MemberVO {
	
	private int member_num;
	
	private String member_name;
	
	private String member_tel;
	
	private String member_birth; 
	
	private String member_email;
	
	private String member_id; 
	
	private String member_pw;

	public int getMember_num() {
		return member_num;
	}

	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_tel() {
		return member_tel;
	}

	public void setMember_tel(String member_tel) {
		this.member_tel = member_tel;
	}

	public String getMember_birth() {
		return member_birth;
	}

	public void setMember_birth(String member_birth) {
		this.member_birth = member_birth;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	
	

	@Override
	public String toString() {
		return "MemberVO [member_num=" + member_num + ", member_name=" + member_name + ", member_tel=" + member_tel
				+ ", member_birth=" + member_birth + ", member_email=" + member_email + ", member_id=" + member_id
				+ ", member_pw=" + member_pw + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((member_birth == null) ? 0 : member_birth.hashCode());
		result = prime * result + ((member_email == null) ? 0 : member_email.hashCode());
		result = prime * result + ((member_id == null) ? 0 : member_id.hashCode());
		result = prime * result + ((member_name == null) ? 0 : member_name.hashCode());
		result = prime * result + member_num;
		result = prime * result + ((member_pw == null) ? 0 : member_pw.hashCode());
		result = prime * result + ((member_tel == null) ? 0 : member_tel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		if (member_birth == null) {
			if (other.member_birth != null)
				return false;
		} else if (!member_birth.equals(other.member_birth))
			return false;
		if (member_email == null) {
			if (other.member_email != null)
				return false;
		} else if (!member_email.equals(other.member_email))
			return false;
		if (member_id == null) {
			if (other.member_id != null)
				return false;
		} else if (!member_id.equals(other.member_id))
			return false;
		if (member_name == null) {
			if (other.member_name != null)
				return false;
		} else if (!member_name.equals(other.member_name))
			return false;
		if (member_num != other.member_num)
			return false;
		if (member_pw == null) {
			if (other.member_pw != null)
				return false;
		} else if (!member_pw.equals(other.member_pw))
			return false;
		if (member_tel == null) {
			if (other.member_tel != null)
				return false;
		} else if (!member_tel.equals(other.member_tel))
			return false;
		return true;
	} 
	
	
	
	
	

	
}
