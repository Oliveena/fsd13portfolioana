@extends('layouts.app')

    <div id="content">
        <div id="contents">
            <!--========================================== HERO IMAGE SECTION ==========================================-->
            <header class="hero">
                <img id="hero-img" src="{{ asset('/images/vector1.jpg') }}" alt="full-page banner presenting the website">
                <img id="face-img" src="{{ asset('/images/thumbnail_20240601_143811.jpg') }}" alt="Ana's face"
                    style="position: absolute; top: 15%; right: 50%; transform: translateX(150%); max-width: 25%; height: auto; z-index: 2; border-radius: 25%;"
                    loading="lazy">
                <div class="hero-text" id="hero-text">
                    <h1>Hello, this is Ana</h1>
                    <h2>Web Developer and Nurse Clinician</h2>
                </div>
            </header>

            <!--========================================== DOWNLOAD CV SECTION ==========================================-->
            <div class="welcome text-center py-5">
                <div id="download_text">
                    <h3>Download my resume</h3>
                </div>
                <div class="cv_download mt-4">
                    <button id="pdf-cv" class="btn btn-primary btn-lg mx-2" data-bs-toggle="modal" data-bs-target="#downloadModal" data-file="{{ asset('/documents/2024_Inf_Clin_CV_FR.pdf') }}">
                        PDF
                    </button>
                    
                    <button id="word-cv" class="btn btn-success btn-lg mx-2" data-bs-toggle="modal" data-bs-target="#downloadModal" data-file="{{ asset('/documents/2024_Inf_Clin_CV_FR.docx') }}">
                        Word
                    </button>
                </div>
            </div>
        </div>

        <!--========================================== MODAL SECTION ==========================================-->
        <div class="modal fade" id="downloadModal" tabindex="-1" aria-labelledby="downloadModalLabel"
            aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="downloadModalLabel">Please enter your details:</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form id="downloadForm">
                            <div class="mb-3">
                                <label for="userName" class="form-label">Name or Company Name</label>
                                <input type="text" class="form-control" id="userName" required>
                            </div>
                            <div class="mb-3">
                                <label for="userEmail" class="form-label">Email Address</label>
                                <input type="email" class="form-control" id="userEmail" required>
                            </div>
                            <button type="submit" class="btn btn-info">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!--========================================== TESTIMONIALS SECTION ==========================================-->
        <h3 class="text-center mb-4">Testimonials</h3>
        <div id="testimonials" class="container py-5 carousel slide" data-bs-ride="carousel" data-bs-interval="3000">
            <div id="reviews-display" class="carousel-inner">
                <!--reviews are displayed in here-->
            </div>

            <button class="carousel-control-prev" type="button" data-bs-target="#testimonials" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#testimonials" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>

        <!-- review form-->
        <div id="addReview" class="mt-5">
            <h3 class="text-center mb-3">Add Your Review</h3>
            <form id="reviewForm" class="mx-auto" style="max-width: 800px;">
                <div class="mb-3">
                    <label for="reviewText" class="form-label" style="color: black;">Your Review:</label>
                    <textarea id="reviewText" class="form-control" rows="4"></textarea>
                </div>
                <div class="mb-3">
                    <label for="reviewName" class="form-label" style="color: black;">Your Name:</label>
                    <input type="text" id="reviewName" class="form-control" />
                </div>
                <button type="submit" class="btn btn-primary w-100">Submit Review</button>
            </form>
        </div>
    </div>
