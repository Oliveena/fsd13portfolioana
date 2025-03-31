@extends('layouts.app')

@section('content')
    <div id="content">
        <!--========================================== FEATURED PROJECTS SECTION ==========================================-->
        <section id="featured_projects">
            <h3>Featured Projects</h3>

            <div class="transparent-background-cold">
                <div class="row g-4">

                    <!-- Card 1 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Project Image">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Carbon Footprint Calculator</p>
                            </div>
                        </div>
                    </div>

                    <!-- Card 2 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Project Image">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Java Login GUI</p>
                            </div>
                        </div>
                    </div>

                    <!-- Card 3 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Project Image">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Artist Portfolio Webpage</p>
                            </div>
                        </div>
                    </div>

                    <!-- Card 4 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Project Image">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Database Queries</p>
                            </div>
                        </div>
                    </div>

                    <!-- Card 5 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Project Image">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Library Management Software</p>
                            </div>
                        </div>
                    </div>

                    <!-- Card 6 -->
                    <div class="col-12 col-sm-6 col-md-4 col-lg-4">
                        <div class="card">
                            <img src="{{ asset('images/jpeg.webp') }}" class="card-img-top img-fluid" alt="Project Image">
                            <div class="card-body rounded">
                                <p class="card-text text-primary">Home Care Planner</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
@endsection
