package com.codecool.MKM.queststore.Controller;

public class MainController {

    private MentorController mentorController;
    private StudentController studentController;
    private CreepyController creepyController;

    public MainController() {
        mentorController = new BasicMentorController();
        studentController = new BasicStudentController();
        creepyController = new BasicCreepyController();
        run();

    }

    public void run() {
        mentorController.addQuest();
    }


    /// add new mentor and add mentor to group are done

}
