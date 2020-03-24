package br.com.digitalhouse;

public class Principal {

    public static void main (String[] args){
       DigitalHouseManager digitalHouseManager= new DigitalHouseManager();
      digitalHouseManager.registrarProfessorTitular("Ivan","Crizza", 2541, "Android");
      digitalHouseManager.registrarProfessorTitular("Yuri","Kayel", 2542, "Android");
      digitalHouseManager.registrarProfessorAdjunto("Victor","Amaral",2554,45);
      digitalHouseManager.registrarProfessorAdjunto("Ricardo","Novellis",2574,49);

      digitalHouseManager.registrarUmCurso("Android", 20002, 2);
      digitalHouseManager.registrarUmCurso("FullStack", 20001, 3);

      digitalHouseManager.alocarProfessores(874, 2541,2554);
      digitalHouseManager.alocarProfessores(879, 2542, 2574);

      digitalHouseManager.matricularAluno("Thais", "Amaral",458);
      digitalHouseManager.matricularAluno("José", "Rodrigues",459);
      digitalHouseManager.matricularAluno("Cleyson", "Roberto",460);
      digitalHouseManager.matricularAluno("Verusca", "Damasco",461);
      digitalHouseManager.matricularAluno("Fernanda", "Novellis",454);
      digitalHouseManager.matricularAluno(458,20002);
      digitalHouseManager.matricularAluno(454,20003);

      digitalHouseManager.matricularAluno(460, 20002);
      digitalHouseManager.matricularAluno(461, 20002);
      digitalHouseManager.matricularAluno(454, 20002);

      digitalHouseManager.consultarCursoAluno(460);







    }

}
