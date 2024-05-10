package org.example.summary._10_05_2024_task.vocab;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Vocab {
    private Map<String,String>wordToTranslation;

    public Vocab(Set<String> vocab) {
        this.wordToTranslation = new HashMap<>();
        for (String string : vocab) {
            if (string == null||string.isBlank()||!string.contains(" "))continue;
            String key = string.substring(0, string.indexOf(""));
            String value = string.substring(string.indexOf("")+1);
            wordToTranslation.put(key,value);
        }
    }
}
