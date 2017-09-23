package org.openecomp.mso.yangDecoder.base;

import org.opendaylight.mdsal.binding.api.DataBroker;
import org.opendaylight.mdsal.dom.api.DOMDataBroker;
import org.opendaylight.mdsal.binding.generator.impl.ModuleInfoBackedContext;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import org.opendaylight.yangtools.yang.binding.util.BindingReflections;
import org.opendaylight.yangtools.yang.model.api.SchemaContext;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//--

public abstract class TYangJsonXmlBase {

    private Iterable<YangModuleInfo> moduleInfos;
    protected SchemaContext schemaContext;
//----------
    private DataBrokerTestCustomizer testCustomizer;
    private DataBroker dataBroker;
    private DOMDataBroker domBroker;

    protected Iterable<YangModuleInfo> getModuleInfos() throws Exception {
        return BindingReflections.loadModuleInfos();
    }
    public static void writefile(String confname, String strx)
    {
    	final String outd="outdir";
    	File dir = new File(outd);  
    	dir.mkdir();
        String fn = outd+File.separatorChar+confname;
        try(FileWriter fw = new FileWriter(fn); BufferedWriter writer = new BufferedWriter(fw))
        {
            // FileWriter fw = new FileWriter(fn);
            // BufferedWriter writer = new BufferedWriter(fw);
            writer.write(strx);
            // writer.close();
            // fw.close();
        }
        catch (Exception e)
        {
        }
    }
 
    public final void setup() throws Exception {
        moduleInfos = getModuleInfos();
        ModuleInfoBackedContext moduleContext = ModuleInfoBackedContext.create();
        moduleContext.addModuleInfos(moduleInfos);
        schemaContext = moduleContext.tryToCreateSchemaContext().get();
        setupWithSchema(schemaContext);
    }

    /**
     * Setups test with Schema context.
     *
     * @param context schema context
     */
    protected  void setupWithSchema(SchemaContext context){
        testCustomizer = createDataBrokerTestCustomizer();
        dataBroker = testCustomizer.createDataBroker();
        domBroker = testCustomizer.createDOMDataBroker();
        testCustomizer.updateSchema(context);
        setupWithDataBroker(dataBroker);
    }
    protected void setupWithDataBroker(final DataBroker dataBroker) {
        // Intentionally left No-op, subclasses may customize it
    }

    protected DataBrokerTestCustomizer createDataBrokerTestCustomizer() {
        return new DataBrokerTestCustomizer();
    }

    public DataBroker getDataBroker() {
        return dataBroker;
    }

    public DOMDataBroker getDomBroker() {
        return domBroker;
    }
    public void close()
    {
    	//domBroker.
    	testCustomizer.close();
    }
}