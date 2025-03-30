<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>@yield('title', 'Your Default Title')</title>
    
    <!-- Vite Styles -->
    @vite('resources/sass/app.scss')  
    @vite('resources/js/app.js')  
</head>
<body id="gradient-background">

    @include('layouts.header')

    @include('layouts.navbar')

    <div class="container">
        @yield('content')  
    </div>

    @include('layouts.footer')

</body>
</html>
