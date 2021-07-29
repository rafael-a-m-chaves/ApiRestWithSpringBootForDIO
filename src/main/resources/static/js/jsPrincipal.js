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
        .then(function(response){
            if (response.status !=200){
                var lblErrorUserPass = document.getElementById("lblErrorUserPass");
                $(lblErrorUserPass).show();
            }else{
                var lblErrorUserPass = document.getElementById("lblErrorUserPass");
                $(lblErrorUserPass).hide();
                response.json()
                .then((data1) => {
                window.localStorage.setItem('token',data1.token);
                return window.location.href ="http://localhost:8081/hub"
                
            })
            
        }
        }) 
        .catch((error) => {
            console.error("Error:", error);
    });

}
async function redirecionar(){
    let html ="";
    let log22 = await fetch("/hub", {
        method: "GET",
        headers: {
            "X-Content-Type-Options":"nosniff",
            "X-XSS-Protection":"1; mode=block",
            "X-Frame-Options":"DENY",
            "Content-Type": "text/html;charset=UTF-8",
            "Content-Language":"pt-BR",
            "Transfer-Encoding":"chunked",
            "Authorization": "Bearer " + window.localStorage.getItem('token'),
        },
        })
        .then(function(response){

            if (response.status != 200){
                alert("Problema Para Carregar os Dados");
                return;
            }
    
            response.text().then(function(text){
                html = text;
                console.log(html);
            });
        })
        .catch((error) => {
            console.error("Error:", error);
    });

    
};
    
