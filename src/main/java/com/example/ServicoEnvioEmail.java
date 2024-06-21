package com.example;

import java.text.Format;

public class ServicoEnvioEmail {

  private PlataformaDeEnvio plataforma;

  void enviaEmail(String enderecoEmail, String mensagem) {

    Email email = null;

    if (formatoHtml) {
      email = new Email(enderecoEmail, mensagem);
    } else {
      email = new Email(enderecoEmail, mensagem);
    }

    plataforma.enviaEmail(email);
  }
}
