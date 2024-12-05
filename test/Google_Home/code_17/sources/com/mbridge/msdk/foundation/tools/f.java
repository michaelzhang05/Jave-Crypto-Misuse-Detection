package com.mbridge.msdk.foundation.tools;

/* loaded from: classes4.dex */
final class f {

    /* loaded from: classes4.dex */
    static class a extends j {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i8, int i9, Object obj, int i10, boolean z8) {
            super(i8, i9, obj, i10, z8);
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        final byte a() {
            return (byte) 7;
        }
    }

    /* loaded from: classes4.dex */
    static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        int f21124a;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract byte a();
    }

    /* loaded from: classes4.dex */
    static class c extends b {

        /* renamed from: b, reason: collision with root package name */
        boolean f21125b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(int i8, boolean z8) {
            this.f21124a = i8;
            this.f21125b = z8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 1;
        }
    }

    /* loaded from: classes4.dex */
    static class d extends b {

        /* renamed from: b, reason: collision with root package name */
        double f21126b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(int i8, double d8) {
            this.f21124a = i8;
            this.f21126b = d8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 5;
        }
    }

    /* loaded from: classes4.dex */
    static class e extends b {

        /* renamed from: b, reason: collision with root package name */
        float f21127b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(int i8, float f8) {
            this.f21124a = i8;
            this.f21127b = f8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 3;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0402f extends b {

        /* renamed from: b, reason: collision with root package name */
        int f21128b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0402f(int i8, int i9) {
            this.f21124a = i8;
            this.f21128b = i9;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 2;
        }
    }

    /* loaded from: classes4.dex */
    static class g extends b {

        /* renamed from: b, reason: collision with root package name */
        long f21129b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(int i8, long j8) {
            this.f21124a = i8;
            this.f21129b = j8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 4;
        }
    }

    /* loaded from: classes4.dex */
    static class h extends j {
        /* JADX INFO: Access modifiers changed from: package-private */
        public h(int i8, int i9, Object obj, int i10, boolean z8) {
            super(i8, i9, obj, i10, z8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 8;
        }
    }

    /* loaded from: classes4.dex */
    static class i extends j {
        /* JADX INFO: Access modifiers changed from: package-private */
        public i(int i8, int i9, String str, int i10, boolean z8) {
            super(i8, i9, str, i10, z8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 6;
        }
    }

    /* loaded from: classes4.dex */
    static abstract class j extends b {

        /* renamed from: b, reason: collision with root package name */
        boolean f21130b;

        /* renamed from: c, reason: collision with root package name */
        int f21131c;

        /* renamed from: d, reason: collision with root package name */
        Object f21132d;

        /* renamed from: e, reason: collision with root package name */
        int f21133e;

        j(int i8, int i9, Object obj, int i10, boolean z8) {
            this.f21131c = i8;
            this.f21124a = i9;
            this.f21132d = obj;
            this.f21133e = i10;
            this.f21130b = z8;
        }
    }
}
