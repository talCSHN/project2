package com.exam.dto;

import javax.validation.constraints.Size;

import org.apache.ibatis.type.Alias;

@Alias("MemberDTO")
public class MemberDTO {
	
	int member_id;
    String name;
    String gender;
    
    @Size(min = 4, message = "4글자 이상 입력해주세요.")
    String access_pw;
    
    String post;
    String addr1;
    String addr2;
    String phone1;
    String phone2;
    String phone3;
    String height;
    String weight;
    String ponum;
    String period;
	
	public MemberDTO() {}

	public MemberDTO(int member_id, String name, String gender, String access_pw, String post, String addr1,
			String addr2, String phone1, String phone2, String phone3, String height, String weight, String ponum,
			String period) {
		this.member_id = member_id;
		this.name = name;
		this.gender = gender;
		this.access_pw = access_pw;
		this.post = post;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.height = height;
		this.weight = weight;
		this.ponum = ponum;
		this.period = period;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAccess_pw() {
		return access_pw;
	}

	public void setAccess_pw(String access_pw) {
		this.access_pw = access_pw;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getPonum() {
		return ponum;
	}

	public void setPonum(String ponum) {
		this.ponum = ponum;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	@Override
	public String toString() {
		return "MemberDTO [member_id=" + member_id + ", name=" + name + ", gender=" + gender + ", access_pw="
				+ access_pw + ", post=" + post + ", addr1=" + addr1 + ", addr2=" + addr2 + ", phone1=" + phone1
				+ ", phone2=" + phone2 + ", phone3=" + phone3 + ", height=" + height + ", weight=" + weight + ", ponum="
				+ ponum + ", period=" + period + "]";
	}

	
	

}
