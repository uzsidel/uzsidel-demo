package com.training.java.uzsideldemo.services;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

@Component
public class FileStoreService implements StoregeServices {

    private static final Logger LOG= LoggerFactory.getLogger(FileStoreService.class);
    @Override
    public void save(String text) {
        LOG.debug("save method called with text: "+ text);
        File file = getFile();
        try {
            FileUtils.writeStringToFile(file,text, Charset.defaultCharset());
            LOG.trace("save method completed successfully");
        }catch (IOException e){
            LOG.error("se ha producido un error al guardar",e);
        }
    }

    @Override
    public String Load() {
        LOG.debug("load method called ");
        File file = getFile();
        try {
            String text= FileUtils.readFileToString(file, Charset.defaultCharset());
            LOG.debug("Load method completed successfully");
            return text;
        }catch (IOException e){
            LOG.debug("se ha producido un error al guardar",e);
        }
        return "";
    }

    private File getFile(){
        return new File("store.txt");
    }
}
