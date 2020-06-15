// Generated code from Butter Knife. Do not modify!
package com.example.android.musicalstructureapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NowPlayingActivity_ViewBinding implements Unbinder {
  private NowPlayingActivity target;

  @UiThread
  public NowPlayingActivity_ViewBinding(NowPlayingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NowPlayingActivity_ViewBinding(NowPlayingActivity target, View source) {
    this.target = target;

    target.albumImageView = Utils.findRequiredViewAsType(source, R.id.nowplaying_album_cover_picture, "field 'albumImageView'", ImageView.class);
    target.songTextView = Utils.findRequiredViewAsType(source, R.id.playing_song, "field 'songTextView'", TextView.class);
    target.artistTextView = Utils.findRequiredViewAsType(source, R.id.playing_artist, "field 'artistTextView'", TextView.class);
    target.albumTextView = Utils.findRequiredViewAsType(source, R.id.playing_album, "field 'albumTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NowPlayingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.albumImageView = null;
    target.songTextView = null;
    target.artistTextView = null;
    target.albumTextView = null;
  }
}
