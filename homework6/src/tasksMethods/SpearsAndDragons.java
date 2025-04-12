package tasksMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Класс для выполнения пятого задания
 */
public class SpearsAndDragons {
    private final int healthSpear;
    private int healthDragon;
    private final int attackSpear;
    private final int attackDragon;
    private final List<List<String>> battleLog;

    public SpearsAndDragons() {
        // инициализация полей класса
        battleLog = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите здоровье копейщика, здоровье дракона, атаку копейщика, атаку дракона");
        healthSpear = input.nextInt();
        healthDragon = input.nextInt();
        attackSpear = input.nextInt();
        attackDragon = input.nextInt();
        input.close();
    }

    public void start() {
        // поиск необходимого количества копейщиков
        findRequiredNumber();
    }

    private void findRequiredNumber() {
        // пока не найдено количество, проверять на успех
        int iterator = 1;
        while (!didSucceed(iterator)) {
            iterator++;
        }
        // вывести лог для успешной итерации
        printLog(iterator);
    }

    private void printLog(int iteration) {
        System.out.println("Итерация №" + iteration);
        List<String> records = battleLog.get(iteration - 1);
        // выводим построчно лог итерации из временного списка
        for (String record : records) {
            System.out.println(record);
        }
    }

    private List<Integer> getHealthList(int spears) {
        // создание и заполнение списка здоровья
        List<Integer> healthList = new ArrayList<>();
        for (int i = 0; i < spears; i++) {
            healthList.add(healthSpear);
        }
        // возврат списка здоровья
        return healthList;
    }

    private boolean didSucceed(int spears) {
        // список здоровья копейщиков
        List<Integer> spearHealthList = getHealthList(spears);
        // лог боя для конкретной итерации
        List<String> logList = new ArrayList<>();

        int backupValue = healthDragon;
        // пока здоровье дракона больше нуля и список здоровья не пуст
        while (healthDragon > 0 && !spearHealthList.isEmpty()) {
            // атака копейщиков
            spearAttack(spearHealthList.size(), logList);
            // если дракон ещё жив после атаки
            if (healthDragon > 0) {
                // атака дракона
                dragonAttack(spearHealthList, logList);
            }
        }

        // смотрим, удалось ли убить дракона
        boolean didSucceed = (healthDragon <= 0);
        // сбрасываем здоровье дракона
        healthDragon = backupValue;
        // добавляем в лог запись об исходе битвы
        addVerdictRecord(didSucceed, logList);
        // добавляем лог итерации в общий
        battleLog.add(logList);
        // возвращаем результат схватки
        return didSucceed;
    }

    private void spearAttack(int spears, List<String> logList) {
        // копейщики атакуют дракона, уменьшая его здоровье
        int dealingDamage = attackSpear * spears;
        healthDragon -= dealingDamage;
        // лист передаётся ниже, чтобы зафиксировать результат атаки
        addSpearAttackRecord(dealingDamage, healthDragon, logList);
    }

    private void dragonAttack(List<Integer> spearHealthList, List<String> logList) {
        // заносим атаку дракона в буфер, для распределения урона
        int attackBuffer = attackDragon;
        // пока буфер не пуст и список здоровья копейщиков не пуст, распределяем урон
        while (attackBuffer != 0 && !spearHealthList.isEmpty()) {
            int lastSpearHealth = spearHealthList.getLast();
            if (lastSpearHealth < attackBuffer) {
                // если буфера хватит и на следующих копейщиков
                attackBuffer -= lastSpearHealth;
                spearHealthList.removeLast();
            } else {
                // если копейщик на итерации последним впитает урон
                // убираем здоровье последнего копейщика из списка
                spearHealthList.removeLast();
                // возвращаем, только если он ещё жив
                if (lastSpearHealth - attackBuffer != 0) {
                    spearHealthList.add(lastSpearHealth - attackBuffer);
                }
                // обнуляем буфер
                attackBuffer = 0;
            }
        }
        if (!spearHealthList.isEmpty()) {
            // если копейщики ещё не проиграли, добавляем запись в лог
            addDragonAttackRecord(spearHealthList.size(), spearHealthList.getLast(), logList);
        }
    }

    private void addSpearAttackRecord(int damage, int dragonHealthRemained, List<String> logList) {
        // создаём строку для записи
        String record;
        // проверяем, будет ли запись первой, добавляем соответственно
        if (logList.isEmpty()) {
            record = "Копейщики атакуют (урон " + damage + ") – у дракона осталось " + dragonHealthRemained + " жизней";
            logList.add(record);
        } else if (dragonHealthRemained > 0) {
            // программа не зайдёт в этот блок, если дракон убит, записи не будет
            record = "Копейщики атакуют – у дракона осталось " + dragonHealthRemained + " жизней";
            logList.add(record);
        }
    }

    private void addDragonAttackRecord(int leftStanding, int lastHealth, List<String> logList) {
        String record = "Дракон атакует – осталось " + leftStanding + " копейщиков";
        // после формирования базовой части записи создаём буфер и проверяем, нужно ли расширить запись
        StringBuilder buffer = new StringBuilder();
        buffer.append(record);
        // расширяем запись, если есть раненый копейщик
        if (lastHealth < healthSpear) {
            buffer.append(", один из которых ранен (осталось ").append(lastHealth).append(" жизней)");
        }
        // добавляем запись
        logList.add(buffer.toString());
    }

    private void addVerdictRecord(boolean didSucceed, List<String> logList) {
        // создаём буфер записи
        StringBuilder buffer = new StringBuilder();
        // в зависимости от успеха предприятия копейщиков заполняем буфер
        if (didSucceed) {
            buffer.append("Копейщики атакуют и побеждают");
        } else {
            buffer.append("Дракон атакует и побеждает");
        }
        // добавляем запись
        logList.add(buffer.toString());
    }

}
