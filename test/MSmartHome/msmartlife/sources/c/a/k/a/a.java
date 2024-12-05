package c.a.k.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.g0;
import java.util.WeakHashMap;

/* compiled from: AppCompatResources.java */
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<C0047a>> f2250b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f2251c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatResources.java */
    /* renamed from: c.a.k.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0047a {
        final ColorStateList a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f2252b;

        C0047a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.f2252b = configuration;
        }
    }

    private static void a(Context context, int i2, ColorStateList colorStateList) {
        synchronized (f2251c) {
            WeakHashMap<Context, SparseArray<C0047a>> weakHashMap = f2250b;
            SparseArray<C0047a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i2, new C0047a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static ColorStateList b(Context context, int i2) {
        C0047a c0047a;
        synchronized (f2251c) {
            SparseArray<C0047a> sparseArray = f2250b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0047a = sparseArray.get(i2)) != null) {
                if (c0047a.f2252b.equals(context.getResources().getConfiguration())) {
                    return c0047a.a;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    public static ColorStateList c(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        ColorStateList b2 = b(context, i2);
        if (b2 != null) {
            return b2;
        }
        ColorStateList f2 = f(context, i2);
        if (f2 != null) {
            a(context, i2, f2);
            return f2;
        }
        return androidx.core.content.a.d(context, i2);
    }

    public static Drawable d(Context context, int i2) {
        return g0.h().j(context, i2);
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList f(Context context, int i2) {
        if (g(context, i2)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return androidx.core.content.d.a.a(resources, resources.getXml(i2), context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean g(Context context, int i2) {
        Resources resources = context.getResources();
        TypedValue e2 = e();
        resources.getValue(i2, e2, true);
        int i3 = e2.type;
        return i3 >= 28 && i3 <= 31;
    }
}
