package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class A implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10012a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10013b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10014c;

    private A(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f10012a = linearLayout;
        this.f10013b = textView;
        this.f10014c = textView2;
    }

    public static A a(View view) {
        int i8 = R.id.tv_answer_faq;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_answer_faq);
        if (textView != null) {
            i8 = R.id.tv_question_faq;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_question_faq);
            if (textView2 != null) {
                return new A((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static A c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static A d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.faq, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f10012a;
    }
}
