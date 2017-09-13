import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	System.out.println("hi");
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
	System.out.println("EPAM");
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
	System.out.println("we");
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
	System.out.println("are");
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
	System.out.println("from");
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
	System.out.println("MLRIT");
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
	System.out.println("college");
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
	System.out.println("Hyderabad");
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		System.out.println("Coding");
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		System.out.println("is");
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		System.out.println("tough");
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		System.out.println("EPAM");
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		System.out.println("good evening");
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		System.out.println("have");
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		System.out.println("a");
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		System.out.println("nice");
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		System.out.println("day");
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		System.out.println("good");
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		System.out.println("night");
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		System.out.println("bye");
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		System.out.println("bye");
		return null;
	}
}
