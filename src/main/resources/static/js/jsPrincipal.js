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
            console.log("Success:", data1);
            window.localStorage.setItem('token',data1.token);
            return redirecionar();
        })
        .catch((error) => {
            console.error("Error:", error);
    });

}
function redirecionar(){
    fetch("/tipodata/all", {
        method: "GET",
        headers: {
        "Content-Type": "application/json",
        "Authorization": "Bearer " + window.localStorage.getItem('token'),
        },
        })
        .then((response) => response.json())
        .then((data) => {
            console.log("Success:", data);
        })
        .catch((error) => {
            console.error("Error:", error);
    });
};
    