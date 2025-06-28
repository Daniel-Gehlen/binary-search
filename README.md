# Binary Search em Java

## 📌 Visão Geral
Implementação em Java do algoritmo de Busca Binária com:
- Código principal
- Testes unitários
- Fluxograma em Mermaid

## 📊 Fluxograma do Algoritmo

```mermaid
graph TD
    A[Start] --> B{Is arr null?}
    B -->|Yes| C[Throw Exception]
    B -->|No| D[left=0, right=arr.length-1]
    D --> E{left <= right?}
    E -->|No| F[Return -1]
    E -->|Yes| G[mid = left + (right-left)/2]
    G --> H{arr[mid] == target?}
    H -->|Yes| I[Return mid]
    H -->|No| J{arr[mid] < target?}
    J -->|Yes| K[left = mid + 1]
    J -->|No| L[right = mid - 1]
    K --> E
    L --> E
```

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
