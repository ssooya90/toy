
var boardUpdate = {

	init : function (){


		var _this = this;
		console.log(_this)
	},


	commentSave : function (){


		console.log("HERE")

		var _params = {
			boardId : $('input[name=id]').val(),
			writer : $('input[name=commentWriter]').val(),
			content : $('textarea[name=commentContent]').val()
		}


		console.log(_params)

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