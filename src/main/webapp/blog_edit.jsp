<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/blog_edit.css"
	rel="stylesheet" type="text/css" media="all" />
<title>编辑博客</title>
</head>
<body>
	<div id="top_section">
		<div align="center">
			<img src="image\homepage\bb.jpg" width="1000" height=200; " />
		</div>
		<div id="up_floating_text">
			<marquee direction="left" scrolldelay="300">欢迎来到梦空间-博客编辑页面。
				立刻写下此时的感想吧！</marquee>
		</div>
		<div id="up_left_section">
			<div style="float: left">
				<img src="image\homepage\book1.jpg" width="140" height="140" />
			</div>
			<div
				style="float: left; margin-left: 20px; margin-top: 20px; font-size: 18px">
				<p>
					<span style="color: darkblue;">${requestScope.userName}</span><br />
					<em style="margin-left: 30px">的梦空间</em>
				</p>
			</div>
		</div>
		<div id="up_middle_section">
			<p>记录今天的生活？ 分享今天的喜悦？</p>
			<p>诉说现在的心情？ 保存此时的梦想？</p>
			<p>开始写博客吧，记录生活与梦想的点点滴滴......</p>
		</div>
		<div id="up_right_section" style="float: right;">
			<a href="${pageContext.request.contextPath}/blog_display"> <input
				name="按钮" type="button" class="button"
				onmouseover="this.style.backgroundPosition='left -40px'"
				onmouseout="this.style.backgroundPosition='left top'" value="我的主页" /></a>
			<a href="${pageContext.request.contextPath}/blog_display"> <input
				name="按钮" type="button" class="button"
				onmouseover="this.style.backgroundPosition='left -40px'"
				onmouseout="this.style.backgroundPosition='left top'" value="查看我的博文" /></a>
			<a href="${pageContext.request.contextPath}/blog_update"> <input
				name="按钮" type="button" class="button"
				onmouseover="this.style.backgroundPosition='left -40px'"
				onmouseout="this.style.backgroundPosition='left top'" value="退出当前编辑" /></a>
		</div>
	</div>
	<hr width="100%" align="center" />
	<div id="edit_area"
		style="width: 90%; height: 550px; border-style: groove; border-width: 3px; margin-left: 5%; margin-right: 5%;margin-bottom:110px;">
		<form method="post" action="${pageContext.request.contextPath}/blog_update">
			<div style="font-size: 20px; margin: 25px">
				<label>标题</label><input type="text" name="title"
					style="font-size: 20px;; margin-left: 20px; width: 40%; height: 25px" />
			</div>
			<div style="font-size: 20px; margin: 25px">
				<label style="float: left">内容</label>
				<textarea name="content"
					style="margin-left: 20px; margin-bottom: 0px; resize: vertical; height: 450px; width: 93%"></textarea>
			</div>
			<input style="float:right;margin-right:10%" type="submit" value="提交" class="button"
				onmouseover="this.style.backgroundPosition='left -40px'"
				onmouseout="this.style.backgroundPosition='left top'" />
		</form>
	</div>
</body>
</html>