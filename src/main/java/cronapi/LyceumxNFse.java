package cronapi;

import cronapi.*;
import java.util.concurrent.Callable;

/**
 * Emite NFSe utilizando plugin LyceumX ...
 *
 * @author Maristella Ribas De Sousa
 * @version 1.0
 * @since 2022-05-30
 *
 */

@CronapiMetaData(categoryName = "LyceumX")
public class LyceumxNFse {

@CronapiMetaData(type = "function", name = "ObterToken", description = "ObterToken")

public static Var ObterToken() throws Exception {
 return new Callable<Var>() {

   private Var resp = Var.VAR_NULL;
   public Var call() throws Exception {
     resp = 
    /*# sourceMappingStart=Anb:u5+^,0vLkL9QIqn5 */ 
/*# sourceMappingStart=K:r,J+mI.rm16iVXxo!r */ Var.valueOf(
/*# sourceMappingStart=bAK0,MF@[}}^HZ;D4m!V */ Var.valueOf("Bearer ").toString() +
/*# sourceMappingStart=T,J2,,,:;5c-s!nwFm#$ */ cronapi.json.Operations.getJsonOrMapField(
/*# sourceMappingStart=u;uzET!_waOw6RG6?[v[ */ cronapi.json.Operations.toJson(
/*# sourceMappingStart=kn3GP_yQj8|FM-7pDT.! */ cronapi.util.Operations.getURLFromOthers(
/*# sourceMappingStart=py;G^UdAXdP8.TA-rhXp */ Var.valueOf("POST"),
/*# sourceMappingStart=`*LrmkJRc#p06.Cr[zHB */ Var.valueOf("application/x-www-form-urlencoded"),
/*# sourceMappingStart=j~PZK3+h$=#hNBVd+ykJ */ Var.valueOf("https://api.dev.lyceum.cloud/auth/universidade"), Var.VAR_NULL, Var.VAR_NULL,
/*# sourceMappingStart=,BVf=T5^R_*T@3{(R`,G */ cronapi.map.Operations.createObjectMapWith(Var.valueOf("client_id",
/*# sourceMappingStart=Wg2nXbvbY,AOZD/3fx9M */ Var.valueOf("cronapp-poc1")) , Var.valueOf("grant_type",
/*# sourceMappingStart=tJ=YZdE8Cu-Gd0V27XDg */ Var.valueOf("client_credentials")) , Var.valueOf("client_secret",
/*# sourceMappingStart={0n/sCrG:{nX~rugc{@H */ Var.valueOf("lxPjqCeD5xiBMaSJIZr7BWPiEgWYGEpF"))),
/*# sourceMappingStart=Mn1D:)%;[Hw(IUXZly7# */ Var.valueOf(""),
/*# sourceMappingStart=!J2[heL#iKH,gr=d1E4b */ Var.valueOf("BODY"))),
/*# sourceMappingStart=YdoP@j.:Z+O:6Zf~TRps */ Var.valueOf("access_token")).toString());
   System.out.println(resp.getObjectAsString());
   return resp;
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
@CronapiMetaData(type = "function", name = "CancelarNFSE", description = "CancelarNFSE")
public static Var CancelarNFSE(@ParamMetaData(description = "idInteg") Var idInteg) throws Exception {
 return new Callable<Var>() {

   private Var token = Var.VAR_NULL;
   private Var resp = Var.VAR_NULL;

   public Var call() throws Exception {

    System.out.println(idInteg.getObjectAsString());

    System.out.println(
    Var.valueOf("idInteg").getObjectAsString());

    token =
    Var.valueOf(ObterToken());

    System.out.println(
    Var.valueOf("token").getObjectAsString());

    System.out.println(token.getObjectAsString());

    System.out.println(
    Var.valueOf(
    cronapi.util.Operations.getSystemParameter(
    Var.valueOf("urlNfse")).toString() +
    Var.valueOf("/").toString() +
    idInteg.toString() +
    Var.valueOf("/cancelar").toString()).getObjectAsString());

    resp =
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("POST"),
    Var.valueOf("application/json"),
    Var.valueOf(
    cronapi.util.Operations.getSystemParameter(
    Var.valueOf("urlNfse")).toString() +
    Var.valueOf("/").toString() +
    idInteg.toString() +
    Var.valueOf("/cancelar").toString()), Var.VAR_NULL,
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("Content-Type",
    Var.valueOf("application/json")) , Var.valueOf("X-LYC-ContaId",
    cronapi.util.Operations.getSystemParameter(
    Var.valueOf("contaId"))) , Var.valueOf("Authorization",token)),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("10000")) , Var.valueOf("MotivoCancelamento",
    Var.valueOf("Cancelamento de serviço Cronapp"))),
    Var.valueOf(""),
    Var.valueOf("BODY"));
    return
cronapi.map.Operations.createObjectMapWith(Var.valueOf("msg",
Var.valueOf("NF cancelada com sucesso")));
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
@CronapiMetaData(type = "function", name = "ConsultarNFSE", description = "ConsultarNFSE")
public static Var ConsultarNFSE(@ParamMetaData(description = "idInteg") Var idInteg) throws Exception {
 return new Callable<Var>() {

   private Var token = Var.VAR_NULL;
   private Var resp = Var.VAR_NULL;

   public Var call() throws Exception {

    token =
    Var.valueOf(ObterToken());

    resp =
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("GET"),
    Var.valueOf("application/json"),
    Var.valueOf(
    cronapi.util.Operations.getSystemParameter(
    Var.valueOf("urlNfse")).toString() +
    Var.valueOf("/").toString() +
    idInteg.toString() +
    Var.valueOf("/consultar").toString()), Var.VAR_NULL,
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("Content-Type",
    Var.valueOf("application/json")) , Var.valueOf("X-LYC-ContaId",
    cronapi.util.Operations.getSystemParameter(
    Var.valueOf("contaId"))) , Var.valueOf("Authorization",token)), Var.VAR_NULL,
    Var.valueOf(""),
    Var.valueOf("BODY"));
    return resp; /*
cronapi.map.Operations.createObjectMapWith(Var.valueOf("msg",
Var.valueOf("NF consultada com sucesso"))); */
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
@CronapiMetaData(type = "function", name = "EmitirNFSE", description = "EmitirNFSE")
public static Var EmitirNFSE(@ParamMetaData(description = "valor") Var valor, @ParamMetaData(description = "idInteg") Var idInteg) throws Exception {
 return new Callable<Var>() {

   private Var resp = Var.VAR_NULL;

   public Var call() throws Exception {

    resp =
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("POST"),
    Var.valueOf("application/json"),
    cronapi.util.Operations.getSystemParameter(
    Var.valueOf("urlNfse")), Var.VAR_NULL,
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("Content-Type",
    Var.valueOf("application/json")) , Var.valueOf("X-LYC-ContaId",
    cronapi.util.Operations.getSystemParameter(
    Var.valueOf("contaId"))) , Var.valueOf("Authorization",
    Var.valueOf(ObterToken()))),
    Var.valueOf(dados_NFSE_padrao(idInteg, valor)),
    Var.valueOf(""),
    Var.valueOf("BODY"));
    return
cronapi.map.Operations.createObjectMapWith(Var.valueOf("msg",
Var.valueOf("NF emitida com sucesso")));
   }
 }.call();
}

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
@CronapiMetaData(type = "function", name = "dados_NFSE_padrao", description = "dados_NFSE_padrao")
public static Var dados_NFSE_padrao(@ParamMetaData(description = "idInteg") Var idInteg, @ParamMetaData(description = "valor") Var valor) throws Exception {
 return new Callable<Var>() {

   private Var payload = Var.VAR_NULL;

   public Var call() throws Exception {

    payload =
    cronapi.map.Operations.createObjectMap();

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("naturezaTributacao"),
    Var.valueOf(1));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorInscricaoMunicipal"),
    Var.valueOf("029718"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorSimplesNacional"),
    Var.VAR_TRUE);

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorRegimeTributario"),
    Var.valueOf(1));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorIncentivoFiscal"),
    Var.VAR_TRUE);

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorIncentivadorCultural"),
    Var.VAR_TRUE);

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorRegimeTributarioEspecial"),
    Var.valueOf(1));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorEnderecoLogradouro"),
    Var.valueOf("Rua Central"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorEnderecoNumero"),
    Var.valueOf("111"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorEnderecoCodigoCidade"),
    Var.valueOf("2507507"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorEnderecoDescricaoCidade"),
    Var.valueOf("JOÃO PESSOA"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorEnderecoCep"),
    Var.valueOf("58020750"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorTelefoneNumero"),
    Var.valueOf("8340092700"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorEmail"),
    Var.valueOf("piox@marista.edu.br"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorEnderecoLogradouro"),
    Var.valueOf("RUA ESCRITOR GERALDO DE CARVALHO"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorEnderecoNumero"),
    Var.valueOf("22"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorEnderecoBairro"),
    Var.valueOf("TAMBIA"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorEnderecoBairro"),
    Var.valueOf("TAMBIA"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorEnderecoEstado"),
    Var.valueOf("PB"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorEnderecoCep"),
    Var.valueOf("58020750"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorTelefoneDdd"),
    Var.valueOf("83"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorTelefoneNumero"),
    Var.valueOf("32461154"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorEmail"),
    Var.valueOf("mariedson76@hotmail.com"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoCodigoTributacao"),
    Var.valueOf("801"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoCnae"),
    Var.valueOf("8513900"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoCodigoCidadeIncidencia"),
    Var.valueOf("2507507"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoDescricaoCidadeIncidencia"),
    Var.valueOf("JOÃO PESSOA"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoUnidade"),
    Var.valueOf("Mensalidade"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoQuantidade"),
    Var.valueOf(1));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoIssTipoTributacao"),
    Var.valueOf(5));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoIssExigibilidade"),
    Var.valueOf(1));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoIssRetido"),
    Var.VAR_TRUE);

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoIssAliquota"),
    Var.valueOf(5));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoIssValor"),
    Var.valueOf(45.67));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoIssValorRetido"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoValorBaseCalculo"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoValorDeducoes"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoValorDescontoCondicionado"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoValorDescontoIncondicionado"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoValorUnitario"),
    Var.valueOf(999.85));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoRetencaoPisAliquota"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoRetencaoPisValor"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoRetencaoCofinsAliquota"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoRetencaoCofinsValor"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoRetencaoCsllAliquota"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoRetencaoCsllValor"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoRetencaoInssAliquota"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoRetencaoInssValor"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoRetencaoIrrfAliquota"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoRetencaoIrrfValor"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoRetencaoOutrasRetencoes"),
    Var.valueOf(0));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("idIntegracao"), idInteg);

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("enviarEmail"),
    Var.VAR_TRUE);

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("dataEmissao"),
    cronapi.dateTime.Operations.formatDateTime2(
    cronapi.dateTime.Operations.getNow(),
    Var.valueOf("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"),
    Var.valueOf("true")));

    System.out.println(
    Var.valueOf("datas").getObjectAsString());

    System.out.println(
    cronapi.dateTime.Operations.getNow().getObjectAsString());

    System.out.println(
    cronapi.dateTime.Operations.formatDateTime2(
    cronapi.dateTime.Operations.getNow(),
    Var.valueOf("yyyy-MM-dd"),
    Var.valueOf("true")).getObjectAsString());

    System.out.println(
    cronapi.dateTime.Operations.formatDateTime2(
    cronapi.dateTime.Operations.getNow(),
    Var.valueOf("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"),
    Var.valueOf("true")).getObjectAsString());

    System.out.println(
    cronapi.dateTime.Operations.formatDateTime2(
    cronapi.dateTime.Operations.getNow(),
    Var.valueOf("yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"),
    Var.VAR_NULL,
    Var.valueOf("true")).getObjectAsString());

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("competencia"),
    cronapi.dateTime.Operations.formatDateTime2(
    cronapi.dateTime.Operations.getNow(),
    Var.valueOf("yyyy-MM-dd"),
    Var.valueOf("true")));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("dataVencimento"),
    Var.valueOf("2021-09-13T11:11:09.059Z"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("serie"),
    Var.valueOf("E"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("descricao"),
    Var.valueOf("Emissão de NF usando o Cronapp"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("cidadePrestacaoCodigo"),
    Var.valueOf("2507507"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("cidadePrestacaoDescricao"),
    Var.valueOf("JOÃO PESSOA"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorCpfCnpj"),
    Var.valueOf("44040049000143"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("prestadorRazaoSocial"),
    Var.valueOf("COLEGIO MARISTA PIO X"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorCpfCnpj"),
    Var.valueOf("89312660497"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorRazaoSocial"),
    Var.valueOf("MARIEDSON FONTES HENRIQUE"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorEnderecoCodigoCidade"),
    Var.valueOf("2507507"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorEnderecoDescricaoCidade"),
    Var.valueOf("JOÃO PESSOA"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("tomadorOrgaoPublico"),
    Var.VAR_FALSE);

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoCodigo"),
    Var.valueOf("8.01"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoDiscriminacao"),
    Var.valueOf("Emissão de NF usando o Cronapp"));

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoValorServico"), valor);

    cronapi.map.Operations.setMapFieldByKey(payload,
    Var.valueOf("servicoValorLiquido"), valor);

    System.out.println(payload.getObjectAsString());
    return payload;
   }
 }.call();
}

}