package javalearning.files;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//https://mkyong.com/java/jackson-tree-model-example/
public class ReadJsonFileJackson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        final JsonNode rootNode = new ObjectMapper().readTree(new File("src/main/resources/reportFile1.json"));
        JsonNode medicationsNode = rootNode.path("medications");

        System.out.println(rootNode.get("name"));
        if (medicationsNode.isArray()) {
            for (JsonNode node : medicationsNode) {
                System.out.println(node);
               for(JsonNode n1: node){
                  for(JsonNode n2: n1){
                      System.out.println(n2.path("name").asText( ));
                  }
               }



            }
        }
    }
}

