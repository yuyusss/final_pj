$.ajax({
    url: '/insertCalendar',
    type: 'GET',
    success: function(res){
        var list = res;
        console.log(list);

        var calendarE1 = document.getElementsById('calendar');

        var events = list.map(function(item){
            return{
                title : item.calTitle,
                start : item.calDate + "T" + item.calTime
            }

        });

        var calendar = new FullCalendar.Calendar(calendarE1, {
            events: events,
            eventTimeFormat: {
                hour: '2-digit',
                minute: '2-digit',
                hour12: false
            }
        });
        calendar.render();
    },
});