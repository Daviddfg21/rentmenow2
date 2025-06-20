package com.rentmenow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

	@GetMapping("/api/health")
	public ResponseEntity<Map<String, Object>> health() {
		Map<String, Object> response = new HashMap<>();
		response.put("status", "UP");
		response.put("timestamp", LocalDateTime.now());
		response.put("service", "RentMeNow API");
		return ResponseEntity.ok(response);
	}

	@GetMapping("/health")
	public ResponseEntity<Map<String, Object>> simpleHealth() {
		Map<String, Object> response = new HashMap<>();
		response.put("status", "UP");
		return ResponseEntity.ok(response);
	}
}