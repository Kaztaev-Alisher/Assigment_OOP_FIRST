public class library {
    private String name;
    private book bok;
    private librarymember member;

    public library(String name , book bok , librarymember member){
        this.name = name;
        this.bok = bok;
        this.member = member;
    }

    public void displayInfo(){
        System.out.println("Library: " + name);
        System.out.println(bok);
        System.out.println(member);
    }

}

