def quadrados_menores(n):
    lista = []
    for i in range(1, n + 1):
        quadrado = i ** 2
        if quadrado <= n:
            lista.append(quadrado)
        else:
            return lista
    return lista


assert [1] == quadrados_menores(1)
assert [1, 4] == quadrados_menores(4)
assert [1, 4, 9] == quadrados_menores(9)
assert [1, 4, 9] == quadrados_menores(11)


def soma_quadrados(n):
    if n == 0:
        return [0]

    menores = quadrados_menores(n)
    if menores[-1] == n:
        return [n]
    else:
        ultimo = menores.pop()
        lista_final = [ultimo]
        lista_final.extend(soma_quadrados(n - ultimo))
        while menores:
            lista_transitoria = gerar_solucao(menores, n)
            if len(lista_transitoria) < len(lista_final):
                lista_final = lista_transitoria
    return lista_final


def gerar_solucao(menores, n):
    ultimo = menores.pop()
    lista_gerada = [ultimo]
    lista_gerada.extend(soma_quadrados(n - ultimo))
    return lista_gerada


assert [0] == soma_quadrados(0)
assert [1] == soma_quadrados(1)
assert [4] == soma_quadrados(4)
assert [9] == soma_quadrados(9)
assert [1, 1] == soma_quadrados(2)
assert [1, 1, 1] == soma_quadrados(3)
assert [4, 1] == soma_quadrados(5)
assert [9, 1] == soma_quadrados(10)
assert [4, 4, 4] == soma_quadrados(12)
