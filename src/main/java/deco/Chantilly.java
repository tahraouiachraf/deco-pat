package deco;

import boissons.Boisson;

public class Chantilly extends DecorateurBoisson {
    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Chantilly";
    }

    @Override
    public double cout() {
        return 0.8 + boisson.cout();
    }
}
