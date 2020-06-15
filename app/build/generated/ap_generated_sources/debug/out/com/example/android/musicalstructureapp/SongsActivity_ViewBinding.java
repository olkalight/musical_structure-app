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

public class SongsActivity_ViewBinding implements Unbinder {
  private SongsActivity target;

  @UiThread
  public SongsActivity_ViewBinding(SongsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SongsActivity_ViewBinding(SongsActivity target, View source) {
    this.target = target;

    target.song = Utils.findRequiredViewAsType(source, R.id.listView, "field 'song'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SongsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.song = null;
  }
}
