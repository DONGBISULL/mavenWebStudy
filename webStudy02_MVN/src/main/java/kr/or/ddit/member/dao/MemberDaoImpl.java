package kr.or.ddit.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.db.ConnectionFactory;
import kr.or.ddit.vo.MemberVO;

public class MemberDaoImpl implements MemberDAO {
	//	singleton 
	
	private static MemberDaoImpl self ; 
	
	private MemberDaoImpl() {
		super();
	}
	
	
	public static MemberDaoImpl getInstance() {
		if(self==null) {
			self = new MemberDaoImpl();
		}
		return self;
	}
	
	
	
	@Override
	public MemberVO selectMemberById(String mem_id)  {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT MEM_ID , MEM_PASS, MEM_NAME  FROM MEMBER WHERE MEM_ID = ?  " );
		//아이바티스 #mem_id# ==> 인라인 파라미터
		try (
				Connection conn = ConnectionFactory.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql.toString()) 
				) {	
				stmt.setString(1,mem_id);
				ResultSet rs = stmt.executeQuery();
				MemberVO saveMember = null;
				if(rs.next()) {
					saveMember = new MemberVO();
					saveMember.setMem_id(rs.getString("mem_id"));
					saveMember.setMem_pass(rs.getString("MEM_PASS"));
					saveMember.setMem_name(rs.getString("MEM_Name"));
				}
				rs.close();
				return saveMember;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public int insertMember(MemberVO member) {
		 StringBuffer sql = new StringBuffer();                                     
	sql.append(" insert into member ( mem_id,    mem_pass,    mem_name,            ");
	sql.append("		    mem_regno1,    mem_regno2,    mem_bir,    mem_zip,     ");
	sql.append("		    mem_add1,    mem_add2,    mem_hometel,    mem_comtel,  ");
	sql.append("		    mem_hp,    mem_mail,    mem_job,    mem_like,          ");
	sql.append("		    mem_memorial,    mem_memorialday,    mem_mileage,      ");
	sql.append("		    mem_delete                                             ");
	sql.append("		)  values(  ?,?,? , ?,?,? , ?,?,? ,                                            ");
	sql.append("					?,?,? , ?,?,? ,  ?,?,?,?	)                                                          ");
		                                                                          
		return 0;
	}

	@Override
	public List<MemberVO> selectMemebrList() {
		  StringBuffer sql = new StringBuffer();
		sql.append(" SELECT    mem_id,    mem_pass,    mem_name,               ");
		sql.append("    mem_regno1,    mem_regno2,    mem_bir,    mem_zip,     ");
		sql.append("    mem_add1,    mem_add2,    mem_hometel,    mem_comtel,  ");
		sql.append("    mem_hp,    mem_mail,    mem_job,    mem_like,          ");
		sql.append("    mem_memorial,    mem_memorialday,    mem_mileage,      ");
		sql.append("    mem_delete FROM    member                              ");
		try(
				Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				){
			
				ResultSet rs = pstmt.executeQuery();
				List<MemberVO> memList = new ArrayList< >();
				while(rs.next()) {
					
					MemberVO vo = MemberVO.builder()
					.mem_id(rs.getString("mem_id"))
					.mem_pass(rs.getString("mem_pass"))
					.mem_name(rs.getString("mem_name"))
					.mem_regno1(rs.getString("mem_regno1"))
					.mem_name(rs.getString("mem_name"))
					.mem_add1(rs.getString("mem_add1"))
					.mem_add2(rs.getString("mem_add2"))
					.mem_bir(rs.getString("mem_bir"))
					.mem_zip(rs.getString("mem_zip"))
					.mem_hometel(rs.getString("mem_hometel"))
					.mem_comtel(rs.getString("mem_comtel"))
					.mem_hp(rs.getString("mem_hp"))
					.mem_mail(rs.getString("mem_mail"))
					.mem_job(rs.getString("mem_job"))
					.mem_like(rs.getString("mem_like"))
					.mem_memorial(rs.getString("mem_memorial"))
					.mem_delete(rs.getString("mem_delete"))
					.mem_memorialday(rs.getString("mem_memorialday"))
					.mem_mileage(rs.getInt("mem_mileage")).build();
					memList.add(vo);
				}
				
				rs.close();
				return memList;
		}catch (Exception e) {
			 throw new RuntimeException(e);
		}
		                                                           
	}

	@Override
	public MemberVO selectMemberDetail(String mem_id) { //멤버가 존재하지 않으면 null 값으로 리턴 
	StringBuffer sql = new StringBuffer();
		sql.append("	SELECT    MEM_ID,    MEM_PASS,    MEM_NAME,          ");
		sql.append("  MEM_REGNO1,    MEM_REGNO2,     to_char(mem_bir,'yyyy-mm-dd') as mem_bir,    MEM_ZIP,     ");
		sql.append("  MEM_ADD1,    MEM_ADD2,    MEM_HOMETEL,    MEM_COMTEL,  ");
		sql.append("  MEM_HP,    MEM_MAIL,    MEM_JOB,    MEM_LIKE,          ");
		sql.append("  MEM_MEMORIAL,     to_char(mem_memorialday,'yyyy-mm-dd') as mem_memorialday,     MEM_MILEAGE,      ");
		sql.append("  MEM_DELETE FROM    MEMBER                              ");
		sql.append("  WHERE MEM_ID = ?                                        ");
		
	try(
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			)
	{		pstmt.setString(1, mem_id);
			ResultSet rs = pstmt.executeQuery();
			MemberVO vo = null;
			if(rs.next()) {
						vo = MemberVO.builder()
						.mem_id(rs.getString("mem_id"))
						.mem_pass(rs.getString("mem_pass"))
						.mem_name(rs.getString("MEM_NAME"))
						.mem_regno1(rs.getString("mem_regno1"))
						.mem_regno2(rs.getString("mem_regno2"))
						.mem_bir(rs.getString("mem_bir"))
						.mem_zip(rs.getString("mem_zip"))
						.mem_add1(rs.getString("mem_add1"))
						.mem_add2(rs.getString("mem_add2"))
						.mem_hometel(rs.getString("mem_hometel"))
						.mem_comtel(rs.getString("mem_comtel"))
						.mem_hp(rs.getString("mem_hp"))
						.mem_mail(rs.getString("mem_mail"))
						.mem_job(rs.getString("mem_job"))
						.mem_like(rs.getString("mem_like"))
						.mem_memorial(rs.getString("mem_memorial"))
						.mem_memorialday(rs.getString("mem_memorialday"))
						.mem_mileage(rs.getInt("mem_mileage"))
						.mem_delete(rs.getString("mem_delete"))
						.build();
			}else {
				vo=null;
			}
			
			
		rs.close();
		return vo;
		
	} catch (Exception e) {
		throw new RuntimeException(e);
	
	}
	
		
	}

	@Override
	public int updateMember(MemberVO member) {
		
		
		
		
		return 0;
	}

	@Override
	public int deleteMember(String mem_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
