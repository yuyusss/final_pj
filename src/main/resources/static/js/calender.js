/* calender.js */
$(function(){
    const date = new Date();

    const viewYear= date.getFullYear();
    const viewMonth = date.getMonth();

    document.querySelector('.year_month').textContent = `${viewYear}년 ${viewMonth + 1}월`;

    const prevLast = new Date(viewYear, viewMonth, 0);
    const thisLast = new Date(viewYear, viewMonth + 1, 0);

// 지난달 마지막 날짜와 요일
    const PLDate = prevLast.getDate();
    const PLDay = prevLast.getDay();

// 이번 달 마지막 날짜, 요일
    const TLDate = thisLast.getDate();
    const TLDay = thisLast.getDay();

// 전체 달력에 필요한 날짜 생성
    const prevDates = [];
    const thisDates = [...Array(TLDate + 1).keys()].slice(1);
    const nextDates = [];

// prevDates, nextDates 생성(반복문)
    if(PLDay !== 6){
        for(let i=0; i<PLDay + 1; i++){
            prevDates.unshift(PLDate - i);
        }
    }

    for(let i = 1; i< 7 - TLDay; i++){
        nextDates.push(i);
    }

// 만든 데이터 기반 html에 그리기
    const dates = prevDates.concat(thisDates, nextDates);

    dates.forEach((date, i) => {
        dates[i] = `<div class="date">${date}</div>`;
    });

    document.querySelector('.dates').innerHTML = dates.join('');
});
