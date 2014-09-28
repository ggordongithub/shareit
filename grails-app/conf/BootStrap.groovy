
class BootStrap {
    def springSecurityService


    def init = { servletContext ->

		
    new Requestmap(url: '/**', configAttribute: 'ROLE_ADMIN, ROLE_USER,IS_AUTHENTICATED_ANONYMOUSLY').save()

    def userRole = SecRole.findByAuthority('ROLE_USER') ?: new SecRole(authority: 'ROLE_USER').save(failOnError: true)
    def adminRole = SecRole.findByAuthority('ROLE_ADMIN') ?: new SecRole(authority: 'ROLE_ADMIN').save(failOnError: true)
    def adminUser = SecUser.findByUsername('admin') ?: new SecUser( username: 'admin', password: springSecurityService.encodePassword('admin'), enabled: true  ).save(failOnError: true)
 //   def userRole = new SecRole(authority: 'ROLE_USER').save(failOnError: true)
 //   def adminRole = new SecRole(authority: 'ROLE_ADMIN').save(failOnError: true)
 //   SecUser adminUser = new SecUser( username: 'admin', password: springSecurityService.encodePassword('admin'), enabled: true  ).save(failOnError: true)


   println(userRole.all)
   println(adminRole.getAuthority())
   println(adminUser.getUsername())

     if (!adminUser.authorities.contains(adminRole)) { SecUserSecRole.create( adminUser, adminRole ) }
	
    }

    def destroy = {
    }
}
