package T4;

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

/* renamed from: T4.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1372g0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10602a;

    /* renamed from: b, reason: collision with root package name */
    public final K f10603b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f10604c;

    /* renamed from: d, reason: collision with root package name */
    public final Toolbar f10605d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10606e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10607f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10608g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10609h;

    private C1372g0(RelativeLayout relativeLayout, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f10602a = relativeLayout;
        this.f10603b = k8;
        this.f10604c = recyclerView;
        this.f10605d = toolbar;
        this.f10606e = textView;
        this.f10607f = textView2;
        this.f10608g = textView3;
        this.f10609h = textView4;
    }

    public static C1372g0 a(View view) {
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
                                    return new C1372g0((RelativeLayout) view, a8, recyclerView, toolbar, textView, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1372g0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1372g0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.rollback_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10602a;
    }
}
