// Generated code from Butter Knife. Do not modify!
package th.co.mfec.chaiyapong.gradecalculator;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends th.co.mfec.chaiyapong.gradecalculator.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427412, "field 'score'");
    target.score = finder.castView(view, 2131427412, "field 'score'");
    view = finder.findRequiredView(source, 2131427413, "field 'addButton'");
    target.addButton = finder.castView(view, 2131427413, "field 'addButton'");
    view = finder.findRequiredView(source, 2131427414, "field 'result'");
    target.result = finder.castView(view, 2131427414, "field 'result'");
  }

  @Override public void unbind(T target) {
    target.score = null;
    target.addButton = null;
    target.result = null;
  }
}
