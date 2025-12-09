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

## Правило веток: feature/DVT-X

В репозитории используются следующие правила именования веток:

- Основная ветка: `master`
- Фича-ветки: `feature/DVT-X`, где `X` — номер задачи или тикета.

Примеры:
- `master`
- `feature/DVT-3`

## Git локальный цикл: шаги и команды


```bash
git checkout master
git pull origin master
git checkout -b feature/DVT-3
git status
git add .
git commit -m "DVT-3: описание"