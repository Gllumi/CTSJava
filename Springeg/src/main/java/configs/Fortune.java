package configs;
import org.springframework.beans.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class Fortune {
	public String fortuner() {
		return "Fortuner is a SUV";
	}
}
