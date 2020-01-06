package com.watchlist.models;

import java.util.List;

public class Kinds {
    private final List<String> kindTypes;

    public Kinds( List<String> kindTypes) {
        this.kindTypes = kindTypes;
    }

    public List<String> getKindTypes() {
        return kindTypes;
    }
}
