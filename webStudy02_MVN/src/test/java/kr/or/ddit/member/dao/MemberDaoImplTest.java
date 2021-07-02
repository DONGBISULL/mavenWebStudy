package kr.or.ddit.member.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import kr.or.ddit.vo.MemberVO;

public class MemberDaoImplTest {
	MemberDaoImpl dao ;
	@Before
	public void setUp() throws Exception {
		dao = MemberDaoImpl.getInstance();
	}

	/*@Test
	public void testSelectMemberById() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertMember() {
		fail("Not yet implemented");
	}
*/
//	@Test
//	public void testSelectMemebrList() {
//		List<MemberVO> list =  dao.selectMemebrList();
//		System.out.println(list);
//	
//	}

@Test
	public void testSelectMemberDetail() {
		 MemberVO vo = dao.selectMemberDetail("a001");
		 System.out.println(vo);
	}
/*	
	@Test
	public void testUpdateMember() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteMember() {
		fail("Not yet implemented");
	}
*/
}
