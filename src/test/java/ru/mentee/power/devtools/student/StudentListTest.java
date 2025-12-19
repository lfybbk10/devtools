package ru.mentee.power.devtools.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.mentee.power.ProgressDemo;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Тестирование StudentList")
class StudentListTest {

  private StudentList studentList;

  @BeforeEach
  void init() {
    studentList = new StudentList();
  }

  @Test
  @DisplayName("Должен добавить студента")
  void shouldAddStudent() {
    Student student = new Student("Иван", "Москва");
    studentList.studentAdd(student);

    assertThat(student).isEqualTo(studentList.findStudentByName("Иван"));
    assertThat(student).isEqualTo(studentList.getStudentsFromCity("Москва").getFirst());
  }
}