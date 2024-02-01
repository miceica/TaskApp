import controller.TaskController;
import models.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //User user= new User();
        //System.out.println(user.login("pepe","1234").toString());


        TaskController taskController = new TaskController();
        taskController.login("pepe", "1234");
        System.out.println(taskController.getAllTaskByUser());


        //taskController.createUser("lolo","1234",1);
        //taskController.deleteUser(3);
        //taskController.userLogged.toString();
        //taskController.createTask("tarea1","Primera tarea", LocalDate.now());
    }
}