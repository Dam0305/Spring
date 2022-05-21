package hello.hellospring.domain;

public class Member {

    private Long id; //고객이 정하는 아이디가 아니라 시스템이 정하는 아이디 데이터 구분 위함
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
