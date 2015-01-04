<style type="text/css" media="screen">
body {
	margin: 0 auto;
}

.container_share {
	position: relative;
	background-color: white;
	width: 80%;
	height: 400px;
	padding: 1em;
	margin: 4em auto;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

#ref_browse, #ref_edit, #ref_share {
	width: 250px;
	height: 320px;
	float: left;
	margin: 1.5em auto;
	margin-left: 40px;
	border: 2px solid black;
}

#menu {
	padding: 0;
	margin: 0;
}

#menu li {
	list-style-type: none;
}

.container_share #head {
	width: 100%;
	height: 80px;
	border: 2px solid black;
	background: rgb(214, 214, 214); /* Old browsers */
	background: -moz-linear-gradient(-45deg, rgba(214, 214, 214, 1) 0%,
		rgba(38, 40, 43, 1) 84%, rgba(40, 52, 59, 1) 100%); /* FF3.6+ */
	background: -webkit-gradient(linear, left top, right bottom, color-stop(0%, rgba(214
		, 214, 214, 1)), color-stop(84%, rgba(38, 40, 43, 1)),
		color-stop(100%, rgba(40, 52, 59, 1))); /* Chrome,Safari4+ */
	background: -webkit-linear-gradient(-45deg, rgba(214, 214, 214, 1) 0%,
		rgba(38, 40, 43, 1) 84%, rgba(40, 52, 59, 1) 100%);
	/* Chrome10+,Safari5.1+ */
	background: -o-linear-gradient(-45deg, rgba(214, 214, 214, 1) 0%,
		rgba(38, 40, 43, 1) 84%, rgba(40, 52, 59, 1) 100%); /* Opera 11.10+ */
	background: -ms-linear-gradient(-45deg, rgba(214, 214, 214, 1) 0%,
		rgba(38, 40, 43, 1) 84%, rgba(40, 52, 59, 1) 100%); /* IE10+ */
	background: linear-gradient(135deg, rgba(214, 214, 214, 1) 0%,
		rgba(38, 40, 43, 1) 84%, rgba(40, 52, 59, 1) 100%); /* W3C */
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#d6d6d6',
		endColorstr='#28343b', GradientType=1);
	/* IE6-9 fallback on horizontal gradient */
}

.container_share #body {
	width: 100%;
	height: 140px;
	border: 2px solid black;
}

.container_share #close {
	width: 100%;
	height: 96px;
	border: 2px solid black;
}

#close p {
	position: relative;
	top: 1px;
	padding: 0.6em;
	margin-left: auto;
	margin-right: auto;
	font-family: Arial;
	font-weight: 900;
	font-size: .9em;
	color: black;
	text-align: center;
	vertical-align: middle;
}

#img_browse {
	position: relative;
	top: 20%;
	left: 10%;
}

#img_browse_g:hover, #img_edit_b:hover, #img_share_g:hover {
	opacity: 0.5;
	filter: alpha(opacity = 50);
	-ms-transform: rotate(7deg); /* IE 9 */
	-webkit-transform: rotate(7deg); /* Chrome, Safari, Opera */
	transform: rotate(7deg);
}

#img_edit, #img_share {
	position: relative;
	top: 20%;
	left: 20%;
}

#img_browse_g {
	position: relative;
	height: 120px;
	width: 190px;
	top: 7%;
	left: 15%;
}

#img_edit_b {
	position: relative;
	top: 7%;
	left: 12%;
	height: 110px;
	width: 190px;
}

#img_share_g {
	position: relative;
	height: 130px;
	width: 160px;
	top: 3%;
	left: 18%;
}

H1 {
	font-size: 45px;
	font-weight: bold;
	font-style: italic;
	font-family: "lucinda";
	background: -webkit-linear-gradient(black, #505050 );
	-webkit-background-clip: text;
	-webkit-text-fill-color: transparent;
	text-align: center;
	text-shadow: 2px 2px 0px white;
}

H1 a:hover {
 color: gray;
}

#toptxt {
	text-decoration: none;
}
</style>

<div class="container_share">
	<ul id="menu">
		<li>
			<div id="ref_browse">
				<div id="head">
					<H1><a id="toptxt" href="request">REQUEST</a></H1>
					<%--					<a href="request"><img id="img_browse"--%>
					<%--						src="assets/home/browser_text_l.png"></a>--%>
				</div>
				<div id="body">
					<a href="request"><img id="img_browse_g"
						src="assets/home/glass_image_lt.png"></a>
				</div>
				<div id="close">
					<p>Request professional/personal references from
						clients, supporters or employers.
				</div>
			</div>
		</li>
		<li>
			<div id="ref_edit">
				<div id="head">
					<H1><a id="toptxt" href="share/operate">SETTINGS</a></H1>
				</div>
				<div id="body">
					<a href="share/operate"><img id="img_edit_b"
						src="assets/home/book_and_pen_home_page_v1f.png"></a>
				</div>
				<div id="close">
					<p>Create, update and personalize your references salutations. Upload photos, manual references and check out your profile analytics.</p>
				</div>
			</div>
		</li>
		<li>
			<div id="ref_share">
				<div id="head">
					<H1><a id="toptxt" href="share">SHARE</a></H1>
<%--					<img id="img_share"--%>
<%--						src="assets/home/share_text_l.png"></a>--%>
				</div>
				<div id="body">
					<a href="share"><img id="img_share_g"
						src="assets/home/globe_image_home_page_v1f.png"></a>
				</div>
				<div id="close">
					<p>Make your verified professional references available to all
						potential clients/employers</p>
				</div>
			</div>
		</li>
	</ul>
</div>