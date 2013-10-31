package uk.ac.southampton.ecs.gdp29;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

public class MyFeatureProvider extends DefaultFeatureProvider {

	public MyFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if(context.getNewObject() instanceof org.eclipse.core.internal.resources.File) {
			return new AddMachineFeature(this);
		}
		else {
			System.err.println(context.getNewObject().getClass().toString());
			return super.getAddFeature(context);
		}
	}
}
