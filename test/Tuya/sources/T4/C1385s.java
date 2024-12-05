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

/* renamed from: T4.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1385s implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10878a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10879b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10880c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10881d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10882e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10883f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10884g;

    private C1385s(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f10878a = relativeLayout;
        this.f10879b = imageView;
        this.f10880c = textView;
        this.f10881d = textView2;
        this.f10882e = textView3;
        this.f10883f = textView4;
        this.f10884g = textView5;
    }

    public static C1385s a(View view) {
        int i8 = R.id.iv_close_dialog_no_wifi_connection;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_dialog_no_wifi_connection);
        if (imageView != null) {
            i8 = R.id.tv_cancel_dialog_no_wifi_connection;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel_dialog_no_wifi_connection);
            if (textView != null) {
                i8 = R.id.tv_description_dialog_no_wifi_connection;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_dialog_no_wifi_connection);
                if (textView2 != null) {
                    i8 = R.id.tv_ok_dialog_no_wifi_connection;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ok_dialog_no_wifi_connection);
                    if (textView3 != null) {
                        i8 = R.id.tv_settings_dialog_no_wifi_connection;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_settings_dialog_no_wifi_connection);
                        if (textView4 != null) {
                            i8 = R.id.tv_title_dialog_no_wifi_connection;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_dialog_no_wifi_connection);
                            if (textView5 != null) {
                                return new C1385s((RelativeLayout) view, imageView, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1385s c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1385s d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_no_wifi_connection, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10878a;
    }
}
