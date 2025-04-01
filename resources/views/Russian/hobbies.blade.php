@extends('layouts.app')

@section('content')
    <div id="content">

<!--========================================== HOBBIES SECTION ==========================================-->

<section class="reading-reviews text-center py-5">
    <!--Чтение-->
    <h3>Обзор книг</h3>

    <div class="transparent-background-warm">
      <div class="reading">
        <p>Анастасия всегда была заядлым читателем. Вот список последних прочитанных книг.</p>
        <ul class="books">
          <li class="flip"><strong>"Моя любимая вещь - монстры"</strong> Эмиля Ферриса
            <span class="panel" id="panel1">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Culpa ducimus
              debitis in dolorem voluptates. Recusandae nihil tenetur voluptate nemo. Corporis voluptas expedita
              repudiandae architecto, ut quod aliquam labore a vitae!</span>
          </li>
          <li class="flip"><strong>"Encabanée"</strong> Габриэль Фильтё-Чиба
            <span class="panel" id="panel2">Lorem ipsum dolor sit amet consectetur adipisicing elit. Fugiat quod sed
              nobis ab ad iusto quo nesciunt consectetur et autem accusantium iure, provident ea laborum delectus
              tempora voluptas reprehenderit doloremque.</span>
          </li>
          <li class="flip"><strong>"Жена Ахава"</strong> Сены Джетер Нэслунд
            <span class="panel" id="panel3">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatem
              corrupti facere ducimus illum labore numquam repellendus explicabo pariatur reiciendis laboriosam
              maxime, facilis molestiae dignissimos quae libero nisi asperiores necessitatibus animi!</span>
          </li>
          <li class="flip"><strong>"Очаровательница Флоренции"</strong> Салмана Рушди
            <span class="panel" id="panel4">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Vel quam
              quisquam deserunt quo dolorum nulla tempore eum amet fugit exercitationem accusantium voluptates
              reiciendis quae, laboriosam facilis doloremque quia ducimus sapiente!</span>
          </li>
        </ul>
      </div>

      <p>Рекомендуемые книги от пользователей</p>
      <div class="suggested-books">
        <!--table для предложений книг-->
      </div>

      <!--форма предложения книги-->
      <div class="contact">
        <fieldset class="border p-4 rounded">
          <p>Хотите предложить книгу?</p>
          <form id="bookForm" class="mx-auto" style="max-width: 500px;">

            <div class="mb-3">
              <label for="bookTitle" class="form-label">Введите название книги</label>
              <input type="text" id="bookTitle" class="form-control" placeholder="например, Приключения Тома Сойера">
            </div>

            <div class="mb-3">
              <label for="bookAuthor" class="form-label">Введите имя автора</label>
              <input type="text" id="bookAuthor" class="form-control" placeholder="например, Марк Твен">
            </div>

            <div class="text-center">
              <button type="submit" class="btn btn-primary w-75">Добавить книгу</button>
            </div>

          </form>
        </fieldset>
      </div>

      <!--использование Google API-->
      <div class="contact">
        <fieldset class="border p-4 rounded">
          <p>Ищете определенную книгу?<br>Вот API Google Books!</p>
          <div class="mb-3">
            <label for="search" class="form-label">Введите название книги</label>
            <input type="text" id="search" class="form-control" placeholder="поиск по названию, автору...">
          </div>
          <div class="text-center">
            <button type="submit" class="btn btn-primary w-100" onclick="searchBooks()">Поиск</button>
          </div>
          <div class="book-container mt-4" id="bookResults">
          </div>

        </fieldset>
      </div>

    </div>
  </section>


  <!--галерея акварельных картин-->
  <section class="watercolor-art-gallery py-5">
    <h3 class="text-center">Акварель</h3>

    <div class="transparent-background-cold">
      <p class="text-center">Рисование — это очень расслабляюще.<br> Вот некоторые из моих последних картин.</p>
      <div class="paintings">
        <div class="row row-cols-sm-2 row-cols-md-3 g-4">
          <!--первые 3 акварели-->
          <div class="col">
            <a href="/images/valrustheimpalrus.jpg" target="_blank">
              <img src="/images/valrustheimpalrus.jpg"
                alt="Акварель Влад Дракула как морж" class="img-fluid rounded-3" loading="lazy">
            </a>
          </div>
          <div class="col">
            <a href="/images/birthofwalrus.jpg" target="_blank">
              <img src="/images/birthofwalrus.jpg"
                alt="Акварель 'Рождение Венеры' Боттичелли как моржи" class="img-fluid rounded-3"
                loading="lazy">
            </a>
          </div>
          <div class="col">
            <a href="/images/walruswiththepearlearring.jpg" target="_blank">
              <img src="/images/walruswiththepearlearring.jpg"
                alt="Акварель 'Девушка с жемчужной серёжкой' Вермеера как морж" class="img-fluid rounded-3"
                loading="lazy">
            </a>
          </div>
        </div>
      </div>

      <!--кнопка 'Еще'-->
      <div class="text-center"><button class="btn btn-primary" id="more-walruses">Больше моржей!</button>
      </div>

      <!--кнопка 'Меньше'-->
      <div class="text-center"><button class="btn btn-primary" id="less-walruses">Меньше моржей...</button>
      </div>

      <!--дополнительные 3 акварели-->
      <div class="paintings" id="extra-walruses">
        <div class="row row-cols-sm-2 row-cols-md-3 g-4">
          <div class="col">
            <a href="/images/fridawalrus.jpg" target="_blank">
              <img src="/images/fridawalrus.jpg"
                alt="Акварель автопортрета Фриды Кало как морж" class="img-fluid rounded-3"
                loading="lazy">
            </a>
          </div>
          <div class="col">
            <a href="/images/napoleowalrus.jpg" target="_blank">
              <img src="/images/napoleowalrus.jpg"
                alt="Акварель портрета Наполеона Бонапарта как морж" class="img-fluid rounded-3"
                loading="lazy">
            </a>
          </div>
          <div class="col">
            <a href="/images/applewalrus.jpg" target="_blank">
              <img src="/images/applewalrus.jpg"
                alt="Акварель 'Сын человека' Магритта как морж" class="img-fluid rounded-3" loading="lazy">
            </a>
          </div>
        </div>
      </div>
      <p class="text-center">Для большего искусства, посетите мою галерею</p>
      <div class="text-center">
        <button class="btn btn-primary">Здесь
        </button>
      </div>

      <!--Прогрессия картины (Vanilla JS карусель)
      <div class="bonus">
        <p>БОНУС: вот прогресс текущей картины.</p>

        <div class="progression">

          <div class="image-container">
            <span style="--i: 1">
              <img src="images/walrus_progress/20250102_173417.jpg" title="Arnolfini1" alt="Воспроизведение 'Свадьбы Арнольфини' ван Эйка с моржами - шаг 1">
            </span>
            <span style="--i: 2">
              <img src="images/walrus_progress/20250102_182141.jpg" title="Arnolfini2" alt="Воспроизведение 'Свадьбы Арнольфини' ван Эйка с моржами - шаг 2">
            </span>
            <span style="--i: 3">
              <img src="images/walrus_progress/20250102_193255.jpg" title="Arnolfini3" alt="Воспроизведение 'Свадьбы Арнольфини' ван Эйка с моржами - шаг 3">
            </span>
            <span style="--i: 3">
              <img src="images/walrus_progress/20250102_194414.jpg" title="Arnolfini4" alt="Воспроизведение 'Свадьбы Арнольфини' ван Эйка с моржами - шаг 4 ">
            </span>
            <span style="--i: 3">
              <img src="images/walrus_progress/20250102_200253.jpg" title="Arnolfini5" alt="Воспроизведение 'Свадьбы Арнольфини' ван Эйка с моржами - шаг 5">
            </span>
            <span style="--i: 3">
              <img src="images/walrus_progress/20250102_201236.jpg" title="Arnolfini6" alt="Воспроизведение 'Свадьбы Арнольфини' ван Эйка с моржами - шаг 6">
            </span>
            <span style="--i: 3">
              <img src="images/walrus_progress/20250102_221350.jpg" title="Arnolfini7" alt="Воспроизведение 'Свадьбы Арнольфини' ван Эйка с моржами - шаг 7">
            </span>              
          </div>

          <div class="btn-container">
            <button class="btn" id="prev">Назад</button>
            <button class="btn" id="next">Вперед</button>
          </div>

      </div>
      -->
    </div>

  </section>

    </div>
    @endsection
