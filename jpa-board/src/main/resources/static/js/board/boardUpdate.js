
var boardUpdate = {

	init : function (){


		var _this = this;
		console.log(_this)
	},

	update : function (){

		var _params = {
			boardId : $('input[name=id]').val(),
			title : $('input[name=title]').val(),
			writer : $('input[name=writer]').val(),
			content : $('textarea[name=commentContent]').val()
		}

		$.ajax({
			type: "post"
			, url: '/post'
			, data: JSON.stringify(_params)
			, dataType: 'text'
			, contentType: 'application/json; charset=utf-8'
		}).done(function (data) {

			console.log(data)
			alert("작성완료 완료되었습니다.")

			$('form').append(data);
			// window.location.href("/")

		}).fail(function (error) {
			alert(JSON.stringify(error))

		})

	},


	commentSave : function (){


		console.log("HERE")

		var _params = {
			boardId : $('input[name=id]').val(),
			writer : $('input[name=commentWriter]').val(),
			content : $('textarea[name=commentContent]').val()
		}


		console.log(JSON.stringify(_params))

		$.ajax({
			type: "post"
			, url : "/comment/save"
			, data: JSON.stringify(_params)
			, dataType: 'text'
			, contentType: 'application/json; charset=utf-8'

		}).done(function (data){
			console.log(data);

		}).fail(function (error){
			alert(JSON.stringify(error))
		});

	}

}

boardUpdate.init();