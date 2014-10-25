// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better 
// to create separate JavaScript files as needed.
//
//= require jquery
//= require_tree .
//= require_self

if (typeof jQuery !== 'undefined') {
	(function($) {
		$('#spinner').ajaxStart(function() {
			$(this).fadeIn();
		}).ajaxStop(function() {
			$(this).fadeOut();
		});
	})(jQuery);
}

$(document).ready(function() {

	// rotation speed and timer
	// var speed = 5000;
	// var run = setInterval('rotate()', speed);

	// grab the width and calculate left value
	var item_width = $('#slides li').outerWidth();
	var left_value = item_width * (-1);

	// move the last item before first item, just in case user click prev button
	$('#slides li:first').before($('#slides li:last'));

	// set the default item to the correct position
	$('#slides ul').css({
		'left' : left_value
	});

	// if user clicked on prev button
	$('#prev').click(function() {

		// get the right position
		var left_indent = parseInt($('#slides ul').css('left')) + item_width;

		// slide the item
		$('#slides ul').animate({
			'left' : left_indent
		}, 200, function() {

			// move the last item and put it as first item
			$('#slides li:first').before($('#slides li:last'));

			// set the default item to correct position
			$('#slides ul').css({
				'left' : left_value
			});

		}).fadeIn(5000);

		// cancel the link behavior
		return false;

	});

	// if user clicked on next button
	$('#next').click(function() {

		// get the right position
		var left_indent = parseInt($('#slides ul').css('left')) - item_width;

		// slide the item
		$('#slides ul').animate({
			'left' : left_indent
		}, 200, function() {

			// move the first item and put it as last item
			$('#slides li:last').after($('#slides li:first'));

			// set the default item to correct position
			$('#slides ul').css({
				'left' : left_value
			});

		});

		// cancel the link behavior
		return false;

	});

	// if mouse hover, pause the auto rotation, otherwise rotate it
	/*
	 * $('#slides').hover(
	 * 
	 * function() { clearInterval(run); }, function() { run =
	 * setInterval('rotate()', speed); } );
		console.log("inside of animation method now")
	 */

});

$(document).ready(function() {
	  $('#img_browse_g').hover(function() {
		$(this).animate("bounce", { times:5 }, 300);
		console.log("insdie animation loop")
	  })
});

// a simple function to click next link
// a timer will call this function, and the rotation will begin :)
function rotate() {
	$('#next').click();
}
