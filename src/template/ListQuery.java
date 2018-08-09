package template;

import java.sql.ResultSet;

import domain.MemberBean;
import enums.MemberQuery;
import factory.DataBaseFactory;

public class ListQuery extends QueryTemplate{

	@Override
	void initialize() {
		System.out.println("initialize override");
		map.put("sql", String.format(MemberQuery.LIST.toString(),
							map.get("table")));
	}

	@Override
	void startPlay() {
		System.out.println("=================");
		System.out.println(map.get("sql"));
		System.out.println(map.get("startRow"));
		System.out.println(map.get("endRow"));
		System.out.println("=================");
		try {
			pstmt = DataBaseFactory.createDataBase2(map)
					.getConnection()
					.prepareStatement((String)map.get("sql"));
			pstmt.setString(1, map.get("startRow").toString());
			pstmt.setString(2, map.get("endRow").toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	void endPlay() {
		System.out.println("endPlay override");
		try {
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				member = new MemberBean();
				member.setMemId(rs.getString("MEM_ID"));
				member.setTeamId(rs.getString("TEAM_ID"));
				member.setName(rs.getString("NAME"));
				member.setAge(rs.getString("AGE"));
				member.setRoll(rs.getString("ROLL"));
				member.setPassWord(rs.getString("PASS_WORD"));
				member.setSsn(rs.getString("SSN"));
				member.setGender(rs.getString("GENDER"));
				member.setSubject(rs.getString("SUBJECT"));
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
