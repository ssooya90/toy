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
			contents : $('textarea[name=contents]').val(),
			writer : "테스트"
		};

		$.ajax({
			url : "/board/save",
			data : JSON.stringify(_param),
			type : 'post',
			dataType : 'json',
			contentType : 'application/json; charset=utf-8'
		}).done(function (data) {

			alert("작성완료");
			window.location.href ="/";


		}).fail(function (error) {
			alert(JSON.stringify(error))
		})

	},

	write_move : function () {

		location.href='/board/boardWrite';
	}

};

baord.init();