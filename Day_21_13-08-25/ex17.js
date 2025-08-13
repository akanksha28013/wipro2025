
const questions = [
    {
        question: "What is the capital of India?",
        options: ["Delhi", "Mumbai", "Pune", "Gujrat"],
        correctAnswer: 0,
    },
    {
        question: "In Java, what is the default value of a boolean variable?",
        options: ["true", "false", "null", "undefined"],
        correctAnswer: 0,
    },
    {
        question: "What does CSS stand for?",
        options: ["Color Style Sheets", "Cascading Style Sheets", " Creative Style Sheets", "Computer Style Sheets"],
        correctAnswer: 1,
    },
    {
        question: "What is the square root of 64?",
        options: ["6", "8", "10", "16"],
        correctAnswer: 1,
    },
];

let currentQuestionIndex = 0;
let score = 0;

function displayQuestion() {
    const currentQuestion = questions[currentQuestionIndex];
    document.getElementById("question").textContent = currentQuestion.question;

    const options = document.querySelectorAll(".option");
    options.forEach((option, index) => {
        option.textContent = currentQuestion.options[index];
    });

    document.getElementById("feedback").textContent = "";
    document.getElementById("next-button").style.display = "none";
}

function checkAnswer(selectedOption) {
    const currentQuestion = questions[currentQuestionIndex];
    const correctAnswer = currentQuestion.correctAnswer;

    const feedbackElement = document.getElementById("feedback");
    const nextButton = document.getElementById("next-button");

    if (selectedOption === correctAnswer) {
        score++;
        feedbackElement.textContent = "Correct!";
        feedbackElement.style.color = "green";
    } else {
        feedbackElement.textContent = "Wrong!";
        feedbackElement.style.color = "red";
    }

    document.getElementById("score").textContent = score;
    nextButton.style.display = "inline-block";
}

function nextQuestion() {
    currentQuestionIndex++;
    
    if (currentQuestionIndex < questions.length) {
        displayQuestion();
    } else {
        alert(`Quiz Over! Your final score is: ${score}`);
        currentQuestionIndex = 0;
        score = 0;
        document.getElementById("score").textContent = score;
        displayQuestion();
    }
}
displayQuestion();
