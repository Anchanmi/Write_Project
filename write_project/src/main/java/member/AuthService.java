package member;

import org.springframework.beans.factory.annotation.Autowired;

public class AuthService {

	@Autowired
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public AuthInfo authenticate(String id, String password) {
		Member member = memberDao.selectById(id);
		
		if(member == null) {
			throw new NotMemberException();
		}
		if(!member.matchPassword(password)) {
			throw new WrongIdPasswordException();
		}
		return new AuthInfo(member.getId(), member.getNickname(), member.getName());
	}
}
