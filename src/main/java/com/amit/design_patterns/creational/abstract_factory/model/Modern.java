package main.java.com.amit.design_patterns.creational.abstract_factory.model;

import main.java.com.amit.design_patterns.creational.abstract_factory.common.Chair.ChairInterface;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Chair.ModernChair;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Sofa.ModernSofa;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Sofa.SofaInterface;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Table.ModernTable;
import main.java.com.amit.design_patterns.creational.abstract_factory.common.Table.TableInterface;

public class Modern extends Furniture {

    @Override
    public ChairInterface createChair() {
        return new ModernChair();
    }

    @Override
    public SofaInterface createSofa() {
        return new ModernSofa();
    }

    @Override
    public TableInterface createTable() {
        return new ModernTable();
    }
}
