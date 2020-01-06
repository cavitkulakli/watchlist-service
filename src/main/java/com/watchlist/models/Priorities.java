package com.watchlist.models;

import java.util.List;

public class Priorities {
    private final List<String> priorities;

    public Priorities(List<String> priorities) {
        this.priorities = priorities;
    }

    public List<String> getPriorities() {
        return priorities;
    }

}
