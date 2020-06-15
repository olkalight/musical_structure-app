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

public class AlbumActivity_ViewBinding implements Unbinder {
  private AlbumActivity target;

  @UiThread
  public AlbumActivity_ViewBinding(AlbumActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AlbumActivity_ViewBinding(AlbumActivity target, View source) {
    this.target = target;

    target.album = Utils.findRequiredViewAsType(source, R.id.gridview, "field 'album'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AlbumActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.album = null;
  }
}
