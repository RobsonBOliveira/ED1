package Lista1.Q31;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Mamaco", 10);
        Pessoa pessoa = new Pessoa("Jonas", 18, 'M');
        Veiculo veiculo = new Veiculo("Gol", 1999);
        Animal animal1 = new Animal("Cobra", 1);
        Pessoa pessoa1 = new Pessoa("Jonas1", 18,'M');
        Veiculo veiculo1 = new Veiculo("Gol1", 2000);

        CRUD<Object> crud = new CRUD<>();

        crud.create(animal);
        crud.create(veiculo);
        crud.create(pessoa);
        crud.listarObjetos();
        System.out.println(" ");
        crud.update(animal, pessoa1);
        crud.listarObjetos();

        System.out.println(" ");
    }
}
