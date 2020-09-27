
$(function() {
	var isLogined = false;

	if (!isLogined) {
		$("a#viewlistgroups").hide();
		$("a#login").show();
	} else {
		$("a#viewlistgroups").show();
		$("a#login").hide();
	}
});

function clickNavHome() {
	$(".main").load("jsp/home.jsp");
}

function clickNavViewListGroups() {
	$(".main").load("jsp/viewlistgroups.jsp");
}

function clickNavLogin() {
	location.replace("./login")
}