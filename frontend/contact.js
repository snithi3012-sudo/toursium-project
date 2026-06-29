document.getElementById("contactForm")
.addEventListener("submit", async function(e){

    e.preventDefault();

    const contact = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        subject: document.getElementById("subject").value,
        message: document.getElementById("message").value
    };

    try {

        const response = await fetch(
            "http://localhost:8080/contact/send",
            {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(contact)
            }
        );

        const result = await response.text();

        document.getElementById("successMsg").innerHTML =
            "✅ " + result;

        document.getElementById("contactForm").reset();

    } catch(error) {

        document.getElementById("successMsg").innerHTML =
            "❌ Failed to send message";

        console.error(error);
    }
});