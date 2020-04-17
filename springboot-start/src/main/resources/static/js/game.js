var game = {

	init : function () {
		var _this = this;

		this.lottoMake();



		$('#writeMoveBtn').on('click',function () {

			_this.write_move();
		});

	},


	selectChange : function (e) {

		var _parents = 	$('.numberSelect');
		var _cnt = 0;


		console.log("1")

		$.each(_parents.find('input[type=checkBox]'),function (index, item) {

			$(this).prop("checked") ? _cnt++ : '';
		});




		if(_cnt == 7){

			alert("6개까지 선택이 가능합니다.");
			$(e).prop("checked",false);
		}







	},

	// 로또 생성
	lottoMake : function () {

		var _parents = 	$('.numberSelect');
		var _str = "";

		for(var i = 1 ; i <= 45 ; i ++){

			_str +=  '<div class="numBox">';
			_str += '	<input type="checkbox" name="lottoNum" value="' + i + '" id="num' + i + '" onchange="game.selectChange(this)">';
			_str += '	<label for="num' + i + '">';
			_str += '		<span class="numTxt">' + i +'</span>';
			_str += '	</label>';
			_str += '</div>';

		}

		_parents.append(_str);

}
};

game.init();