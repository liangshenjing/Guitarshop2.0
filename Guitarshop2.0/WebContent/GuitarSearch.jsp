<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
        <form action="searchGuitar" method="post" >
          <table >
            
              <tr>
                <tr class="table-id">吉他编号</tr>&nbsp
                <tr class="table-type">吉他模型</tr>&nbsp
                <tr class="table-author">制造商</tr>&nbsp
                <tr class="table-set">吉他类型</tr>&nbsp
                <tr class="table-set">吉他材料</tr>
              </tr>
          
          <tbody>
	          <c:forEach items="${guitars }" var="guitar">
	         	<tr>
	                <td class="table-id">${guitar.serialNumber }</td>
	                <td class="table-title">${guitar.spec.model }</td>
                	<td class="table-set">${guitar.spec.buider }</td>
	                <td class="table-type">${guitar.spec.type }</td>
	                <td class="table-author">${guitar.spec.wood }</td>	        	                
	              </tr>
	          </c:forEach>
          </tbody>
        </table>
         <input type="text" name="model"/>
         <input type="submit" class="am-btn am-btn-primary" id="submit" value="查询"/>
        </form>
</body>
</html>