package c;

import android.content.Context;
import android.content.Intent;
import f5.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0067a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f3837a;

        public C0067a(Object obj) {
            this.f3837a = obj;
        }

        public final Object a() {
            return this.f3837a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0067a b(Context context, Object obj) {
        h.e(context, "context");
        return null;
    }

    public abstract Object c(int i6, Intent intent);
}
