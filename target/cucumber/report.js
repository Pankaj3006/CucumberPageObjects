$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Common.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to Validate Buy Cars Page is working.",
  "description": "",
  "id": "acceptance-testing-to-validate-buy-cars-page-is-working.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Common-Cars"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the Home Page of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchCars.i_am_on_the_home_page_of_carsguide_website()"
});
formatter.result({
  "duration": 7138324565,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "duration": 209739,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-buy-cars-page-is-working.;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#Given I am on the Home Page of CarsGuide Website"
    }
  ],
  "line": 10,
  "name": "I move to Car For Sale Menu",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select carbrand as \"BMW\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select \"1 Series\" as car model",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "select location as \"SA - All\" from SelectLocation dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select \"1000\" as price",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "#Then I should see list of searched cars"
    }
  ],
  "line": 18,
  "name": "the page title should be \"Bmw 1 Series Under 1000 for Sale SA | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCars.i_move_to_car_for_sale_menu()"
});
formatter.result({
  "duration": 789421846,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "SearchCars.click_on_something_link(String)"
});
formatter.result({
  "duration": 866891102,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 20
    }
  ],
  "location": "SearchCars.select_carbrand_as_something_from_anymake_dropdown(String)"
});
formatter.result({
  "duration": 1904903627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 8
    }
  ],
  "location": "SearchCars.select_something_as_car_model(String)"
});
formatter.result({
  "duration": 253570068,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SA - All",
      "offset": 20
    }
  ],
  "location": "SearchCars.select_location_as_something_from_selectlocation_dropdown(String)"
});
formatter.result({
  "duration": 161853927,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 8
    }
  ],
  "location": "SearchCars.select_something_as_price(String)"
});
formatter.result({
  "duration": 422073597,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.click_on_findmynextcar_button()"
});
formatter.result({
  "duration": 444673684,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 1000 for Sale SA | carsguide",
      "offset": 26
    }
  ],
  "location": "SearchCars.the_page_title_should_be_something(String)"
});
formatter.result({
  "duration": 18413854,
  "status": "passed"
});
formatter.after({
  "duration": 732428742,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the Home Page of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchCars.i_am_on_the_home_page_of_carsguide_website()"
});
formatter.result({
  "duration": 5599120806,
  "status": "passed"
});
formatter.match({
  "location": "SearchCars.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "duration": 178921,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Validate Used  Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-buy-cars-page-is-working.;validate-used--search-cars-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 21,
      "value": "#Given I navigate to the Home Page of CarsGuide Website"
    }
  ],
  "line": 22,
  "name": "I move to Used Car For Sale Menu",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "click on \"Used\" link on Menu Page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "select carMaker from AnyMake dropdown",
  "rows": [
    {
      "cells": [
        "carMaker"
      ],
      "line": 25
    },
    {
      "cells": [
        "Audi"
      ],
      "line": 26
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "select car model",
  "rows": [
    {
      "cells": [
        "carModel"
      ],
      "line": 28
    },
    {
      "cells": [
        "A4"
      ],
      "line": 29
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "select location from SelectLocation dropdown",
  "rows": [
    {
      "cells": [
        "location"
      ],
      "line": 31
    },
    {
      "cells": [
        "SA - All"
      ],
      "line": 32
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#And select \"1000\" price"
    }
  ],
  "line": 34,
  "name": "click on Find_My_Car button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 35,
      "value": "#Then I should see list of Used cars"
    }
  ],
  "line": 36,
  "name": "the page title should match expected title \"Used Audi A4 for Sale SA | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "UsedCars.i_move_to_used_car_for_sale_menu()"
});
formatter.result({
  "duration": 1507744957,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used",
      "offset": 10
    }
  ],
  "location": "UsedCars.click_on_something_link_on_menu_page(String)"
});
formatter.result({
  "duration": 1804948143,
  "status": "passed"
});
formatter.match({
  "location": "UsedCars.select_carmaker_from_anymake_dropdown(String\u003e)"
});
formatter.result({
  "duration": 1987612521,
  "status": "passed"
});
formatter.match({
  "location": "UsedCars.select_car_model(String\u003e)"
});
formatter.result({
  "duration": 387064630,
  "status": "passed"
});
formatter.match({
  "location": "UsedCars.select_location_from_selectlocation_dropdown(String\u003e)"
});
formatter.result({
  "duration": 454932520,
  "status": "passed"
});
formatter.match({
  "location": "UsedCars.click_on_findmycar_button()"
});
formatter.result({
  "duration": 299698659,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used Audi A4 for Sale SA | carsguide",
      "offset": 44
    }
  ],
  "location": "UsedCars.the_page_title_should_match_expected_title_something(String)"
});
formatter.result({
  "duration": 50206529,
  "status": "passed"
});
formatter.after({
  "duration": 636932579,
  "status": "passed"
});
});