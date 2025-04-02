@extends('layouts.appfr')

@section('content')
    <div id="content">
        <!--========================================== TECH SKILLS SECTION ==========================================-->
        <section class="tech_skills">
            <h3>Compétences Techniques</h3>
            <div class="tech-skills-grid">
                <div><img class="tech-skill" src="{{ asset('images/html-logo.png') }}" alt="Logo HTML"></div>
                <div><img class="tech-skill" src="{{ asset('images/css3-logo-png-transparent.png') }}" alt="Logo CSS"></div>
                <div><img class="tech-skill" src="{{ asset('images/figma.jpg') }}" alt="Logo Figma"></div>
                <div><img class="tech-skill" src="{{ asset('images/javascript-vector-logo-yellow-png-transparent-javascript-vector-12.png') }}" alt="Logo JavaScript"></div>
                <div><img class="tech-skill" src="{{ asset('images/sql-database-icon-png-17.png') }}" alt="Logo MySQL"></div>
                <div><img class="tech-skill" src="{{ asset('images/java-14-logo-png-transparent.png') }}" alt="Logo Java"></div>
            </div>

            <h3>Portfolios autodidactes</h3>
            <div class="transparent-background-cold">
                <p> J'ai commencé à étudier le codage de manière autonome tout en travaillant comme infirmière. <br> Mon approche est pleine de curiosité et de diligence.</p>

                <div class="container d-flex justify-content-center align-items-center flex-wrap">
                    <a href="https://www.freecodecamp.org/oliveena">
                        <img class="portfolio" src="{{ asset('images/FCC.jpg') }}" alt="Logo FreeCodeCamp">
                    </a>

                    <a href="https://www.w3profile.com/ana">
                        <img class="portfolio" src="{{ asset('images/w3schools-1536.png') }}" alt="Logo W3Schools">
                    </a>
                </div>
            </div>
        </section>

        <!--========================================== SOFT SKILLS SECTION ==========================================-->
        <section id="soft_skills">
            <h3>Compétences Interpersonnelles</h3>
            <div class="transparent-background-warm">
                <p>Après 5 ans d'expérience en tant qu'infirmière et responsable des soins infirmiers, j'ai des compétences humaines exceptionnelles.</p>
                <ul>
                    <li class="skill">Résolution de problèmes efficace</li>
                    <li class="skill">Approche multiculturelle</li>
                    <li class="skill">Performe bien sous pression</li>
                    <li class="skill">Communication équilibrée</li>
                </ul>
            </div>

            <!--========================================== LANGUAGES SPOKEN SECTION ==========================================-->

            <h3>Langues parlées</h3>
            <div class="transparent-background-cold">
                <ul class="d-flex list-unstyled justify-content-center align-items-center flex-wrap">
                    <li class="language">
                        Anglais
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                    <li class="language">
                        Français
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                    <li class="language">
                        Russe
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                    <li class="language">
                        Espagnol
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 75%" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                    <li class="language">
                        Roumain
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                </ul>
            </div>
        </section>
    </div>
@endsection
