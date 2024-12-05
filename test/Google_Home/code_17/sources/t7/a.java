package T7;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes5.dex */
public class a extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f10170a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f10171b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f10172c;

    /* renamed from: d, reason: collision with root package name */
    public ConstraintLayout f10173d;

    /* renamed from: e, reason: collision with root package name */
    public SearchView f10174e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f10175f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f10176g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f10177h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f10178i;

    /* renamed from: j, reason: collision with root package name */
    public M7.c f10179j;

    /* renamed from: k, reason: collision with root package name */
    public Typeface f10180k;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f10181l;

    public final void h() {
        int i8;
        SearchView searchView = this.f10174e;
        if (searchView != null) {
            int i9 = searchView.getContext().getResources().getConfiguration().uiMode & 48;
            Context context = searchView.getContext();
            if (i9 == 32) {
                i8 = L1.a.f5734e;
            } else {
                i8 = L1.a.f5735f;
            }
            searchView.setBackgroundTintList(ContextCompat.getColorStateList(context, i8));
        }
    }

    public final void i() {
        ImageView imageView = this.f10172c;
        if (imageView != null) {
            imageView.setImageTintList(j());
        }
        ImageView imageView2 = this.f10178i;
        if (imageView2 != null) {
            imageView2.setImageTintList(j());
        }
        TextView textView = this.f10171b;
        if (textView != null) {
            textView.setTextColor(j());
        }
    }

    public final ColorStateList j() {
        int i8;
        int i9 = requireContext().getResources().getConfiguration().uiMode & 48;
        Context requireContext = requireContext();
        if (i9 == 32) {
            i8 = L1.a.f5733d;
        } else {
            i8 = L1.a.f5730a;
        }
        return ContextCompat.getColorStateList(requireContext, i8);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i8;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 29) {
            i8 = R.style.Theme.DeviceDefault.DayNight;
        } else {
            i8 = R.style.Theme.Material.Light.DarkActionBar;
        }
        setStyle(1, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.a.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
