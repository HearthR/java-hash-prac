package hash.prac;

import java.io.Serializable;

class FileHash implements Serializable {
    private String id;
    private String hashValue;

    String getId() {
        return id;
    }

    String getHashValue() {
        return hashValue;
    }

    FileHash(String id, String hashValue) {
        this.id = id;
        this.hashValue = hashValue;
    }
}
