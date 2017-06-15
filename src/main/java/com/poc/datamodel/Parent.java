
package com.poc.datamodel;

import java.io.Serializable;

public class Parent implements Serializable
{

    private String display_value;
    private String link;
    private final static long serialVersionUID = 120258377426837913L;

    public String getDisplay_value() {
        return display_value;
    }

    public void setDisplay_value(String display_value) {
        this.display_value = display_value;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
