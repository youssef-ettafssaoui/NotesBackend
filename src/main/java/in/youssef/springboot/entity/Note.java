package in.youssef.springboot.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="tbl_notes")
@Data
public class Note {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String body;
    private String category;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Date createdAt; // This will create date and Time when new object is created

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt; // This will update date and Time when an object is updated

}
