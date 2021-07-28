function enviar2(){
    var user = document.getElementById("username");
    var pass = document.getElementById("password")
    const data =  {username:user.value, password:pass.value};
    fetch("/", {
        method: "POST",
        headers: {
        "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
        })
        .then((response) => response.json())
        .then((data1) => {
            window.localStorage.setItem('token',data1.token);
            return redirecionar();
        })
        .catch((error) => {
            console.error("Error:", error);
    });

}
function redirecionar(){
    fetch("/hub", {
        method: "GET",
        headers: {
        "Content-Type": "application/json",
        "Authorization": "Bearer " + window.localStorage.getItem('token'),
        },
        })
        .then((response) => {
            let reader = response.body.getReader();
            reader.read().then(function(data){  
                document.open();
                document.write(String.fromCharCode.apply(null, data.value));
            });
            
        })
        .catch((error) => {
            console.error("Error:", error);
    });
};
    