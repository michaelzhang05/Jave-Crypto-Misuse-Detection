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

/* loaded from: classes5.dex */
public final class q0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12470a;

    /* renamed from: b, reason: collision with root package name */
    public final K f12471b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f12472c;

    /* renamed from: d, reason: collision with root package name */
    public final Toolbar f12473d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12474e;

    private q0(RelativeLayout relativeLayout, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView) {
        this.f12470a = relativeLayout;
        this.f12471b = k8;
        this.f12472c = recyclerView;
        this.f12473d = toolbar;
        this.f12474e = textView;
    }

    public static q0 a(View view) {
        int i8 = R.id.loading_view_updates;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_updates);
        if (findChildViewById != null) {
            K a8 = K.a(findChildViewById);
            i8 = R.id.rv_updates;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_updates);
            if (recyclerView != null) {
                i8 = R.id.toolbar_updates;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_updates);
                if (toolbar != null) {
                    i8 = R.id.tv_toolbar_title_updates;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title_updates);
                    if (textView != null) {
                        return new q0((RelativeLayout) view, a8, recyclerView, toolbar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static q0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static q0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.updates, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12470a;
    }
}
