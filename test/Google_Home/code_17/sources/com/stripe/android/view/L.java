package com.stripe.android.view;

/* loaded from: classes4.dex */
public interface L {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28458a = new a("Number", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f28459b = new a("Expiry", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f28460c = new a("Cvc", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f28461d = new a("Postal", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f28462e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f28463f;

        static {
            a[] a8 = a();
            f28462e = a8;
            f28463f = U5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f28458a, f28459b, f28460c, f28461d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f28462e.clone();
        }
    }
}
