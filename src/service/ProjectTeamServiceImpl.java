package service;

import java.util.List;

import domain.ProjectTeamBean;

public class ProjectTeamServiceImpl implements ProjectTeamService{
	private ProjectTeamServiceImpl instance = new ProjectTeamServiceImpl();
	public ProjectTeamServiceImpl getInstance () {return instance;}
	private ProjectTeamServiceImpl() {}
	@Override
	public void createProjectTeam(ProjectTeamBean projectTeam) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<ProjectTeamBean> projectList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProjectTeamBean> findByName(ProjectTeamBean projectTeam) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ProjectTeamBean findByID(ProjectTeamBean projectTeam) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countProjectTeam() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void modifyProjectTeam(ProjectTeamBean projectTeam) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeProjectTeam(ProjectTeamBean projectTeam) {
		// TODO Auto-generated method stub
		
	}
	
}
