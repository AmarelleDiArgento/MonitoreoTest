window.addEventListener('load', () => {
    let online = window.navigator.onLine;
    console.log("Estado: " + online);
    estado(online);
    //console.log(postco);
});

function estado(stat) {
    var s = document.getElementById('status')
    if (stat) {
        goOnline();
    } else {
        goOffline();
    }

    function goOnline() {
        s.classList.remove('offline');
        s.classList.add('online');
        s.innerHTML = '<a href="jsonfiles">Online</a>';
    }

    function goOffline() {
        s.classList.remove('online');
        s.classList.add('offline');
        s.innerHTML = "Offline";
        Campos();
    }
}

$(document).ready(function () {
    $("button").click(function () {
        //let pre = document.querySelector('#Test');
        //console.log("Entramos a la funcion :D");
        const xhttp = new XMLHttpRequest();
        xhttp.open('GET', 'JSON/causas.json', true)
        xhttp.send();
        xhttp.onreadystatechange = function () {
            if (this.readyState == 4 && this.status == 200) {
                let Causas = JSON.parse(this.responseText);
                //let
                $.each(Causas, function (i, item) {

                    $.each(item, function (b, data) {
                        $("#Test").append('<option value="' + data.id + '">' + data.nombre + '</option>');
                    });
                });

            }

        }
    });
});