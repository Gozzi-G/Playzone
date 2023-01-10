import database.databaseModule
import ktor.ktorModule
import org.kodein.di.DI

val coreModule = DI.Module("coreModule") {
    importAll(
        databaseModule,
        serializationModule,
        ktorModule,
    )
}