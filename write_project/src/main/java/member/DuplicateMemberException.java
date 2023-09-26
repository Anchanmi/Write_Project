package member;

public class DuplicateMemberException extends RuntimeException{
	//멤버가 존재할 때 발생하는 에러
	public DuplicateMemberException(String message) {
		super(message);
	}
}
