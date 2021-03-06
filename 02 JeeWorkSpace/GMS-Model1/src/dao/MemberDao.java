package dao;

import java.util.List;

import domain.*;

public interface MemberDao {
	public void insertMember (MemberBean member);
	public List<MemberBean> selectAllMember();
	public List<MemberBean> selectBySearchWord(String word);
	public MemberBean selectById(MemberBean id);
	public int countMember();
	public void updateMember(MemberBean member);
	public void deleteMember(MemberBean member);
	public MemberBean login(MemberBean bean);
	public boolean iDDualCheck(String id);
}
