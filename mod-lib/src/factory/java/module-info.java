import com.example.api.Message;
import com.example.factory.Factory;

module lib.factory {
    requires lib.api;
    provides Message with Factory;
}
