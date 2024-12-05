package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.h;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.k {

    /* renamed from: b, reason: collision with root package name */
    private static int f117b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f118c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f119d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f120e;

    /* renamed from: a, reason: collision with root package name */
    private Activity f121a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f121a = activity;
    }

    private static void h() {
        try {
            f117b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f119d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f120e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f118c = declaredField3;
            declaredField3.setAccessible(true);
            f117b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.k
    public void d(androidx.lifecycle.m mVar, h.a aVar) {
        if (aVar != h.a.ON_DESTROY) {
            return;
        }
        if (f117b == 0) {
            h();
        }
        if (f117b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f121a.getSystemService("input_method");
            try {
                Object obj = f118c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f119d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f120e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
