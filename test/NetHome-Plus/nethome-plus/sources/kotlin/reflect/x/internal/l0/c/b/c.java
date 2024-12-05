package kotlin.reflect.x.internal.l0.c.b;

import kotlin.jvm.internal.l;

/* compiled from: LookupTracker.kt */
/* loaded from: classes2.dex */
public interface c {

    /* compiled from: LookupTracker.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c {
        public static final a a = new a();

        private a() {
        }

        @Override // kotlin.reflect.x.internal.l0.c.b.c
        public boolean a() {
            return false;
        }

        @Override // kotlin.reflect.x.internal.l0.c.b.c
        public void b(String str, e eVar, String str2, f fVar, String str3) {
            l.f(str, "filePath");
            l.f(eVar, "position");
            l.f(str2, "scopeFqName");
            l.f(fVar, "scopeKind");
            l.f(str3, "name");
        }
    }

    boolean a();

    void b(String str, e eVar, String str2, f fVar, String str3);
}
