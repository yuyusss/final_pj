/**
 * 
 */
window.onload = function(){
	
    document.getElementById("memberAddress").addEventListener("click", function(){ 
        new daum.Postcode({
            oncomplete: function(data) { //선택시 입력값 세팅
                document.getElementById("memberAddress").value = data.address; // 주소 넣기
                document.querySelector("input[name=memberAddress_Detail]").focus(); //상세입력 포커싱
            }
        }).open();
    });
}
    
