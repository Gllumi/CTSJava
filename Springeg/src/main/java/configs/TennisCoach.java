package configs;
import org.springframework.beans.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myCoach")
public class TennisCoach {
	
	@Autowired
	private Fortune fortune;
	
	public TennisCoach (Fortune fortuner) {
		fortune=fortuner;
	}
	
	public String getDailyWorkout() {
		return "Practice";
	}
}
