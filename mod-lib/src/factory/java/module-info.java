import com.example.api.Message;
import com.example.factory.Factory;

module lib.self {
    requires lib.api;
    provides Message with Factory;
}
