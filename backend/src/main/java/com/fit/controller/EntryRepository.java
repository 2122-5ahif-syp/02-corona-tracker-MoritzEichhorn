package com.fit.controller;

import com.fit.entities.Entry;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EntryRepository implements PanacheRepository<Entry> {
}
