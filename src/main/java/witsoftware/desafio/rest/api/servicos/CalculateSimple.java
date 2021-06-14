package witsoftware.desafio.rest.api.servicos;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import witsoftware.desafio.rest.api.model.OperationModel;

@Service
public class CalculateSimple {
    public int add(OperationModel model){
        return model.getA() + model.getB();
    }

    public int subtract(OperationModel model){
        return model.getA() - model.getB();
    }

    public int multiply(OperationModel model){
        return model.getA() * model.getB();
    }

    public double divide(OperationModel model){
        if(model.getA() == 0) return 0;
        if(model.getB() == 0) return 0;
        return (double) model.getA() / model.getB();
    }

    public OperationModel clearSimple(OperationModel model){
        model.setA(0);
        model.setB(0);
        return model;
    }

    public OperationModel clearAdvanced(OperationModel model){
        model.setC(0);
        return model;
    }
}
