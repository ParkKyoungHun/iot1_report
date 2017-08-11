/**
 * 공통함수 javascript파일
 */
//Javascript Numer객체 비교 프로토타입 함수 추가.
Number.prototype.equals = function(obj){
	if(obj instanceof Number){
		return this.toString() == obj.toString();
	}
	return this==obj;
}

//Ajax + Json 을 이용한 페이지 이동 공통 함수
function movePageWithAjax(pParams, pUrl, pCallBackFunc, pMethod){
	var params = JSON.stringify(pParams);
	$.ajax({ 
    		type     : pMethod ? pMethod:"POST"
	    ,   url      : pUrl
	    ,   dataType : "json" 
	    ,   beforeSend: function(xhr) {
	        xhr.setRequestHeader("Accept", "application/json");
	        xhr.setRequestHeader("Content-Type", "application/json");
	    }
	    ,   data     : params
	    ,   success : pCallBackFunc
	    ,   error : function(xhr, status, e) {
		    	alert("에러 : "+e);
		},
		complete  : function() {
		}
	});
}

//pagination 이벤트 적용 공통 함수
// * 단 ul태그 > li태그 > a태그 형식이여야하며
//    ul태그의 class명은 반드시 pagination이여야 함
function setEvent(pageInfo, pUrl){
	$("ul[class='pagination']>li:not([class='disabled'],[class='active'])>a").click(function(){
		var thisNowPage = pageInfo.nowPage;
		var goPageNum = new Number(this.innerHTML);
		if(isNaN(goPageNum)){
			if(this.innerHTML=="◀"){
				thisNowPage -= pageInfo.blockCnt;
			}else if(this.innerHTML=="◀◀"){
				thisNowPage = 1;
			}else if(this.innerHTML=="▶"){
				thisNowPage += pageInfo.blockCnt;
			}else if(this.innerHTML=="▶▶"){
				thisNowPage = pageInfo.totalPageCnt;
			}
			if(thisNowPage<=0){
				thisNowPage = 1;
			}else if(thisNowPage>pageInfo.totalPageCnt){
				thisNowPage = pageInfo.totalPageCnt;
			}
			goPageNum = thisNowPage;
		}

		var page = {};
		page["nowPage"] = "" + goPageNum;
		var params = {};
		params["page"] = page;
		params["command"] = "list";
		movePageWithAjax(params, pUrl, callback);
	})
}