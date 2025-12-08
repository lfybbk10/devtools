### Quick Start

**Через Gradle Tool Window (IDEA):**  
`View → Tool Windows → Gradle` →  
`Tasks → application → run` — запуск  
`Tasks → build → build` — сборка  
`Tasks → verification → test` — тесты (двойной клик по задаче).

**Через Run Anything (Ctrl+Ctrl):**  
Нажмите `Ctrl` дважды → введите:

```bash
gradle run
gradle build
gradle test
```

---

### Packages

`ru.mentee.power` — основной пакет со всеми классами

---

### Поля

| Имя                  | Описание                                      |
|----------------------|-----------------------------------------------|
| `menteeName`         | Имя менти                                     |
| `sprintNumber`       | Номер спринта                                 |
| `plannedHoursPerWeek`| План часов в неделю                           |
| `readyForSprint()`   | Проверка, можно ли начинать спринт           |

