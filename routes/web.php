<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\ContactController;
use Illuminate\Support\Facades\DB;


//debugging 
Route::get('/test-db', function () {
    $users = DB::table('portfolio_visitors')->get();
    return $users;
});

Route::get('/', function () {
    return view('English.index');
});
 
// English Routes
Route::prefix('English')->name('English.')->group(function () {
    Route::get('index', function () {
        return view('English.index'); 
    })->name('index');

    Route::get('skills', function () {
        return view('English.skills'); 
    })->name('skills');

    Route::get('featuredprojects', function () {
        return view('English.featuredprojects'); 
    })->name('featuredprojects');

    Route::get('hobbies', function () {
        return view('English.hobbies'); 
    })->name('hobbies');

    Route::get('contact', function () {
        return view('English.contact'); 
    })->name('contact');
});

// routes/web.php
Route::prefix('French')->name('French.')->group(function () {
    Route::get('index', function () {
        return view('French.index'); 
    })->name('index');

    Route::get('skills', function () {
        return view('French.skills'); 
    })->name('skills');

    Route::get('featuredprojects', function () {
        return view('French.featuredprojects'); 
    })->name('featuredprojects');

    Route::get('hobbies', function () {
        return view('French.hobbies'); 
    })->name('hobbies');

    Route::get('contact', function () {
        return view('French.contact'); 
    })->name('contact');
});


// Russian Routes
Route::prefix('Russian')->name('Russian.')->group(function () {
    Route::get('index', function () {
        return view('Russian.index'); // returns the Russian index view
    })->name('index');

    Route::get('skills', function () {
        return view('Russian.skills'); 
    })->name('skills');

    Route::get('featuredprojects', function () {
        return view('Russian.featuredprojects'); 
    })->name('featuredprojects');

    Route::get('hobbies', function () {
        return view('Russian.hobbies'); 
    })->name('hobbies');

    Route::get('contact', function () {
        return view('Russian.contact'); 
    })->name('contact');
});

Route::post('/submit-contact', [ContactController::class, 'store'])->name('contact.store');

