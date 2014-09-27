class Member {
    String login
    String password
    String email
    String role = "member"
    String active
    Date lastUpdated

    static constraints = {
     login(blank:false)
     password(blank:false, password:true)
     email(email:true, unique:true)
     active(blank:false)
     role(inList:"admin", "member")
    }
}
