package Group9.map.area;

import Group9.agent.container.AgentContainer;
import Group9.tree.PointContainer;
import Interop.Agent.Guard;
import Interop.Agent.Intruder;

public class ModifySpeedEffect extends EffectArea<Double> {

    private double guardModifier;
    private double intruderModifier;

    public ModifySpeedEffect(PointContainer pointContainer, double guardModifier, double intruderModifier) {
        super(pointContainer);

        this.guardModifier = guardModifier;
        this.intruderModifier = intruderModifier;
    }

    @Override
    public Double get(AgentContainer<?> agentContainer) {

        if(agentContainer.getAgent() instanceof Guard)
        {
            return this.guardModifier;
        }
        else if(agentContainer.getAgent() instanceof Intruder)
        {
            return this.intruderModifier;
        }

        throw new IllegalStateException();
    }
}
