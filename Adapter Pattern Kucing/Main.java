class Main {
    public static void main (String[] args) {
        Kucing kucing = new Meow();
        System.out.println("Suara asli kucing ... ");
        kucing.meow();

        Bebek meowAdapter = new MeowAdapter(kucing);
        System.out.println("Suara bebek kwekkk kweeekk!! ");
        meowAdapter.kwek();
    }
}
