package person.service;

import javax.xml.ws.Endpoint;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main  {







    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8080/personservice/", new PersonServiceImpl());





    }



}

