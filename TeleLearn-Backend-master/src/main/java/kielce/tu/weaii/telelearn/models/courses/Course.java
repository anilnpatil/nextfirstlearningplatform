package kielce.tu.weaii.telelearn.models.courses;

import kielce.tu.weaii.telelearn.models.Teacher;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(name = "COURSES")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(insertable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(nullable = false, name = "OWNER_ID")
    private Teacher owner;

    @Column(columnDefinition = "TEXT")
    private String name;

    @Column(columnDefinition = "TEXT")
    @Basic(fetch = LAZY)
    private String welcomePageHtmlContent;

    @Column(nullable = false)
    private boolean publicCourse;

    @Column(nullable = false)
    private boolean autoAccept;

    @Column(nullable = false)
    private boolean studentsAllowedToPost;

    @OneToMany(cascade = ALL, orphanRemoval = true, mappedBy = "course")
    private List<CourseStudent> students;

    @OneToMany(cascade = ALL, orphanRemoval = true, mappedBy = "course")
    private List<Post> posts;

    @OneToMany(cascade = ALL, orphanRemoval = true, mappedBy = "course")
    private List<Task> tasks;
}
