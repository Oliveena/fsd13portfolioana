@extends('layouts.app')

@section('content')
    <div id="content">
        <!--========================================== TECH SKILLS SECTION ==========================================-->
        <section class="tech_skills">
            <h3>Технические навыки</h3>
            <div class="tech-skills-grid">
                <div><img class="tech-skill" src="{{ asset('images/html-logo.png') }}" alt="Логотип HTML"></div>
                <div><img class="tech-skill" src="{{ asset('images/css3-logo-png-transparent.png') }}" alt="Логотип CSS"></div>
                <div><img class="tech-skill" src="{{ asset('images/figma.jpg') }}" alt="Логотип Figma"></div>
                <div><img class="tech-skill" src="{{ asset('images/javascript-vector-logo-yellow-png-transparent-javascript-vector-12.png') }}" alt="Логотип JavaScript"></div>
                <div><img class="tech-skill" src="{{ asset('images/sql-database-icon-png-17.png') }}" alt="Логотип MySQL"></div>
                <div><img class="tech-skill" src="{{ asset('images/java-14-logo-png-transparent.png') }}" alt="Логотип Java"></div>
            </div>

            <h3>Портфолио</h3>
            <div class="transparent-background-cold">
                <p>Я начала самостоятельно изучать программирование, одновременно работая медсестрой. <br>Мой подход полон любопытства и усердия.</p>

                <div class="container d-flex justify-content-center align-items-center flex-wrap">
                    <a href="https://www.freecodecamp.org/oliveena">
                        <img class="portfolio" src="{{ asset('images/FCC.jpg') }}" alt="Логотип FreeCodeCamp">
                    </a>

                    <a href="https://www.w3profile.com/ana">
                        <img class="portfolio" src="{{ asset('images/w3schools-1536.png') }}" alt="Логотип W3Schools">
                    </a>
                </div>
            </div>
        </section>

        <!--========================================== SOFT SKILLS SECTION ==========================================-->
        <section id="soft_skills">
            <h3>Мягкие навыки</h3>
            <div class="transparent-background-warm">
                <p>После 5 лет работы медсестрой и менеджером в здравоoхранительных учереждениях, у меня отлично развиты навыки работы с людьми.</p>
                <ul>
                    <li class="skill">Эффективное решение проблем</li>
                    <li class="skill">Мультикультурный подход</li>
                    <li class="skill">Хорошая работа в условиях стресса</li>
                    <li class="skill">Сбалансированная коммуникация</li>
                </ul>
            </div>

            <!--========================================== LANGUAGES SPOKEN SECTION ==========================================-->

            <h3>Языки, которыми я владею</h3>
            <div class="transparent-background-cold">
                <ul class="d-flex list-unstyled justify-content-center align-items-center flex-wrap">
                    <li class="language">
                        Английский
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                    <li class="language">
                        Французский
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                    <li class="language">
                        Русский
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                    <li class="language">
                        Испанский
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 75%" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                    <li class="language">
                        Румынский
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                </ul>
            </div>
        </section>
    </div>
@endsection
