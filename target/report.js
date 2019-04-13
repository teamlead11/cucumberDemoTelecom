$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/AddCustomer.feature");
formatter.feature({
  "name": "To test the add customer functionlaity",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@sprint1"
    },
    {
      "name": "@us1234"
    },
    {
      "name": "@xyz"
    },
    {
      "name": "@addcust"
    }
  ]
});
formatter.scenario({
  "name": "To test the submit button1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@sprint1"
    },
    {
      "name": "@us1234"
    },
    {
      "name": "@xyz"
    },
    {
      "name": "@addcust"
    },
    {
      "name": "@smoke1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in telecom home pag",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_in_telecom_home_pag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigates to add customer page",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.the_user_navigates_to_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill in the form details",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "email",
        "adress",
        "phnum"
      ]
    },
    {
      "cells": [
        "testf",
        "testl",
        "test4@gmail.com",
        "chennai",
        "123456789"
      ]
    },
    {
      "cells": [
        "testxf",
        "testxl",
        "test1@gmail.com",
        "chennai",
        "223456789"
      ]
    },
    {
      "cells": [
        "testyf",
        "testyl",
        "test2@gmail.com",
        "chennai",
        "323456789"
      ]
    },
    {
      "cells": [
        "testzf",
        "testzl",
        "test3@gmail.com",
        "chennai",
        "423456789"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_fill_in_the_form_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user submits the form",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_submits_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The customer should see the customer id generated.",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessSteps.the_customer_should_see_the_customer_id_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To test the submit button2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@sprint1"
    },
    {
      "name": "@us1234"
    },
    {
      "name": "@xyz"
    },
    {
      "name": "@addcust"
    },
    {
      "name": "@smoke2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in telecom home pag",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_in_telecom_home_pag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigates to add customer page",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.the_user_navigates_to_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill in the form details",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "email",
        "adress",
        "phnum"
      ]
    },
    {
      "cells": [
        "testf",
        "testl",
        "test4@gmail.com",
        "chennai",
        "123456789"
      ]
    },
    {
      "cells": [
        "testxf",
        "testxl",
        "test1@gmail.com",
        "chennai",
        "223456789"
      ]
    },
    {
      "cells": [
        "testyf",
        "testyl",
        "test2@gmail.com",
        "chennai",
        "323456789"
      ]
    },
    {
      "cells": [
        "testzf",
        "testzl",
        "test3@gmail.com",
        "chennai",
        "423456789"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_fill_in_the_form_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user submits the form",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_submits_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The customer should see the customer id generated.",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessSteps.the_customer_should_see_the_customer_id_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To test the submit button3",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@sprint1"
    },
    {
      "name": "@us1234"
    },
    {
      "name": "@xyz"
    },
    {
      "name": "@addcust"
    },
    {
      "name": "@smoke3"
    },
    {
      "name": "@smoke1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in telecom home pag",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_in_telecom_home_pag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigates to add customer page",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.the_user_navigates_to_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill in the form details",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "email",
        "adress",
        "phnum"
      ]
    },
    {
      "cells": [
        "testf",
        "testl",
        "test4@gmail.com",
        "chennai",
        "123456789"
      ]
    },
    {
      "cells": [
        "testxf",
        "testxl",
        "test1@gmail.com",
        "chennai",
        "223456789"
      ]
    },
    {
      "cells": [
        "testyf",
        "testyl",
        "test2@gmail.com",
        "chennai",
        "323456789"
      ]
    },
    {
      "cells": [
        "testzf",
        "testzl",
        "test3@gmail.com",
        "chennai",
        "423456789"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_fill_in_the_form_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user submits the form",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_submits_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The customer should see the customer id generated.",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessSteps.the_customer_should_see_the_customer_id_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});