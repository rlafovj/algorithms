package kaupOOP;

public class KaupServiceImpl implements KaupService{
    public double createHeight(){
        return (150 + Math.random() * 50);
    }
    public double createWeight(){
        return (30 + Math.random() * 70);
    }
    @Override
    public double createBmi() {
        return 0.0;
    }

    @Override
    public String createBodyMass() {
        return "";
    }
}
