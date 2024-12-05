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

/* renamed from: T4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1359a implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10386a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10387b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f10388c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10389d;

    private C1359a(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView) {
        this.f10386a = relativeLayout;
        this.f10387b = imageView;
        this.f10388c = relativeLayout2;
        this.f10389d = textView;
    }

    public static C1359a a(View view) {
        int i8 = R.id.iv_interstitial;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_interstitial);
        if (imageView != null) {
            i8 = R.id.rl_close_interstitial;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_close_interstitial);
            if (relativeLayout != null) {
                i8 = R.id.tv_download_interstitial;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_download_interstitial);
                if (textView != null) {
                    return new C1359a((RelativeLayout) view, imageView, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1359a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1359a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.ad_interstitial, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10386a;
    }
}
