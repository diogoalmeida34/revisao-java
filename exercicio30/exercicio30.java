/*--------------------------
*****  EXERCICIO 30  ******
----------------------------
Agrupando Alunos por Nota: Tendo uma List<Aluno> (onde Aluno tem nome e nota), crie um Map<String, List<Aluno>> que agrupe os alunos por faixa de nota: "Aprovados" (nota >= 7), "Recuperação" (nota >= 5 e < 7) e "Reprovados" (nota < 5).*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exercicio30 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Ana", 8.0));
        alunos.add(new Aluno("Bruno", 6.0));
        alunos.add(new Aluno("Carlos", 4.5));
        alunos.add(new Aluno("Daniel", 7.5));
        Map<String,List<Aluno>> grupos = new HashMap<>();
        grupos.put("Aprovados", new ArrayList<>());
        groupsAdd(alunos, grupos);
        for (Map.Entry<String,List<Aluno>> e : grupos.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
    static void groupsAdd(List<Aluno> alunos, Map<String,List<Aluno>> map) {
        map.computeIfAbsent("Recuperação", k -> new ArrayList<>());
        map.computeIfAbsent("Reprovados", k -> new ArrayList<>());
        for (Aluno a : alunos) {
            if (a.getNota() >= 7) map.get("Aprovados").add(a);
            else if (a.getNota() >= 5) map.get("Recuperação").add(a);
            else map.get("Reprovados").add(a);
        }
    }
}

class Aluno {
    private String nome; private double nota;
    public Aluno(String n, double no) { nome = n; nota = no; }
    public double getNota() { return nota; }
    @Override public String toString() { return nome + "(" + nota + ")"; }
}
