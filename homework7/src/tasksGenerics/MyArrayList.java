package tasksGenerics;

import java.util.*;

/**
 * Дженерик-класс, реализующий логику работы динамического массива.
 * Массив подходит для хранения любого ссылочного типа данных.
 *
 * @param <E> тип для работы с дженериком.
 */
public class MyArrayList<E> implements MyList<E> {
    private E[] data;
    private int capacity;
    private int size;

    /**
     * Конструктор.
     * Принимает параметр capacity.
     * Выделяет память под массив (size = 0).
     *
     * @param capacity начальная ёмкость массива.
     */
    @SuppressWarnings("unchecked")
    MyArrayList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        data = (E[]) new Object[capacity];
    }

    /**
     * Конструктор без параметров.
     * Вызывает конструктор с параметром,
     * передавая значение ёмкости 10 единиц.
     */
    MyArrayList() {
        this(10);
    }

    /**
     * Проверяет, достаточно ли резерва памяти для хранения
     * указанного в параметре количества элементов.
     *
     * @param numOfElements количество элементов, которые необходимо хранить.
     */
    @SuppressWarnings("unchecked")
    private void ensureCapacity(int numOfElements) {
        if (numOfElements > capacity) {
            capacity *= 1.5;
            capacity += 1;
            E[] temp = (E[]) new Object[capacity];
            System.arraycopy(data, 0, temp, 0, size);
            data = temp;
        }
    }

    /**
     * Геттер для поля size.
     *
     * @return значение поля size.
     */
    public int getSize() {
        return size;
    }

    /**
     * Добавляет передаваемый элемент в конец массива.
     * Перед добавлением убеждается, что места достаточно.
     *
     * @param element элемент к добавлению.
     */
    public void pushBack(E element) {
        ensureCapacity(size + 1);
        data[size] = element;
        size += 1;
    }

    /**
     * Добавляет передаваемый элемент в начало массива.
     * Перед добавлением убеждается, что места достаточно.
     *
     * @param element элемент к добавлению.
     */
    public void pushFront(E element) {
        ensureCapacity(size + 1);
        System.arraycopy(data, 0, data, 1, size);
        size += 1;
        data[0] = element;
    }

    /**
     * Вставляет передаваемый элемент по передаваемому индексу.
     * Перед добавлением убеждается, что места достаточно.
     *
     * @param element элемент к вставке.
     * @param index   индекс вставки.
     */
    @SuppressWarnings("unchecked")
    public void insert(E element, int index) {
        ensureCapacity(size + 1);
        E[] temp = (E[]) new Object[size + 1];
        if (index > size) {
            index = size;
        } else if (index < 0) {
            index = 0;
        }
        System.arraycopy(data, 0, temp, 0, index);
        System.arraycopy(data, index, temp, index + 1, size - index);
        temp[index] = element;
        size += 1;
        System.arraycopy(temp, 0, data, 0, temp.length);
    }

    /**
     * Удаляет первый элемент массива.
     *
     * @return удалённый элемент.
     */
    @SuppressWarnings("unchecked")
    public E popFront() {
        size -= 1;
        E[] temp = (E[]) new Object[size];
        E deletedElement = data[0];
        System.arraycopy(data, 1, temp, 0, size);
        System.arraycopy(temp, 0, data, 0, size);
        data[size] = null;
        return deletedElement;
    }

    /**
     * Удаляет последний элемент массива.
     *
     * @return удалённый элемент.
     */
    public E popBack() {
        E deletedElement = data[size - 1];
        removeAt(size - 1);
        return deletedElement;
    }

    /**
     * Удаляет элемент массива под переданным индексом.
     *
     * @param index индекс элемента к удалению.
     */
    @SuppressWarnings("unchecked")
    public void removeAt(int index) {
        size -= 1;
        E[] temp = (E[]) new Object[size];
        System.arraycopy(data, 0, temp, 0, index);
        if (index + 1 < size) {
            System.arraycopy(data, index + 1, temp, index, size - index);
        }
        System.arraycopy(temp, 0, data, 0, size);
        data[size] = null;
    }

    /**
     * Удаляет первый элемент, равный переданному.
     *
     * @param element элемент к удалению.
     */
    public void remove(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                removeAt(i);
                return;
            }
        }
    }

    /**
     * Удаляет все элементы, равные переданному.
     *
     * @param element элемент, вхождения которого должны быть удалены.
     */
    public void removeAll(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                removeAt(i);
            }
        }
    }

    /**
     * Очищает массив, заполняя нулями выделенную память.
     * Обнуляет размер.
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    /**
     * Метод для проверки массива на пустоту.
     *
     * @return true, если массив пуст, false - иначе.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Срезает с массива всю неиспользуемую фактически память.
     * Значение capacity приравнивается к size.
     */
    @SuppressWarnings("unchecked")
    public void trimToSize() {
        capacity = size;
        E[] temp = (E[]) new Object[capacity];
        System.arraycopy(data, 0, temp, 0, size);
        data = temp;
    }

    /**
     * Метод для получения индекса первого вхождения передаваемого элемента.
     *
     * @param element искомый элемент.
     * @return индекс искомого элемента.
     */
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Метод для получения индекса последнего вхождения передаваемого элемента.
     *
     * @param element искомый элемент.
     * @return индекс искомого элемента.
     */
    public int lastIndexOf(E element) {
        for (int i = size - 1; i > -1; i--) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Перезаписывает массив наоборот.
     */
    @SuppressWarnings("unchecked")
    public void reverse() {
        E[] temp = (E[]) new Object[size];
        for (int i = size - 1, j = 0; i > -1; i--, j++) {
            temp[j] = data[i];
        }
        data = temp;
    }

    /**
     * Случайным образом меняет порядок следования элементов.
     */
    @SuppressWarnings("unchecked")
    public void shuffle() {
        E[] temp = (E[]) new Object[capacity];
        Set<Integer> slotsUsed = new HashSet<>();
        Random random = new Random();
        for (E element : data) {
            int index = random.nextInt(0, size);
            while (slotsUsed.contains(index)) {
                index = random.nextInt(0, size);
            }
            temp[index] = element;
            slotsUsed.add(index);
        }
        data = temp;
    }

    /**
     * Метод для получения элемента по указанному индексу.
     *
     * @param index индекс желаемого элемента.
     * @return элемент под индексом или null, если индекс выходит за границы массива.
     */
    public E getElementAt(int index) {
        if (index >= size || index < 0) {
            System.out.println("Переданный индекс выходит за пределы массива");
            return null;
        } else {
            return data[index];
        }
    }

    /**
     * Переопределённый метод ToString.
     *
     * @return все элементы массива через пробел.
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (E element : data) {
            stringBuilder.append(element);
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }

    /**
     * Переопределённый метод equals.
     *
     * @param o объект для сравнения.
     * @return равнозначен ли переданный объект.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayList<?> that = (MyArrayList<?>) o;
        return capacity == that.capacity && size == that.size && Arrays.equals(data, that.data);
    }

    /**
     * Переопределённый метод hashCode.
     *
     * @return собственно, хеш-код.
     */
    @Override
    public int hashCode() {
        int result = Objects.hash(capacity, size);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }

    /**
     * Переопределённый метод clone.
     *
     * @return клонированный объект, неглубокое клонирование.
     */
    @SuppressWarnings("unchecked")
    @Override
    public MyList<E> clone() {
        try {
            return (MyArrayList<E>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
