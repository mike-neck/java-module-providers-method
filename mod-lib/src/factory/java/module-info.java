import com.example.api.Message;
import com.example.factory.Factory;
import com.example.factory.Numero;

module lib.factory {
    requires lib.api;
    provides Message with Factory, Numero;
}
