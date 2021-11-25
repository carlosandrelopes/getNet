#Author: carlosandre.lopes@hotmail.com


@execucao
Feature: Buscar usuario unico 
  Como usuario quero validar a busca do usuario via api

   
  Background:  Acessar api
  Given que acesse api get para consultar unico usuario
   
  Scenario: Validar status code
  
  Then valido o status code retorno
  
  Scenario: Validar o primeiro nome do body response
  
  Then valido o nome "Janet"
   
   