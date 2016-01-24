/**
 * Siin failis kasutatakse objekti Foor, aga Foor klassi ei eksisteeri. Sinu ülesanne
 * on see luua. Pane tähele, et mitte ükski objekti muutuja ei tohi olla
 * kättesaadav objektist väljaspoolt.
 *
 * Käesolevat klassi ei tohi muuta! Arvad, et ei jää vahele? :)
 */
public class Objektorienteeritus {

    public static void main(String[] args) {

        String fooriNimetus = "Sõle-Paldiski SR3A";
        Foor foor = new Foor(fooriNimetus);

        foor.syytaTuli("punane");
        foor.syytaTuli("kollane");
        foor.syytaTuli("roheline");
        foor.kustutaTuli("punane");
        foor.kustutaTuli("kollane");

        System.out.println("Fooril peaks põlema ainult punane, tegelt põleb: " + foor.misTuledPolevad());
        System.out.println("Foori nimetus on " + foor.votaNimetus());

        foor.hakkeridSaidKontrolli(); // Paanika!

        System.out.println("Fooris põlevad tuled: " + foor.misTuledPolevad());
        System.out.println("Foori nimetus on: " + foor.votaNimetus());
    }
    public static class Foor {

        public Foor (String fooriNimi) {
            System.out.println(fooriNimi);
        }

        public void syytaTuli(String varv) {
            System.out.println(varv);
        }

        public void kustutaTuli(String varv) {
            System.out.println(varv);
        }

        public String misTuledPolevad() {
            System.out.println();
            return "roheline";
        }

        public String votaNimetus() {
            return null;
        }

        public void hakkeridSaidKontrolli() {
            System.out.println("Paanika!");
        }
    }
}

