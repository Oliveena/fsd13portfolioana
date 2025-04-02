@extends('layouts.appru')

@section('content')
    <div id="content">

        <!--========================================== РАЗДЕЛ ФОРМЫ ОБРАТНОЙ СВЯЗИ ==========================================-->
        <section class="contact my-5" id="contact">
            <div class="container">
                <form id="contactForm" class="shadow-lg p-4 rounded border border-light bg-dark">
                    <h3 class="text-center mb-4 text-white">Свяжитесь со мной</h3>

                    <div class="form-group mb-3">
                        <label for="name" class="form-label text-white">Имя:</label>
                        <input class="form-control" type="text" id="name" placeholder="Ваше имя" required>
                    </div>

                    <div class="form-group mb-3">
                        <label for="email-address" class="form-label text-white">Адрес электронной почты:</label>
                        <input class="form-control" type="email" id="email-address" placeholder="ваш@mail.com" required>
                    </div>

                    <div class="form-group mb-3">
                        <label for="phone" class="form-label text-white">Номер телефона:</label>
                        <input class="form-control" type="tel" id="phone" placeholder="123-456-7890" required>
                    </div>

                    <div class="form-group mb-3">
                        <label for="message" class="form-label text-white">Сообщение:</label>
                        <textarea class="form-control" id="message" placeholder="Ваше сообщение" rows="4" required></textarea>
                    </div>

                    <button type="submit" class="btn btn-primary w-100">Отправить</button>
                </form>
            </div>
        </section>
    </div>
@endsection

