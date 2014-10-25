<style type="text/css" media="screen">
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
	border: 1px solid red;
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
	height: 92px;
	border: 2px solid black;
}

#img_browse {
	position: relative;
	top: 20%;
	left: 10%;
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
	top: 5%;
	left: 15%;
}

#img_edit_b {
	position: relative;
	top: 3%;
	left: 18%;
}

#img_share_g {
	position: relative;
	height: 130px;
	width: 160px;
	top: 3%;
	left: 18%;
}
</style>

<script type="text/javascript"> 
$('#img_browse_g').hover(function () {
        console.log("inside of animation method now");
});
</script>

<div class="container_share">
	<ul id="menu">
		<li>
			<div id="ref_browse">
				<div id="head">
					<a href=#><img id="img_browse"
						src="assets/home/browser_text_l.png"></a>
				</div>
				<div id="body">
					<a href=#><img id="img_browse_g"
						src="assets/home/glass_image_lt.png"></a>
				</div>
				<div id="close"></div>
			</div>
		</li>
		<li>
			<div id="ref_edit">
				<div id="head">
					<a href=#><img id="img_edit" src="assets/home/edit_text_l.png"></a>
				</div>
				<div id="body">
					<a href=#><img id="img_edit_b"
						src="assets/home/book_and_pen_home_page_v1f.png"></a>
				</div>
				<div id="close"></div>
			</div>
		</li>
		<li>
			<div id="ref_share">
				<div id="head">
					<a href=#><img id="img_share"
						src="assets/home/share_text_l.png"></a>
				</div>
				<div id="body">
					<a href=#><img id="img_share_g"
						src="assets/home/globe_image_home_page_v1f.png"></a>
				</div>
				<div id="close"></div>
			</div>
		</li>
	</ul>
</div>