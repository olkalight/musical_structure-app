// Generated code from Butter Knife. Do not modify!
package com.example.android.musicalstructureapp;

import android.view.View;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArtistActivity_ViewBinding implements Unbinder {
  private ArtistActivity target;

  @UiThread
  public ArtistActivity_ViewBinding(ArtistActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ArtistActivity_ViewBinding(ArtistActivity target, View source) {
    this.target = target;

    target.artist = Utils.findRequiredViewAsType(source, R.id.listView, "field 'artist'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ArtistActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.artist = null;
  }
}
