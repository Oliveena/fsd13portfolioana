<?php

use Illuminate\Support\Facades\Route;

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


