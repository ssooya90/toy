

var boardWrite = {

	init : function (){

		var _this = this;
		console.log(_this)

	},

	save : function (){

		var _params = {
			title : $('input[name=title]').val(),
			writer : $('input[name=writer]').val(),
			content : $('textarea[name=content]').val()
		}

		$.ajax({
			type: "post"
			, url: '/post'
			, data: JSON.stringify(_params)
			, dataType: 'json'
			, contentType: 'application/json; charset=utf-8'
		}).done(function () {
			alert("작성완료 완료되었습니다.")
			window.location.href("/")

		}).fail(function (error) {
			alert(JSON.stringify(error))

		})

	}

}

boardWrite.init();