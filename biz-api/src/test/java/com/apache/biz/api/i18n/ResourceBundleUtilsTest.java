package com.apache.biz.api.i18n;

import org.junit.jupiter.api.Test;

import java.util.ResourceBundle;

public class ResourceBundleUtilsTest {

    @Test
    public void testJavaPropertiesResourceBundle() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("META-INF/Messages");
        System.out.println("testJavaPropertiesResourceBundle: " + resourceBundle.getString("my.name"));
    }

    @Test
    public void testJavaClassResourceBundle() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.apache.biz.api.i18n.HardCodeResourceBundle");
        System.out.println("testJavaClassResourceBundle: " + resourceBundle.getString("my.name"));
    }


}
