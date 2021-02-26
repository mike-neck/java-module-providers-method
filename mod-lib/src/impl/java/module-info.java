import com.example.api.Message;
import com.example.impl.Hello;

module lib.hello {

    requires lib.api;

    provides Message with Hello;
}
