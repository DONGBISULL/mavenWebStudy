<%@page import="kr.or.ddit.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/includee/preScript.jsp"></jsp:include>
<style>

<style>
table{
 
}
 
td,tr, th{
 border : 1px solid lightgray; 
padding :10px;

}
</style>

 

</head>
<body>
	<%
		//dispatch 방식으로 꺼내기 

		MemberVO member = (MemberVO) request.getAttribute("member");
		//컨텐츠 꺼내기 
		//
	%>
	<%= member.getMem_name()%>님의 마이페이지
			
	<table class='table table-bordered '>
		<tbody>
			<tr>
				<th>회원 id</th>
				<td><%=member.getMem_id() %></td></tr>
			<tr> <th>비밀 번호</th><td><%=member.getMem_pass() %></td>
			<tr>		<th>회원명</th>      <td><%=member.getMem_name() %></td>   </tr>
			<tr>		<th>주민등록번호1</th>   <td><%=member.getMem_regno1() %></td></tr>
			<tr>		<th>주민등록번호2</th>  <td><%=member.getMem_regno2() %></td> </tr>
			<tr>		<th>생일</th>      <td><%=member.getMem_bir() %></td>      </tr>
			<tr>		<th>우편번호</th>   <td><%=member.getMem_zip() %></td>    </tr>
			<tr>		<th>주소 1</th>     <td><%=member.getMem_add1() %></td>     </tr>
			<tr>		<th>주소 2</th>    <td><%=member.getMem_add2() %></td>     </tr>
			<tr>		<th>집 전화 번호</th> 	<td><%=member.getMem_hometel() %></td>   </tr>
			<tr>		<th>회사 전화번호</th><td><%=member.getMem_comtel() %></td>  </tr>
			<tr>		<th>이동 전화번호</th> <td><%=member.getMem_hp() %></td>  </tr>
			<tr>		<th>메일</th>     <td><%=member.getMem_mail() %></td>      </tr>
			<tr>		<th>직업</th>       <td><%=member.getMem_job() %></td>     </tr>
			<tr>		<th>취미</th>     <td><%=member.getMem_like() %></td>       </tr>
			<tr>		<th>기념일 명</th> <td><%=member.getMem_memorial() %></td>     </tr>
			<tr>		<th>기념일 날짜</th>   <td><%=member.getMem_memorialday() %></td>  </tr>
			<tr>		<th>마일리지</th>   <td><%=member.getMem_mileage() %></td>    </tr>
			<tr>		<th>삭제 여부</th>   	<td><%=member.getMem_delete()!=null?"삭제됨":"" %></td>    </tr>
			 
  
		</tbody>

	</table>



</body>
</html>