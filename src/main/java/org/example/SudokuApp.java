package org.example;

import java.io.IOException;

public class SudokuApp {

    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception {
        uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException exception) {
            exception.printStackTrace();
            throw exception;
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}