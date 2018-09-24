package com.codecool.uml.overriding;

public class AbstractProcess {
    public void process(Orderable item){};
    protected void action(Orderable item){};
    public void StepBefore(){};
    public void StepAfter(){};
}
