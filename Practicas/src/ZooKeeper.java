
    class Mammal {
        String name = "furry ";
        String makeNoise() { return "generic noise"; }
    }
    class Zebra extends Mammal {
        String name = "stripes ";

        @Override
        String makeNoise() { return "bray"; }
    }
    public class ZooKeeper {
        public static void main(String[] args) { new ZooKeeper().go(); }
            void go() {
                Mammal m = new Zebra();
                //Mammal m = new Mammal();
                Zebra z = (Zebra) new Mammal();
                //Zebra z = new Zebra();
                System.out.println(m.name + m.makeNoise());
                System.out.println(z.name + z.makeNoise());
            }
    }
