/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Ferenc Karsany
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package ec.devnull.osprest.model;


import ec.devnull.osprest.util.StringHelper;

import java.util.List;

/**
 * Created by fkarsany on 2015.01.11..
 */
public class Type {

    private String typeName;
    private List<ec.devnull.osprest.model.TypeAttribute> attributeList;
    private String converterPackageName;
    private String objectPackage;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<ec.devnull.osprest.model.TypeAttribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<ec.devnull.osprest.model.TypeAttribute> attributeList) {
        this.attributeList = attributeList;
    }

    public String getJavaClassName() {
        return StringHelper.toCamelCase(typeName);
    }

    public String getConverterPackageName() {
        return converterPackageName;
    }

    public void setConverterPackageName(String converterPackageName) {
        this.converterPackageName = converterPackageName;
    }

    public String getObjectPackage() {
        return objectPackage;
    }

    public void setObjectPackage(String objectPackage) {
        this.objectPackage = objectPackage;
    }
}
