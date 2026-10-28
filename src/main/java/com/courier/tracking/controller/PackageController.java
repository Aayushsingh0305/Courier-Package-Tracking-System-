package com.courier.tracking.controller;
import com.courier.tracking.model.CourierPackage;import com.courier.tracking.service.CourierService;import org.springframework.http.HttpStatus;import org.springframework.web.bind.annotation.*;import org.springframework.web.server.ResponseStatusException;import java.util.*;
@RestController @RequestMapping("/api/packages") public class PackageController {
 private final CourierService service;public PackageController(CourierService s){service=s;}
 @GetMapping public List<CourierPackage> all(){return service.all();}
 @GetMapping("/{id}") public CourierPackage find(@PathVariable String id){CourierPackage p=service.find(id);if(p==null)throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Tracking ID not found.");return p;}
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public CourierPackage add(@RequestBody CourierPackage p){try{return service.add(p);}catch(IllegalArgumentException e){throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());}}
 @PatchMapping("/{id}") public CourierPackage update(@PathVariable String id,@RequestBody Map<String,String>b){CourierPackage p=service.update(id,b.get("status"),b.get("currentLocation"));if(p==null)throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Tracking ID not found.");return p;}
}
