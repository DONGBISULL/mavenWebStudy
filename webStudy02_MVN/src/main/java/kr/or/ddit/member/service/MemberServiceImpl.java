package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.commons.UserNotFoundException;
import kr.or.ddit.enumtype.ServiceResult;
import kr.or.ddit.member.dao.MemberDAO;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.vo.MemberVO;


public class MemberServiceImpl implements MemberService {

	private static MemberServiceImpl self ;
	private MemberDAO dao  =MemberDaoImpl.getInstance();
	
	 
	
	private MemberServiceImpl() {
		super();
	
	}


	public static MemberServiceImpl getInstance() {
		if(self==null) {
			self = new MemberServiceImpl();
		}
		return self;
	}
	
	
	@Override
	public ServiceResult createMemberVO(MemberVO member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> retrieveMemberList() {
		List<MemberVO> memList = dao.selectMemebrList();
		return memList;
	}

 
	@Override
	public ServiceResult modifyMember(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResult removeMember(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public MemberVO retrieveMember(String mem_id) {
			MemberVO vo = dao.selectMemberDetail(mem_id);
		 
			if(vo==null) {
				throw new UserNotFoundException(String.format("%s 회원이 존재하지 않습니다", mem_id));
			}
			
			
				return vo;
			
			
		
	}


 
}
