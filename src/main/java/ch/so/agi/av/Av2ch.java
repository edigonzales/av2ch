package ch.so.agi.av;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.interlis.ili2c.Ili2c;
import ch.interlis.ili2c.Ili2cException;
import ch.interlis.ili2c.config.Configuration;
import ch.interlis.ili2c.metamodel.*;
import ch.interlis.ilirepository.IliManager;
import ch.interlis.iom.*;
import ch.interlis.iox.*;
import ch.interlis.iom_j.itf.ItfReader;
import ch.interlis.iom_j.itf.ItfWriter;
import ch.interlis.iom_j.itf.EnumCodeMapper;
import ch.interlis.iom_j.itf.ModelUtilities;

public class Av2ch {
    Logger log = LoggerFactory.getLogger(this.getClass());
    
    private final String PREFIX = "ch_";
    
    private ch.interlis.ili2c.metamodel.TransferDescription iliTdInput = null;
    private ch.interlis.ili2c.metamodel.TransferDescription iliTdOutput = null;
    
    private Map tag2type = null;
    private String inputModelName = null;
    private static HashMap<String, String> outputModelNames;
    
    private HashMap<String,EnumerationType> inputEnumerations = null;
    private HashMap<String,EnumerationType> outputEnumerations = null;
    private IoxReader ioxReader = null;
    private IoxWriter ioxWriter = null;
    private HashMap<String, HashMap<Integer, Integer>> enumerationMappings = null;
    private ArrayList inputTables = null;
    private ArrayList outputTables = null;
    private EnumCodeMapper enumCodeMapper = new EnumCodeMapper();
    
    static {
        outputModelNames = new HashMap<String, String>();
        outputModelNames.put("de","DM01AVCH24LV95D");
        outputModelNames.put("it","MD01MUCH24MN95I");
    }
    
    /**
     * Converts surveying data from a cantonal INTERLIS model into the federal model. 
     * A simple prefix ('ch_') will be added the to file name.
     * LV95 only! LV03 is not supported!
     * 
     * @param inputFileName
     * @param outputPath
     * @param language The language of the model (de, it)
     * @throws IoxException
     * @throws Ili2cException
     * @throws IllegalArgumentException
     */
    public void convert(String inputFileName, String outputPath, String language) throws IoxException, Ili2cException, IllegalArgumentException {

    }
    
    public boolean convert() {
        return true;
    }
}
