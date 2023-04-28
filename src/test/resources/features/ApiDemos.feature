@ApiDemos
Feature: Mobile Search Page

  @Ornek1
  Scenario: Find Element
    Given uygulamanın açıldığı kontrol edilir

  @Ornek2
  Scenario: Get Text
    Given uygulamanın başlığının "API Demos" olduğu kontol edilir

  @Ornek3
  Scenario: Click
    Given uygulamanın açıldığı kontrol edilir
    Given uygulamanın başlığının "API Demos" olduğu kontol edilir
    When tablarden App tabine tıklanır

  @Ornek4
  Scenario Outline: SendKeys
    Given uygulamanın başlığının "API Demos" olduğu kontol edilir
    When tablarden "<tab1>" tabine tıklanır
    When tablarden "<tab2>" tabine tıklanır
    When tablarden "<tab3>" tabine tıklanır
    When Search butonuna tıklanır
    When Search alanına "<text>" yazılır
    Then Text area "<text>" değerini içeriyormu kontrol edilir
    Examples:
      | tab1 | tab2       | tab3             | text    |
      | App  | Action Bar | Action Bar Usage | enes    |
      | App  | Action Bar | Action Bar Usage | enes    |
      | App  | Action Bar | Action Bar Usage | enes    |

  @Ornek5
  Scenario: Scroll UiSelector/UiScrollable
    Given uygulamanın açıldığı kontrol edilir
    When tablarden "Graphics" tabine tıklanır
    When tablarden Touch Paint tabine tıklanır

  @Ornek6
  Scenario: Scroll JavascriptExecutor
    Given uygulamanın açıldığı kontrol edilir
    When tablarden "Graphics" tabine tıklanır
    When tablarden Touch Paint tabine tıklanırrrrr

  @ButtonsPage
  Scenario: Check Buttons Page
    Given user should see the CategoriesPage
    When taps "Views" on Categories Page
    When taps "Buttons" on Categories Page
    Then should see Title "Views/Buttons" on Buttons Page

  @ButtonsPage @CheckActions
  Scenario: Check Buttons Page Actions
    Given user is on the Buttons Page
    Then should Normal Button "NORMAL" on Buttons Page
    Then should Small Button "SMALL" on Buttons Page
    Then should Switch Button "KAPALI" on Buttons Page
    When taps Switch Button on Buttons Page
    Then should Switch Button "AÇIK" on Buttons Page

  @PopupMenuPage
  Scenario: Check Popup Menu Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Popup Menu" on Categories Page
    Then should see Title "Views/Popup Menu" on Popup Menu Page

  @PopupMenuPage @CheckActions
  Scenario: Check Popup Menu Page Actions
    Given user is on the Popup Menu Page
    Then should Make Popup Button "MAKE A POPUP!" on Popup Menu Page
    When taps Make Popup Button on Popup Menu Page
    Then should see Popup Element "Search" on Popup Menu Page
    Then should see Popup Element "Add" on Popup Menu Page
    Then should see Popup Element "Edit" on Popup Menu Page
    When taps Popup Element "Edit" on Popup Menu Page
    Then should see Popup Menu Title "Edit" on Popup Menu Page

  @RadioButtonPage
  Scenario: Check Radio Button Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Radio Group" on Categories Page
    Then should see Title "Views/Radio Group" on Radio Button Page

  @RadioButtonPage @CheckActions
  Scenario: Check Radio Button Page Actions
    Given user is on the Radio Button Page
    Then should see Radio Button "Snack" on Radio Button Page
    Then should see Radio Button "Breakfast" on Radio Button Page
    Then should see Radio Button "Lunch" on Radio Button Page
    Then should see Radio Button "Dinner" on Radio Button Page
    Then should see Radio Button "All of them" on Radio Button Page
    Then should see Clear Button "CLEAR" on Radio Button Page
    When taps to Radio Button "Dinner" on Radio Button Page
    Then should see Selected Text "2131296432" on Radio Button Page
    When taps to Radio Button "Lunch" on Radio Button Page
    Then should see Selected Text "2131296577" on Radio Button Page

  @SearchView
  Scenario: Check Search View Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Search View" on Categories Page
    When taps "Action Bar" on Categories Page
    Then should see Title "Views/Search View/Action Bar" on Search View Page

  @SearchView @CheckActions
  Scenario: Check Search View Page Actions
    Given user is on the Search View Page
    Then should see Search Button on Search View Page
    When taps to Search Button on Search View Page
    When sendkeys to Search Area "blabla" on Search View Page
    Then should see Result "blabla" on Search View Page

  @Switches
  Scenario: Check Switches Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Switches" on Categories Page
    Then should see Switches Page

  @Switches @CheckActions
  Scenario: Check Radio Button Page Actions
    Given user is on the Switches Page
    Then should see Defaults Switch On on Switches Page
    When taps to Defaults Switch on Switches Page
    Then should see Defaults Switch Off on Switches Page

  @Visibility
  Scenario: Check Visibility Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Visibility" on Categories Page
    Then should see Visibility Page

  @Visibility @CheckActions
  Scenario: Check Visibility Page Actions
    Given user is on the Visibility Page
    Then should see View Text "" on Visibility Page
    Then should see Buttons "" on Visibility Page
    When taps to Buttons "" on Visibility Page
    Then should not see View Text "" on Visibility Page
    When taps to Buttons "" on Visibility Page
    Then should see View Text "" on Visibility Page