
package com.example.springboottutorial.ContactUsForm;

        import jakarta.persistence.Entity;
        import jakarta.persistence.GeneratedValue;
        import jakarta.persistence.GenerationType;
        import jakarta.persistence.Id;

@Entity
public class ContactUsForm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String date;
    private String body;
    private String head;
    private String mail;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getHead() {
        return head;
    }
    public void setHead(String head) {
        this.head = head;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}