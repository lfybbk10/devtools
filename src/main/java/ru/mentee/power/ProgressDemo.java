package ru.mentee.power;

/**
 * Демо класс.
 */
public class ProgressDemo {
  /**
   * Точка входа для примера работы трекера прогресса.
   *
   * @param args аргументы командной строки
   */
  public static void main(String[] args) {
    MenteeProgress progress = new MenteeProgress("Имя студента", 1, 6);

    System.out.println(progress.summary());
    if (progress.readyForSprint()) {
      System.out.println("Status: sprint ready");
    } else {
      System.out.println("Status: backlog first");
    }

    System.out.println("Current branch - feature/DVT-3");
  }
}