package pl.cecherz.proglang.usage;

import java.util.ArrayList;

public class Applications {
    private final ArrayList<String> applicationAreas = new ArrayList<>();

    public void addUsage(String usage) {
        applicationAreas.add(usage);
    }

    public ArrayList<String> getApplicationAreas() {
        return applicationAreas;
    }
}
