package ru.mentee.power.devtools.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Список студентов с возможностью поиска по имени и городу.
 */
public class StudentList {

  /**
   * Максимальное количество студентов в списке.
   */
  public static final int MAX_SIZE = 100;

  private final List<Student> studentList;
  private final Map<String, Student> studentByName;

  /**
   * Создает пустой список студентов.
   */
  public StudentList() {
    studentList = new ArrayList<>();
    studentByName = new HashMap<>();
  }

  /**
   * Добавляет студента в список, если его имя не пустое.
   *
   * @param student студент для добавления
   */
  public void studentAdd(Student student) {
    if (student != null
        && student.name() != null
        && student.name().length() > 0) {

      System.out.println("Debug: studentAdd");
      studentList.add(student);
      studentByName.put(student.name(), student);
    }
  }

  /**
   * Возвращает список студентов из указанного города.
   *
   * @param city город
   * @return список студентов из этого города
   */
  public List<Student> getStudentsFromCity(String city) {
    return studentList.stream()
        .filter(student -> student.city() != null && student.city().equals(city))
        .toList();
  }

  /**
   * Ищет студента по имени.
   *
   * @param name имя студента
   * @return найденный студент или {@code null}, если не найден
   */
  public Student findStudentByName(String name) {
    for (Student student : studentList) {
      if (student.name() != null && student.name().equals(name)) {
        return student;
      }
    }
    return null;
  }
}
