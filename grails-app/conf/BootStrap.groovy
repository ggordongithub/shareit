
class BootStrap {
    def springSecurityService


    def init = { servletContext ->

    def userRole = SecRole.findByAuthority('ROLE_USER') ?: new SecRole(authority: 'ROLE_USER').save(failOnError: true, flush:true)
    def adminRole = SecRole.findByAuthority('ROLE_ADMIN') ?: new SecRole(authority: 'ROLE_ADMIN').save(failOnError: true, flush:true)
    def adminUser = SecUser.findByUsername('admin') ?: new SecUser( username: 'admin', password: 'admin', enabled: true  ).save(failOnError: true, flush:true)

    println(userRole.all)
    println(adminRole.getAuthority())
    println(adminUser.getUsername())

    if (!adminUser.authorities.contains(adminRole)) { SecUserSecRole.create( adminUser, adminRole ) }
	
    }

    def destroy = {
    }
}
