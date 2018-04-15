<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<TITLE>中国移动业务管理系统</TITLE>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=gb2312">
<style type="text/css">
<!--
body {
	background-color: #CCCCCC;
	margin-top: 10px;
}
-->
</style>
<link href="style.css" rel="stylesheet" type="text/css">
</HEAD>
<script src="webjars/jquery/3.3.1/jquery.js"></script>
<script type="text/javascript">
$(function(){

	$("#btn_login").click(function(){		
		$("form").get(0).submit();
	})
})

</script>
<BODY LEFTMARGIN=0 MARGINWIDTH=0>
<!-- ImageReady Slices (index.psd) -->
<TABLE WIDTH=750 BORDER=0 align="center" CELLPADDING=0 CELLSPACING=0>
	<TR>
		<TD ROWSPAN=2>
			<IMG SRC="images/index_01.gif" WIDTH=444 HEIGHT=237 ALT=""></TD>
		<TD>
			<IMG SRC="images/index_02.gif" WIDTH=306 HEIGHT=99 ALT=""></TD>
	</TR>
	<TR>
		<TD>
			<IMG SRC="images/index_03.gif" WIDTH=306 HEIGHT=138 ALT=""></TD>
	</TR>
	<TR>
		<TD ROWSPAN=2>
			<IMG SRC="images/index_04.gif" WIDTH=444 HEIGHT=363 ALT=""></TD>
		<TD width="306" height="185" background="images/index_05.gif"><table width="250" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><form  action="login.do" method="get" >
              <div align="center">
                <table width="100%"  border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td height="30"><div align="center"><strong>用户名：</strong>
                        <INPUT name="userName" type="text" value="">
                        <br>
                    </div></td>
                  </tr>
                  <tr>
                    <td height="30"><div align="center"><strong>密&nbsp;&nbsp;&nbsp;码：</strong>
                        <INPUT name="password" type="password" value="">
                    </div></td>
                  </tr>
                  <tr>
                    <td height="30">
                      <div align="center">
                        <div id="div_login"  >
                                                 用户名密码不正确
                        </div>
                        <INPUT class=f2 type="button" size=4 value="进入系统" id="btn_login">                   
                      </div></td>
                  </tr>
                </table></div>
            </form></td>
          </tr>
        </table></TD>
	</TR>
	<TR>
		<TD>
			<IMG SRC="images/index_06.gif" WIDTH=306 HEIGHT=178 ALT=""></TD>
	</TR>
</TABLE>
<!-- End ImageReady Slices -->
</BODY>
</HTML>