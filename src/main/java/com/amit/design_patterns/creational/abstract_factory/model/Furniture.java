package main.java.com.amit.design_patterns.creational.abstract_factory.model;

import main.java.com.amit.design_patterns.creational.abstract_factory.common.Chair.ChairInterface;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Sofa.SofaInterface;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Table.TableInterface;

public abstract class Furniture {
    public abstract ChairInterface createChair();
    public abstract SofaInterface createSofa();
    public abstract TableInterface createTable();
}
