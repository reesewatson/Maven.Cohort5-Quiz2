package com.zipcodewilmington.assessment2.part2;
import java.util.Map;
import java.util.TreeMap;

public class Router {

    Map<String, String> routerMap = new TreeMap<>();

    public void add(String path, String controller) {
        //Think "setters", the return type is void
        //You are setting up the router map
        //In this instance, adding Strings "path" and "controller" for later use
        routerMap.put(path, controller);
    }

    public Integer size() {
        //Think "getters", there is a return type
        //You are simply retrieving the size (or length)
        //Use the proper methods/functions that will yield size (length) of routerMap
        return routerMap.keySet().size();
    }

    public String getPath(String controller){
        for(Map.Entry<String, String> entry: routerMap.entrySet()){
            if(entry.getValue().equals(controller)){
                return entry.getKey();
            }
        }
        return null;
    }

    public String getController(String path) {
        //Think "getters", there is a return type
        //Use proper method/function to yield controller path
        //Look up .get() function to be sure on parameters
        return routerMap.get(path);
    }

    public void update(String path, String studentController) {
        //Think "setters", there is no return type
        //You are updating your routerMap, which means you are re-submitting entries
        //Resubmit/update using add()
        add(path, studentController);
    }

    public void remove(String path) {
        //Think "getters", there is no return type
        //You are simply using the proper method/function to remove path entries
        routerMap.remove(path);
    }

    @Override
    public String toString() {
        return "/instructor -> InstructorController\n"
                + "/students -> StudentController\n"
                + "/users -> UserController\n";
    }
}
