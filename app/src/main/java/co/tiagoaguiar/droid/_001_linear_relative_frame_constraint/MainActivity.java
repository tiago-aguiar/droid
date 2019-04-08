package co.tiagoaguiar.droid._001_linear_relative_frame_constraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import co.tiagoaguiar.droid.R;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_linear_layout_horizontal_01_1);

    // -> to position and organize another views, aka (CONTAINERS) | ViewGroup / View
    // -> LinearLayout, RelativeLayout, FrameLayout | ConstraintLayout (all before) (constraint aka relationship between 2 widgets
    // -> ViewGroup class (Ctrl+Alt+B), see all *Layout.java

    // -> Design + Blueprint viewEditor


    // # LinearLayout -> Single Direction
    // (example)


    // # RelativeLayout -> Stack relative to others or parent
    // (example)
    // Position based on siblings: layout_above, layout_below, layout_toLeftOf, layout_toRightOf
    // Alignment based on siblings: layout_alignTop, layout_alignBottom, layout_alignLeft, layout_alignRight, layout_alignBaseline
    // Position based on parent: android:layout_centerHorizontal, android:layout_centerVertical
    // Alignment based on parent: layout_alignParentTop, layout_alignParentBottom, layout_alignParentLeft, layout_alignParentRight

    // # FrameLayout -> Stack z-index views
    // (example) layout_gravity + padding + margin

    // Extra! (Optimize)
    // -> Avoid instantiate layouts (LinearLayout X RelativeLayout)
    // -> linear_layout_01.png | linear_layout_02.png
  }

}
