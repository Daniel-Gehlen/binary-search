# Binary Search em Java

## 📌 Visão Geral
Implementação em Java do algoritmo de Busca Binária com:
- Código principal
- Testes unitários
- Fluxograma em Mermaid

## 📦 Estrutura do Projeto

```
binary-search/
└── BinarySearch.java
└── BinarySearchTest.java
└── pom.xml
```

## 🛠️ Como Usar

1. **Compilar e executar testes**:
```bash
mvn test
```

2. **Implementação principal**:
```java
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        if (arr == null) {
            throw new IllegalArgumentException("Array não pode ser nulo");
        }
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}
```

## 🧪 Testes

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {
    // Testes aqui...
}
```

## 🔍 Explicação do Fluxograma

1. **Inicialização**:
   - Verifica se o array é nulo
   - Define os limites inicial (left) e final (right)

2. **Loop Principal**:
   - Calcula o ponto médio (mid)
   - Compara o elemento no índice mid com o alvo
   - Ajusta os limites de busca conforme a comparação

3. **Resultados**:
   - Retorna o índice se encontrado
   - Retorna -1 se não encontrado
   - Lança exceção para entrada inválida

## ✅ Como Renderizar o Fluxograma

1. Em plataformas que suportam Mermaid (como GitHub):
   - O diagrama será renderizado automaticamente

2. Localmente:
   - Use editores como Mermaid Live Editor
   - Ou instale a extensão Mermaid para VS Code
  
## 📊 Fluxograma do Algoritmo
```mermaid
graph TD

subgraph BinarySearchProcess
    A[Initialize pointers] --> B{Array null?}
    B -->|Yes| C[Throw error]
    B -->|No| D[Calculate mid]
    D --> E{arr[mid] == target?}
    E -->|Yes| F[Return index]
    E -->|No| G{arr[mid] < target?}
    G -->|Yes| H[Adjust left]
    G -->|No| I[Adjust right]
    H --> D
    I --> D
end

subgraph Example
    J[Input: [2,4,6,8,10]]
    K[Target: 8]
    L[Output: Index 3]
end

J --> BinarySearchProcess
K --> BinarySearchProcess
BinarySearchProcess --> L
```
