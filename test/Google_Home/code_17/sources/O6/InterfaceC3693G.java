package o6;

/* renamed from: o6.G */
/* loaded from: classes5.dex */
public interface InterfaceC3693G {

    /* renamed from: a */
    public static final a f36586a = a.f36587a;

    /* renamed from: o6.G$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f36587a = new a();

        /* renamed from: b */
        private static final InterfaceC3693G f36588b = new C3695I();

        /* renamed from: c */
        private static final InterfaceC3693G f36589c = new C3696J();

        private a() {
        }

        public static /* synthetic */ InterfaceC3693G b(a aVar, long j8, long j9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                j8 = 0;
            }
            if ((i8 & 2) != 0) {
                j9 = Long.MAX_VALUE;
            }
            return aVar.a(j8, j9);
        }

        public final InterfaceC3693G a(long j8, long j9) {
            return new C3697K(j8, j9);
        }

        public final InterfaceC3693G c() {
            return f36588b;
        }

        public final InterfaceC3693G d() {
            return f36589c;
        }
    }

    InterfaceC3706f a(InterfaceC3698L interfaceC3698L);
}
