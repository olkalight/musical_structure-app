// Generated code from Butter Knife. Do not modify!
package com.example.android.musicalstructureapp;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.songs = Utils.findRequiredViewAsType(source, R.id.songs, "field 'songs'", TextView.class);
    target.albums = Utils.findRequiredViewAsType(source, R.id.albums, "field 'albums'", TextView.class);
    target.artists = Utils.findRequiredViewAsType(source, R.id.artists, "field 'artists'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.songs = null;
    target.albums = null;
    target.artists = null;
  }
}
