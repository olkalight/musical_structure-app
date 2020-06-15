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

public class AlbumAdapter$ViewHolder_ViewBinding implements Unbinder {
  private AlbumAdapter.ViewHolder target;

  @UiThread
  public AlbumAdapter$ViewHolder_ViewBinding(AlbumAdapter.ViewHolder target, View source) {
    this.target = target;

    target.albumDrawableId = Utils.findRequiredViewAsType(source, R.id.album_picture_image_view, "field 'albumDrawableId'", ImageView.class);
    target.albumTextView = Utils.findRequiredViewAsType(source, R.id.album_title_text_view, "field 'albumTextView'", TextView.class);
    target.albumArtistTextView = Utils.findRequiredViewAsType(source, R.id.album_artist_name_text_view, "field 'albumArtistTextView'", TextView.class);
    target.albumDateTextView = Utils.findRequiredViewAsType(source, R.id.album_date_text_view, "field 'albumDateTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AlbumAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.albumDrawableId = null;
    target.albumTextView = null;
    target.albumArtistTextView = null;
    target.albumDateTextView = null;
  }
}
