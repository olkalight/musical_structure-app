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

public class SongsAdapter$ViewHolder_ViewBinding implements Unbinder {
  private SongsAdapter.ViewHolder target;

  @UiThread
  public SongsAdapter$ViewHolder_ViewBinding(SongsAdapter.ViewHolder target, View source) {
    this.target = target;

    target.songTextView = Utils.findRequiredViewAsType(source, R.id.song_title_text_view, "field 'songTextView'", TextView.class);
    target.artistTextView = Utils.findRequiredViewAsType(source, R.id.song_artist_name_text_view, "field 'artistTextView'", TextView.class);
    target.albumTextView = Utils.findRequiredViewAsType(source, R.id.song_album_title_text_view, "field 'albumTextView'", TextView.class);
    target.albumImageView = Utils.findRequiredViewAsType(source, R.id.album_cover_picture, "field 'albumImageView'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SongsAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.songTextView = null;
    target.artistTextView = null;
    target.albumTextView = null;
    target.albumImageView = null;
  }
}
