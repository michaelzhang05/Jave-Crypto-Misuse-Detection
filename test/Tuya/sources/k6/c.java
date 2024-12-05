package k6;

import e6.InterfaceC2645e;
import i6.InterfaceC2837o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C3156v;
import n6.C3486F;
import n6.I;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final j f33590a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f33591b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f33592c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3486F f33593d;

    /* renamed from: e, reason: collision with root package name */
    private static final C3486F f33594e;

    /* renamed from: f, reason: collision with root package name */
    private static final C3486F f33595f;

    /* renamed from: g, reason: collision with root package name */
    private static final C3486F f33596g;

    /* renamed from: h, reason: collision with root package name */
    private static final C3486F f33597h;

    /* renamed from: i, reason: collision with root package name */
    private static final C3486F f33598i;

    /* renamed from: j, reason: collision with root package name */
    private static final C3486F f33599j;

    /* renamed from: k, reason: collision with root package name */
    private static final C3486F f33600k;

    /* renamed from: l, reason: collision with root package name */
    private static final C3486F f33601l;

    /* renamed from: m, reason: collision with root package name */
    private static final C3486F f33602m;

    /* renamed from: n, reason: collision with root package name */
    private static final C3486F f33603n;

    /* renamed from: o, reason: collision with root package name */
    private static final C3486F f33604o;

    /* renamed from: p, reason: collision with root package name */
    private static final C3486F f33605p;

    /* renamed from: q, reason: collision with root package name */
    private static final C3486F f33606q;

    /* renamed from: r, reason: collision with root package name */
    private static final C3486F f33607r;

    /* renamed from: s, reason: collision with root package name */
    private static final C3486F f33608s;

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends C3156v implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33609a = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final j d(long j8, j jVar) {
            return c.x(j8, jVar);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d(((Number) obj).longValue(), (j) obj2);
        }
    }

    static {
        int e8;
        int e9;
        e8 = I.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f33591b = e8;
        e9 = I.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f33592c = e9;
        f33593d = new C3486F("BUFFERED");
        f33594e = new C3486F("SHOULD_BUFFER");
        f33595f = new C3486F("S_RESUMING_BY_RCV");
        f33596g = new C3486F("RESUMING_BY_EB");
        f33597h = new C3486F("POISONED");
        f33598i = new C3486F("DONE_RCV");
        f33599j = new C3486F("INTERRUPTED_SEND");
        f33600k = new C3486F("INTERRUPTED_RCV");
        f33601l = new C3486F("CHANNEL_CLOSED");
        f33602m = new C3486F("SUSPEND");
        f33603n = new C3486F("SUSPEND_NO_WAITER");
        f33604o = new C3486F("FAILED");
        f33605p = new C3486F("NO_RECEIVE_RESULT");
        f33606q = new C3486F("CLOSE_HANDLER_CLOSED");
        f33607r = new C3486F("CLOSE_HANDLER_INVOKED");
        f33608s = new C3486F("NO_CLOSE_CAUSE");
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
    public static final boolean B(InterfaceC2837o interfaceC2837o, Object obj, Function1 function1) {
        Object n8 = interfaceC2837o.n(obj, null, function1);
        if (n8 != null) {
            interfaceC2837o.C(n8);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean C(InterfaceC2837o interfaceC2837o, Object obj, Function1 function1, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        return B(interfaceC2837o, obj, function1);
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

    public static final InterfaceC2645e y() {
        return a.f33609a;
    }

    public static final C3486F z() {
        return f33601l;
    }
}
