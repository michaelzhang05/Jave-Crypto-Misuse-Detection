package c;

import android.content.Context;
import android.content.Intent;
import f5.f;
import f5.h;

/* loaded from: classes.dex */
public final class c extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3839a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @Override // c.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent intent) {
        h.e(context, "context");
        h.e(intent, "input");
        return intent;
    }

    @Override // c.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.activity.result.a c(int i6, Intent intent) {
        return new androidx.activity.result.a(i6, intent);
    }
}
