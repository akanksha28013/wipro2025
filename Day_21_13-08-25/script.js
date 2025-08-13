// function changeText(newText) {
//     var header = document.getElementById('text');
//     header.textContent = newText;  
// }

// changeText('New Text Changed by JavaScript!');

// function printTextLength() {
//     var t1 = document.getElementById('t1').value;
//     var length = t1.length;
//     console.log('Length of text: ' + length); 
// }


function updateRemainingChars() {
    var textInput = document.getElementById('textInput').value;  
    var remaining = 50 - textInput.length; 
    document.getElementById('remainingChars').textContent = remaining + ' characters remaining'; 
}


