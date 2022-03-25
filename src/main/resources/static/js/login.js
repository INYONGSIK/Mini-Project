
        let id ="<c:out value='${id}'/>";
        let pw = "<c:out value='${pw}'/>";
        let btn = "<c:out value='${btn}'/>";

        $(btn).on('click', function() {
            if($(id).val() ==""){
                $(id).next('label').addClass('warning');
                setTimeout(function() {
                    $('label').removeClass('warning');
                })
            }
            else if($(pw).val() == ""){
                $(pw).next('label').addClass('warning');
            }
        })
