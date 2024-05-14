
document.addEventListener('DOMContentLoaded', function() {
    var texts = [
        "Web Designer", "Web Developer", "Front End Developer", "Apps Designer", "Apps Developer"
    ]; // Array of texts to display
    var delay = 1000; // Delay between each text in milliseconds
    var textIndex = 0; // Index of the current text being typed
    var charIndex = 0; // Index of the current character being typed
    var elem = document.getElementById('typing-text');

    function type() {
        if (charIndex <= texts[textIndex].length) {
        elem.textContent = texts[textIndex].substring(0, charIndex++);
        setTimeout(type, delay / texts[textIndex].length);
        } else {
        charIndex = 0;
        textIndex = (textIndex + 1) % texts.length;
        setTimeout(type, delay);
        }
    }

    type();
});


  