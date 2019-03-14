package rbtpajajakng.web.id.importantvideosplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.Random;

public class MainActivity extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youTubePlayerView = findViewById(R.id.youtube_play);
        // Make a random number
        Random r = new Random();
        final int random = r.nextInt(311);
        // Initializing the listener
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadPlaylist("PLFsQleAWXsj_4yDeebiIADdH5FMayBiJo", random, 0);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        // Play the video
        youTubePlayerView.initialize(YouTubeConfig.getApiKey(), onInitializedListener);
    }
}
