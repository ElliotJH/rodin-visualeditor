package uk.ac.southampton.ecs.gdp29;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;

public class BasicDiagramTypeProvider extends AbstractDiagramTypeProvider implements
		IDiagramTypeProvider {

	public BasicDiagramTypeProvider() {
		// TODO Auto-generated constructor stub
		this.setFeatureProvider(new MyFeatureProvider(this));
	}

}
