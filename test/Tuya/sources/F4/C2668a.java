package f4;

import L5.s;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.net.PlacesClient;
import k3.i;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2668a implements InterfaceC2669b {

    /* renamed from: b, reason: collision with root package name */
    private final PlacesClient f31097b;

    /* renamed from: c, reason: collision with root package name */
    private final i f31098c;

    /* renamed from: d, reason: collision with root package name */
    private final AutocompleteSessionToken f31099d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0742a extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f31100a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31101b;

        /* renamed from: d, reason: collision with root package name */
        int f31103d;

        C0742a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31101b = obj;
            this.f31103d |= Integer.MIN_VALUE;
            Object a8 = C2668a.this.a(null, this);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f4.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f31104a;

        /* renamed from: b, reason: collision with root package name */
        int f31105b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31106c;

        /* renamed from: e, reason: collision with root package name */
        int f31108e;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31106c = obj;
            this.f31108e |= Integer.MIN_VALUE;
            Object b8 = C2668a.this.b(null, null, 0, this);
            if (b8 == Q5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    public C2668a(PlacesClient client, i errorReporter) {
        AbstractC3159y.i(client, "client");
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f31097b = client;
        this.f31098c = errorReporter;
        this.f31099d = AutocompleteSessionToken.newInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // f4.InterfaceC2669b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r7, P5.d r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.C2668a.a(java.lang.String, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1 A[Catch: Exception -> 0x002f, LOOP:0: B:13:0x009b->B:15:0x00a1, LOOP_END, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x002b, B:12:0x0072, B:13:0x009b, B:15:0x00a1, B:17:0x00d5), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // f4.InterfaceC2669b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r11, java.lang.String r12, int r13, P5.d r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.C2668a.b(java.lang.String, java.lang.String, int, P5.d):java.lang.Object");
    }
}
