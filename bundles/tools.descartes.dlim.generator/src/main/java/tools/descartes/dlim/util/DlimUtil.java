package tools.descartes.dlim.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class DlimUtil {
    /**
     * Returns the model root of the model contained in the file at the modelFilePath. When using
     * this for dlim files, the resulting Object should be cast to dlim.Sequence.
     *
     * @param modelFilePath
     *            path of the .dlim file
     * @return EObject of the root (should be of type dlim.Sequence)
     */
    public static EObject getRootEObject(String modelFilePath) {
        URI fileURI = URI.createFileURI(modelFilePath);
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
            .put("dlim", new EcoreResourceFactoryImpl());
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource dlimResource = resourceSet.getResource(fileURI, true);
        return dlimResource.getContents()
            .get(0);
    }

}
