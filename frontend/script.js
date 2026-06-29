function login() {

    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    fetch("https://toursium-project-production.up.railway.app/Login/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/x-www-form-urlencoded"
        },
        body: `username=${encodeURIComponent(username)}&password=${encodeURIComponent(password)}`
    })
        .then(response => response.text())
        .then(data => {
            alert(data);
        })
        .catch(error => {
            console.error("Error:", error);
            alert("Failed to connect to backend");
        });
}
const slides = document.querySelectorAll(".slide");
const next = document.getElementById("next");
const prev = document.getElementById("prev");

let current = 0;

function showSlide(index){

    slides.forEach(slide=>{
        slide.classList.remove("active");
    });

    slides[index].classList.add("active");

    gsap.fromTo(
        slides[index].querySelector("img"),
        {scale:1.2},
        {scale:1,duration:1.2}
    );

    gsap.fromTo(
        slides[index].querySelector("h1"),
        {y:100, opacity:0},
        {y:0, opacity:1, duration:1}
    );
}

next.addEventListener("click",()=>{
    current = (current + 1) % slides.length;
    showSlide(current);
});

prev.addEventListener("click",()=>{
    current = (current - 1 + slides.length) % slides.length;
    showSlide(current);
});

showSlide(current);
document.getElementById("contactForm")
    .addEventListener("submit", function(e){

        e.preventDefault();

        document.getElementById("successMsg").innerHTML =
            "✅ Message Sent Successfully!";

        document.getElementById("successMsg").style.color = "#00ff66";
        document.getElementById("successMsg").style.fontWeight = "bold";
        document.getElementById("successMsg").style.marginTop = "15px";

        document.getElementById("contactForm").reset();
    });