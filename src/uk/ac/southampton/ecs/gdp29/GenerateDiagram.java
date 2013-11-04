package uk.ac.southampton.ecs.gdp29;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.FileStoreEditorInput;

public class GenerateDiagram extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
//		MessageDialog.openInformation(
//				HandlerUtil.getActiveWorkbenchWindow(arg0).getShell(), "Info", "The \"Project Diagram Viewer\" view will be displayed");
//		try {
//			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("uk.ac.southampton.ecs.gdp29.view2");
//		} catch (PartInitException e) {
//			e.printStackTrace();
//		}
//		return null;
		File file = new File("F:/runtime-EclipseApplication/TestProject/src/diagrams/newDiagram.diagram");
		
		IFileStore fileOnLocalDisk = EFS.getLocalFileSystem().getStore(file.toURI());
		FileStoreEditorInput editorInput = new FileStoreEditorInput(fileOnLocalDisk);
		
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		try {
			page.openEditor(editorInput, "uk.ac.southampton.ecs.gdp29.editors.DiagramEditor");
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

}
