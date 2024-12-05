package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1493q implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12467a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f12468b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12469c;

    private C1493q(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.f12467a = linearLayout;
        this.f12468b = recyclerView;
        this.f12469c = textView;
    }

    public static C1493q a(View view) {
        int i8 = R.id.rv_path;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_path);
        if (recyclerView != null) {
            i8 = R.id.tv_ok;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ok);
            if (textView != null) {
                return new C1493q((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1493q c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1493q d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_download_path, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12467a;
    }
}
