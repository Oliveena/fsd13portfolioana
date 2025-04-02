@extends('layouts.appru')

@section('content')
    <div id="content">
        <!--========================================== РАЗДЕЛ ВЫДЕЛЕННЫХ ПРОЕКТОВ ==========================================-->
        <section id="featured_projects">
            <h3>Выделенные проекты</h3>

            <div class="transparent-background-cold">
                <div class="row g-4">

                    <!-- Карточка 1 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Изображение проекта">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Калькулятор углеродного следа</p>
                            </div>
                        </div>
                    </div>

                    <!-- Карточка 2 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Изображение проекта">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Интерфейс входа на Java</p>
                            </div>
                        </div>
                    </div>

                    <!-- Карточка 3 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Изображение проекта">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Веб-страница портфолио художника</p>
                            </div>
                        </div>
                    </div>

                    <!-- Карточка 4 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Изображение проекта">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Запросы к базе данных</p>
                            </div>
                        </div>
                    </div>

                    <!-- Карточка 5 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Изображение проекта">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Программное обеспечение для управления библиотекой</p>
                            </div>
                        </div>
                    </div>

                    <!-- Карточка 6 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Изображение проекта">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Планировщик домашних медицинских услуг</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
@endsection
