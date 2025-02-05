package Lista1.Q312;

import java.util.ArrayList;
import java.util.List;

public class CRUD <E> {

    List<E> myList = new ArrayList<E>();

    public void create(E myObj){
        myList.add(myObj);
    }

    public E read(int position){
        return myList.get(position);
    }

    public void update(E oldObj, E newObj) {
        myList.set(myList.indexOf(oldObj) , newObj);
    }

    public void delete(E myObj){
        myList.remove(myObj);
    }

    public void listarObjetos(){
        for(E obj : myList){
            System.out.println(obj.hashCode());
        }
    }
}
