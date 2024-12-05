package n6;

import a6.InterfaceC1668n;
import h6.InterfaceC2965e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C3252v;
import l6.InterfaceC3372o;
import q6.C3865F;
import q6.I;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final j f35582a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f35583b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f35584c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3865F f35585d;

    /* renamed from: e, reason: collision with root package name */
    private static final C3865F f35586e;

    /* renamed from: f, reason: collision with root package name */
    private static final C3865F f35587f;

    /* renamed from: g, reason: collision with root package name */
    private static final C3865F f35588g;

    /* renamed from: h, reason: collision with root package name */
    private static final C3865F f35589h;

    /* renamed from: i, reason: collision with root package name */
    private static final C3865F f35590i;

    /* renamed from: j, reason: collision with root package name */
    private static final C3865F f35591j;

    /* renamed from: k, reason: collision with root package name */
    private static final C3865F f35592k;

    /* renamed from: l, reason: collision with root package name */
    private static final C3865F f35593l;

    /* renamed from: m, reason: collision with root package name */
    private static final C3865F f35594m;

    /* renamed from: n, reason: collision with root package name */
    private static final C3865F f35595n;

    /* renamed from: o, reason: collision with root package name */
    private static final C3865F f35596o;

    /* renamed from: p, reason: collision with root package name */
    private static final C3865F f35597p;

    /* renamed from: q, reason: collision with root package name */
    private static final C3865F f35598q;

    /* renamed from: r, reason: collision with root package name */
    private static final C3865F f35599r;

    /* renamed from: s, reason: collision with root package name */
    private static final C3865F f35600s;

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends C3252v implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35601a = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final j d(long j8, j jVar) {
            return c.x(j8, jVar);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d(((Number) obj).longValue(), (j) obj2);
        }
    }

    static {
        int e8;
        int e9;
        e8 = I.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f35583b = e8;
        e9 = I.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f35584c = e9;
        f35585d = new C3865F("BUFFERED");
        f35586e = new C3865F("SHOULD_BUFFER");
        f35587f = new C3865F("S_RESUMING_BY_RCV");
        f35588g = new C3865F("RESUMING_BY_EB");
        f35589h = new C3865F("POISONED");
        f35590i = new C3865F("DONE_RCV");
        f35591j = new C3865F("INTERRUPTED_SEND");
        f35592k = new C3865F("INTERRUPTED_RCV");
        f35593l = new C3865F("CHANNEL_CLOSED");
        f35594m = new C3865F("SUSPEND");
        f35595n = new C3865F("SUSPEND_NO_WAITER");
        f35596o = new C3865F("FAILED");
        f35597p = new C3865F("NO_RECEIVE_RESULT");
        f35598q = new C3865F("CLOSE_HANDLER_CLOSED");
        f35599r = new C3865F("CLOSE_HANDLER_INVOKED");
        f35600s = new C3865F("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i8) {
        if (i8 != 0) {
            if (i8 != Integer.MAX_VALUE) {
                return i8;
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC3372o interfaceC3372o, Object obj, Function1 function1) {
        Object k8 = interfaceC3372o.k(obj, null, function1);
        if (k8 != null) {
            interfaceC3372o.B(k8);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean C(InterfaceC3372o interfaceC3372o, Object obj, Function1 function1, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        return B(interfaceC3372o, obj, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j8, boolean z8) {
        long j9;
        if (z8) {
            j9 = 4611686018427387904L;
        } else {
            j9 = 0;
        }
        return j9 + j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j8, int i8) {
        return (i8 << 60) + j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j x(long j8, j jVar) {
        return new j(j8, jVar, jVar.u(), 0);
    }

    public static final InterfaceC2965e y() {
        return a.f35601a;
    }

    public static final C3865F z() {
        return f35593l;
    }
}
