public class Imc {
    public static double calcularImc(double peso, double altura){
        double imc =0.0;

        imc = peso / (altura* altura);

        return imc;
    }

    public static String classificarImc(double imc){

        if ((imc > 0)&&(imc < 18.5)){
            return " Baixo Peso";
        } else if ((imc >= 18.5)&&(imc < 25.0)) {
            return " Peso Normal";
        } else if ((imc >= 25.0)&&(imc < 30.0)) {
            return " Sobre Peso";
        } else if ((imc >= 30.0)&&(imc < 35.0)) {
            return " Obesidade Grau 1";
        }else if ((imc >= 35.0)&&(imc < 40.0)){
            return "Obesidade Grau 2";
        } else if (imc >= 40.0) {
            return "Obesidade Grau 3";
        }else{
            return " Não foi possivel classificar !!";
        }


    }
}
