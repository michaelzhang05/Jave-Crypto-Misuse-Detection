package com.facebook.internal.a0;

import com.facebook.f;
import com.facebook.internal.k;

/* compiled from: InstrumentManager.java */
/* loaded from: classes.dex */
public class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InstrumentManager.java */
    /* loaded from: classes.dex */
    public static class a implements k.c {
        a() {
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                com.facebook.internal.a0.e.a.a();
                if (k.g(k.d.CrashShield)) {
                    com.facebook.internal.a0.a.a();
                    com.facebook.internal.a0.f.a.a();
                }
                if (k.g(k.d.ThreadCheck)) {
                    com.facebook.internal.a0.h.a.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InstrumentManager.java */
    /* loaded from: classes.dex */
    public static class b implements k.c {
        b() {
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                com.facebook.internal.a0.g.b.a();
            }
        }
    }

    public static void a() {
        if (f.i()) {
            k.a(k.d.CrashReport, new a());
            k.a(k.d.ErrorReport, new b());
        }
    }
}
