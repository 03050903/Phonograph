package com.kabouzeid.gramophone.comparator;

import com.kabouzeid.gramophone.model.Song;

import java.util.Comparator;

/**
 * Created by karim on 25.11.14.
 */
public class SongTrackNumberComparator implements Comparator<Song> {
    @Override
    public int compare(Song lhs, Song rhs) {
        // 0 gleich
        // -1 steht über dem anderen
        // 1 steht unter dem anderen
        if (lhs.trackNumber == rhs.trackNumber) {
            return 0;
        }
        if (lhs.trackNumber > rhs.trackNumber) {
            return 1;
        }
        return -1;
    }
}
