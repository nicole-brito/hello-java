function calcular(oper){
    let valor1 = document.calcform.valor1.value;

    var porhora = 60;

    var turno = 480;

    var min = document.calcform.minutos.value

            if(oper == "porhora"){
                var res = parseFloat(valor1.replace(',', '.', ':'))/porhora;
                res = min + valor1;
            }else{
                var res = parseFloat(valor1.replace(',', '.', ':'))/turno;
            }
            document.calcform.res.value = res;
        }

    