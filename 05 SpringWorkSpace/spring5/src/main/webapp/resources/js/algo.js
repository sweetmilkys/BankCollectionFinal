var algo = algo || {};
algo = {
	init : x => {
		algo.onCreate(x);
		algo.setContextView();
	},
	onCreate : x => {
		algo.router.onCreate(x);
	},
	setContextView : () => {
		$('#wrapper').empty();
	}
};
algo.main = (()=>{
	let $wrapper, ctx, img, script, style, compo, json, $tl, $tr;
	let onCreate = () => {
		ctx = $.ctx();
		img = $.img();
		script = $.script();
		style = $.style();
		compo = script + '/compo.js'
		setContextView();
	};
	let setContextView = () => {
		$('#wrapper').html('<h1>알고리즘</h1><div id="ctn"></div><span id="seq">수열</span><span id="appl">응용</span>'
			+ '<table id="tbl" style="width:800px; height: 300px;'		
			+ 'border-collapse: collapse; border: 1px solid black; margin: 0 auto">'
			+ '<tr style="border: 1px solid black;">'
			+ '<td id="tl" style="width: 50%; border: 1px solid black; text-align: center;"></td>'
			+ '<td id="tr" style="width: 50%; border: 1px solid black;"></td>'
			+ '</tr>'
			+ '</table>'
			+'</div>'
		);
		$tl = $('#tl');
		$tr = $('#tr');
		$('#seq').click( x => {
			$('#tl').empty();
			$('#tr').empty();
			$('<ul/>').attr({id : 'sideMenu'}).addClass('listGroup').appendTo($tl);
			$('<li/>').attr({id : 'arith'}).addClass('listGroupItem').appendTo($('#sideMenu'));
			$('<a/>').attr({href: '#'}).html('등차수열의합')
			.appendTo($('#arith'))
			.click(e=>{
				$('#tr').empty();
				$('<div/>').attr({id : 'quest'}).appendTo($tr);
				$('<h4>').html('등차수열에 대하여 시작값 x로부터 y번째항까지의 합을 구하시오').appendTo($('#quest'));
				$([{t1 : '시작값', t2 : 'start'}, {t1 : '종료값', t2 : 'end'}, {t1 : '공차', t2 : 'diff'}])
				.each(function() {
					$('<label/>').html(this.t1).appendTo($('#quest'));
					$('<input/>').attr({id: this.t2, type: 'text', placeholder: '숫자를 입력하세요'}).appendTo($('#quest'));
					$('<br/>').appendTo($('#quest'));			 
				  });
				$('<button/>')
				.addClass('btn btn-primary')
				.attr({type : 'button'})
				.text('결과보기')
				.appendTo($('#quest'))
				.click(e=>{
					if($.fn.zeroChk([+$('#start').val(), +$('#end').val(), +$('#diff').val()])) {
						alert('빈칸을채우세요');
					}else {
						let a = '답 : ';
						let s = +$('#start').val();
						let en = +$('#end').val();
						let d = +$('#diff').val();
						let i = s;
						let sum = 0;
						while(i<=en){
							sum += s + (i-1) * d;
							i++;
						}
						$('#res').text(a+sum);
					}
				});
				$('<h6/>').attr({id:'res'}).appendTo($('#quest'));
			});
			$('<li/>').attr({id : 'fibonacci'}).addClass('listGroupItem').appendTo($('#sideMenu'));
			$('<a/>').html('피보나치수열').appendTo($('#fibonacci')).click(e=>{algo.series.fibonacci(e);});
			$('<li/>').attr({id : 'swit'}).addClass('listGroupItem').appendTo($('#sideMenu'));
			$('<a/>').html('스위치수열').appendTo($('#swit')).click(e=>{algo.series.swit(e);});
			$('<li/>').attr({id : 'factorial'}).addClass('listGroupItem').appendTo($('#sideMenu'));
			$('<a/>').html('팩토리얼수열').appendTo($('#factorial')).click(e=>{algo.series.factorial(e);});
		});
		$('#appl').click( x => {
			$('#tl').empty();
			$('#tr').empty();
			$.getScript(compo, ()=>{
				ui.ul({len : 3, id: 'menu'}).appendTo($tl);
				ui.anchor({txt:'화폐문제'}).appendTo($('#menu-0'))
				.click(x=>{
					$('<h6>화폐문제</h6>').appendTo($tr);
					ui.input({id: 'money', type: 'text', txt : '입금액', holder : '입금액'})
					.appendTo($tr);
					ui.button({clazz: 'primary', txt: '전송'})
					.appendTo($tr)
					.click(e=>{
						alert('화폐금액 : '+$('#money').val());
						$.ajax({
							url : ctx + '/algo/money/',
							method : 'POST',
							contentType : 'application/json',
							data : JSON.stringify({money : $('#money').val()}),
							success : d => {
								alert('성공'+d.test);
							},
							error : (m1, m2, m3)=>{
								alert('에러발생1'+m1);
								alert('에러발생2'+m2);
								alert('에러발생3'+m3);
							}
						});
					});
				});
			});
		});
	};
	return{
		onCreate : onCreate,
		setContextView : setContextView
	};
})();
algo.series = {
	fibonacci : x => {
		let q = '<h3>피보나치수열에 대하여 시작값 x로부터, y번째항까지의 합을 구하시오</h3>'
				+ '<label for="시작값">시작값</label><input id="start" type="text"><br>'
				+ '<label for="항">항값</label><input id="diff" type="text"><br>'
				+ '<button id="btn">결과보기</button>';
		$('#tr').empty();
		$('#tr').append(q);
		$('#btn').click(e=>{
			if($.fn.zeroChk([$('#start').val()*1, $('#end').val()*1, $('#diff').val()*1])) {
				alert('빈칸을채우세요');
			}else {
				let a = '답 : ';
				let n1 = +$('#start').val();
				let n2 = 1;
				let sum = n1 + n2;
				let c = 0;
				let i = 2;
				while(true){
					c = n1 + n2;
					sum += c;
					n1 = n2;
					n2 = c;
					i++;
					if(i == +$('#diff').val()) break;
				}
				$('#tr').text(a+sum);
			}
		});
	},
	swit : x => {
		let q = '<h3>시작값 x, 마지막값 y인 값인 교행 자연수 수열의 합을 구하시오</h3>'
				+ '<label for="시작값">시작값</label><input id="start" type="text"><br>'
				+ '<label for="마지막값">마지막값</label><input id="end" type="text"><br>'
				+ '<button id="btn">결과보기</button>';
		$('#tr').empty();
		$('#tr').append(q);
		$('#btn').click(e=>{
			let a = '답 : ';
			let n = +$('#start').val();
			let sum = n;
			while(true){
				n += 1;
				sum -= n;
				if(n == +$('#end').val()) break;
				n++;
				sum += n;
				if(n == +$('#end').val()) break;
			}
			$('#tr').text(a+sum);
		});
	},
	factorial : x => {
		let q = '<h3>시작값 x, 마지막값 y인 누승의 합을 구하시오</h3>'
				+ '<label for="시작값">시작값</label><input id="start" type="text"><br>'
				+ '<label for="마지막값">마지막값</label><input id="end" type="text"><br>'
				+ '<button id="btn">결과보기</button>';
		$('#tr').empty();
		$('#tr').append(q);
		$('#btn').click(e=>{
			let a = '답 : ';
			let n = +$('#start').val();;
			let f = 1;
			let sum = 1;
			while(true){
				n++;
				f *= n;
				sum += f;
				if(n == $('#end').val()*1) break;
			}
			$('#tr').text(a+sum);
		});
	}
};
algo.array = {
	bubble : x => {
		let q = '<h3>학생 n명의 영어성적을 오름차순으로 버블정렬하시오</h3>'
			+ '<label for="학생1">학생1</label><input id="s1" type="text"><br>'
			+ '<button id="btn">결과보기</button>'
	$('#tr').empty();
	$('#tr').append(q);
	$('#btn').click(e=>{
		let a = '답 : ';
		let n = +$('#start').val();;
		let f = 1;
		let sum = 1;
		while(true){
			n++;
			f *= n;
			sum += f;
			if(n == $('#end').val()*1) break;
		}
		$('#tr').text(a+sum);
	});
	},
	insert : x => {},
	select : x => {},
	ranking : x => {}
};
algo.matrix = {
	fiveBy5 : x => {},
	sandGlass : x => {},
	snail : x => {},
	diamond : x => {},
	zigzag : x => {}
};
algo.math = {
	
};
algo.appl = {
	
};
algo.router = {
	onCreate : x => {
		$.getScript(x + '/resources/js/router.js',
			() => {
					$.extend(new Session(x));
					$.getScript($.ctx() + '/resources/js/util.js')
						.done(x=>{console.log('실행');})
						.fail(x=>{console.log('실패');})
					;
					algo.main.onCreate();
				}
		);
	}
};