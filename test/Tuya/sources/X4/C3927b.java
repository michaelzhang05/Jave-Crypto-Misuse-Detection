package x4;

import r2.f;

/* renamed from: x4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3927b {

    /* renamed from: c, reason: collision with root package name */
    private static InterfaceC3926a f39490c;

    /* renamed from: a, reason: collision with root package name */
    public static final C3927b f39488a = new C3927b();

    /* renamed from: b, reason: collision with root package name */
    private static final a f39489b = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final int f39491d = 8;

    /* renamed from: x4.b$a */
    /* loaded from: classes4.dex */
    private static final class a implements InterfaceC3926a {
        @Override // x4.InterfaceC3926a
        public String a(int i8, String str, f fVar) {
            if (str == null) {
                return "";
            }
            return str;
        }
    }

    private C3927b() {
    }

    public final InterfaceC3926a a() {
        InterfaceC3926a interfaceC3926a = f39490c;
        if (interfaceC3926a == null) {
            return f39489b;
        }
        return interfaceC3926a;
    }
}
