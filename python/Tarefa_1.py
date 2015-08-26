# Tarefa_1.py
# Lucas Narciso
# 26 de agosto de 2015
# Resolucao do problema de encontrar uma lista de numeros quadrados
# perfeitos menores que um dado inteiro e cuja soma iguala-se ao mesmo.

def quadrados_menores(n):
    """Retorna uma lista com os numeros quadrados menores 
    ou iguais a n."""

    lista = []
    for i in range(1, n + 1):
        quadrado = i ** 2
        if quadrado <= n:
            lista.append(quadrado)
        else:
            return lista
    return lista

def soma_quadrados(n):
    """Retorna a lista final requerida pelo problema."""

    if n == 0:
        return [0]

    menores = quadrados_menores(n)
    if menores[-1] == n:
        return [n]
    else:
        lista_final = []
        lista_final.extend(gerar_solucao(menores, n))
        while menores:
            lista_transitoria = gerar_solucao(menores, n)
            if len(lista_transitoria) < len(lista_final):
                lista_final = lista_transitoria
    return lista_final

def gerar_solucao(menores, n):
    """Auxilio na geracao da solucao. A solucao sera a menor
    lista gerada por essa funcao."""

    ultimo = menores.pop()
    lista_gerada = [ultimo]
    lista_gerada.extend(soma_quadrados(n - ultimo))
    return lista_gerada

if __name__ == "__main__":
    """Testes para as funcoes quadrados_menores e soma_quadrados."""

    mensagem_final = "Se o programa finalizou sem erros, " \
                     "fora executado com sucesso!"

    # Testes da funcao quadrados_menores

    assert [1] == quadrados_menores(1)
    assert [1, 4] == quadrados_menores(4)
    assert [1, 4, 9] == quadrados_menores(9)
    assert [1, 4, 9] == quadrados_menores(11)

    # Testes das funcao soma_quadrados

    assert [0] == soma_quadrados(0)
    assert [1] == soma_quadrados(1)
    assert [4] == soma_quadrados(4)
    assert [9] == soma_quadrados(9)
    assert [1, 1] == soma_quadrados(2)
    assert [1, 1, 1] == soma_quadrados(3)
    assert [4, 1] == soma_quadrados(5)
    assert [9, 1] == soma_quadrados(10)
    assert [9, 1, 1] == soma_quadrados(11)
    assert [4, 4, 4] == soma_quadrados(12)

    print (mensagem_final)
