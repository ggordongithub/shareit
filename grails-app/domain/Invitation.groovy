class Invitation {
    String userid 
    String password
    String email
    String role = "member"
    String active
    Date lastUpdated

    static constraints = {
     userid(blank:false)
     password(blank:false, password:true)
     email(email:true, unique:true)
     active(blank:false)
     role(inList:["member", "admin"])
    }
}
