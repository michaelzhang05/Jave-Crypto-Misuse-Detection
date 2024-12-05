package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1481g0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12259a;

    /* renamed from: b, reason: collision with root package name */
    public final K f12260b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f12261c;

    /* renamed from: d, reason: collision with root package name */
    public final Toolbar f12262d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12263e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12264f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12265g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12266h;

    private C1481g0(RelativeLayout relativeLayout, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f12259a = relativeLayout;
        this.f12260b = k8;
        this.f12261c = recyclerView;
        this.f12262d = toolbar;
        this.f12263e = textView;
        this.f12264f = textView2;
        this.f12265g = textView3;
        this.f12266h = textView4;
    }

    public static C1481g0 a(View view) {
        int i8 = R.id.loading_view_rollback;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_rollback);
        if (findChildViewById != null) {
            K a8 = K.a(findChildViewById);
            i8 = R.id.recyclerview;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerview);
            if (recyclerView != null) {
                i8 = R.id.toolbar_rollback;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_rollback);
                if (toolbar != null) {
                    i8 = R.id.tv_gdpr_button_rollback;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gdpr_button_rollback);
                    if (textView != null) {
                        i8 = R.id.tv_no_items;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_items);
                        if (textView2 != null) {
                            i8 = R.id.tv_subtitle_rollback;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_subtitle_rollback);
                            if (textView3 != null) {
                                i8 = R.id.tv_title_rollback;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_rollback);
                                if (textView4 != null) {
                                    return new C1481g0((RelativeLayout) view, a8, recyclerView, toolbar, textView, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1481g0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1481g0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.rollback_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12259a;
    }
}
