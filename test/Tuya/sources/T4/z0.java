package T4;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class z0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f11038a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f11039b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f11040c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f11041d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f11042e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f11043f;

    /* renamed from: g, reason: collision with root package name */
    public final View f11044g;

    private z0(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2, View view) {
        this.f11038a = relativeLayout;
        this.f11039b = imageView;
        this.f11040c = relativeLayout2;
        this.f11041d = relativeLayout3;
        this.f11042e = textView;
        this.f11043f = textView2;
        this.f11044g = view;
    }

    public static z0 a(View view) {
        int i8 = R.id.iv_ufc;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_ufc);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i8 = R.id.rl_notifier_ufc;
            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_notifier_ufc);
            if (relativeLayout2 != null) {
                i8 = R.id.tv_label_ufc;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_ufc);
                if (textView != null) {
                    i8 = R.id.tv_notifier_ufc;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_notifier_ufc);
                    if (textView2 != null) {
                        i8 = R.id.v_ref_center;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_ref_center);
                        if (findChildViewById != null) {
                            return new z0(relativeLayout, imageView, relativeLayout, relativeLayout2, textView, textView2, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f11038a;
    }
}
