package com.holcomb.sean.recipeapp.services;

import com.holcomb.sean.recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
