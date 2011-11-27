/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.util.ArrayList;

/**
 *
 * @author acar
 */
public class GameAttributes {
    String gameName;
    String description;
    String startingPoint;
    String borders;
    ArrayList<String> tags = new ArrayList<String>();
    int numberOfSteps;
    int currentDesigningStep;
    ArrayList<GameSteps> gameSteps = new ArrayList<GameSteps>();

    public static class GameSteps {
        String qrCodeOfStep;
        String location;
        String password;

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getQrCodeOfStep() {
            return qrCodeOfStep;
        }

        public void setQrCodeOfStep(String qrCodeOfStep) {
            this.qrCodeOfStep = qrCodeOfStep;
        }
    }

    public GameAttributes() {
        currentDesigningStep = 1;
    }

    public String getBorders() {
        return borders;
    }

    public void setBorders(String borders) {
        this.borders = borders;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    public String getTag(int i) throws IndexOutOfBoundsException{
        return tags.get(i);
    }

    public int getCurrentDesigningStep() {
        return currentDesigningStep;
    }

    public void setCurrentDesigningStep(int currentDesigningStep) {
        this.currentDesigningStep = currentDesigningStep;
    }

    public void addGameStep(GameSteps step) {
        gameSteps.add(step);
    }

    public GameSteps getGameStep(int step) {
        return gameSteps.get(step);
    }
}
