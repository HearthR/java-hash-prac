package hash.prac;

import java.util.ArrayList;

public class FileDiff {
    private ArrayList<String> added = new ArrayList<>();
    private ArrayList<String> deleted = new ArrayList<>();
    private ArrayList<String> modified = new ArrayList<>();

    void onAdded(String path) {
        added.add(path);
    }

    void onDeleted(String path) {
        deleted.add(path);
    }

    void onModified(String path) {
        modified.add(path);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Added:\n");
        for (String str : added) {
            sb.append(str).append("\n");
        }
        sb.append("Deleted:\n");
        for (String str : deleted) {
            sb.append(str).append("\n");
        }
        sb.append("Modified:\n");
        for (String str : modified) {
            sb.append(str).append("\n");
        }
        return sb.toString();
    }
}
