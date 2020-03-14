

var myInfo = {

	pwChk : function () {

		var _pw = $('#password');

		if(_pw.val() == ""){
			alert("비밀번호를 입력해주세요!.!");
			_pw.focus();
		}

		// var myInfo = {
		// 	pw : _pw.val()
		// };

		var data = {
			userId : 'asdf'
			, password : 'asdf'
			, userName : 'asdf'
			, userAge : '30'
		};

		$.ajax({
			type: "POST"
			, url: '/myInfo/pwChk'
			, dataType: 'json'
			, contentType: 'application/json; charset=utf-8'
			, data : JSON.stringify(data)
			, success : function (data) {
				console.log(data)
			}
		})

	}

};