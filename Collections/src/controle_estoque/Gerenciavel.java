package controle_estoque;

import java.util.List;

public interface Gerenciavel<T> {
  public void adicionar(T t);
  public void remover(T t);
  public List<T> listar();
}
