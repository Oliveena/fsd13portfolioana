@extends('layouts.app')

@section('content')
    <div id="content">

        <!--========================================== CONTACT FORM SECTION ==========================================-->
        <section class="contact my-5" id="contact">
            <div class="container">
                <form id="contactForm" class="shadow-lg p-4 rounded border border-light bg-dark">
                    <h3 class="text-center mb-4 text-white">Contactez-moi</h3>

                    <div class="form-group mb-3">
                        <label for="name" class="form-label text-white">Nom :</label>
                        <input class="form-control" type="text" id="name" placeholder="Votre nom ici" required>
                    </div>

                    <div class="form-group mb-3">
                        <label for="email-address" class="form-label text-white">Adresse e-mail :</label>
                        <input class="form-control" type="email" id="email-address" placeholder="votre@mail.com" required>
                    </div>

                    <div class="form-group mb-3">
                        <label for="phone" class="form-label text-white">Numéro de téléphone :</label>
                        <input class="form-control" type="tel" id="phone" placeholder="123-456-7890" required>
                    </div>

                    <div class="form-group mb-3">
                        <label for="message" class="form-label text-white">Message :</label>
                        <textarea class="form-control" id="message" placeholder="Votre message" rows="4" required></textarea>
                    </div>

                    <button type="submit" class="btn btn-primary w-100">Envoyer</button>
                </form>
            </div>
        </section>
    </div>
@endsection
