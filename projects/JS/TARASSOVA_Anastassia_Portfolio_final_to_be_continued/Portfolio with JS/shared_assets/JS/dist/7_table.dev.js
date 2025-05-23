"use strict";

/*========================================== Table (case 6) ==========================================*/
// applicable to books on Hobbies page
// creating elements is more responsive than document.writeln()
// however, I didn't find a solution to the "delete" affecting pre-entered book suggestions 
// that are supposed to be immutable
document.addEventListener('DOMContentLoaded', function () {
  // making a table
  var table = document.createElement('table');
  table.id = 'bookTable'; // making table header (row)

  var thead = document.createElement('thead');
  var headerRow = document.createElement('tr'); // making table header (contents)

  var th1 = document.createElement('th');
  th1.textContent = 'Book Title';
  var th2 = document.createElement('th');
  th2.textContent = 'Author';
  var th3 = document.createElement('th');
  th3.textContent = 'Actions'; // appending children to parent

  headerRow.appendChild(th1);
  headerRow.appendChild(th2);
  headerRow.appendChild(th3);
  thead.appendChild(headerRow); // making table body

  var tbody = document.createElement('tbody'); // appending th and tb to table

  table.appendChild(thead);
  table.appendChild(tbody); // appending full table to container .suggested-books

  document.querySelector('.suggested-books').appendChild(table); // defining my array of "previous suggestions"

  var suggested_books = [{
    title: "Chateaux de la colere",
    author: "Alessandro Barrico"
  }, {
    title: "The Glass Castle",
    author: "Jeannette Walls"
  }, {
    title: "Goodnight Punpun",
    author: "Inio Asano"
  }, {
    title: "Why Lhasa de Sela Matters",
    author: "Fred Goodman"
  }, {
    title: "Le Semaphore d'Alexandrie",
    author: "Robert Sole"
  }]; // a loop pushing array into table

  suggested_books.forEach(function (book, index) {
    addRowToTable(book.title, book.author, index, true); // pre-existing cannot be changed
  }); // loading array from Local Storage

  var books = JSON.parse(localStorage.getItem('books')) || [];
  books.forEach(function (book, index) {
    addRowToTable(book.title, book.author, index, false); // user-loaded can be changed
  }); // event listener on submit here

  var form = document.getElementById('bookForm');
  form.addEventListener('submit', addBook);
}); // adding a new user suggestion

function addBook(event) {
  event.preventDefault(); // Prevent form submission

  var title = document.getElementById('bookTitle').value;
  var author = document.getElementById('bookAuthor').value;

  if (title && author) {
    // storing user data on local storage
    var books = JSON.parse(localStorage.getItem('books')) || [];
    var book = {
      title: title,
      author: author
    };
    books.push(book);
    localStorage.setItem('books', JSON.stringify(books)); // pushing to table

    var index = books.length - 1; // to avoid out of bounds error 

    addRowToTable(title, author, index, false); // flagging data as user-submitter (editable)
    // clear form on submission

    document.getElementById('bookTitle').value = '';
    document.getElementById('bookAuthor').value = '';
  }
} // pushing new row to table


function addRowToTable(title, author, index, isPreExisting) {
  var tableBody = document.getElementById('bookTable').querySelector('tbody');
  var row = document.createElement('tr');
  row.dataset.index = index;
  row.dataset.preExisting = isPreExisting; // creating cells

  var cell1 = document.createElement('td'); // disabling editing for pre-existing books

  cell1.contentEditable = !isPreExisting;
  cell1.textContent = title;
  var cell2 = document.createElement('td'); // idem

  cell2.contentEditable = !isPreExisting;
  cell2.textContent = author;
  var cell3 = document.createElement('td');
  var deleteButton = document.createElement('button');
  deleteButton.textContent = 'Delete'; // Disable delete for pre-existing books

  deleteButton.disabled = isPreExisting;

  deleteButton.onclick = function () {
    return deleteRow(index, isPreExisting);
  };

  cell3.appendChild(deleteButton); // adding class for pre-existing books to make them visually different

  if (isPreExisting) {
    row.classList.add('pre-existing');
  } // appending cells to row


  row.appendChild(cell1);
  row.appendChild(cell2);
  row.appendChild(cell3); // appending row to tbody

  tableBody.appendChild(row);
} // edit a row's content


function editRow(event) {
  var row = event.target.closest('tr');
  var index = row.dataset.index;
  var books = JSON.parse(localStorage.getItem('books')) || [];

  if (event.target.cellIndex === 0) {
    books[index].title = event.target.innerText;
  } else if (event.target.cellIndex === 1) {
    books[index].author = event.target.innerText;
  } // from object to string


  localStorage.setItem('books', JSON.stringify(books));
} // deleting a row


function deleteRow(index, isPreExisting) {
  if (isPreExisting) {
    alert("You cannot delete pre-existing books.");
    return;
  }

  var books = JSON.parse(localStorage.getItem('books')) || [];
  books.splice(index, 1);
  localStorage.setItem('books', JSON.stringify(books));
  var rowToDelete = document.querySelector("tr[data-index=\"".concat(index, "\"]"));

  if (rowToDelete) {
    rowToDelete.remove();
  } // using i for the index of elements, or else they get deleted out of order
  // it still doesn't work


  var rows = document.querySelectorAll('tr');
  rows.forEach(function (row, i) {
    if (!row.classList.contains('pre-existing')) {
      // only affects user-added
      row.dataset.index = i;
    }
  }); //TO BE IMPROVED, SOMETHING'S FISHY
}