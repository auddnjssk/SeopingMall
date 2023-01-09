package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

   @Override
   protected Class<?>[] getRootConfigClasses() {
      
      return new Class[] {RootConfig.class};
   }//getRootConfigClasses

   @Override
   protected Class<?>[] getServletConfigClasses() {
      
      return new Class[] {ServletConfig.class};
   }//getServletConfigClasses

   @Override
   protected String[] getServletMappings() {
      
      return new String[] {"/"};
   }//getServletMappings

   
   
}//WebConfig