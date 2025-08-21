import { Component } from '@angular/core';
import { MovieService } from '../movie-service';
import { Movie } from '../movie';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-movie-component',
  imports: [FormsModule],
  templateUrl: './movie-component.html',
  styleUrl: './movie-component.css'
})
export class MovieComponent {
  movieList: Movie[] = [];
  movieId: string = '';
  movieIdAdd: string = '';
  movieNameAdd: string = '';
  languageAdd: string = '';
  imdbRatingAdd: number=0;
  constructor(private movieService: MovieService) {
    this.movieList = this.movieService.getMovies();
  }

  delete(): void {
    this.movieService.deleteByMovieId(this.movieId);
    this.movieList = this.movieService.getMovies();
    this.movieId = ''; // Clear the input field after deletion

  }

  save() {
    const newMovie: Movie = {
      movieId: this.movieIdAdd,
      movieName: this.movieNameAdd,
      language: this.languageAdd,
      imdbRating:this.imdbRatingAdd

    };
    this.movieService.addMovie(newMovie);
    this.movieList = this.movieService.getMovies();
    // Clear the input fields after saving
    this.movieIdAdd = '';
    this.movieNameAdd = '';
    this.languageAdd ='';
    this.imdbRatingAdd = 0;
}

update() {
  const newUpdate: Movie = {
      movieId: this.movieIdAdd,
      movieName: this.movieNameAdd,
      language:this.languageAdd,
      imdbRating:this.imdbRatingAdd
    };
    this.movieService.updateMovie(newUpdate);
    this.movieList = this.movieService.getMovies();
    // Clear the input fields after saving
    this.movieId = '';
    this.movieNameAdd = '';
    this.languageAdd = '';
    this.imdbRatingAdd = 0;
}
edit() {
  const movie = this.movieService.findByMovieId(this.movieId);
  if (movie) {
    this.movieIdAdd = movie.movieId;
    this.movieNameAdd = movie.movieName;
    this.languageAdd = movie.language;
    this.imdbRatingAdd = movie.imdbRating
  } else {
    alert('Movie not found');
}
}

}
