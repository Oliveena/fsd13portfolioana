<p align="center"><a href="https://laravel.com" target="_blank"><img src="https://raw.githubusercontent.com/laravel/art/master/logo-lockup/5%20SVG/2%20CMYK/1%20Full%20Color/laravel-logolockup-cmyk-red.svg" width="400" alt="Laravel Logo"></a></p>

<p align="center">
<a href="https://github.com/laravel/framework/actions"><img src="https://github.com/laravel/framework/workflows/tests/badge.svg" alt="Build Status"></a>
<a href="https://packagist.org/packages/laravel/framework"><img src="https://img.shields.io/packagist/dt/laravel/framework" alt="Total Downloads"></a>
<a href="https://packagist.org/packages/laravel/framework"><img src="https://img.shields.io/packagist/v/laravel/framework" alt="Latest Stable Version"></a>
<a href="https://packagist.org/packages/laravel/framework"><img src="https://img.shields.io/packagist/l/laravel/framework" alt="License"></a>
</p>

## About Laravel

Laravel is a web application framework with expressive, elegant syntax. We believe development must be an enjoyable and creative experience to be truly fulfilling. Laravel takes the pain out of development by easing common tasks used in many web projects, such as:

- [Simple, fast routing engine](https://laravel.com/docs/routing).
- [Powerful dependency injection container](https://laravel.com/docs/container).
- Multiple back-ends for [session](https://laravel.com/docs/session) and [cache](https://laravel.com/docs/cache) storage.
- Expressive, intuitive [database ORM](https://laravel.com/docs/eloquent).
- Database agnostic [schema migrations](https://laravel.com/docs/migrations).
- [Robust background job processing](https://laravel.com/docs/queues).
- [Real-time event broadcasting](https://laravel.com/docs/broadcasting).

Laravel is accessible, powerful, and provides tools required for large, robust applications.

## Learning Laravel

Laravel has the most extensive and thorough [documentation](https://laravel.com/docs) and video tutorial library of all modern web application frameworks, making it a breeze to get started with the framework.

You may also try the [Laravel Bootcamp](https://bootcamp.laravel.com), where you will be guided through building a modern Laravel application from scratch.

If you don't feel like reading, [Laracasts](https://laracasts.com) can help. Laracasts contains thousands of video tutorials on a range of topics including Laravel, modern PHP, unit testing, and JavaScript. Boost your skills by digging into our comprehensive video library.

## Laravel Sponsors

We would like to extend our thanks to the following sponsors for funding Laravel development. If you are interested in becoming a sponsor, please visit the [Laravel Partners program](https://partners.laravel.com).

### Premium Partners

- **[Vehikl](https://vehikl.com/)**
- **[Tighten Co.](https://tighten.co)**
- **[WebReinvent](https://webreinvent.com/)**
- **[Kirschbaum Development Group](https://kirschbaumdevelopment.com)**
- **[64 Robots](https://64robots.com)**
- **[Curotec](https://www.curotec.com/services/technologies/laravel/)**
- **[Cyber-Duck](https://cyber-duck.co.uk)**
- **[DevSquad](https://devsquad.com/hire-laravel-developers)**
- **[Jump24](https://jump24.co.uk)**
- **[Redberry](https://redberry.international/laravel/)**
- **[Active Logic](https://activelogic.com)**
- **[byte5](https://byte5.de)**
- **[OP.GG](https://op.gg)**

## Contributing

Thank you for considering contributing to the Laravel framework! The contribution guide can be found in the [Laravel documentation](https://laravel.com/docs/contributions).

## Code of Conduct

In order to ensure that the Laravel community is welcoming to all, please review and abide by the [Code of Conduct](https://laravel.com/docs/contributions#code-of-conduct).

## Security Vulnerabilities

If you discover a security vulnerability within Laravel, please send an e-mail to Taylor Otwell via [taylor@laravel.com](mailto:taylor@laravel.com). All security vulnerabilities will be promptly addressed.

## License

The Laravel framework is open-sourced software licensed under the [MIT license](https://opensource.org/licenses/MIT).


```
fsd13portfolioana
├─ .editorconfig
├─ app
│  ├─ Http
│  │  └─ Controllers
│  │     └─ Controller.php
│  ├─ Models
│  │  └─ User.php
│  └─ Providers
│     └─ AppServiceProvider.php
├─ artisan
├─ bootstrap
│  ├─ app.php
│  ├─ cache
│  │  ├─ packages.php
│  │  └─ services.php
│  └─ providers.php
├─ composer.json
├─ composer.lock
├─ config
│  ├─ app.php
│  ├─ auth.php
│  ├─ cache.php
│  ├─ database.php
│  ├─ filesystems.php
│  ├─ logging.php
│  ├─ mail.php
│  ├─ queue.php
│  ├─ services.php
│  └─ session.php
├─ database
│  ├─ database.sqlite
│  ├─ factories
│  │  └─ UserFactory.php
│  ├─ migrations
│  │  ├─ 0001_01_01_000000_create_users_table.php
│  │  ├─ 0001_01_01_000001_create_cache_table.php
│  │  └─ 0001_01_01_000002_create_jobs_table.php
│  └─ seeders
│     └─ DatabaseSeeder.php
├─ package-lock.json
├─ package.json
├─ phpunit.xml
├─ public
│  ├─ .htaccess
│  ├─ favicon.ico
│  ├─ index.php
│  └─ robots.txt
├─ README.md
├─ resources
│  ├─ css
│  │  ├─ style.css
│  │  └─ style.css.map
│  ├─ js
│  │  ├─ app.js
│  │  └─ bootstrap.js
│  └─ views
│     ├─ English
│     │  ├─ contact.blade.php
│     │  ├─ featuredprojects.blade.php
│     │  ├─ hobbies.blade.php
│     │  ├─ index.blade.php
│     │  └─ skills.blade.php
│     ├─ French
│     │  └─ index.blade.php
│     ├─ home.blade.php
│     ├─ layouts
│     │  ├─ footer.php
│     │  ├─ header.blade.php
│     │  └─ navbar.blade.php
│     └─ Russian
│        └─ index.blade.php
├─ routes
│  ├─ console.php
│  └─ web.php
├─ storage
│  ├─ app
│  │  ├─ private
│  │  └─ public
│  ├─ framework
│  │  ├─ cache
│  │  │  └─ data
│  │  ├─ sessions
│  │  ├─ testing
│  │  └─ views
│  │     ├─ 232c063e9c876b9406a0d7b93e675bd9.php
│  │     ├─ 31db02d6da8d04c8ab59a02d12a8b207.php
│  │     ├─ 38401519e78f1b6e34ddaad932cca90a.php
│  │     ├─ 43422d27c65099d1c2bed3a3d6f09737.php
│  │     ├─ 4dbf48434b3fc901f14da58d5175dccb.php
│  │     ├─ 662ea8e4bdc7f97f3b3e18a5b208da92.php
│  │     ├─ 6765e099b3d0ff31483fb2f2a35f7d4b.php
│  │     ├─ 6e1aefc5abf2e8f44da99163d1562873.php
│  │     ├─ 7873bb208127276f2ec96f107868a381.php
│  │     ├─ 7cfca5b3c0355add303054291e509980.php
│  │     ├─ 8e49469b580f0cbf53925f70b0a33f59.php
│  │     ├─ 9dd014bbadd1d497084c2293b7572414.php
│  │     ├─ 9f3a20164d5553183dc52ed5e2f5250b.php
│  │     ├─ a3841ab1fc13eeea6e8e040eb4ac9f64.php
│  │     ├─ b5a0a55020adb5223d891067ab079fb3.php
│  │     ├─ b5f01c24ddfa641c4f4bed7e9c3e54a6.php
│  │     ├─ d26976e4d919a4cb0e2f38a7ed405c95.php
│  │     ├─ da391aca21bc0caffccaf54b9d5ff04e.php
│  │     └─ f7fd64d14aebb13af542f622ba6e1277.php
│  └─ logs
│     └─ laravel.log
├─ tests
│  ├─ Feature
│  │  └─ ExampleTest.php
│  ├─ Pest.php
│  ├─ TestCase.php
│  └─ Unit
│     └─ ExampleTest.php
└─ vite.config.js

```