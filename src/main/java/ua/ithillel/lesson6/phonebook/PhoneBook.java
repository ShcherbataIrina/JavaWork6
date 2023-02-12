package ua.ithillel.lesson6.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private  List<PhoneBookRecord> records = new ArrayList<>();

    public void add(String name, String phone) {

        records.add(new PhoneBookRecord(name, phone));

    }

    public PhoneBookRecord find(List<PhoneBookRecord> recordList, String name) {

        int index = recordList.indexOf(name);
        if (index != -1) {
            return recordList.get(index);
        } else return null;

    }

    public List<PhoneBookRecord> findAll(List<PhoneBookRecord> recordList, String name) {
        var resultRecordList = new ArrayList<PhoneBookRecord>();


        for (int i = 0; i < recordList.size(); i++) {

            if(recordList.get(i).equals(name)){
                resultRecordList.add(recordList.get(i));
            }

        }
        if (!resultRecordList.isEmpty()) {
            return resultRecordList;
        } else return null;

    }


}
