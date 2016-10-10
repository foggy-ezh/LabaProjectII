package com.training.lab.second.library;

import com.training.lab.second.edition.AbstractEdition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 07.10.2016.
 */
public class Library {
    private String name;
    List<AbstractEdition> editionList =  new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<AbstractEdition> getEditionList() {
        return editionList;
    }

    public void addToEditionList(AbstractEdition edition) {
        if(!this.editionList.isEmpty()) {
            for(AbstractEdition currentEdition : editionList){
                if (currentEdition.getEditionId()==edition.getEditionId()){return;}
            }
        }
        this.editionList.add(edition);
    }
}
