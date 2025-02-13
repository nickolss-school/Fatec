public class MinhaPrimeiraED {
    public Object[] objetos = new Object[10];

    public int totalDeObjetos = 0;

    public void adiciona(int posicao, Object objeto) {
        if (posicaoValida(posicao) && totalDeObjetos < objetos.length) {
            for (int i = totalDeObjetos; i > posicao; i--) {
                objetos[i] = objetos[i - 1];
            }
            objetos[posicao] = objeto;
            totalDeObjetos++;
        } else if (totalDeObjetos == objetos.length) {
            Object[] novoVetor = new Object[objetos.length * 2];
            for (int i = 0; i < objetos.length; i++) {
                novoVetor[i] = objetos[i];
            }
            objetos = novoVetor;

            for (int i = totalDeObjetos; i > posicao; i--) {
                objetos[i] = objetos[i - 1];
            }
            objetos[posicao] = objeto;
            totalDeObjetos++;
        }
    }

    public void adiciona(Object objeto) {
        if (totalDeObjetos == objetos.length) {
            Object[] novoVetor = new Object[objetos.length * 2];
            for (int i = 0; i < objetos.length; i++) {
                novoVetor[i] = objetos[i];
            }
            objetos = novoVetor;
        }

        objetos[totalDeObjetos] = objeto;
        totalDeObjetos++;
    }


    public boolean posicaoOcupada(int posicao) {
        return objetos[posicao] != null;
    }

    public boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < objetos.length;
    }

    public void remove(int posicao) {
        if (posicaoValida(posicao) && posicaoOcupada(posicao)) {
            for (int i = posicao; i < totalDeObjetos - 1; i++) {
                objetos[i] = objetos[i + 1];
            }
            objetos[totalDeObjetos - 1] = null;
            totalDeObjetos--;
        }
    }

    public boolean contem(Object objeto) {
        for (int i = 0; i < totalDeObjetos; i++) {
            if (objetos[i].equals(objeto)) {
                return true;
            }
        }
        return false;
    }

    public Object getObjeto(int posicao) {
        if (posicaoValida(posicao) && posicaoOcupada(posicao)) {
            return objetos[posicao];
        }
        return null;
    }

    public int tamanho() {
        return totalDeObjetos;
    }

    public boolean cheio() {
        return totalDeObjetos == objetos.length;
    }

    public boolean vazio() {
        return totalDeObjetos == 0;
    }
}
