package App.Gerenciamento;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
public class GerenciamentoClass implements GerenciamentoInterface {
    @Override
    public void adicionarGasto(double addGasto) {
        if(Files.exists(Path.of("gastos.dat"))) {
            try {
                List<String> linha = new ArrayList<>();
                String str = Double.toString(addGasto);
                linha.add(str);
                Files.write(Paths.get("gastos.dat"), linha, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            } catch (Exception e) { e.printStackTrace(); }
        }
        else {
            try{
                Files.createFile(Path.of("gastos.dat"));
                try {
                    List<String> linha = new ArrayList<>();
                    String str = Double.toString(addGasto);
                    linha.add(str);
                    Files.write(Paths.get("gastos.dat"), linha, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
                } catch (Exception e) { e.printStackTrace(); }
            }catch (Exception e){ e.printStackTrace(); }
        }
    }
    @Override
    public void adicionarGanho(double addGanho) {

        if(Files.exists(Path.of("ganhos.dat"))) {

            try {
                List<String> linha = new ArrayList<>();
                String str = Double.toString(addGanho);
                linha.add(str);
                Files.write(Paths.get("ganhos.dat"), linha, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            } catch (Exception e) { e.printStackTrace(); }
        }
        else {
            try{
                Files.createFile(Path.of("ganhos.dat"));

                try {
                    List<String> linha = new ArrayList<>();
                    String str = Double.toString(addGanho);
                    linha.add(str);
                    Files.write(Paths.get("ganhos.dat")
                            , linha
                            , StandardCharsets.UTF_8
                            , StandardOpenOption.APPEND);
                } catch (Exception e) { e.printStackTrace(); }
            }catch (Exception e){ e.printStackTrace(); }
        }
    }

    @Override
    public void somar() {

        double somaTotal;
        double somaGanhos = 0;
        double somaGastos = 0;

        try{
            List<String> linha = Files.readAllLines(Path.of("ganhos.dat"));
            for(String s : linha){
                double numero = 0;
                boolean verifique1 = false;

                if (verifique1 != linha.isEmpty()){
                    break;
                }
                else{
                    numero = numero + Double.parseDouble(s);
                    somaGanhos = somaGanhos + numero;
                }
            }
        }catch(Exception e){ e.printStackTrace(); }

        try{
            List<String> linha = Files.readAllLines(Path.of("gastos.dat"));
            for(String s : linha){
                double numero = 0;
                boolean verifique2 = false;

                if (verifique2 != linha.isEmpty()){
                    break;
                }
                else{
                    numero = numero + Double.parseDouble(s);
                    somaGastos = somaGastos + numero;
                }
            }

        }catch(Exception e){ e.printStackTrace(); }

        somaTotal = somaGanhos - somaGastos;
        System.out.println(" O Saldo entre ganhos e gastos é de: " + somaTotal);
    }

}
