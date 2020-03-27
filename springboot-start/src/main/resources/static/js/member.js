var member = {



	init : function () {
		var _this = this;


	},

	save : function () {

		var data = {
			userId : $('#userId').val()
			, password : $('#password').val()
			, userName : $('#userName').val()
			, userAge : $('#userAge').val()
		};


		$.ajax({
			type: "POST"
			, url: '/api/v1/member'
			, dataType: 'json'
			, contentType: 'application/json; charset=utf-8'
			// , data: JSON.stringify(data)
			, data: JSON.stringify(data)

		}).done(function () {
			alert("회원가입이 완료되었습니다");
			window.location.href ="/";

		}).fail(function (error) {
			alert(JSON.stringify(error))
		});

	},

	login : function () {


		$.ajax({
			url : "/login",
			type : "post",
			data : $('form').serialize(),
			contentType: "application/x-www-form-urlencoded; charset=UTF-8",
		}).done(function (data) {

			if(data == "success"){


				window.location.href = "/";
			}else{
				alert(data);
			}
		}).fail(function (error) {
			alert(JSON.stringify(error))
		});

	}
}