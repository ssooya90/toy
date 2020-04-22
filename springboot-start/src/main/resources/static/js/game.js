var game = {

	init: function () {
		var _this = this;

		this.lottoMake();


		$('#writeMoveBtn').on('click', function () {

			_this.write_move();
		});

	},


	selectChange: function (e) {

		var _parents = $('.numberSelect');
		var _cnt = 0;


		console.log("1")

		$.each(_parents.find('input[type=checkBox]'), function (index, item) {

			$(this).prop("checked") ? _cnt++ : '';
		});


		if (_cnt == 7) {

			alert("6개까지 선택이 가능합니다.");
			$(e).prop("checked", false);
		}

	},

	// 로또 생성
	lottoMake: function () {

		var _parents = $('.numberSelect');
		var _str = "";

		for (var i = 1; i <= 45; i++) {

			_str += '<div class="numBox">';
			_str += '	<input type="checkbox" name="lottoNum" value="' + i + '" id="num' + i + '" onchange="game.selectChange(this)">';
			_str += '	<label for="num' + i + '">';
			_str += '		<span class="numTxt">' + i + '</span>';
			_str += '	</label>';
			_str += '</div>';

		}

		_parents.append(_str);

	},

	// 로또번호 선택
	lottoSelect : function () {

		var _amount = $('#amount');
		var _auto = $('#autoSelect');

		var _parents = $('.numberSelect');
		var _cnt = 0;

		var _lotto = [];

		$.each(_parents.find('input[type=checkBox]'), function (index, item) {

			if($(this).prop("checked")){
				_cnt++;
				_lotto.push($(this).val());
			}
		});


		if(_auto.prop("checked")){


		}else{

			if(_cnt != 6){

				alert("입력하지 않았습니다.");
				return;

			}else{

				$('#selectNum').append(this.makeNum(_lotto));

			}
		}



	},

	makeNum : function (data) {

		var _str = "";


		_str += '<div class="row">';
		for(var i = 0 ; i < data.length ; i++){
			_str += '<span>' + data[i] + '</span>';
		}
		_str += '</div>';



		return _str;

	},



};

game.init();