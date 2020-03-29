var baord = {

	save: function () {

		var _param = {
			title : $('input[name=title]').val(),
			contents : $('input[name=contents]').val(),
		};

		$.ajax({
			url : "/board/save",
			data : _param,
			type : 'post'
		}).done(function (data) {



		}).fail(function (error) {
			alert(JSON.stringify(error))
		})

	}

}