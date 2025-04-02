"use strict";

$(document).ready(function () {

    var fileToDownload = '';

    $('#pdf-cv, #word-cv').click(function() {
        fileToDownload = $(this).data('file');
    });

    $('#downloadForm').on('submit', function (e) {
        e.preventDefault(); 

        var NAME = $('#userName').val().trim();
        var EMAIL = $('#userEmail').val().trim();

        var valid = true;
        var errorMessages = [];

        var emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;

        if (!NAME) {
            valid = false;
            errorMessages.push("Please provide your Name or Company Name.");
        }

        if (!EMAIL) {
            valid = false;
            errorMessages.push("Email cannot be empty.");
        } else if (!emailRegex.test(EMAIL)) {
            valid = false;
            errorMessages.push("Please enter a valid email address.");
        }
        if (!valid) {
            alert(errorMessages.join("\n"));
            return;
        }
        $(this).off('submit').submit();  
        
    });

});

