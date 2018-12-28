package com.meditab.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModuleFile encodingModule = new EncodingModuleFile();
        encodingModuleFile.encodeWithFiles();
        EncodingModuleDatabase encodingModule = new EncodingModuleDatabase();
        encodingModuleDatabase.encodeBasedOnNetworkAndDatabase();
    }
}
