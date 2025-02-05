package Lista1.Q31;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Mamaco", 10);
        Pessoa pessoa = new Pessoa("Jonas", 18);
        Veiculo veiculo = new Veiculo("Gol", 1999);
        Animal animal1 = new Animal("Mamaco1", 10);
        Pessoa pessoa1 = new Pessoa("Jonas1", 18);
        Veiculo veiculo1 = new Veiculo("Gol1", 2000);

        CRUD<Object> crud = new CRUD<>();

        crud.create(animal);
        crud.create(pessoa);
        crud.create(veiculo);
        crud.create(animal1);
        crud.create(pessoa1);
        crud.create(veiculo1);
        crud.listarObjetos();
    }
}
