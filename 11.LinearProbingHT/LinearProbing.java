public class LinearProbing {

    StoredEmployee employee[];

    LinearProbing() {
        employee = new StoredEmployee[10];
    }

    public void put(String key, Employee e) {
        int keyvalue = hashkey(key);
        if (keyOcuupied(keyvalue)) {

            int stopIndex = keyvalue;
            if (keyvalue == employee.length - 1) {
                keyvalue = 0;
            } else {
                keyvalue++;
            }
            while (keyOcuupied(keyvalue) && keyvalue != stopIndex) {
                keyvalue = (keyvalue + 1) % employee.length;
            }
        }

        if (keyOcuupied(keyvalue)) {
            System.out.println("table is full");
        } else {
            employee[keyvalue] = new StoredEmployee(key, e);
        }
    }

    private int hashkey(String key) {
        return key.length() % employee.length;
    }

    private boolean keyOcuupied(int index) {
        return employee[index] != null;
    }


    public void printtable() {
        for (int i = 0; i < employee.length; i++) {

            if (employee[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println("Position " + i + ":" + employee[i].employee);
            }
        }
    }


    public Employee get(String key) {
        int k = getKey(key);
        if (k == -1) {
            return null;
        }

        return employee[k].employee;
    }

    public int getKey(String key) {
        int keyvalue = hashkey(key);
        if (employee[keyvalue].key.equals(key) && employee[keyvalue] != null) {
            return keyvalue;
        }
        int stopIndex = keyvalue;
        if (keyvalue == employee.length - 1) {
            keyvalue = 0;
        } else {
            keyvalue++;
        }
        while (keyvalue != stopIndex && employee[keyvalue] != null && !employee[keyvalue].key.equals(key)) {
            keyvalue = (keyvalue + 1) % employee.length;
        }

        if (employee[keyvalue]!=null && employee[keyvalue].key.equals(key)) {
            return keyvalue;
        } else {
            return -1;
        }
    }

    public Employee remove(String key){
        int key1=getKey(key);
        if(key1==-1){
                 return null;
        }

        Employee aa=employee[key1].employee;

        employee[key1]=null;
         StoredEmployee[] oldhashtable=employee;
         employee=new StoredEmployee[employee.length];

         for(int i=0;i<oldhashtable.length;i++){
             if(oldhashtable[i]!=null){
                 put(oldhashtable[i].key,oldhashtable[i].employee);
             }
         }
         return aa;

    }


}

