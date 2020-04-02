var baord = {


	init : function () {

		var _this = this;

		$('#writeMoveBtn').on('click',function () {

			_this.write_move();
		});

	},



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

	},

	write_move : function () {

		location.href='/board/boardWrite';
	}

};

baord.init();