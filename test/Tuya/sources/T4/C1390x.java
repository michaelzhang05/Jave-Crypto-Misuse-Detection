package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: T4.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1390x implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10957a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10958b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10959c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10960d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10961e;

    private C1390x(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.f10957a = relativeLayout;
        this.f10958b = imageView;
        this.f10959c = textView;
        this.f10960d = textView2;
        this.f10961e = textView3;
    }

    public static C1390x a(View view) {
        int i8 = R.id.iv_close_dialog_turbo_positives_detected;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_dialog_turbo_positives_detected);
        if (imageView != null) {
            i8 = R.id.tv_action_dialog_turbo_positives_detected;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_dialog_turbo_positives_detected);
            if (textView != null) {
                i8 = R.id.tv_description_dialog_turbo_positives_detected;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_dialog_turbo_positives_detected);
                if (textView2 != null) {
                    i8 = R.id.tv_title_dialog_turbo_positives_detected;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_dialog_turbo_positives_detected);
                    if (textView3 != null) {
                        return new C1390x((RelativeLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1390x c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1390x d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_turbo_positives_detected, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10957a;
    }
}
