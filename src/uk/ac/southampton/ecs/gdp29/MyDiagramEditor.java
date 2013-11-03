package uk.ac.southampton.ecs.gdp29;
import org.eclipse.emf.common.util.URI;
import org.eclipse.graphiti.ui.editor.DiagramComposite;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;


public class MyDiagramEditor extends ViewPart {
	DiagramComposite diagramComposite;
	public MyDiagramEditor() {
	}

	@Override
	public void createPartControl(Composite parent) {
		this.diagramComposite = new DiagramComposite(parent, SWT.NONE);
		this.diagramComposite.setLayout(new FillLayout());
		//Support from eclipse composite examples
		this.diagramComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		this.diagramComposite.setInput(new DiagramEditorInput(
			URI.createURI("/TestProject/src/diagrams/newDiagram.diagram"),
			"uk.ac.southampton.ecs.gdp29.BasicDiagramTypeProvider"
		));
	
	}

	@Override
	public void setFocus() {
		diagramComposite.setFocus();
	}

}
