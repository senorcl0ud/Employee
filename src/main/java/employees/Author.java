package employees;

public class Author {
    private String name;
    private String domainName;
    private char gender;


    public Author(String name, String domainName, char gender){
        this.name = name;
        this.domainName = domainName;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    private String getDomainName(){
        return this.domainName;
    }

    public String createBookEmail(){
        return this.name + "@" + getDomainName();
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", domainName='" + domainName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
