$(function () {
    //初始化日期时间控件
    $("#dateTimeRange").daterangepicker({
        "timePicker": true,
        "timePicker24Hour": true,
        "timePickerSeconds": true,
        "autoApply": true,
        ranges : {
            '最近1小时': [moment().subtract('hours',1), moment()],
            '今日': [moment().startOf('day'), moment()],
            '昨日': [moment().subtract('days', 1).startOf('day'), moment().subtract('days', 1).endOf('day')],
            '最近7日': [moment().subtract('days', 6), moment()],
            '最近30日': [moment().subtract('days', 29), moment()]
        },
        "locale": {
            "direction": "ltr",
            "format": "YYYY-MM-DD HH:mm:ss",
            "separator": " - ",
            "applyLabel": "确定",
            "cancelLabel": "取消",
            "fromLabel": "起始时间",
            "toLabel": "结束时间",
            "customRangeLabel": "自定义",
            "daysOfWeek": ['日', '一', '二', '三', '四', '五', '六'],
            "monthNames": ['一月', '二月', '三月', '四月', '五月', '六月','七月', '八月', '九月', '十月', '十一月', '十二月' ],
            "firstDay": 1
        },
        "alwaysShowCalendars": true
    }, function(start, end, label) {
        console.log("New date range selected: ' + start.format('YYYY-MM-DD') + ' to ' + end.format('YYYY-MM-DD') + ' (predefined range: ' + label + ')");
    });
	// Switch
	$("div.switch").bootstrapSwitch();
	
	var oTable = $('#dataTable').dataTable( {
        "aoColumnDefs": [
            { "bSortable": false, "aTargets": [ 0 ] }
        ],
        //"aaSorting": [[1, 'asc']],
        "oLanguage": { //国际化配置  
            "sProcessing" : "正在加载数据，请稍后...",
            "sLengthMenu" : "显示 _MENU_ 条",    
            "sZeroRecords" : "没有您要搜索的内容",    
            "sInfo" : "从 _START_ 到  _END_ 条记录 总记录数为 _TOTAL_ 条",    
            "sInfoEmpty" : "记录数为0",    
            "sInfoFiltered" : "(全部记录数 _MAX_ 条)",    
            "sInfoPostFix" : "",    
            "sSearch" : "搜索",    
            "sUrl" : "",    
            "oPaginate": {    
                "sFirst" : "第一页",    
                "sPrevious" : "上一页",    
                "sNext" : "下一页",    
                "sLast" : "最后一页"    
            }  
        },  
    });

    /* 
     * 在详细按钮上添加点击绑定事件
     */
     $("#dataTable").on('click','.details-control', function () {
        var nTr = $(this).parents('tr')[0];
        //判定当前详细栏是否打开
       if (oTable.fnIsOpen(nTr)){
            //已打开，关闭它
          this.src = "img/details_open.png";
            oTable.fnClose( nTr );
        }else{
      	  //未打开，打开它
          this.src = "img/details_close.png";
      	  //获取detail列的内容
          var detail = $(this).next("input").val();
      	  
            oTable.fnOpen(nTr, fnFormatDetails(detail), 'details');
        }
    } );

    $("#dataForm").validate({
        errorElement : 'span',
        errorClass : 'help-block',
        onsubmit : false,
        highlight : function(element) {
            $(element).closest('.form-group').addClass('has-error');
        },
        success : function(label) {
            label.closest('.form-group').removeClass('has-error');
            label.remove();
        },
        errorPlacement : function(error, element) {
            element.parent('div').append(error);
        }
    });
});

/* 构建详细数据 */
function fnFormatDetails (detail)
{
	var array_value = detail.split(";");
    var detail_key = $("#detail_key").val();
    var array_key = detail_key.split(",");
    var sOut = '<table cellpadding="5" cellspacing="0" border="0" style="padding-left:50px;">';
    $.each(array_value, function(i, n){
    	sOut += '<tr><td>'+array_key[i]+':</td><td>'+n+'</td></tr>';
    });
    sOut += '</table>';
    return sOut;
}
