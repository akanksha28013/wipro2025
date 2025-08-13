function validateEmail() { 
    const email = document.getElementById("email").value;
    const emailError = document.getElementById("emailError");
    const emailPattern = /^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/;

    if (!email) {
        emailError.textContent = "Email is mandatory.";
    } else if (!emailPattern.test(email)) {
        emailError.textContent = "Invalid email format.";
    } else {
        emailError.textContent = "";
    }
}

        function validatePassword() {
            const password = document.getElementById("password").value;
            const passwordError = document.getElementById("passwordError");
            if (!password) {
                passwordError.textContent = "Password cannot be empty.";
            } else {
                passwordError.textContent = "";
            }
        }

        function validateForm() {
            validateEmail();
            validatePassword();
            const emailError = document.getElementById("emailError").textContent;
            const passwordError = document.getElementById("passwordError").textContent;
            return !emailError && !passwordError;
        }