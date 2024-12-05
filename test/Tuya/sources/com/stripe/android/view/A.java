package com.stripe.android.view;

/* loaded from: classes4.dex */
public interface A {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27109a = new a("CardNumber", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f27110b = new a("ExpiryDate", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f27111c = new a("Cvc", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f27112d = new a("PostalCode", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f27113e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f27114f;

        static {
            a[] a8 = a();
            f27113e = a8;
            f27114f = R5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f27109a, f27110b, f27111c, f27112d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f27113e.clone();
        }
    }

    void a();

    void b();

    void c();

    void d(a aVar);

    void e();
}
