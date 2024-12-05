package y3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import t3.u;
import t3.v;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4205b implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f40923a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f40924b;

    /* renamed from: c, reason: collision with root package name */
    public final CircularProgressIndicator f40925c;

    /* renamed from: d, reason: collision with root package name */
    public final ComposeView f40926d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f40927e;

    private C4205b(View view, ImageView imageView, CircularProgressIndicator circularProgressIndicator, ComposeView composeView, ImageView imageView2) {
        this.f40923a = view;
        this.f40924b = imageView;
        this.f40925c = circularProgressIndicator;
        this.f40926d = composeView;
        this.f40927e = imageView2;
    }

    public static C4205b a(View view) {
        int i8 = u.f39740a;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = u.f39741b;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i8);
            if (circularProgressIndicator != null) {
                i8 = u.f39742c;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i8);
                if (composeView != null) {
                    i8 = u.f39743d;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
                    if (imageView2 != null) {
                        return new C4205b(view, imageView, circularProgressIndicator, composeView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C4205b b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(v.f39746b, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f40923a;
    }
}
