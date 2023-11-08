import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PersonneTest {
	private Personne p;
	
	@BeforeEach
	public void setUp() throws Exception {
		this.p = new Personne("MARTIN","LAURENT");
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreationLogin() {
		
		/*if(!p.getLogin().equals("lmartin"))
			fail("Not yet implemented");*/
		Assert.assertEquals("Pas de majuscules !", "lmarti",this.p.getLogin());
		
	}
	
	@Test
	void getTailleLogin() {
		
		Assert.assertEquals("Pas de majuscules !", 6,this.p.getTailleLogin(p.getLogin()));
		
	}

}
