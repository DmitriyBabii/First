import java.util.Arrays;

public class Phonebook {
    private Note[] note;

    Phonebook(String name, String phoneNumber) {
        //note = new Note[1];
        note = new Note[]{new Note(name, phoneNumber)};
    }

    Phonebook(int size) {
        note = new Note[size];
    }

    void add(String name, String phoneNumber) {
        Note[] tmp = new Note[note.length + 1];
        System.arraycopy(note, 0, tmp, 0, note.length);
        note = tmp;
        note[note.length-1]=new Note(name,phoneNumber);
    }

    void deleteLast() {
        Note[] tmp = new Note[note.length - 1];
        System.arraycopy(note, 0, tmp, 0, note.length - 1);
        note = tmp;
    }

    void deleteByIndex(int index) {
        //Индекс как для пользователя, потому отнимаем 1
        if (--index < 0 || index >= note.length) return;
        Note tmp = note[index];
        note[index] = note[note.length - 1];
        note[note.length - 1] = tmp;
        deleteLast();
    }

    void output() {
        for (Note n : note) {
            System.out.println("Name: " + n.getName());
            System.out.println("Phone number: " + n.getPhoneNumber());
            System.out.println();
        }
    }

    Note get(String name) {
        for (Note n : note)
            if (n.getName().equals(name)) return n;
        return null;
    }

    //Так же вывод можно сделать уже сразу в методе
    Note[] getAll(String name) {
        int count = 0;
        Note[] tmp = new Note[note.length];

        for (Note n : note) {
            if (n.getName().equals(name)) {
                tmp[count] = n;
                count++;
            }
        }
        if (count == 0) return null;
        Note[] temp = new Note[count];
        System.arraycopy(tmp, 0, temp, 0, count);
        return temp;
    }


}
