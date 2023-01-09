import ktor.KtorGamesDataSource
import ktor.models.mapToGame
import models.Game
import sqldelight.SqlDelightDataSource

class GamesRepositoryImpl(
    private val remoteDataSource: KtorGamesDataSource,
    private val localDataSource: SqlDelightDataSource,
) : GamesRepository {
    override suspend fun fetchAllGames(): List<Game> {
        return remoteDataSource.fetchAllGames().map { it.mapToGame() }
    }

    override suspend fun searchGame(query: String): List<Game> {
        return remoteDataSource.searchGame(query).map { it.mapToGame() }
    }
}