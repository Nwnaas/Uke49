package com.example.uke49;
import java.util.ArrayList;
import java.util.List;
public class OppgaveController {
    private static List<Oppgave> oppgaver = new ArrayList<>();

    public static void addOppgave(String title, String description) {
        Oppgave oppgave = new Oppgave(title, description);
        oppgaver.add(oppgave);
    }

    public static List<Oppgave> getOppgaver() {
        return oppgaver;
    }
}
