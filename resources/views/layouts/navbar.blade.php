<link rel="stylesheet" href="{{ asset('css/style.css') }}">

<!--========================================== NAVBAR SECTION ==========================================-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <!-- Toggle button for small screens -->
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="navbar-item">
                        <a class="nav-link" href="{{ route('English.index') }}">Welcome</a>
                    </li>
                    <li class="navbar-item">
                        <a class="nav-link" href="{{ route('English.skills') }}">Skills</a>
                    </li>
                    <li class="navbar-item">
                        <a class="nav-link" href="{{ route('English.featuredprojects') }}">Featured Projects</a>
                    </li>
                    <li class="navbar-item">
                        <a class="nav-link" href="{{ route('English.hobbies') }}">Hobbies</a>
                    </li>
                    <li class="navbar-item">
                        <a class="nav-link" href="{{ route('English.contact') }}">Contact</a>
                    </li>
                    <!-- Languages Dropdown -->
                    <li class="navbar-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">
                            Languages
                        </a>
                        <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown"
                            data-bs-popper="none">
                            <li><a class="dropdown-item" href="{{ route('French.index') }}">Fran&ccedil;ais</a></li>
                            <li><a class="dropdown-item" href="{{ route('Russian.index') }}">Русский</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>