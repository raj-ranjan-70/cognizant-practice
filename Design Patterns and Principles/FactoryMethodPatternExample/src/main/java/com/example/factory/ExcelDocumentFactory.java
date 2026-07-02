package com.example.factory;

import javax.print.Doc;

public class ExcelDocumentFactory extends DocumentFactory{

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
