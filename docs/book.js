document.getElementById("registerForm").addEventListener("submit", async function (e) {

    e.preventDefault();

    const booking = {
        name: document.getElementById("name").value,
        age: parseInt(document.getElementById("age").value),
        mobile: document.getElementById("mobile").value,
        email: document.getElementById("email").value,
        place: document.getElementById("place").value,
        members: parseInt(document.getElementById("members").value),
        travelDate: document.getElementById("travelDate").value
    };

    try {

        const response = await fetch("https://toursium-project-production.up.railway.app/travel/book", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(booking)
        });

        const result = await response.text();

        if (response.ok) {
            alert("✅ " + result);

            document.getElementById("registerForm").reset();
        } else {
            alert("❌ Booking Failed");
            console.log(result);
        }

    } catch (error) {

        console.error(error);
        alert("❌ Cannot connect to server. Check Spring Boot is running.");

    }

});