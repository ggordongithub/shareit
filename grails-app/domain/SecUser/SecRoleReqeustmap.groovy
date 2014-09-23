package SecUser

import org.apache.commons.lang.builder.HashCodeBuilder

class SecRoleReqeustmap implements Serializable {

	private static final long serialVersionUID = 1

	SecRole secRole
	Reqeustmap reqeustmap

	boolean equals(other) {
		if (!(other instanceof SecRoleReqeustmap)) {
			return false
		}

		other.secRole?.id == secRole?.id &&
		other.reqeustmap?.id == reqeustmap?.id
	}

	int hashCode() {
		def builder = new HashCodeBuilder()
		if (secRole) builder.append(secRole.id)
		if (reqeustmap) builder.append(reqeustmap.id)
		builder.toHashCode()
	}

	static SecRoleReqeustmap get(long secRoleId, long reqeustmapId) {
		SecRoleReqeustmap.where {
			secRole == SecRole.load(secRoleId) &&
			reqeustmap == Reqeustmap.load(reqeustmapId)
		}.get()
	}

	static boolean exists(long secRoleId, long reqeustmapId) {
		SecRoleReqeustmap.where {
			secRole == SecRole.load(secRoleId) &&
			reqeustmap == Reqeustmap.load(reqeustmapId)
		}.count() > 0
	}

	static SecRoleReqeustmap create(SecRole secRole, Reqeustmap reqeustmap, boolean flush = false) {
		def instance = new SecRoleReqeustmap(secRole: secRole, reqeustmap: reqeustmap)
		instance.save(flush: flush, insert: true)
		instance
	}

	static boolean remove(SecRole u, Reqeustmap r, boolean flush = false) {
		if (u == null || r == null) return false

		int rowCount = SecRoleReqeustmap.where {
			secRole == SecRole.load(u.id) &&
			reqeustmap == Reqeustmap.load(r.id)
		}.deleteAll()

		if (flush) { SecRoleReqeustmap.withSession { it.flush() } }

		rowCount > 0
	}

	static void removeAll(SecRole u, boolean flush = false) {
		if (u == null) return

		SecRoleReqeustmap.where {
			secRole == SecRole.load(u.id)
		}.deleteAll()

		if (flush) { SecRoleReqeustmap.withSession { it.flush() } }
	}

	static void removeAll(Reqeustmap r, boolean flush = false) {
		if (r == null) return

		SecRoleReqeustmap.where {
			reqeustmap == Reqeustmap.load(r.id)
		}.deleteAll()

		if (flush) { SecRoleReqeustmap.withSession { it.flush() } }
	}

	static constraints = {
		reqeustmap validator: { Reqeustmap r, SecRoleReqeustmap ur ->
			if (ur.secRole == null) return
			boolean existing = false
			SecRoleReqeustmap.withNewSession {
				existing = SecRoleReqeustmap.exists(ur.secRole.id, r.id)
			}
			if (existing) {
				return 'userRole.exists'
			}
		}
	}

	static mapping = {
		id composite: ['reqeustmap', 'secRole']
		version false
	}
}
