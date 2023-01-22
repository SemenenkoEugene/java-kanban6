package controller;

import entity.Epic;

import java.util.ArrayList;
import java.util.HashMap;

public class EpicController {

    private HashMap<Integer, Epic> epics = new HashMap<>();
    private int counterIdEpics = 0;

    // получение списка всех эпиков
    public ArrayList<Epic> getListAllEpic() {
        return new ArrayList<>(epics.values());
    }

    // удаление всех эпиков
    public void deleteAllEpics() {
        epics.clear();
    }

    // получение эпика по Id
    public Epic getEpicById(Integer id) {
        return epics.get(id);
    }

    //создание нового эпика
    public Epic createEpic(Epic epic) {
        epic.setId(++counterIdEpics);
        return epics.put(epic.getId(),epic);
    }

    // обновление эпика
    public Epic updateEpicById(Epic epic) {
        return epics.put(epic.getId(),epic);
    }

    // удаление эпика по Id
    public void deleteEpicById(Integer id) {
        epics.remove(id);
    }


}
