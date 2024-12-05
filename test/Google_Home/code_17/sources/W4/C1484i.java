package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.views.FullWidthImageView;

/* renamed from: W4.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1484i implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12346a;

    /* renamed from: b, reason: collision with root package name */
    public final FullWidthImageView f12347b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12348c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f12349d;

    private C1484i(RelativeLayout relativeLayout, FullWidthImageView fullWidthImageView, TextView textView, TextView textView2) {
        this.f12346a = relativeLayout;
        this.f12347b = fullWidthImageView;
        this.f12348c = textView;
        this.f12349d = textView2;
    }

    public static C1484i a(View view) {
        int i8 = R.id.iv_image_article;
        FullWidthImageView fullWidthImageView = (FullWidthImageView) ViewBindings.findChildViewById(view, R.id.iv_image_article);
        if (fullWidthImageView != null) {
            i8 = R.id.tv_date_article;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_article);
            if (textView != null) {
                i8 = R.id.tv_desc_article;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_article);
                if (textView2 != null) {
                    return new C1484i((RelativeLayout) view, fullWidthImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1484i c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1484i d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.article, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12346a;
    }
}
