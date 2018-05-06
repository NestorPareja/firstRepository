package artist;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {
	private static final String plantilla="Hola, %s !!!!!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/artist")
	public Artist artist(@RequestParam(value="name",defaultValue="Mejor DJ del mundo")String name) {
		return new Artist(counter.incrementAndGet(),String.format(plantilla,name));
	}
}
