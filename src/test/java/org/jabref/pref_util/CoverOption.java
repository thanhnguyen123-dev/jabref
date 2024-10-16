package org.jabref.pref_util;

public class CoverOption {
    private boolean coverViewerEnabled;
    private String coverFolderPath;

    public boolean isCoverViewerEnabled() {
        return coverViewerEnabled;
    }

    public void setCoverViewerEnabled(boolean coverViewerEnabled) {
        this.coverViewerEnabled = coverViewerEnabled;
    }

    public String getCoverFolderPath() {
        return coverFolderPath;
    }

    public void setCoverFolderPath(String coverFolderPath) {
        this.coverFolderPath = coverFolderPath;
    }
}
