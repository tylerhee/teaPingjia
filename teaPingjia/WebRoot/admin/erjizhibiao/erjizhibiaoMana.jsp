<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		
        <script language="javascript">
           function erjizhibiaoAdd()
           {
                 var url="<%=path %>/admin/erjizhibiao/erjizhibiaoAdd.jsp";
                 //var n="";
                 //var w="480px";
                 //var h="500px";
                 //var s="resizable:no;help:no;status:no;scroll:yes";
				 //openWin(url,n,w,h,s);
				 window.location.href=url;
           }
       </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/images/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="5" background="<%=path %>/images/tbg.gif">&nbsp;二级指标&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="20%">一级级指标</td>
					<td width="20%">二级指标名称</td>
					<td width="40%">二级指标内容</td>
					<td width="10%">二级指标权重</td>
					<td width="10%">二级指标分数</td>
		        </tr>	
				<s:iterator value="#request.erjizhibiaoList" id="erjizhibiao">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#erjizhibiao.yijizhibiaoName"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#erjizhibiao.erjizhibiaoName"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#erjizhibiao.erjizhibiaoName"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#erjizhibiao.erjizhibiaoQuanzhong"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					    <s:property value="#erjizhibiao.erjizhibiaoFenshu"/>
					</td>
				</tr>
				</s:iterator>
			</table>
			
			<table width='98%'  border='0'style="margin-top:8px;margin-left: 5px;">
			  <tr>
			    <td>
			      <input type="button" value="添加" style="width: 80px;" onclick="erjizhibiaoAdd()" />
			    </td>
			  </tr>
		    </table>
	</body>
</html>
