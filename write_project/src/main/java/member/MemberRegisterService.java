package member;

import java.time.LocalDateTime;

public class MemberRegisterService {

	private MemberDao memberDao;
	
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public String regist(RegisterRequest req) {
		Member member = memberDao.selectByNickname(req.getNickname());
		
		if(member != null) {
			throw new DuplicateMemberException("dup Nickname" + req.getNickname());
		}
		
		Member newMember = new Member(req.getNickname(), req.getId(), req.getPassword(),
										req.getName(), req.getEmail(), LocalDateTime.now());
		memberDao.insert(newMember);
		return newMember.getNickname();
	}
}
