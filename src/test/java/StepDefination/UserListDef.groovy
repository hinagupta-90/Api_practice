package StepDefination

import com.yantriks.cucumber.utilities.JsonComparator
import com.yantriks.cucumber.utilities.ReadFile
import cucumber.api.PendingException
import groovy.json.JsonOutput
import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.HttpStatus
import org.apache.http.util.EntityUtils
import com.yantriks.cucumber.utilities.APITestBase
this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)


When(~/^Request user api is hit$/)
  {
       println("in when")
    }

Then(~/^Validate the \"([^\"]*)\" and assert \"([^\"]*)\"$/)
        {
            int response, String Expfile ->

            println("in then")
    }
When(~/^Create user with \"([^\"]*)\" and \"([^\"]*)\"\$/)
        { String username, String job ->
            println("in Create user")

        }


