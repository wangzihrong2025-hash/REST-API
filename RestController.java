#Simple REST API 
@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "hello");
    }

    @PostMapping("/data")
    public Map<String, Object> post(@RequestBody Map<String, Object> body) {
        return body;
    }
}
