<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>@yield('title', 'Ваше стандартное название')</title>
    <link href="{{ asset('css/app.css') }}" rel="stylesheet">
    <link href="{{ mix('css/main.css') }}" rel="stylesheet">

    <!-- Vite стили -->
    @vite('resources/scss/main.scss') 
    @vite('resources/js/app.js')  
</head>
<body id="gradient-background">

    @include('partials.headerru')

    @include('partials.navbarru')

    <div class="container">
        @yield('content')  
    </div>

    @include('partials.footer')

</body>
</html>
