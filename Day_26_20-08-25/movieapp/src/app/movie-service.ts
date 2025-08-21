import { Injectable } from '@angular/core';
import { Movie } from './movie';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  movieList:Movie[] = [
    { movieId: 'M101', movieName: 'Intersteller', language:'English', imdbRating:9.0},
    { movieId: 'M102', movieName: 'Sita Ram', language:'Hindi', imdbRating:9.0},
    { movieId: 'M103', movieName: 'Fast & Furious',language:'Hindi', imdbRating:9.0 }
  ];

  getMovies(): Movie[] {
    return this.movieList;
  }

  deleteByMovieId(movieId: string): void {
    this.movieList = this.movieList.filter(movie => movie.movieId !== movieId);
  }
  addMovie(movie: Movie): void {
    this.movieList.push(movie);
  }
  findByMovieId(movieId: string): Movie | undefined {
    return this.movieList.find(movie => movie.movieId === movieId);
  }

   updateMovie(movie: Movie): void {
    const index = this.movieList.findIndex(e => e.movieId === movie.movieId);
    if (index !== -1) {
      this.movieList[index] = movie;
    } else {
      console.error(`Movie with movieId ${movie.movieId} not found.`);
    }
  }
  
}
