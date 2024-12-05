package a4;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: a4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1569m {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13542b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final FragmentActivity f13543a;

    /* renamed from: a4.m$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final void a(AppCompatActivity activity, T3.p toolbarCustomization) {
            AbstractC3159y.i(activity, "activity");
            AbstractC3159y.i(toolbarCustomization, "toolbarCustomization");
            if (toolbarCustomization.b() != null) {
                Z3.a.f13400a.e(activity, Color.parseColor(toolbarCustomization.b()));
            } else if (toolbarCustomization.e() != null) {
                int parseColor = Color.parseColor(toolbarCustomization.e());
                Z3.a aVar = Z3.a.f13400a;
                aVar.e(activity, aVar.c(parseColor));
            }
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1569m(FragmentActivity activity) {
        AbstractC3159y.i(activity, "activity");
        this.f13543a = activity;
    }

    public final ThreeDS2Button a(T3.p pVar, T3.b bVar) {
        AppCompatActivity appCompatActivity;
        ActionBar supportActionBar;
        String string;
        FragmentActivity fragmentActivity = this.f13543a;
        ThreeDS2Button threeDS2Button = null;
        if (fragmentActivity instanceof AppCompatActivity) {
            appCompatActivity = (AppCompatActivity) fragmentActivity;
        } else {
            appCompatActivity = null;
        }
        if (appCompatActivity != null && (supportActionBar = appCompatActivity.getSupportActionBar()) != null) {
            threeDS2Button = new ThreeDS2Button(new ContextThemeWrapper(this.f13543a, P3.g.f7985a), null, 0, 6, null);
            threeDS2Button.setBackgroundTintList(ColorStateList.valueOf(0));
            threeDS2Button.setButtonCustomization(bVar);
            supportActionBar.setCustomView(threeDS2Button, new ActionBar.LayoutParams(-2, -2, 8388629));
            supportActionBar.setDisplayShowCustomEnabled(true);
            if (pVar != null) {
                String s8 = pVar.s();
                if (s8 != null && !g6.n.u(s8)) {
                    threeDS2Button.setText(pVar.s());
                } else {
                    threeDS2Button.setText(P3.f.f7983g);
                }
                String e8 = pVar.e();
                if (e8 != null) {
                    supportActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(e8)));
                    f13542b.a(appCompatActivity, pVar);
                }
                String f8 = pVar.f();
                if (f8 != null && !g6.n.u(f8)) {
                    string = pVar.f();
                    AbstractC3159y.f(string);
                } else {
                    string = this.f13543a.getString(P3.f.f7984h);
                    AbstractC3159y.f(string);
                }
                supportActionBar.setTitle(Z3.a.f13400a.b(this.f13543a, string, pVar));
            } else {
                supportActionBar.setTitle(P3.f.f7984h);
                threeDS2Button.setText(P3.f.f7983g);
            }
        }
        return threeDS2Button;
    }
}
