package main.java.com.amit.design_patterns.creational.abstract_factory.model;

import main.java.com.amit.design_patterns.creational.abstract_factory.common.Chair.BritishChair;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Chair.ChairInterface;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Sofa.BritishSofa;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Sofa.SofaInterface;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Table.BritishTable;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Table.TableInterface;

public class British extends Furniture {

    @Override
    public ChairInterface createChair() {
        return new BritishChair();
    }

    @Override
    public SofaInterface createSofa() {
        return new BritishSofa();
    }

    @Override
    public TableInterface createTable() {
        return new BritishTable();
    }
}
