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

/* loaded from: classes4.dex */
public final class T implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10324a;

    /* renamed from: b, reason: collision with root package name */
    public final K f10325b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f10326c;

    /* renamed from: d, reason: collision with root package name */
    public final Toolbar f10327d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10328e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10329f;

    private T(RelativeLayout relativeLayout, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f10324a = relativeLayout;
        this.f10325b = k8;
        this.f10326c = recyclerView;
        this.f10327d = toolbar;
        this.f10328e = textView;
        this.f10329f = textView2;
    }

    public static T a(View view) {
        int i8 = R.id.loading_view_old_versions;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_old_versions);
        if (findChildViewById != null) {
            K a8 = K.a(findChildViewById);
            i8 = R.id.rv_old_versions;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_old_versions);
            if (recyclerView != null) {
                i8 = R.id.toolbar_old_versions;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_old_versions);
                if (toolbar != null) {
                    i8 = R.id.tv_no_data_old_version;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data_old_version);
                    if (textView != null) {
                        i8 = R.id.tv_toolbar_old_versions;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_old_versions);
                        if (textView2 != null) {
                            return new T((RelativeLayout) view, a8, recyclerView, toolbar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static T c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static T d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.old_versions_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10324a;
    }
}
