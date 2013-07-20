package droidsafe.eclipse.plugin.core.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.RadioState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import droidsafe.eclipse.plugin.core.view.SecuritySpecOutlineViewPart;


/**
 * Command to sort the nodes in the Security Spec Outline Tree View. The view part has methods to
 * define different types of sorting strategies.
 * 
 * @author Marcel Becker (becker@kestrel.edu)
 * 
 */
public class SortOutlineView extends AbstractHandler {
    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(SortOutlineView.class);

    /**
     * Command to sort the outline view according to the selected criterion.
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        if (!HandlerUtil.matchesRadioState(event)) {
            IWorkbenchPart part = HandlerUtil.getActivePart(event);
            if (part instanceof SecuritySpecOutlineViewPart) {
                SecuritySpecOutlineViewPart droidsafeView = (SecuritySpecOutlineViewPart) part;
                String currentState = event.getParameter(RadioState.PARAMETER_ID);
                droidsafeView.sortOutlineView(currentState);
                // and finally update the current state
                HandlerUtil.updateRadioState(event.getCommand(), currentState);
            }
        }
        return null;
    }

}
