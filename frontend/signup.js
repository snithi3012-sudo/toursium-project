document
.getElementById("signupForm")
.addEventListener("submit", function(e){

    e.preventDefault();

    const user = {

        name:
        document.getElementById("name").value,

        email:
        document.getElementById("email").value,

        password:
        document.getElementById("password").value
    };

    fetch(
        "http://localhost:8080/signup/save",
        {
            method:"POST",

            headers:{
                "Content-Type":"application/json"
            },

            body:JSON.stringify(user)
        }
    )

    .then(response => response.text())

    .then(data => {

        alert(data);

        document
        .getElementById("signupForm")
        .reset();
    })

    .catch(error => {

        console.error(error);

        alert("Registration Failed");
    });

});