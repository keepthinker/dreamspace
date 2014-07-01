<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "_//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http_equiv="Content_Type" content="text/html; charset=utf-8" />
<link href="css/common.css" rel="stylesheet" type="text/css" media="all" />
<%-- ${pageContext.request.contextPath}/ --%>
<link href="css/blog_display.css" rel="stylesheet" type="text/css"
	media="all" />
<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
<title>梦空间主页</title>
</head>

<body background="" style="background-color: rgba(183, 226, 244, 0.46)">
	<div id="top_section">
		<div align="center">
			<img src="image\homepage\bb.jpg" width="1000" height=200; " />
		</div>
		<div id="up_floating_text">
			<marquee direction="left" scrolldelay="300">欢迎来到梦空间_博客</marquee>
		</div>
		<div id="up_left_section">
			<div style="float: left">
				<img src="image\homepage\book1.jpg" width="100" height="100" />
			</div>
			<div
				style="float: left; margin-left: 20px; margin-top: 20px; font-size: 18px">
				<p>
					<span style="color: darkblue;">${requestScope.user.nickname}</span><br />
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
			<a href="${pageContext.request.contextPath}/blog_add"> <input
				name="按钮" type="button" class="button"
				onmouseover="this.style.backgroundPosition='left -40px'"
				onmouseout="this.style.backgroundPosition='left top'" value="马上写博客" /></a>
			<a href="${pageContext.request.contextPath}/logout"> <input
				name="按钮" type="button" class="button"
				onmouseover="this.style.backgroundPosition='left -40px'"
				onmouseout="this.style.backgroundPosition='left top'" value="退出" /></a>

		</div>

	</div>
	<hr width="100%" align="center" />
	<div id="main_section">
		<div id="left_side_section">
			<div id="left_my_nav_menu">
				<h4 class="left_section_header">我 的 梦 空 间</h4>
				<ul>
					<li><a href="user_info.html"><span><img
								src="image\homepage\ziliao.png" width="40" height="40" /><span
								class="left_menu_item">我的资料</span></span></a></li>
					<li><a href="blog_display"><span><img
								src="image\homepage\boke.jpg" width="40" height="40"><span
								class="left_menu_item">我的博客</span></span></a></li>
					<li><a href="#"><span><img
								src="image\homepage\pinglun.png" width="40" height="40"><span
								class="left_menu_item">我的评论</span></span></a></li>
					<li><a href="#"><span><img
								src="image\homepage\canyu.png" width="40" height="40"><span
								class="left_menu_item">我的参与</span></span></a></li>
					<li><a href="#"><span><img
								src="image\homepage\zuixinpinglun.png" width="40" height="40"><span
								class="left_menu_item">最新评论</span></span></a></li>
				</ul>
			</div>
			<div id="left_public_nav_menu">
				<h4 class="left_section_header">大 家 的 梦 空 间</h4>
				<ul>
					<li><a href="#"><span><img
								src="image\homepage\dongtai.png" width="40" height="40"><span
								class="left_menu_item">博友动态</span></span></a></li>
					<li><a href="#"><span><img
								src="image\homepage\remen.png" width="40" height="40"><span
								class="left_menu_item">热门博客</span></span></a></li>
				</ul>
			</div>
		</div>
		<div id="blog_content">
			<c:forEach var="blog" items="${blogList }">
				<div
					style="padding-bottom: 16px; border-bottom-style: groove; border-bottom-width: 1px;">
					<a href=""# style="color:black"><h3>${blog.title }</h3></a>
					<div style="font-size: 12px">
						作者：<em style="color: darkgreen">${blog.author.nickname}</em>
						&nbsp发布时间：${blog.createdTime} &nbsp修改时间：${blog.modifiedTime}
					</div>
					<p style="font-size: 14px">${blog.content}</p>
					<div style="float: right; font-size: 12px;">
						<a onmouseover="this.style.textDecoration='underline'"
							onmouseout="this.style.textDecoration='none'" style="color: blue"
							href="#"> <span><em>评论(23)</em></a> </span>
					</div>
				</div>
			</c:forEach>

		</div>
		<div id="righ_side_section">
			<div id="right_friend_list">
				<h4 class="left_section_header">我 的 好 友</h4>
				<ul>
					<li><a href="#"><span><img
								src="image/head_pic/default.jpg" width="40" height="40"><span
								class="right_menu_item">小王</span></span></a></li>
					<li><a href="#"><span><img
								src="image/head_pic/default.jpg" width="40" height="40"><span
								class="right_menu_item">小明</span></span></a></li>
				</ul>
			</div>
		</div>
	</div>


	<div id="bottom_section">
		<font color="#000000"><center>关于梦空间&nbsp;|&nbsp;梦空间帮助&nbsp;|&nbsp;Copyright@DreamSpace&nbsp;西安电子科技大学梦空间小组</center></font>
		<br />
		<center>
			<font color="#000000">在此告诉我们您的意见和建议：</font><font color="#FF0000">DreamSpace@123.com</font>
		</center>
	</div>
</body>
</html>
