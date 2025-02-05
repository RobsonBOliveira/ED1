package Lista1.Q312;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Mamaco", 10);
        Pessoa pessoa = new Pessoa("Jonas", 18);
        Veiculo veiculo = new Veiculo("Gol Bolinha", 1999);
        Animal animal1 = new Animal("Mamaco1", 10);
        Pessoa pessoa1 = new Pessoa("Jonas1", 18);
        Veiculo veiculo1 = new Veiculo("Gol Bolinha", 1999);

        CRUD<Object> crud = new CRUD<>();

        crud.create(veiculo);
        crud.listarObjetos();
        crud.update(veiculo, pessoa);

        crud.listarObjetos();
        System.out.println(crud.read(0) == crud.read(1));
    }
}
