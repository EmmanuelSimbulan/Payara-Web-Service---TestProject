// package com.svi.testproject.util;

// import java.util.Map;

// import javax.ws.rs.core.Response;

// public class JsonResponseUtil {

//    private static final ObjectMapper objectMapper = new ObjectMapper();

//    /**
//     * Converts a Map into a JSON string and wraps it in a Response object.
//     *
//     * @param responseMap The Map containing the data to be converted to JSON.
//     * @param status      The HTTP status code for the response.
//     * @return A Response object containing the JSON representation of the Map.
//     */
//    public static Response createJsonResponse(Map<String, Object> responseMap, Response.Status status) {
//        try {
//            String jsonResponse = objectMapper.writeValueAsString(responseMap);

//            return Response.status(status)
//                           .entity(jsonResponse)
//                           .header("Content-Type", "application/json")
//                           .build();
//        } catch (Exception e) {
//            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
//                           .entity("{\"error\": \"Failed to generate JSON response.\"}")
//                           .header("Content-Type", "application/json")
//                           .build();
//        }
//    }
// }

