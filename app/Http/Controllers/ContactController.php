<?php

namespace App\Http\Controllers;

use App\Models\Contact;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class ContactController extends Controller
{
    // Store the contact information
    public function store(Request $request)
    {
        // Validate the incoming data
        $validated = $request->validate([
            'name' => 'required|string|max:200',
            'email' => 'required|email|max:200',
        ]);

        // Create a new contact record in the database
        Contact::create($validated);

        // Optionally, you can return a response or redirect the user
        return back()->with('success', 'Thanks! Your information has been saved.');
    }
}

