package Questão04;

public class Main {
    public static void main(String[] args) {
        PilhaMH pilhaMh = new PilhaMH();
        MagicCard errijota = new MagicCard("Errijota", "Programador", 5, "Dano 20% da vida");
        MagicCard gato = new MagicCard("Gato", "felino", 1, "recupera 10 de vida ao fazer carinho");
        MagicCard mae = new MagicCard("Mãe", "Unica", 2, "vai doer mais em mim do que em vc, dano 50% da vida");
        MagicCard dimmy = new MagicCard("Dimmy", "Programador Mestre", 5, "não fez atividade, dano 100% da vida total");
        pilhaMh.push(dimmy);
        pilhaMh.push(errijota);
        pilhaMh.push(mae);
        pilhaMh.push(gato);
        pilhaMh.lista.print();
        pilhaMh.top();
        pilhaMh.remover("Errijota");
        pilhaMh.pop();
        pilhaMh.lista.print();
        pilhaMh.clear();
        pilhaMh.lista.print();

    }
}
