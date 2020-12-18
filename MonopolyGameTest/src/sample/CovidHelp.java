package sample;

public class CovidHelp extends CardDecorator{

    public CovidHelp(){

    }
    Card card;
    public CovidHelp(Card card){
        this.card = card;
    }

    @Override
    public String getContent() {
        return card.getContent() + "Go to Earth and help to find COVID19 vaccine";
    }

    @Override
    public void duty() {
        takenBy.setPosition(3);
    }
}
