package com.fit.controller;

import com.fit.entities.Entry;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class EntryRepository implements PanacheRepository<Entry> {
}
