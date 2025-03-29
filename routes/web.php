<?php

use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('English.index');
});


// English Routes
Route::prefix('English')->name('English.')->group(function () {
    Route::get('index', function () {
        return view('English.index'); // returns the English index view
    })->name('index');

    Route::get('skills', function () {
        return view('English.skills'); // returns the English skills view
    })->name('skills');

    Route::get('featuredprojects', function () {
        return view('English.featuredprojects'); // returns the English featured projects view
    })->name('featuredprojects');

    Route::get('hobbies', function () {
        return view('English.hobbies'); // returns the English hobbies view
    })->name('hobbies');

    Route::get('contact', function () {
        return view('English.contact'); // returns the English contact view
    })->name('contact');
});

// French Routes
Route::prefix('French')->name('French.')->group(function () {
    Route::get('index', function () {
        return view('French.index'); // returns the French index view
    })->name('index');
});

// Russian Routes
Route::prefix('Russian')->name('Russian.')->group(function () {
    Route::get('index', function () {
        return view('Russian.index'); // returns the Russian index view
    })->name('index');
});


