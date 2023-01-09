package di

import coreModule
import org.kodein.di.DI

val umbrellaModule = DI.Module("umbrellaModule") {
    importAll(
        coreModule,
        gamesModule,
    )
}