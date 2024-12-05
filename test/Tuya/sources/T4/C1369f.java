package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: T4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1369f implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10553a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10554b;

    /* renamed from: c, reason: collision with root package name */
    public final K f10555c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f10556d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f10557e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f10558f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10559g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10560h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10561i;

    private C1369f(RelativeLayout relativeLayout, ImageView imageView, K k8, RelativeLayout relativeLayout2, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f10553a = relativeLayout;
        this.f10554b = imageView;
        this.f10555c = k8;
        this.f10556d = relativeLayout2;
        this.f10557e = recyclerView;
        this.f10558f = toolbar;
        this.f10559g = textView;
        this.f10560h = textView2;
        this.f10561i = textView3;
    }

    public static C1369f a(View view) {
        int i8 = R.id.iv_logo_afa;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_afa);
        if (imageView != null) {
            i8 = R.id.loading_view_app_files;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_app_files);
            if (findChildViewById != null) {
                K a8 = K.a(findChildViewById);
                i8 = R.id.rl_header_afa;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_header_afa);
                if (relativeLayout != null) {
                    i8 = R.id.rv_app_files;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_app_files);
                    if (recyclerView != null) {
                        i8 = R.id.toolbar_afa;
                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_afa);
                        if (toolbar != null) {
                            i8 = R.id.tv_app_name_afa;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name_afa);
                            if (textView != null) {
                                i8 = R.id.tv_date_afa;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_afa);
                                if (textView2 != null) {
                                    i8 = R.id.tv_no_data_afa;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data_afa);
                                    if (textView3 != null) {
                                        return new C1369f((RelativeLayout) view, imageView, a8, relativeLayout, recyclerView, toolbar, textView, textView2, textView3);
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

    public static C1369f c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1369f d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.app_files_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10553a;
    }
}
