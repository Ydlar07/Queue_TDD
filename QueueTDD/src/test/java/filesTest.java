import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class filesTest
{
  Files file;
  int ELEMENT_1 = 5;
  int ELEMENT_2 = 8;

  @Before
  public void initializationQueue(){
    file = new Files();
  }

  @Test
  public void givenNoQueue_whenCreateQueue_thenQueueEmpty() {
    boolean exist = file.isEmpty();
    assertEquals(true, exist);
  }

  @Test
  public void givenEmptyQueue_whenAddElement_thenQueueNotEmpty(){
    file.queue(ELEMENT_1);
    boolean queueEmpty = file.isEmpty();
    assertFalse(queueEmpty);
  }

  @Test
  public void givenEmptyQueue_whenAddElement1AndElement2_thenPrintElement2AndElement1(){
    file.queue(ELEMENT_1);
    List<Integer> result = file.queue(ELEMENT_2);
    int teteListe = result.get(0);
    assertEquals(ELEMENT_2, teteListe);
  }
}
