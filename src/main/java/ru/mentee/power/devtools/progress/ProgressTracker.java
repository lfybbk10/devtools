package ru.mentee.power.devtools.progress;

/**
 * Класс для вычисления суммарного прогресса группы mentee.
 */
public class ProgressTracker {

  /**
   * Точка входа для примера работы трекера прогресса.
   *
   * @param args аргументы командной строки
   */
  public static void main(String[] args) {
    ProgressTracker tracker = new ProgressTracker();

    // Создаём массив mentee (продолжение DVT-2: добавляем прогресс к личной карточке)
    Mentee[] mentees = {
        new Mentee("Иван", "Москва", "Backend разработка", 5, 12),
        new Mentee("Мария", "Санкт-Петербург", "Fullstack", 8, 12),
        new Mentee("Пётр", "Казань", "Java Backend", 12, 12)
    };

    String progress = tracker.calculateTotalProgress(mentees);
    System.out.println(progress);
  }

  /**
   * Вычисляет суммарный прогресс группы mentee.
   *
   * @param mentees массив mentee
   * @return строка с информацией о суммарном прогрессе (пройдено/осталось уроков)
   */
  public String calculateTotalProgress(Mentee[] mentees) {
    if (mentees != null && mentees.length > 0) {
      int totalCompleted = 0;
      int totalTotal = 0;
      int index = 0;

      while (index < mentees.length) {
        totalCompleted += mentees[index].completedLessons();
        totalTotal += mentees[index].totalLessons();
        index++;
      }

      int totalRemaining = totalTotal - totalCompleted;
      return String.format(
          "Суммарно: пройдено %d из %d уроков, осталось %d уроков",
          totalCompleted,
          totalTotal,
          totalRemaining
      );
    }

    return "Массив не должен быть null и должен иметь ненулевую длину";
  }
}
