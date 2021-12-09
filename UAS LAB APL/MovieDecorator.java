public abstract class MovieDecorator implements Movie {

	// Protected variable
	protected Movie decoratedMovie;

	// Method 1
	// Abstract class method
	public MovieDecorator(Movie decoratedMovie)
	{
		// This keywordd refers to current object itself
		this.decoratedMovie = decoratedMovie;
	}

	// Method 2 - draw()
	// Outside abstract class
	public void makeMovie() { 
        decoratedMovie.makeMovie(); 
    }
}