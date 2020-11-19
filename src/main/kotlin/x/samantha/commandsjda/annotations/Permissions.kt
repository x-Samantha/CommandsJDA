package x.samantha.commandsjda.annotations

import net.dv8tion.jda.api.Permission

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class Permissions(vararg val permissions: Permission)