package Z3;

import T3.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13400a = new a();

    private a() {
    }

    public final void a(ProgressBar progressBar, q qVar) {
        String f8;
        AbstractC3159y.i(progressBar, "progressBar");
        if (qVar != null && (f8 = qVar.f()) != null) {
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor(f8)));
        }
    }

    public final SpannableString b(Context context, String text, T3.c customization) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(text, "text");
        AbstractC3159y.i(customization, "customization");
        SpannableString spannableString = new SpannableString(text);
        String k8 = customization.k();
        if (k8 != null) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(k8)), 0, spannableString.length(), 0);
        }
        Integer valueOf = Integer.valueOf(customization.o());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, valueOf.intValue(), context.getResources().getDisplayMetrics())), 0, spannableString.length(), 0);
        }
        String G8 = customization.G();
        if (G8 != null) {
            spannableString.setSpan(new TypefaceSpan(G8), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    public final int c(int i8) {
        return d(i8, 0.8f);
    }

    public final int d(int i8, float f8) {
        return Color.argb(Color.alpha(i8), Math.min(Math.max((int) (Color.red(i8) * f8), 0), 255), Math.min(Math.max((int) (Color.green(i8) * f8), 0), 255), Math.min(Math.max((int) (Color.blue(i8) * f8), 0), 255));
    }

    public final void e(AppCompatActivity activity, int i8) {
        AbstractC3159y.i(activity, "activity");
        activity.getWindow().setStatusBarColor(i8);
    }
}
