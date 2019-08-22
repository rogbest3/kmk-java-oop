package com.bitcamp.services;
import com.bitcamp.domains.MemberBean;;
/**
 * 요구사항(기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 마이페이지
 * 3. 비번 수정
 * 4. 회원 탈퇴
 **************
 * <관리자기능>
 * 5. 회원 목록
 */
public class MemberService {
//	MemberBean[] members = new MemberBean[2];	//	멤버 변수, 멤버 변수라 초기화하지 않는다, 멤버변수는 생성자에 의해서 초기화됨.
	private MemberBean[] members;
	private int count;
	
	public MemberService() {					// 생성자를 코딩하면 default 생성자 없어짐
		members = new MemberBean[2];			// 서버 용량, 서버의 2명의 회원을 받음
		count = 0;
	}
	/** 1. 회원가입 */
	public String join(MemberBean param) {
		String msg = "회원가입 성공";
		members[count] = param;
		count++;			// main에 while(true)에 있기 때문에
		return msg;
	}
	/**
	 * 2. 마이페이지
	 * */
	public String getMyPage(MemberBean param) {
		return param.toString();
	}
	/**
	 * 3. 비번 수정
	 */
	public String changePassword(MemberBean param) {
		String msg = "비번이 변경 되었습니다.";
		return msg;
	}
	/**
	 * 4. 회원 탈퇴
	 */
	public String withdrawal(MemberBean param) {
		String msg = "회원탈퇴 완료.";
		return msg;
	}
	/**
	 * 5. 회원 목록
	 */
	public String list() {
		String msg = "";
		for(int i=0; i<count; i++) {
			msg += members[i].toString() + ", \n"; 
		}
		return msg;
	}
	/**
	 * 6. 아이디 검색
	 */
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i=0; i<count; i++) {
			if( id.equals(members[i].getId())) {
				member = members[i];
			}
		}
		return member;
	}
}
