package ku.util;
import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

/**
 * JUnit test for stack.
 * @author Issaree Srisomboon
 *
 */
public class StackTest {
	private Stack<String> stack;
	
	/** Setup the stack and run before each test. */
	@Before
	public void setUp() {
		StackFactory.setStackType( 0 );
//		StackFactory.setStackType( 1 );
		stack = makeStack( 2 );
	}
	
	/** Capacity must not less than one. */
	@Test
	public void testCapasityLessThanOne() {
		assertFalse( stack.capacity() < 1 );
	}
	
	/** Test for checking the stack's size after using push(), peek(), and pop(). */
	@Test
	public void testStackSize() {
		stack.push( "a" );
		assertEquals( 1 , stack.size() );
		stack.push( "b" );
		assertEquals( 2 , stack.size() );
		stack.peek();
		stack.peek();
		assertEquals( 2 , stack.size() );
		stack.pop();
		assertEquals( 1 , stack.size() );
		stack.push( "c" );
		assertEquals( 2 , stack.size() );
		stack.pop();
		stack.pop();
		assertEquals( 0 , stack.size() );
	}
	
	/** Stack must empty and equals 0 for making new stack. */
	@Test
	public void testnewStackIsEmpty() {
		assertTrue( stack.isEmpty() );
		assertFalse( stack.isFull() );
		assertEquals( 0 , stack.size() );
	}
	
	/** peek() should always return the same element and not alter the stack. */
	@Test
	public void testPeekAllElements() {
		stack.push( "a" );
		stack.push( "b" );
		assertTrue( "b".equals(stack.peek()) );
		assertFalse( "a".equals(stack.peek()) );
		assertTrue( stack.isFull() );
		assertEquals( 2 , stack.size() );
		assertFalse( stack.isEmpty() );
	}
	
	/** peek() should throw an exception if stack is empty. */
	@Test ( expected = java.util.EmptyStackException.class )
	public void testPeekEmptyStackThrowException() {
		assumeTrue( stack.isEmpty() );
		stack.peek();
	}
	
	/** pop() should always remove the top element from the stack. */
	@Test
	public void testPopAllElements() {
		stack.push( "a" );
		stack.push( "b" );
		assertTrue( "b".equals(stack.pop()) );
		assertFalse( stack.isFull() );
		assertEquals( 1 , stack.size() );
		assertTrue( "a".equals(stack.pop()) );
		assertTrue( stack.isEmpty() );
		assertEquals( 0 , stack.size() );
	}
	
	/** pop() should throw an exception if stack is empty. */
	@Test ( expected = java.util.EmptyStackException.class )
	public void testPopEmptyStackThrowException() {
		assumeTrue( stack.isEmpty() );
		stack.pop();
	}
	
	/** pop() cannot be used when already pop more than the elements in the stack. */
	@Test ( expected = IllegalArgumentException.class )
	public void testPopOffByOneThrowException() {
		stack.push( "a" );
		stack.push( "b" );
		stack.pop();
		stack.pop();
		stack.pop();
	}
	
	/** push() should throw an exception if stack is full. */
	@Test ( expected = IllegalStateException.class )
	public void testPushFullStackThrowException() {
		stack.push( "a" );
		stack.push( "b" );
		stack.push( "c" );
	}
	
	/** Throw an exception when push null to the stack. */
	@Test ( expected = IllegalArgumentException.class )
	public void testPushNullStackThrowException() {
		stack.push( null );
	}
	
	/**
	 * Create stack.
	 * @param capacity for stack
	 * @return String type stack
	 */
	private Stack<String> makeStack( int capacity ) {
		return StackFactory.makeStack(capacity);
	}

}
