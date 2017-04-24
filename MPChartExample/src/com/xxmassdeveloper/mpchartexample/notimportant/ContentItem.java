package com.xxmassdeveloper.mpchartexample.notimportant;

/**
 * Created by Philipp Jahoda on 07/12/15.
 */
public class ContentItem<T extends DemoBase> {

    String name;
    String desc;
    boolean isNew = false;
    Class<T> demoBase;

    public ContentItem(String n, String d) {
        this(n, d, null);
    }

    public ContentItem(String n, String d, Class<T> b) {
        name = n;
        desc = d;
        demoBase = b;
    }
}
