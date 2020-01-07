package ru.ssau.tk.sashapractice.Practice.taskForExam;

import java.lang.reflect.Method;

public class StaticMethod {
    public static String[] getStaticMethod(Object object) {
        Method[] containerMethods = object.getClass().getDeclaredMethods();
        String[] arrString = new String[containerMethods.length];
        int i = 0;
        for (Method method : containerMethods) {
            arrString[i++] = method.toString();
        }
        return arrString;
    }
}
