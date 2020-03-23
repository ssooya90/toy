

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
			password : _pw.val()
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

	},


	update : function () {


		var param = {
			userId : $('input[name=userId]').val()
			, userName : $('input[name=userName]').val()
			, userAge : $('input[name=userAge]').val()
		};

		$.ajax({
			type : 'PUT'
			, url: '/myinfo/update/' + param.userId
			, dataType: 'json'
			, contentType: 'application/json; charset=utf-8'
			, data: JSON.stringify(param)
		}).done(function (data) {
			alert("회원정보 수정완료");
			window.location.href='/';
		}).fail(function (data) {
			console.log(data)
		});

	},

	delete : function () {


		if(confirm("탈퇴 후 재가입은 불가능합니다. 탈퇴하시겠습니까?")){

			$.ajax({
				type : 'POST'
				, url: '/myinfo/delete/'
				, dataType: 'json'
				, contentType: 'application/json; charset=utf-8'
				, data: JSON.stringify(param)
			}).done(function (data) {
				alert("회원탈퇴 완료");
				window.location.href='/';
			}).fail(function (data) {
				console.log(data)
			});

		}



	}


};