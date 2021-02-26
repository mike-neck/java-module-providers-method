import com.example.api.Message;

module lib.api {
    exports com.example.api;

    provides Message with Message;
}
