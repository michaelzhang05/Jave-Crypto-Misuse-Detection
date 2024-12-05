package androidx.work;

import android.os.Build;
import androidx.work.z;

/* compiled from: OneTimeWorkRequest.java */
/* loaded from: classes.dex */
public final class p extends z {

    /* compiled from: OneTimeWorkRequest.java */
    /* loaded from: classes.dex */
    public static final class a extends z.a<a, p> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f2164c.f2021f = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.z.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public p c() {
            if (this.a && Build.VERSION.SDK_INT >= 23 && this.f2164c.l.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new p(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.z.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }

    p(a aVar) {
        super(aVar.f2163b, aVar.f2164c, aVar.f2165d);
    }

    public static p d(Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }
}
