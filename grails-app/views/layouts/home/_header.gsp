<div id="header">
	<%--	<form name="submitForm" method="POST"--%>
	<%--		action="${createLink(controller: 'logout')}">--%>
	<%--		<input type="hidden" name="" value=""> <a--%>
	<%--			style="font-style:italic; position:relative; color:black; left:95%; text-decoration:none;" href="javascript:document.submitForm.submit()">logout</a>--%>
	<%--	</form>--%>
	<div id='loginLinkContainer'
		style="font-style: italic; position: relative; color: black; left: 82%; text-decoration: none;">
		<span id='s2ui_login_link_container'> <nobr>
				<sec:ifLoggedIn>
				Logged in as <sec:username /> (<g:link controller='logout'>
						<span style="color: white;">Logout</span>
					</g:link>)
				</sec:ifLoggedIn>
				<sec:ifNotLoggedIn>
					<a href='#' id='loginLink' style="color: white;">Login</a>
				</sec:ifNotLoggedIn>

				<sec:ifSwitched>
					<a href='${request.contextPath}/j_spring_security_exit_user'>
						Resume as <sec:switchedUserOriginalUsername />
					</a>
				</sec:ifSwitched>
			</nobr>

		</span>
	</div>
	<div class="shareref"></div>
	<p>
		<a href="${resource(dir:'/')}"
			style="color: black; text-decoration: none;" class="header-sub">soar
			towards your dreams</a>
	</p>
</div>