// Generated code from Butter Knife. Do not modify!
package com.example.android.musicalstructureapp;

import android.view.View;
import android.widget.GridView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AlbumByArtistActivity_ViewBinding implements Unbinder {
  private AlbumByArtistActivity target;

  @UiThread
  public AlbumByArtistActivity_ViewBinding(AlbumByArtistActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AlbumByArtistActivity_ViewBinding(AlbumByArtistActivity target, View source) {
    this.target = target;

    target.albumByArtist = Utils.findRequiredViewAsType(source, R.id.gridview, "field 'albumByArtist'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AlbumByArtistActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.albumByArtist = null;
  }
}
