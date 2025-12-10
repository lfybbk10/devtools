package ru.mentee.power.devtools.progress;

/**
 * Record для представления mentee с информацией о прогрессе обучения.
 * Автоматически создаёт конструктор и геттеры
 */
public record Mentee(String name, String city, String goal, int completedLessons,
                     int totalLessons) {

}