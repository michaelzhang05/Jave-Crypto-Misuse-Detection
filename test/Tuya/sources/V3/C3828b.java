package v3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import q3.u;
import q3.v;

/* renamed from: v3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3828b implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f38792a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f38793b;

    /* renamed from: c, reason: collision with root package name */
    public final CircularProgressIndicator f38794c;

    /* renamed from: d, reason: collision with root package name */
    public final ComposeView f38795d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f38796e;

    private C3828b(View view, ImageView imageView, CircularProgressIndicator circularProgressIndicator, ComposeView composeView, ImageView imageView2) {
        this.f38792a = view;
        this.f38793b = imageView;
        this.f38794c = circularProgressIndicator;
        this.f38795d = composeView;
        this.f38796e = imageView2;
    }

    public static C3828b a(View view) {
        int i8 = u.f37418a;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = u.f37419b;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i8);
            if (circularProgressIndicator != null) {
                i8 = u.f37420c;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i8);
                if (composeView != null) {
                    i8 = u.f37421d;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
                    if (imageView2 != null) {
                        return new C3828b(view, imageView, circularProgressIndicator, composeView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C3828b b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(v.f37424b, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f38792a;
    }
}
