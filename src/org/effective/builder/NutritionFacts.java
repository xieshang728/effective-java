package org.effective.builder;

/**
 * @author xieshang728
 */

//构建器模式，lombok的@builder的注解
public class NutritionFacts {
    private final int servingSize ;
    private final int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    public NutritionFacts(Builder builder){
        this.servings = builder.servings;
        this.servingSize = builder.servingSize;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static class Builder{
        private final int servingSize ;
        private final int servings;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize,int servings){
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new Builder(210,200)
                .calories(20)
                .carbohydrate(20)
                .fat(20)
                .sodium(20)
                .build();
    }
}
