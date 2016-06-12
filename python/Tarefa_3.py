# Tarefa_3.py
# Lucas Narciso
# 27 de agosto de 2015
# Define uma funcao que recebe inteiros e retorna numerais
# e uma outra funcao que recebe numerais e retorna inteiros.

lista_de_numerais = "zero um dois tres quatro cinco seis sete oito nove".split(" ")

def retorna_numerais(numero_inteiro):
    """ A partir de um inteiro dado como argumento, essa
    funcao retornara o numeral (string) respectivo a ele, i.e.,
    a palavra em portuguese que representa aquele inteiro.
    No caso de mais de um numero, retornara todos separados
    por virgula e espaco.
    Respeita a condicao do enunciado: usa lista.
    e.g. Input: 1; Output: 'um'
         Input: 123; Output: 'um, dois, tres'"""

    global lista_de_numerais

    inteiro_string = str(numero_inteiro)
    numerais = []

    for numero in inteiro_string:
        numerais.append(lista_de_numerais[int(numero)])

    return ", ".join(numerais)


def retorna_numeros(numerais):
    """ A partir de um ou mais numerais (uma string) dados como
    argumento, essa funcao retornara o(s) inteiro(s) respectivo(s)
    a eles. No caso de mais de um numero, retornara todos colados
    como um unico inteiro.
    Respeita a condicao do enunciado: usa dicionario.
    e.g. Input: 'um'; Output: 1
         Input: 'quatro, dois'; Output: 42"""
    
    global lista_de_numerais

    numeros_numerais = {lista_de_numerais[numero] : numero for numero in range(10)}
    numeros = []

    for numeral in numerais.split(", "):
        numeros.append(str(numeros_numerais[numeral]))

    return int("".join(numeros))


if __name__ == '__main__':
    """Testes das funcoes."""

    mensagem_final = "Se erros nao foram retornados, as funcoes " \
                     "funcionam corretamente."

    # Testes da funcao retorna_numerais

    try:
        assert "um" == retorna_numerais(1)
        assert "quatro, dois" == retorna_numerais(42)
        assert "oito, oito, nove" == retorna_numerais(889)
        assert "um, dois, um" == retorna_numerais(121)
    except:
        print ("Erro na funcao retorna_numerais.")
        raise

    # Testes da funcao retorna_numeros

    try:
        assert 1 == retorna_numeros("um")
        assert 12 == retorna_numeros("um, dois")
        assert 42 == retorna_numeros("quatro, dois")
        assert 1994 == retorna_numeros("um, nove, nove, quatro")
    except:
        print ("Erro na funcao retorna_numeros.")
        raise

    print (mensagem_final)
