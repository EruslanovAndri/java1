package Unit;

import java.util.ArrayList;

public class Vector2D {

   protected int posX;
   protected int posY;

    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Double getDistance(Vector2D oponent){
        return Math.sqrt(Math.pow(posX - oponent.posX,2) + Math.pow(posY - oponent.posY,2));

    }

    public boolean getLeft(Vector2D oponent){
        return oponent.posX < posX;
    }

    public boolean getDown(Vector2D oponent){
        return oponent.posY < posY;
    }

    protected boolean getEmpty(ArrayList<Hero> teams, int posX, int posY){
        boolean bool = true;
        for (Hero hero: teams) {
            if(hero.coords.posX == posX && hero.coords.posY == posY){
                bool = false;
                break;
            }
        }
        return bool;
    }
}
