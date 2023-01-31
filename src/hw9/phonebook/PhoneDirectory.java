package hw9.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {

    private List<Note> noteList = new ArrayList<>();

    public void add(String name, String phone) {
        noteList.add(new Note(name, phone));
    }

    public Note find(String name) {
        for (Note note : noteList) {

            if (note.getName().equals(name)) {
                return note;
            }


        }
        return null;
    }
}