package uk.ac.southampton.ecs.gdp29;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class GenerateDiagram extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		MessageDialog.openInformation(
				HandlerUtil.getActiveWorkbenchWindow(arg0).getShell(), "Info", "The \"Project Diagram Viewer\" view will be displayed");
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("uk.ac.southampton.ecs.gdp29.view2");
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
	}

}
