package code;

import java.awt.event.KeyListener;
import java.beans.IntrospectionException;

import java.beans.*;
import java.util.Arrays;


public class ColorsBeanInfo extends SimpleBeanInfo {
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor rectangular = new
                    PropertyDescriptor("rectangular", Colors.class);
            return new PropertyDescriptor[]{rectangular};
        }
        catch(Exception e) {
            System.out.println("Exception caught. " + e);
        }
        return null;
    }

    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        try {
            var eventSetDescriptor=new EventSetDescriptor(Colors.class,"Key", KeyListener.class,"keyTyped");
            var arr=new EventSetDescriptor[]{eventSetDescriptor};
            System.out.println(Arrays.toString(arr));
            return arr;
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        return new EventSetDescriptor[0];
    }
}
