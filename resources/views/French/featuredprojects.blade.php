@extends('layouts.appfr')

@section('content')
    <div id="content">
        <!--========================================== SECTION DES PROJETS EN VEDETTE ==========================================-->
        <section id="featured_projects">
            <h3>Projets en vedette</h3>

            <div class="transparent-background-cold">
                <div class="row g-4">

                    <!-- Card 1 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Image du projet">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Calculateur de l'empreinte carbone</p>
                                <p>Description of the project with technologies used, problems solved, and a link to the full GitHub repo.</p>
                                <a href="https://github.com/yourusername/project1" target="_blank">View Code on GitHub</a>
                            </div>
                        </div>
                    </div>

                    <!-- Card 2 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Image du projet">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Interface de connexion en Java</p>
                                <p>Description of the project with technologies used, problems solved, and a link to the full GitHub repo.</p>
                                <a href="https://github.com/yourusername/project1" target="_blank">View Code on GitHub</a>
                            </div>
                        </div>
                    </div>

                    <!-- Card 3 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Image du projet">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Page web de portfolio d'artiste</p>
                                <p>Description of the project with technologies used, problems solved, and a link to the full GitHub repo.</p>
                                <a href="https://github.com/yourusername/project1" target="_blank">View Code on GitHub</a>
                            </div>
                        </div>
                    </div>

                    <!-- Card 4 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Image du projet">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Requêtes de base de données</p>
                                <p>Description of the project with technologies used, problems solved, and a link to the full GitHub repo.</p>
                                <a href="https://github.com/yourusername/project1" target="_blank">View Code on GitHub</a>
                            </div>
                        </div>
                    </div>

                    <!-- Card 5 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Image du projet">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Logiciel de gestion de bibliothèque</p>
                                <p>Description of the project with technologies used, problems solved, and a link to the full GitHub repo.</p>
                                <a href="https://github.com/yourusername/project1" target="_blank">View Code on GitHub</a>
                            </div>
                        </div>
                    </div>

                    <!-- Card 6 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Image du projet">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Planificateur de soins à domicile</p>
                                <p>Description of the project with technologies used, problems solved, and a link to the full GitHub repo.</p>
                                <a href="https://github.com/yourusername/project1" target="_blank">View Code on GitHub</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
@endsection
