var member = {

	init: function () {

		var _this = this;
	},

	join: function () {

		alert("조인")

		var _params = {
			email : $('input[name=email]').val(),
			name : $('input[name=name]').val(),
			password : $('input[name=password]').val(),
			grade: $('select[name=grade]').val()
		}

		$.ajax({
			type: "post"
			, url: '/member/joinProc'
			, data: JSON.stringify(_params)
			, dataType: 'json'
			, contentType: 'application/json; charset=utf-8'
		}).done(function () {
			alert("회원가입 완료되었습니다.")
			window.location.href("/")

		}).fail(function (error) {
			alert(JSON.stringify(error))

		})

	}

}

member.init();

