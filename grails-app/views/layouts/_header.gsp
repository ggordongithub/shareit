<%@ page import="grails.util.Holders"%>
<%@ page import="grails.plugin.springsecurity.SpringSecurityUtils"%>
<div id="header" style="padding: 0; margin: 0;">
	<%--<form name="submitForm" method="POST"--%>
	<%--		action="${createLink(controller: 'logout')}">--%>
	<%--		<input type="hidden" name="" value=""> <a--%>
	<%--			style="font-style:italic; position:relative; color:black; left:95%; text-decoration:none;" href="javascript:document.submitForm.submit()">logout</a>--%>
	<%--	</form>--%>

	<span id='s2ui_login_link_container'> <nobr>
			<div id='loginLinkContainer'
				style="font-style: italic; position: relative; color: black; left: 77%; text-decoration: none;">
				<sec:ifLoggedIn>
					<form name="submitForm" method="POST"
						action="${createLink(controller: 'logout')}">
						<input type="hidden" name="" value=""> Logged in as
						<sec:username />
						<a id="myLogOut"
							style="font-style: italic; position: relative; color: white; text-decoration: none;"
							href="javascript:document.submitForm.submit()">&nbsp (logout)</a>
					</form>
				</sec:ifLoggedIn>
				<sec:ifNotLoggedIn>
					<a href='#' id='loginLink' style="color: white;">Login</a>
				</sec:ifNotLoggedIn>

				<sec:ifSwitched>
					<a href='${request.contextPath}/j_spring_security_exit_user'>
						Resume as <sec:switchedUserOriginalUsername />
					</a>
				</sec:ifSwitched>
			</div>
		</nobr>

	</span>
	<div class="shareref" style="padding: 0; margin: 0;"></div>
	<p>
		<a href="${resource(dir:'/')}"
			style="color: black; text-decoration: none;" class="header-sub">soar
			towards your dreams</a>
	</p>
</div>