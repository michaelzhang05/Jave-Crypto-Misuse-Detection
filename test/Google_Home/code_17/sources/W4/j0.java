package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class j0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12362a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f12363b;

    /* renamed from: c, reason: collision with root package name */
    public final K f12364c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f12365d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f12366e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f12367f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12368g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12369h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f12370i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f12371j;

    private j0(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, K k8, LinearLayout linearLayout, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f12362a = relativeLayout;
        this.f12363b = appCompatImageView;
        this.f12364c = k8;
        this.f12365d = linearLayout;
        this.f12366e = recyclerView;
        this.f12367f = toolbar;
        this.f12368g = textView;
        this.f12369h = textView2;
        this.f12370i = textView3;
        this.f12371j = textView4;
    }

    public static j0 a(View view) {
        int i8 = R.id.iv_positives;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.iv_positives);
        if (appCompatImageView != null) {
            i8 = R.id.loading_view_security;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_security);
            if (findChildViewById != null) {
                K a8 = K.a(findChildViewById);
                i8 = R.id.rl_free_positives;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rl_free_positives);
                if (linearLayout != null) {
                    i8 = R.id.rv_positives;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_positives);
                    if (recyclerView != null) {
                        i8 = R.id.toolbar_positives;
                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_positives);
                        if (toolbar != null) {
                            i8 = R.id.tv_button_analysis_free_positives;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_button_analysis_free_positives);
                            if (textView != null) {
                                i8 = R.id.tv_last_analysis_free_positives;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_analysis_free_positives);
                                if (textView2 != null) {
                                    i8 = R.id.tv_title_free_positives;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_free_positives);
                                    if (textView3 != null) {
                                        i8 = R.id.tv_toolbar_title_positives;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title_positives);
                                        if (textView4 != null) {
                                            return new j0((RelativeLayout) view, appCompatImageView, a8, linearLayout, recyclerView, toolbar, textView, textView2, textView3, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static j0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static j0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.security_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12362a;
    }
}
