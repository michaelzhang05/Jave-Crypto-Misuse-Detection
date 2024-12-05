package d4;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import c4.C2043a;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: d4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2749m {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31205b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final FragmentActivity f31206a;

    /* renamed from: d4.m$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final void a(AppCompatActivity activity, W3.p toolbarCustomization) {
            AbstractC3255y.i(activity, "activity");
            AbstractC3255y.i(toolbarCustomization, "toolbarCustomization");
            if (toolbarCustomization.a() != null) {
                C2043a.f15724a.e(activity, Color.parseColor(toolbarCustomization.a()));
            } else if (toolbarCustomization.g() != null) {
                int parseColor = Color.parseColor(toolbarCustomization.g());
                C2043a c2043a = C2043a.f15724a;
                c2043a.e(activity, c2043a.c(parseColor));
            }
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C2749m(FragmentActivity activity) {
        AbstractC3255y.i(activity, "activity");
        this.f31206a = activity;
    }

    public final ThreeDS2Button a(W3.p pVar, W3.b bVar) {
        AppCompatActivity appCompatActivity;
        ActionBar supportActionBar;
        String string;
        FragmentActivity fragmentActivity = this.f31206a;
        ThreeDS2Button threeDS2Button = null;
        if (fragmentActivity instanceof AppCompatActivity) {
            appCompatActivity = (AppCompatActivity) fragmentActivity;
        } else {
            appCompatActivity = null;
        }
        if (appCompatActivity != null && (supportActionBar = appCompatActivity.getSupportActionBar()) != null) {
            threeDS2Button = new ThreeDS2Button(new ContextThemeWrapper(this.f31206a, S3.g.f9816a), null, 0, 6, null);
            threeDS2Button.setBackgroundTintList(ColorStateList.valueOf(0));
            threeDS2Button.setButtonCustomization(bVar);
            supportActionBar.setCustomView(threeDS2Button, new ActionBar.LayoutParams(-2, -2, 8388629));
            supportActionBar.setDisplayShowCustomEnabled(true);
            if (pVar != null) {
                String v8 = pVar.v();
                if (v8 != null && !j6.n.u(v8)) {
                    threeDS2Button.setText(pVar.v());
                } else {
                    threeDS2Button.setText(S3.f.f9814g);
                }
                String g8 = pVar.g();
                if (g8 != null) {
                    supportActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(g8)));
                    f31205b.a(appCompatActivity, pVar);
                }
                String h8 = pVar.h();
                if (h8 != null && !j6.n.u(h8)) {
                    string = pVar.h();
                    AbstractC3255y.f(string);
                } else {
                    string = this.f31206a.getString(S3.f.f9815h);
                    AbstractC3255y.f(string);
                }
                supportActionBar.setTitle(C2043a.f15724a.b(this.f31206a, string, pVar));
            } else {
                supportActionBar.setTitle(S3.f.f9815h);
                threeDS2Button.setText(S3.f.f9814g);
            }
        }
        return threeDS2Button;
    }
}
