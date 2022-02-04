Feature: Desafio

  @teste
  Scenario: Teste Automatizar o formulário presente ao acessar o menu de navegação “Register”.
    Given que esteja na pagina do formulario: "http://demo.automationtesting.in/Register.html"
    When eu preencher o formulario <firstName> <lastName> <address> <emailAddress> <phone> <password> <confirmPassword>
    Then sitema devera permitir o preenchimento do formulario com sucesso

    Examples: 
      | firstName | lastName |              address            |      emailAddress   |     phone       | password     | confirmPassword |
      | "Everton" | "Sousa"  | "visconde de maua sol nascente" | "everton@teste.com" | "1199895656"    | "asssaasasa" |   "asssaasasa"  |

      
       @teste
  Scenario: Teste No menu de navegação “Switch > Frames” você deve escrever dentro de um frame com sua automação.
    Given que esteja na pagina de frames: "http://demo.automationtesting.in/Frames.html"
    When eu preencher o campo Frames <frame>
    Then sitema devera permitir o preenchimento com sucesso
    Examples: 
      |     frame      |
      | "Parabens teste frame realizando com sucesso"  |
      
           
      @teste
  Scenario: Teste No menu de navegação “Widgets > Datapicker” você deve inserir sua data de nascimento nos dois campos.
    Given que esteja na pagina da Data: "http://demo.automationtesting.in/Datepicker.html"
    When eu preencher o campo  <DatePickerEnabled>
    Then sitema devera permitir o preenchimento da data com sucesso
   Examples: 
      |  DatePickerEnabled     |
      |   "02/08/2022"         |
      
         @testeSlider
  Scenario: Teste No menu de navegação “Widgets > Slider” você deve fazer com que sua automação movimente 50% da barra.
    Given que esteja na pagina da Slider: "http://demo.automationtesting.in/Slider.html"
    When eu mover o Slider
    Then sitema devera mover o Slider com sucesso

      
      