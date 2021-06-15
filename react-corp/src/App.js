import React, {Component} from 'react';
import './App.css';
import './resources/scss/reset.css';
import './resources/scss/style.css';

// import './resources/scss/ui.css';

class App extends Component {
	render() {
		return (
			<div class="container">

				<header>

					<div class="inner">

						<div class="header__menu">
							<nav>
								<ul>
									<li>
										<a href="ㅜㅁㅍㄷ" class="current">프로젝트 관리</a>
									</li>
									<li>
										<a href="ㅜㅁㅍㄷ">프로젝트 등록</a>
									</li>
									<li>
										<a href="ㅜㅁㅍㄷ">담당자 관리</a>
									</li>
								</ul>
							</nav>


							<div class="header_menu__right">
								<a href="#none">로그인</a>
								<a href="#none">회원가입</a>

								<a href="#none">로그아웃</a>
							</div>
						</div>

					</div>
				</header>

				<div class="wrapper">


					<article class="table-list">
						<div class="inner">
							<div class="table-list-tit">테이블 타이틀</div>

							<article class="search__form">
								<select>
									<option>프로젝트명</option>
									<option>담당자</option>
								</select>
								// input 끝날 때 / 입력해줘야함
								<input placeholder="검색어 입력"/>
								<a href="#none" class="search-btn">검색</a>
							</article>

							<table>
								<thead>
									<tr>
										<th>NO</th>
										<th>프로젝트명</th>
										<th>담당자</th>
										<th>상태</th>
										<th>등록일시</th>
										<th>메뉴</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>냉매</td>
										<td>신혜욱</td>
										<td>완료</td>
										<td>2020-10-02</td>
										<td>
											<a href="#none" class="view-btn">상세보기</a>
										</td>
									</tr>
									<tr>
										<td>1</td>
										<td>냉매</td>
										<td>신혜욱</td>
										<td>완료</td>
										<td>2020-10-02</td>
										<td>
											<a href="#none" class="view-btn">상세보기</a>
										</td>
									</tr>
									<tr>
										<td>1</td>
										<td>냉매</td>
										<td>신혜욱</td>
										<td>완료</td>
										<td>2020-10-02</td>
										<td>
											<a href="#none" class="view-btn">상세보기</a>
										</td>
									</tr>
									<tr>
										<td>1</td>
										<td>냉매</td>
										<td>신혜욱</td>
										<td>완료</td>
										<td>2020-10-02</td>
										<td>
											<a href="#none" class="view-btn">상세보기</a>
										</td>
									</tr>
									<tr>
										<td>1</td>
										<td>냉매</td>
										<td>신혜욱</td>
										<td>완료</td>
										<td>2020-10-02</td>
										<td>
											<a href="#none" class="view-btn">상세보기</a>
										</td>
									</tr>
								</tbody>
							</table>
							<article class="paging">
								<ul>
									<li>
										<a href="#none" class="current">1</a>
									</li>
									<li>
										<a href="#none">2</a>
									</li>
									<li>
										<a href="#none">3</a>
									</li>
								</ul>
							</article>
						</div>
					</article>

				</div>


			</div>

		);
	}
}

export default App;
