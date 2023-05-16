package Questão04;
/*
 * MagicCard, contém as seguintes informações:
 * a. name: o nome da mágica ou habilidade;
 * b. type: o tipo da mágica ou habilidade (terreno, criatura, encantamento,
 * artefato, instantânea, feitiço, planeswalker, habilidade ativada, habilidade
 * disparada);
 * c. cost: o custo para jogar a mágica ou habilidade (em mana);
 * d. effect: o efeito da mágica ou habilidade.
 */
public class MagicCard {
    private String name;
    private String type;
    private int cost;
    private String effect;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getEffect() {
        return effect;
    }
    public void setEffect(String effect) {
        this.effect = effect;
    }

    public MagicCard(String name, String type, int cost, String effect){
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.effect = effect;
    }
    @Override
    public  String toString(){
        return "name: " + name + "\ntype: " + type + "\ncost: " + cost + "\neffect: " + effect;
    }
}
