@extends('layouts.app')

@section('content')
    <div id="content">

<!--========================================== HOBBIES SECTION ==========================================-->

<section class="reading-reviews text-center py-5">
    <!--Reading-->
    <h3>Reading Reviews</h3>

    <div class="transparent-background-warm">
      <div class="reading">
        <p>Ana has always been an avid reader. Here is a list of recent reads.</p>
        <ul class="books">
          <li class="flip"><strong>"My Favorite Thing Is Monsters"</strong> by Emil Ferris
            <span class="panel" id="panel1">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Culpa ducimus
              debitis in dolorem voluptates. Recusandae nihil tenetur voluptate nemo. Corporis voluptas expedita
              repudiandae architecto, ut quod aliquam labore a vitae!</span>
          </li>
          <li class="flip"><strong>"Encaban&eacute;e"</strong> by Gabrielle Filteau-Chiba
            <span class="panel" id="panel2">Lorem ipsum dolor sit amet consectetur adipisicing elit. Fugiat quod sed
              nobis ab ad iusto quo nesciunt consectetur et autem accusantium iure, provident ea laborum delectus
              tempora voluptas reprehenderit doloremque.</span>
          </li>
          <li class="flip"><strong>"Ahab's Wife"</strong> by Sena Jeter Naslund
            <span class="panel" id="panel3">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatem
              corrupti facere ducimus illum labore numquam repellendus explicabo pariatur reiciendis laboriosam
              maxime, facilis molestiae dignissimos quae libero nisi asperiores necessitatibus animi!</span>
          </li>
          <li class="flip"><strong>"The Enchantress of Florence"</strong> by Salman Rushdie
            <span class="panel" id="panel4">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Vel quam
              quisquam deserunt quo dolorum nulla tempore eum amet fugit exercitationem accusantium voluptates
              reiciendis quae, laboriosam facilis doloremque quia ducimus sapiente!</span>
          </li>
        </ul>
      </div>

      <p>Books recommended by users </p>
      <div class="suggested-books">
        <!--book suggestion table -->
      </div>

      <!--book suggesiton form-->
      <!-- reusing #contact for this element, normally I should create a sepearate .scss for "Form" and use it here-->
      <div class="contact">
        <fieldset class="border p-4 rounded">
          <p>Would you like to suggest a book?</p>
          <form id="bookForm" class="mx-auto" style="max-width: 500px;">

            <div class="mb-3">
              <label for="bookTitle" class="form-label">Enter book title</label>
              <input type="text" id="bookTitle" class="form-control" placeholder="e.g. The Adventures of Tom Sawyer">
            </div>

            <div class="mb-3">
              <label for="bookAuthor" class="form-label">Enter author name</label>
              <input type="text" id="bookAuthor" class="form-control" placeholder="e.g. Mark Twain">
            </div>

            <div class="text-center">
              <!--issue was in the "submit" attribute in HTML, it was causing the alert() even on succesful submission-->
              <button type="submit" class="btn btn-primary w-75">Add Book</button>
            </div>

          </form>
        </fieldset>
      </div>


      <!--using Google API-->
      <div class="contact">
        <fieldset class="border p-4 rounded">
          <p>Searching for a particular book?<br>Here's Google Books API!</p>
          <div class="mb-3">
            <label for="search" class="form-label">Enter Book Title</label>
            <input type="text" id="search" class="form-control" placeholder="search by title, author...">
          </div>
          <div class="text-center">
            <button type="submit" class="btn btn-primary w-100" onclick="searchBooks()">Search</button>
          </div>
          <!--container for displaying book search results-->
          <div class="book-container mt-4" id="bookResults">
            <!--add "Collapse search" button-->
          </div>

        </fieldset>
      </div>



    </div>
  </section>


  <!--watercolor gallery-->
  <section class="watercolor-art-gallery py-5">
    <h3 class="text-center">Watercolor Painting</h3>

    <div class="transparent-background-cold">
      <p class="text-center">Painting is very relaxing.<br> Here are some of my recent paintings.</p>
      <p class="text-center">Hover over them!</p>

      <div class="paintings">
        <div class="row row-cols-sm-2 row-cols-md-3 g-4">
          <!--frist 3 watercolors -->
          <div class="col">
            <a href="/images/valrustheimpalrus.jpg" target="_blank">
              <img src="/images/valrustheimpalrus.jpg"
                alt="Watercolor of Vlad Dracula as a walrus" class="img-fluid rounded-3" loading="lazy">
            </a>
          </div>
          <div class="col">
            <a href="/images/birthofwalrus.jpg" target="_blank">
              <img src="/images/birthofwalrus.jpg"
                alt="Watercolor of Botticelli's 'Birth of Venus' as walruses" class="img-fluid rounded-3"
                loading="lazy">
            </a>
          </div>
          <div class="col">
            <a href="/images/walruswiththepearlearring.jpg" target="_blank">
              <img src="/images/walruswiththepearlearring.jpg"
                alt="Watercolor of Vermeer's 'Girl with the Pearl Earring' as a walrus" class="img-fluid rounded-3"
                loading="lazy">
            </a>
          </div>
        </div>
      </div>

      <!--button "More"-->
      <div class="text-center"><button class="btn btn-primary" id="more-walruses">More walruses!</button>
      </div>

      <!--button "Less"-->
      <div class="text-center"><button class="btn btn-primary" id="less-walruses">Less walruses...</button>
      </div>

      <!--extra 3 watercolors -->
      <div class="paintings" id="extra-walruses">
        <div class="row row-cols-sm-2 row-cols-md-3 g-4">
          <div class="col">
            <a href="/images/fridawalrus.jpg" target="_blank">
              <img src="/images/fridawalrus.jpg"
                alt="Watercolor of Frida Kahlo's self-portrait as a walrus" class="img-fluid rounded-3"
                loading="lazy">
            </a>
          </div>
          <div class="col">
            <a href="/images/napoleowalrus.jpg" target="_blank">
              <img src="/images/napoleowalrus.jpg"
                alt="Watercolor of Napoleon Bonaparte's portrait as a walrus" class="img-fluid rounded-3"
                loading="lazy">
            </a>
          </div>
          <div class="col">
            <a href="/images/applewalrus.jpg" target="_blank">
              <img src="/images/applewalrus.jpg"
                alt="Watercolor of Magritte's 'Son of Man' as a walrus" class="img-fluid rounded-3" loading="lazy">
            </a>
          </div>
        </div>
      </div>
      <p class="text-center">For more art, see my gallery</p>
      <div class="text-center">
        <button class="btn btn-primary">Here
          <!--add 2nd ICA project here, the one with the art gallery (restructure and add Bootstrap to it beforehand)-->
        </button>
      </div>

      <!--Vanilla JS carousel for painting progression
      <div class="bonus">
        <p>BONUS: here's a progression of a current painting.</p>

        <div class="progression">

          <div class="image-container">
            <span style="--i: 1">
              <img src="images/walrus_progress/20250102_173417.jpg" title="Arnolfini1" alt="Reproduction of Van Eyck's 'The Arnolfini's Wedding' with walruses - step 1">
            </span>
            <span style="--i: 2">
              <img src="images/walrus_progress/20250102_182141.jpg" title="Arnolfini2" alt="Reproduction of Van Eyck's 'The Arnolfini's Wedding' with walruses - step 2">
            </span>
            <span style="--i: 3">
              <img src="images/walrus_progress/20250102_193255.jpg" title="Arnolfini3" alt="Reproduction of Van Eyck's 'The Arnolfini's Wedding' with walruses - step 3">
            </span>
            <span style="--i: 3">
              <img src="images/walrus_progress/20250102_194414.jpg" title="Arnolfini4" alt="Reproduction of Van Eyck's 'The Arnolfini's Wedding' with walruses - step 4 ">
            </span>
            <span style="--i: 3">
              <img src="images/walrus_progress/20250102_200253.jpg" title="Arnolfini5" alt="Reproduction of Van Eyck's 'The Arnolfini's Wedding' with walruses - step 5">
            </span>
            <span style="--i: 3">
              <img src="images/walrus_progress/20250102_201236.jpg" title="Arnolfini6" alt="Reproduction of Van Eyck's 'The Arnolfini's Wedding' with walruses - step 6">
            </span>
            <span style="--i: 3">
              <img src="images/walrus_progress/20250102_221350.jpg" title="Arnolfini7" alt="Reproduction of Van Eyck's 'The Arnolfini's Wedding' with walruses - step 7">
            </span>              
          </div>

          <div class="btn-container">
            <button class="btn" id="prev">Prev</button>
            <button class="btn" id="next">Next</button>
          </div>

      </div>
      -->
    </div>

    
  </section>

    </div>
    @endsection
    