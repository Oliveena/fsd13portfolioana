"use strict";

/*========================================== adding a modal to download buttons ==========================================*/
// Adding a modal to download buttons
$(document).ready(function () {

  // Triggering file download after form submission
  $('#downloadForm').on('submit', function (e) {
    e.preventDefault(); // Prevent default form submission

    // Getting the selected file (PDF or Word) from the button's data-file attribute
    var file = $('#download-btn').data('file');
    if (!file) {
      alert('No file selected for download');
      return;
    }

    // Collecting the user input for name and email
    var NAME = $('#userName').val().trim();
    var EMAIL = $('#userEmail').val().trim();

    var valid = true;
    var errorMessages = [];

    // Email validation regex
    var emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;

    // Validation checks for Name and Email
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

    // Show error messages if any validation fails
    if (!valid) {
      alert(errorMessages.join("\n"));
      return;
    }

    // Store user details in localStorage
    localStorage.setItem('userName', NAME);
    localStorage.setItem('userEmail', EMAIL);

    console.log("Stored Name or Company: " + localStorage.getItem('userName'));
    console.log("Stored Email: " + localStorage.getItem('userEmail'));

    // Hide the modal after successful submission
    var modal = bootstrap.Modal.getInstance(document.getElementById('downloadModal'));
    modal.hide();

    // Trigger the file download after the modal closes
    setTimeout(function () {
      window.location.href = file; // Initiates the file download
    }, 500); // Adding a small delay to allow modal to close properly before triggering download
  });

  // Handling the button click to set the file to be downloaded
  $('#pdf-cv, #word-cv').on('click', function () {
    var file = $(this).data('file');
    $('#download-btn').data('file', file); // Store the selected file for later use
  });

  console.log("Adding a modal to download buttons");

});
