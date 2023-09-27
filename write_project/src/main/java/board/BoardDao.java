package board;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BoardDao {

	private JdbcTemplate jdbcTemplate;
	
	public BoardDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Board selectById(int id) {
		List<Board> results = jdbcTemplate.query(
				"select * from board where id = ?", new RowMapper<Board>() {
					@Override
					public Board mapRow(ResultSet rs, int rowNum) throws SQLException{
						Board board = new Board(
								rs.getString("subject"),
								rs.getString("content"),
								rs.getString("nickname"),
								rs.getInt("views"),
								rs.getTimestamp("write_time").toLocalDateTime());
						return board;
					}
				}, id);
		return results.isEmpty() ? null : results.get(0);
	}
	
	public void insert(Board board) {
		jdbcTemplate.update("insert into board(subject, content, nickname, views, write_time) " + 
							"values (?, ?, ?, ?, ?)", board.getSubject(), board.getContent(),
							board.getViews(), Timestamp.valueOf(board.getWrite_time()));
	}
}
