package com.example.factory;

import com.example.api.Message;
import java.util.Arrays;
import java.util.stream.Collectors;

public enum Numero {
  ZERO,
  UNO,
  DOS,
  TRES,
  QUATRO,
  CINCO,
  SEIS,
  SIETE,
  OCHO,
  NUEVE,
  DIEZ,
  ;

  public static Message provider() {
    return () ->
        Arrays
            .stream(values())
            .map(Enum::name)
            .collect(Collectors.joining(",", "Numero[", "]"));
  }
}
