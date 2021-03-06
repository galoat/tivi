/*
 * Copyright 2017 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.banes.chris.tivi.ui

import android.content.Context
import android.support.annotation.StringRes
import me.banes.chris.tivi.R
import me.banes.chris.tivi.data.entities.Genre

object GenreStringer {
    fun getEmoji(genre: Genre): String = when (genre) {
        Genre.DRAMA -> "\uD83D\uDE28"
        Genre.FANTASY -> "\uD83E\uDDD9"
        Genre.SCIENCE_FICTION -> "☄️"
        Genre.ACTION -> "\uD83E\uDD20"
        Genre.ADVENTURE -> "\uD83C\uDFDE️"
        Genre.CRIME -> "\uD83D\uDE93"
        Genre.THRILLER -> "\uD83D\uDDE1️"
        Genre.COMEDY -> "\uD83E\uDD23"
        Genre.HORROR -> "\uD83D\uDC7B"
        Genre.MYSTERY -> "\uD83D\uDD75️"
    }

    @StringRes
    fun getLabel(genre: Genre): Int = when (genre) {
        Genre.DRAMA -> R.string.genre_label_drama
        Genre.FANTASY -> R.string.genre_label_fantasy
        Genre.SCIENCE_FICTION -> R.string.genre_label_science_fiction
        Genre.ACTION -> R.string.genre_label_action
        Genre.ADVENTURE -> R.string.genre_label_adventure
        Genre.CRIME -> R.string.genre_label_crime
        Genre.THRILLER -> R.string.genre_label_thriller
        Genre.COMEDY -> R.string.genre_label_comedy
        Genre.HORROR -> R.string.genre_label_horror
        Genre.MYSTERY -> R.string.genre_label_mystery
    }

    fun joinStrings(context: Context, genres: Collection<Genre>): String {
        return genres.joinToString(" // ") {
            "${context.getString(GenreStringer.getLabel(it))} ${GenreStringer.getEmoji(it)}"
        }
    }
}