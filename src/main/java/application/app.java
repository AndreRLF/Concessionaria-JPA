package application;

import dao.ConcessionariaDao;
import domain.Concessionaria;
import domain.Endereco;
import domain.Veiculo;
import enums.Acessorio;

import javax.persistence.Query;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        ConcessionariaDao concessionariaDao = new ConcessionariaDao();

        /* Método 1
        Veiculo v1 = new Veiculo().builder()
                .marca("Fiat")
                .modelo("Uno")
                .ano_fabricacao(LocalDate.of(2018, Month.SEPTEMBER, 12))
                .acessorios(Arrays.asList(Acessorio.AR_CONDICIONADO)).build();

        Veiculo v2 = new Veiculo().builder()
                .marca("Ford")
                .modelo("K")
                .ano_fabricacao(LocalDate.of(2020, Month.AUGUST, 3))
                .acessorios(Arrays.asList(Acessorio.GPS,Acessorio.AR_CONDICIONADO)).build();

        Veiculo v3 = new Veiculo().builder()
                .marca("Hyundai")
                .modelo("Creta")
                .ano_fabricacao(LocalDate.of(2021, Month.JUNE, 30))
                .acessorios(Arrays.asList(Acessorio.GPS,Acessorio.AR_CONDICIONADO, Acessorio.VIDRO_ELETRICO)).build();

        Concessionaria concessionaria = new Concessionaria().builder()
                .endereco(new Endereco().builder()
                        .rua("Anísio Rolim")
                        .numero("23")
                        .bairro("Centro")
                        .cidade("Cajazeiras")
                        .uf("PB")
                        .build())
                .nome("Concessionária São João")
                .telefone("123-456")
                .veiculos(Arrays.asList(v1,v2,v3)).build();

        v1.setConcessionaria(concessionaria);
        v2.setConcessionaria(concessionaria);
        v3.setConcessionaria(concessionaria);
         */

        /* Método 2
        Concessionaria concessionaria = new Concessionaria().builder()
                .endereco(new Endereco().builder()
                        .rua("Anísio Rolim")
                        .numero("23")
                        .bairro("Centro")
                        .cidade("Cajazeiras")
                        .uf("PB")
                        .build())
                .nome("Concessionária São João")
                .telefone("123-456").build();

        concessionaria.setVeiculos(Arrays.asList(
                new Veiculo().builder()
                        .marca("Fiat")
                        .modelo("Uno")
                        .ano_fabricacao(LocalDate.of(2018, Month.SEPTEMBER, 12))
                        .acessorios(Arrays.asList(Acessorio.AR_CONDICIONADO)).build(),

                new Veiculo().builder()
                        .marca("Ford")
                        .modelo("K")
                        .ano_fabricacao(LocalDate.of(2020, Month.AUGUST, 3))
                        .acessorios(Arrays.asList(Acessorio.GPS,Acessorio.AR_CONDICIONADO)).build(),

                new Veiculo().builder()
                        .marca("Hyundai")
                        .modelo("Creta")
                        .ano_fabricacao(LocalDate.of(2021, Month.JUNE, 30))
                        .acessorios(Arrays.asList(Acessorio.GPS,Acessorio.AR_CONDICIONADO, Acessorio.VIDRO_ELETRICO)).build()
        ));
         */

        Query query = concessionariaDao.getEm().createNamedQuery("findByName");
        query.setParameter("nome", "Concessionária São João");

        System.out.println((Concessionaria)query.getSingleResult());

        //concessionariaDao.saveOrUpdate(concessionaria);
    }
}
