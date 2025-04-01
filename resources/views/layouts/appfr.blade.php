<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>@yield('title', 'Your Default Title')</title>
    <link href="{{ asset('css/app.css') }}" rel="stylesheet">
    <link href="{{ mix('css/main.css') }}" rel="stylesheet">

    <!-- Vite Styles -->
    @vite('resources/scss/main.scss') 
    @vite('resources/js/app.js')  
</head>
<body id="gradient-background">

    @include('partials.headerfr')

    @include('partials.navbarfr')

    <div class="container">
        @yield('content')  
    </div>

    @include('partials.footer')

</body>
</html>
