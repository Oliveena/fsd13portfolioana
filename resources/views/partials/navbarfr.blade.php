<body id="gradient-background">
    <!--========================================== NAVBAR SECTION ==========================================-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <!-- Toggle Button for Small Screens -->
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <!-- Home (French) Link -->
                    <li class="navbar-item {{ request()->is('French*') ? 'active' : '' }}">
                        <a class="nav-link" href="{{ route('French.index') }}">Bienvenue</a>
                    </li>
                    <!-- Skills Link -->
                    <li class="navbar-item {{ request()->is('French/skills') ? 'active' : '' }}">
                        <a class="nav-link" href="{{ route('French.skills') }}">Compétences</a>
                    </li>
                    <!-- Featured Projects Link -->
                    <li class="navbar-item {{ request()->is('French/featuredprojects') ? 'active' : '' }}">
                        <a class="nav-link" href="{{ route('French.featuredprojects') }}">Projets</a>
                    </li>
                    <!-- Hobbies Link -->
                    <li class="navbar-item {{ request()->is('French/hobbies') ? 'active' : '' }}">
                        <a class="nav-link" href="{{ route('French.hobbies') }}">Passe-temps</a>
                    </li>
                    <!-- Contact Link -->
                    <li class="navbar-item {{ request()->is('French/contact') ? 'active' : '' }}">
                        <a class="nav-link" href="{{ route('French.contact') }}">Contact</a>
                    </li>

                    <!-- Language Dropdown -->
                    <li class="navbar-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">
                            Langues
                        </a>
                        <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="{{ route('English.index') }}">English</a></li>
                            <li><a class="dropdown-item" href="{{ route('Russian.index') }}">Русский</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</body>
