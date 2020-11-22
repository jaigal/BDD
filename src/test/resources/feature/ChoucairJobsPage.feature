Feature: Escenarios Chourcair Empleos


  Scenario: HU_01 Ingreso a pestana Empleos
    Given Ubicado en la pagina principal de Chourcair
    When Doy click en la pestana de empleo
    Then Me muevo a la pagina de empleo

  Scenario: HU_02 Funcionamiento anclas WEB
    Given Ubicado en la pestana de empleo chourcair
    When Clik a cada uno de los iconos
    Then Me ubico en la seccion del icono
    
    
@reproducirvideos
  Scenario: HU_05 Verificacion de contenido estático
    Given Ubicado en la pestana de empleo chourcair
    When Doy click al video multimedia
    Then Video inicia reproduccion
