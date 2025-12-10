package ru.mentee.power;

/**
 * Прогресс mentee по конкретному спринту.
 *
 * @param menteeName          имя mentee
 * @param sprintNumber        номер спринта
 * @param plannedHoursPerWeek запланированные часы в неделю
 */
public record MenteeProgress(
    String menteeName,
    int sprintNumber,
    int plannedHoursPerWeek) {

  /**
   * Проверяет, достаточно ли запланировано часов для старта спринта.
   *
   * @return {@code true}, если запланировано минимум 3 часа в неделю
   */
  public boolean readyForSprint() {
    return plannedHoursPerWeek >= 3;
  }

  /**
   * Возвращает краткое описание прогресса по спринту.
   *
   * @return строка с информацией о спринте и планируемых часах
   */
  public String summary() {
    return "Sprint %d → %s: planned %d h"
        .formatted(sprintNumber, menteeName, plannedHoursPerWeek);
  }
}
