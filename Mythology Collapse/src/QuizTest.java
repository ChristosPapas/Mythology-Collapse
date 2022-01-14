import org.junit.Assert;
import org.junit.jupiter.api.Test;

class QuizTest {
	
	@Test
	void testTakeAnAnswer() {
		
		int noOfAnswers = 5;
		int answer = Quiz.takeAnAnswer(noOfAnswers);
		Assert.assertTrue(answer > 0 && answer <= noOfAnswers);
	}

}
