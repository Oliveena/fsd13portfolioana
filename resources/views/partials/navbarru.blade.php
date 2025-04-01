<link rel="stylesheet" href="{{ asset('css/style.css') }}">

<!--========================================== НАВИГАЦИОННАЯ ПАНЕЛЬ ==========================================-->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <!-- Кнопка для маленьких экранов -->
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Переключить навигацию">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <!-- Home (English) Link -->
                <li class="navbar-item {{ request()->is('English*') ? 'active' : '' }}">
                    <a class="nav-link" href="{{ route('English.index') }}">Добро пожаловать</a>
                </li>
                <!-- Skills Link -->
                <li class="navbar-item {{ request()->is('English/skills') ? 'active' : '' }}">
                    <a class="nav-link" href="{{ route('English.skills') }}">Навыки</a>
                </li>
                <!-- Featured Projects Link -->
                <li class="navbar-item {{ request()->is('English/featuredprojects') ? 'active' : '' }}">
                    <a class="nav-link" href="{{ route('English.featuredprojects') }}">Избранные проекты</a>
                </li>
                <!-- Hobbies Link -->
                <li class="navbar-item {{ request()->is('English/hobbies') ? 'active' : '' }}">
                    <a class="nav-link" href="{{ route('English.hobbies') }}">Хобби</a>
                </li>
                <!-- Contact Link -->
                <li class="navbar-item {{ request()->is('English/contact') ? 'active' : '' }}">
                    <a class="nav-link" href="{{ route('English.contact') }}">Контакты</a>
                </li>

                <!-- Language Dropdown -->
                <li class="navbar-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                        data-bs-toggle="dropdown" aria-expanded="false">
                        Языки
                    </a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="{{ route('French.index') }}">Français</a></li>
                        <li><a class="dropdown-item" href="{{ route('Russian.index') }}">Русский</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
