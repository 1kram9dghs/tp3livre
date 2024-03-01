package test;

import java.util.List;

import metier.MetierImpl;
import metier.Livre;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Livre> liv = metier.getLivresParMotCle("pc");
for (Livre l : liv)
System.out.println(l.getNomLivres());
}
}