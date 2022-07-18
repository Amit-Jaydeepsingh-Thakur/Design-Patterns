package main.java.com.amit.design_patterns.creational.abstract_factory.model;

import main.java.com.amit.design_patterns.creational.abstract_factory.common.Chair.ChairInterface;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Chair.VictorianChair;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Sofa.SofaInterface;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Sofa.VictorianSofa;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Table.TableInterface;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Table.VictorianTable;

public class Victorian extends Furniture {

    @Override
    public ChairInterface createChair() {
        return new VictorianChair();
    }

    @Override
    public SofaInterface createSofa() {
        return new VictorianSofa();
    }

    @Override
    public TableInterface createTable() {
        return new VictorianTable();
    }
}
