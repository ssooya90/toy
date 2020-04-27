var lottoNum = [];

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

		// 임시값
		var _param = {}; // 오브젝트 선언


		$.each(_parents.find('input[type=checkBox]'), function (index, item) {

			if($(this).prop("checked")){

				_lotto.push($(this).val());

				switch (_cnt) {

					case 0 :
						_param.lotto1 = $(this).val();
						break;
					case 1 :
						_param.lotto2 = $(this).val();
						break;
					case 2 :
						_param.lotto3 = $(this).val();
						break;
					case 3 :
						_param.lotto4 = $(this).val();
						break;
					case 4 :
						_param.lotto5 = $(this).val();
						break;
					case 5 :
						_param.lotto6 = $(this).val();
						break;
				}

				_cnt++;

				console.log(_param)

			}

		});


		if(_auto.prop("checked")){


		}else{

			if(_cnt != 6){

				alert("입력하지 않았습니다.");
				_param = {};

				return;

			}else{

				$('#selectNum').append(this.makeNum(_lotto));
				lottoNum.push(_param);

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


	lottoBuy : function () {

		var param = {
			lottoList : lottoNum
		};


		var _arry = [];

		var test = {
			name : "최희수"
		};

		console.log(test)

		_arry.push(test);

		var test = {
			name : "이연지"
		};

		console.log(test)


		_arry.push(test);





		console.log(JSON.stringify(_arry))


		$.ajax({
			type  : 'POST',
			url : '/game/lotto/buy',
			dataType : 'json',
			contentType : 'application/json; charset=utf-8',
			data : JSON.stringify(_arry),
		}).done(function () {
			alert('글이 등록되었습니다.');
			window.location.href= '/';
		}).fail(function (error) {
			alert(JSON.stringify(error));
		});

	}


};

game.init();