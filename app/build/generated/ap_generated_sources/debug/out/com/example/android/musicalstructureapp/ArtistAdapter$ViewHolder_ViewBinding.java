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

public class ArtistAdapter$ViewHolder_ViewBinding implements Unbinder {
  private ArtistAdapter.ViewHolder target;

  @UiThread
  public ArtistAdapter$ViewHolder_ViewBinding(ArtistAdapter.ViewHolder target, View source) {
    this.target = target;

    target.artistPictureImageView = Utils.findRequiredViewAsType(source, R.id.artist_picture_image_view, "field 'artistPictureImageView'", ImageView.class);
    target.artistTextView = Utils.findRequiredViewAsType(source, R.id.artist_name_text_view, "field 'artistTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ArtistAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.artistPictureImageView = null;
    target.artistTextView = null;
  }
}
