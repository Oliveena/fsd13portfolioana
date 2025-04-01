<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta name="description" content="Личное портфолио Анастасии Тарасовой, младшего разработчика.">
    <meta name="author" content="Анастасия Тарасова">
    <meta name="keywords" content="HTML, CSS, JS, Java, SQL, Личное, Портфолио, Веб-разработка, Женщины в STEM, Превосходство">
    <meta name="csrf-token" content="{{ csrf_token() }}">
    <title>Портфолио веб-разработчика Анастасии</title>

    <!-- добавление фавикона -->
    <link rel="icon" type="image/x-image" href="{{ asset('/images/walrus_favicon_io/android-chrome-192x192.png') }}">

    <!-- добавление Bootstrap 5 CSS -->
    <link rel="stylesheet" href="{{ asset('C:\Users\anata\Herd\fsd13portfolioana\public\css\style.css') }}">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
        crossorigin="anonymous">

    @vite('resources/sass/app.scss') 

    <!-- добавление JS скриптов -->

    {{-- <script type="text/javascript" src="{{ asset('shared_assets/JS/0_navbar_active_highlight.js') }}" defer></script>
    <script type="text/javascript" src="{{ asset('shared_assets/JS/1_fluid_transitions.js') }}" defer></script>
    <script type="text/javascript" src="{{ asset('shared_assets/JS/2_modal.js') }}" defer></script>
    <script type="text/javascript" src="{{ asset('shared_assets/JS/3_review_carousel.js') }}" defer></script>
    <script type="text/javascript" src="{{ asset('shared_assets/JS/4_walruses.js') }}" defer></script>
    <script type="text/javascript" src="{{ asset('shared_assets/JS/5_featured_projects_effects.js') }}" defer></script>
    <script type="text/javascript" src="{{ asset('shared_assets/JS/6_form_validation.js') }}" defer></script>
    <script type="text/javascript" src="{{ asset('shared_assets/JS/7_table.js') }}" defer></script>
    <script type="text/javascript" src="{{ asset('shared_assets/JS/8_google_api.js') }}" defer></script>
    <script type="text/javascript" src="{{ asset('shared_assets/JS/9_books_read.js') }}" defer></script>
    <script type="text/javascript" src="{{ asset('shared_assets/JS/10_current_year.js') }}" defer></script>
 --}}

    @vite('resources/js/app.js')   <!-- Для JS -->
    @vite('resources/sass/app.scss') <!-- Для SCSS -->

</head>
