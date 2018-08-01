package command;


import javax.servlet.http.HttpServletRequest;

import enums.Domain;
import service.MemberServiceImpl;

public class SearchCommand extends Command {

	public SearchCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {
		switch (Domain.valueOf(domain.toUpperCase())) {
		case MEMBER :
		case ADMIN :
			System.out.println("검색 안으로 진입");
			request.setAttribute("team", MemberServiceImpl.getInstance().findByWord("TEAM_ID"+"/"+request.getParameter("search_team_id")));
			break;
		default:
			break;
		}
		super.execute();
	}
}
