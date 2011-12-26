/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

/**
 *
 * @author alke
 */
public class Game {
int GameId;
String GameName;
String Description;
int NumberOfSteps;
int CurrentStep;
String Borders;
int Rating;
int NumberOfPlayers;
String CreatorName;
int CreaterId;

    public Game() {
    }
int IsFinished;
String StartLocation;

    public Game(int GameId, String GameName, String Description, int NumberOfSteps, int CurrentStep, String Borders, int Rating, int NumberOfPlayers, String CreatorName, int CreaterId, int IsFinished, String StartLocation) {
        this.GameId = GameId;
        this.GameName = GameName;
        this.Description = Description;
        this.NumberOfSteps = NumberOfSteps;
        this.CurrentStep = CurrentStep;
        this.Borders = Borders;
        this.Rating = Rating;
        this.NumberOfPlayers = NumberOfPlayers;
        this.CreatorName = CreatorName;
        this.CreaterId = CreaterId;
        this.IsFinished = IsFinished;
        this.StartLocation = StartLocation;
    }




    public String getBorders() {
        return Borders;
    }

    public void setBorders(String Borders) {
        this.Borders = Borders;
    }

    public int getCreaterId() {
        return CreaterId;
    }

    public void setCreaterId(int CreaterId) {
        this.CreaterId = CreaterId;
    }

    public String getCreatorName() {
        return CreatorName;
    }

    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    public int getCurrentStep() {
        return CurrentStep;
    }

    public void setCurrentStep(int CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getGameId() {
        return GameId;
    }

    public void setGameId(int GameId) {
        this.GameId = GameId;
    }

    public String getGameName() {
        return GameName;
    }

    public void setGameName(String GameName) {
        this.GameName = GameName;
    }

    public int getIsFinished() {
        return IsFinished;
    }

    public void setIsFinished(int IsFinished) {
        this.IsFinished = IsFinished;
    }

    public int getNumberOfPlayers() {
        return NumberOfPlayers;
    }

    public void setNumberOfPlayers(int NumberOfPlayers) {
        this.NumberOfPlayers = NumberOfPlayers;
    }

    public int getNumberOfSteps() {
        return NumberOfSteps;
    }

    public void setNumberOfSteps(int NumberOfSteps) {
        this.NumberOfSteps = NumberOfSteps;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public String getStartLocation() {
        return StartLocation;
    }

    public void setStartLocation(String StartLocation) {
        this.StartLocation = StartLocation;
    }





}
