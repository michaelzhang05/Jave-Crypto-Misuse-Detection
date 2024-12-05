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

/* renamed from: T4.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1388v implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10933a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10934b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10935c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10936d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10937e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10938f;

    private C1388v(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f10933a = relativeLayout;
        this.f10934b = imageView;
        this.f10935c = textView;
        this.f10936d = textView2;
        this.f10937e = textView3;
        this.f10938f = textView4;
    }

    public static C1388v a(View view) {
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
                            return new C1388v((RelativeLayout) view, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1388v c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1388v d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_pre_register, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10933a;
    }
}
