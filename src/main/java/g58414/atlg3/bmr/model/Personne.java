package g58414.atlg3.bmr.model;

import g58414.atlg3.bmr.model.util.Observable;
import g58414.atlg3.bmr.model.util.Observer;

import java.util.ArrayList;
import java.util.List;


/**
 * Person with the age , height , weight , sex , and lifestyles, so
 * we can calculate the bmr and the calories.
 */
public class Personne implements Observable {
private List<Observer> observers = new ArrayList<>();
    private int height;
    private int age;
    private int weight;
    private Genre genre;
    private LifeStyle lifeS;
    //private List<Observer> observers = new ArrayList<>();

    //private BmrInput input;

    /**
     * constructor of Personne
     * @param weight
     * @param age
     * @param height
     * @param genre
     * @param lifeS
     */
    public Personne(int weight,int age, int height, Genre genre,LifeStyle lifeS) {
        this.age=age;
        this.height=height;
        this.weight = weight;
        this.genre=genre;
        this.lifeS=lifeS;
    }

    /**
     * initializes the person to null.
     */
    public Personne(){

    }

    /**
     * Getter that calculates the person's bmr
     * @return
     */
    public double getMBR(){

        return genre == Genre.FEMME?
             (9.6 * weight + 1.8 * height - 4.7 * age + 655):

            (13.7 * weight + 5 * height - 6.8 * age + 66);

    }

    /**
     * Getter that calculates the calories of the person
     * @return
     */
    public double getCalories(){
        return getMBR()*lifeS.getCoef();
    }

    public void setValues(int weight, int age, int height, Genre genre, LifeStyle lifeS) {
        this.age=age;
        this.height=height;
        this.weight = weight;
        this.genre=genre;
        this.lifeS=lifeS;
        notifyObserver();
    }


    @Override
    public void register(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void unregister (Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer obs:observers) {
            obs.update();
        }
    }
}
