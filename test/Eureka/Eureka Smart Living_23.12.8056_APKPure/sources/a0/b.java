package a0;

import android.text.Editable;
import androidx.emoji2.text.n;

/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f6a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f7b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f8c;

    private b() {
        try {
            f8c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f7b == null) {
            synchronized (f6a) {
                if (f7b == null) {
                    f7b = new b();
                }
            }
        }
        return f7b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f8c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
