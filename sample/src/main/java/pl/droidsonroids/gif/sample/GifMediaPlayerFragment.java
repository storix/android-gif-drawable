package pl.droidsonroids.gif.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageButton;

public class GifMediaPlayerFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.media_player, container, false);

        final GifImageButton gib = (GifImageButton) view.findViewById(R.id.gifImageButton);
        final GifDrawable gd = (GifDrawable) gib.getDrawable();
        gd.setMaxFramesToRenderWhenSeeking(1);
        final MediaController mc = new MediaController(getActivity());
        mc.setMediaPlayer(gd);
        mc.setAnchorView(gib);
        gib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mc.show();
            }
        });

        return view;
    }
}

