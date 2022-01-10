import org.junit.Assert;
import org.junit.jupiter.api.Test;

class QuizTest {
	static Quiz quizt = new Quiz();
	
	@Test
	void testTakeAnAnswer() {
		
		int noOfAnswers = 5;
		int answer = quizt.takeAnAnswer(noOfAnswers);
		Assert.assertTrue(answer > 0 && answer <= noOfAnswers);
	}

}
