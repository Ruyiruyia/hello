function login() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    var xhr = new XMLHttpRequest();
    xhr.open("GET", "http://localhost:8080/login/login?name=" + username + "&password=" + password, true);
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {
            var result = JSON.parse(xhr.responseText);
            var alert = document.getElementById("result");
            if (result.code === 1001) {
                alert.className = "alert";
                window.location.replace("/home/home.html");
            } else {
                alert.className = "alert alert-danger";
                alert.innerHTML = result.msg;
            }
        }
    }
    xhr.send();
}
