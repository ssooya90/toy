var member = {



	init : function () {
		var _this = this;


	},

	save : function () {

		var _token = $('meta[name="_csrf"]').attr('content');
		var _header = $('meta[name="_csrf_header"]').attr('content');

		var data = {
			userId : $('#userId').val()
			, password : $('#password').val()
			, userName : $('#userName').val()
			, userAge : $('#userAge').val()
			, _csrf : $('input[name=_csrf]').val()
		};


		$.ajax({
			type: "POST"
			, url: '/api/v1/member'
			, dataType: 'json'
			, contentType: 'application/json; charset=utf-8'
			// , data: JSON.stringify(data)
			, data: JSON.stringify(data)
			, beforeSend : function (xhr) {

				console.log(xhr)
				xhr.setRequestHeader(_header , _token);

				console.log(xhr)
			}

		}).done(function () {
			alert("회원가입이 완료되었습니다");
			window.location.href ="/";

		}).fail(function (error) {
			alert(JSON.stringify(error))
		});

	},

	login : function () {

		// $('form').submit();


		var _token = $('#token').val();
		var _header = $('#header').val();


		$.ajax({
			url : "/login",
			type : "post",
			data : $('form').serialize(),
			contentType: "application/x-www-form-urlencoded; charset=UTF-8",
			success : function (data) {

				console.log(data)
				if(data == "success"){
					window.location.href = "/";
				}else{
					alert(data);
				}
			},
			beforeSend : function (xhr) {
				xhr.setRequestHeader(_header , _token)

			}


		})

	}
}