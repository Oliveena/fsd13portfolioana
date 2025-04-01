@extends('layouts.app')

@section('content')
    <div id="content">
        <!--========================================== TECH SKILLS SECTION ==========================================-->
        <section class="tech_skills">
            <h3>Technical Skills</h3>
            <div class="tech-skills-grid">
                <div><img class="tech-skill" src="{{ asset('images/html-logo.png') }}" alt="HTML Logo"></div>
                <div><img class="tech-skill" src="{{ asset('images/css3-logo-png-transparent.png') }}" alt="CSS Logo"></div>
                <div><img class="tech-skill" src="{{ asset('images/figma.jpg') }}" alt="Figma Logo"></div>
                <div><img class="tech-skill" src="{{ asset('images/javascript-vector-logo-yellow-png-transparent-javascript-vector-12.png') }}" alt="JavaScript Logo"></div>
                <div><img class="tech-skill" src="{{ asset('images/sql-database-icon-png-17.png') }}" alt="MySQL Logo"></div>
                <div><img class="tech-skill" src="{{ asset('images/java-14-logo-png-transparent.png') }}" alt="Java Logo"></div>
            </div>

            <h3>Self-taught portfolios</h3>
            <div class="transparent-background-cold">
                <p> I began autonomously studying coding while simultaneously working as a nurse. <br>My approach is full of curiosity and diligence.</p>

                <div class="container d-flex justify-content-center align-items-center flex-wrap">
                    <a href="https://www.freecodecamp.org/oliveena">
                        <img class="portfolio" src="{{ asset('images/FCC.jpg') }}" alt="FreeCodeCamp Logo">
                    </a>

                    <a href="https://www.w3profile.com/ana">
                        <img class="portfolio" src="{{ asset('images/w3schools-1536.png') }}" alt="W3Schools Logo">
                    </a>
                </div>
            </div>
        </section>

        <!--========================================== SOFT SKILLS SECTION ==========================================-->
        <section id="soft_skills">
            <h3>Soft Skills</h3>
            <div class="transparent-background-warm">
                <p>After 5 years of experience as a nurse and nursing manager, I have exceptionally strong people skills.</p>
                <ul>
                    <li class="skill">Efficient problem-solver</li>
                    <li class="skill">Multicultural approach</li>
                    <li class="skill">Performs well under pressure</li>
                    <li class="skill">Balanced communication</li>
                </ul>
            </div>

            <!--========================================== LANGUAGES SPOKEN SECTION ==========================================-->

            <h3>I speak</h3>
            <div class="transparent-background-cold">
                <ul class="d-flex list-unstyled justify-content-center align-items-center flex-wrap">
                    <li class="language">
                        English
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                    <li class="language">
                        French
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                    <li class="language">
                        Russian
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                    <li class="language">
                        Spanish
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 75%" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                    <li class="language">
                        Romanian
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                        </div>
                    </li>
                </ul>
            </div>
        </section>
    </div>
@endsection
