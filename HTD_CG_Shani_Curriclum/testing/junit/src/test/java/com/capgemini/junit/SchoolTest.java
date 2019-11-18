package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchoolTest {

	private School school;

	@BeforeEach
	private void createObject() {
		school = new School();
	}

	@Test
	public void testRegisterStudent() {
		Student student = new Student("Dimple", 67.78, 'f');
		Student stu = school.registerStudent(student);
		assertEquals(1, stu.getId());
	}

	@Test
	public void testRegisterStudentForNull() {
		assertThrows(NullPointerException.class, () -> school.registerStudent(null));
	}

}
