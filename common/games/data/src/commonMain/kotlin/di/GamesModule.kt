package di

import GamesRepository
import GamesRepositoryImpl
import ktor.KtorGamesDataSource
import org.kodein.di.*
import sqldelight.SqlDelightDataSource

val gamesModule = DI.Module("gamesModule") {
    bind<KtorGamesDataSource>() with provider {
        KtorGamesDataSource(instance())
    }

    bind<SqlDelightDataSource>() with provider {
        SqlDelightDataSource()
    }

    bind<GamesRepository>() with singleton {
        GamesRepositoryImpl(instance(), instance())
    }
}