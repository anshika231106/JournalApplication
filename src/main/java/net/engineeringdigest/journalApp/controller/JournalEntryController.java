//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryController {
//    private Map<Long,JournalEntry> entries=new HashMap();
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(entries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry newEntry){
//        entries.put(newEntry.getId(),newEntry);
//        return true;
//    }
//
//    @GetMapping("id/{myId}")
//    public JournalEntry getEntry(@PathVariable long myId){
//        return entries.get(myId);
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteEntry(@PathVariable long myId){
//        return entries.remove(myId);
//    }
//
//    @PutMapping("id/{id}")
//    public JournalEntry updateEntry(@PathVariable long id,@RequestBody JournalEntry e){
//        return entries.put(id,e);
//    }
//}
