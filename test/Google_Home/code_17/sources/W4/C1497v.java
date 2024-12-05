package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1497v implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12590a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12591b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12592c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12593d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12594e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12595f;

    private C1497v(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f12590a = relativeLayout;
        this.f12591b = imageView;
        this.f12592c = textView;
        this.f12593d = textView2;
        this.f12594e = textView3;
        this.f12595f = textView4;
    }

    public static C1497v a(View view) {
        int i8 = R.id.iv_close_dialog_pre_register;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_dialog_pre_register);
        if (imageView != null) {
            i8 = R.id.tv_cancel_dialog_pre_register;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel_dialog_pre_register);
            if (textView != null) {
                i8 = R.id.tv_description_dialog_pre_register;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_dialog_pre_register);
                if (textView2 != null) {
                    i8 = R.id.tv_ok_dialog_pre_register;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ok_dialog_pre_register);
                    if (textView3 != null) {
                        i8 = R.id.tv_title_dialog_pre_register;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_dialog_pre_register);
                        if (textView4 != null) {
                            return new C1497v((RelativeLayout) view, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1497v c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1497v d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_pre_register, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12590a;
    }
}
