package tools.descartes.dlim.generator;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {
    public static final String PLUGIN_ID = "tools.descartes.dlim.generator";

    private static Activator plugin;

    public static Activator getInstance() {
        return plugin;
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        Activator.plugin = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        Activator.plugin = null;
        super.stop(context);
    }

    public void log(IStatus logEntry) {
        ILog logger = getLog();
        if (logger != null) {
            logger.log(logEntry);
        }
    }
}
