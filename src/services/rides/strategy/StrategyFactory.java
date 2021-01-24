package services.rides.strategy;

public class StrategyFactory {
    public RideStrategy getStrategy(String strategy){
        if (strategy.equals("Prefered Vehicle")){
            return new PreferredVehicleStrategy();
        }
        else if(strategy.equals("Most Vacant")){
            return new MostVaccantStrategy();
        }
        return null;
    }
}
