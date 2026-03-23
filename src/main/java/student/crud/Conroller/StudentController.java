package student.crud.Conroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import student.crud.Entity.Student;
import student.crud.Repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepositry;

    @GetMapping
    public List<Student> getAll(){
        return studentRepositry.findAll();
    }

    @GetMapping("/{get}")
    public Optional<Student> getByid(@PathVariable Long id) {
        return studentRepositry.findById(id);
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentRepositry.save(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);
        return studentRepositry.save(student);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        studentRepositry.deleteById(id);
        return "Student deleted successfully!..";
    }
}
