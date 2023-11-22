package member;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MemberDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public MemberDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Member selectByNickname(String nickname) {
		List<Member> results = jdbcTemplate.query(
				"select * from member where nickname = ?", new RowMapper<Member>() {
					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException{
						Member member = new Member(
								rs.getString("nickname"),
								rs.getString("id"),
								rs.getString("password"),
								rs.getString("name"),
								rs.getString("email"),
								rs.getTimestamp("register_day").toLocalDateTime());
						return member;
					}
				}, nickname);
		return results.isEmpty() ? null : results.get(0);
	}
	
	public Member selectById(String id) {
		List<Member> results = jdbcTemplate.query(
				"select * from member where id = ?", new RowMapper<Member>() {
					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException{
						Member member = new Member(
								rs.getString("nickname"),
								rs.getString("id"),
								rs.getString("password"),
								rs.getString("name"),
								rs.getString("email"),
								rs.getTimestamp("register_day").toLocalDateTime());
						return member;
					}
				}, id);
		return results.isEmpty() ? null : results.get(0);
	}
	
	public void insert(Member member) {
		jdbcTemplate.update(
				"insert into member values(?, ?, ?, ?, ?, ?)",
				member.getNickname(), member.getId(), member.getPassword(),
				member.getName(), member.getEmail(), Timestamp.valueOf(member.getRegister_day()));
		
	}
}
