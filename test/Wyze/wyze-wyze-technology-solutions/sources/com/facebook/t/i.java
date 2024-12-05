package com.facebook.t;

import com.facebook.internal.k;

/* compiled from: AppEventsManager.java */
/* loaded from: classes.dex */
public class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventsManager.java */
    /* loaded from: classes.dex */
    public static class a implements k.c {
        a() {
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                com.facebook.t.q.a.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventsManager.java */
    /* loaded from: classes.dex */
    public static class b implements k.c {
        b() {
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                com.facebook.t.w.a.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventsManager.java */
    /* loaded from: classes.dex */
    public static class c implements k.c {
        c() {
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                com.facebook.t.v.c.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventsManager.java */
    /* loaded from: classes.dex */
    public static class d implements k.c {
        d() {
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                com.facebook.t.s.a.a();
            }
        }
    }

    public static void a() {
        com.facebook.internal.k.a(k.d.AAM, new a());
        com.facebook.internal.k.a(k.d.RestrictiveDataFiltering, new b());
        com.facebook.internal.k.a(k.d.PrivacyProtection, new c());
        com.facebook.internal.k.a(k.d.EventDeactivation, new d());
    }
}
