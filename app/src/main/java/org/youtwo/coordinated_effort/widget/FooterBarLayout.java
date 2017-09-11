package org.youtwo.coordinated_effort.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import org.youtwo.coordinated_effort.behaviors.FooterBarBehavior;

/**
 * Simple FrameLayout container extension that applies the FooterBarBehavior
 * as the default.
 */
@CoordinatorLayout.DefaultBehavior(FooterBarBehavior.class)
public class FooterBarLayout extends FrameLayout {
  public FooterBarLayout(Context context) {
    super(context);
  }

  public FooterBarLayout(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public FooterBarLayout(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }
}
